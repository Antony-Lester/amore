package app.lonelyheartsclub.amore

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import app.lonelyheartsclub.amore.databinding.ActivityProfileWeightBinding
import kotlin.math.floor

class ActivityProfileWeight : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;supportActionBar?.hide()
        val binding = ActivityProfileWeightBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //init fonts
        binding.question.typeface = Fun.setFont(this, "headline")
        binding.imperialTitle.typeface = Fun.setFont(this, "headline")
        binding.metricTitle.typeface = Fun.setFont(this, "headline")
        binding.buttonText.typeface = Fun.setFont(this, "sub_body")
        //init seekbar
        binding.seekBar.progress = 50
        var stone = floor((binding.seekBar.progress + 40).toFloat()*0.15747).toInt()
        var pounds = ((((binding.seekBar.progress + 40).toFloat()*0.15747) - floor((binding.seekBar.progress + 40).toFloat()*0.15747))*14).toInt()
        binding.metricValue.text = (binding.seekBar.progress + 40).toString()
        binding.imperialValue.text = "$stone'$pounds\""
        //init animation
        Fun.startAnimationQuestionSlider(this, binding.profileIconContainer, binding.button, binding.valuesContainer, binding.seekBarContainer, binding.question, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, binding.user, binding.percentage)
        Fun.setWidgetAndProgress(Helper.profileWidget, Helper.profileProgress, binding.profileWidget, binding.profileWidgetText, binding.profileProgressBar)
        binding.seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0 : SeekBar?, p1 : Int, p2 : Boolean) {
                stone = floor((binding.seekBar.progress + 40).toFloat()*0.15747).toInt()
                pounds = ((((binding.seekBar.progress + 40).toFloat()*0.15747) - floor((binding.seekBar.progress + 40).toFloat()*0.15747))*14).toInt()
                binding.metricValue.text = (binding.seekBar.progress + 40).toString()
                binding.imperialValue.text = "$stone'$pounds\""}
            override fun onStartTrackingTouch(p0 : SeekBar?) {}
            override fun onStopTrackingTouch(p0 : SeekBar?) {}})
        binding.buttonText.setOnClickListener {
            val bmi : Float = (binding.seekBar.progress + 40).toFloat() / ((Info.height!!/100)*(Info.height!!/100))
            if (bmi < 18.4){Info.bmi = "a"}
            else if (bmi >= 18.4 && bmi < 20.9) {Info.bmi = "b"}
            else if (bmi >= 20.9 && bmi < 27.5) {Info.bmi = "c"}
            else if (bmi >= 27.5 && bmi < 40) {Info.bmi = "d"}
            else {Info.bmi = "e"}
            Fun.finishAnimationQuestionSlider(this, binding.profileIconContainer, binding.button, binding.valuesContainer, binding.seekBarContainer, binding.question, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, binding.user, binding.percentage)
            if (Helper.swipePref) {Helper.swipePref = false;binding.buttonText.postDelayed({startActivity(Intent(this, ActivitySwipePrefBuild::class.java));finish()}, 1600)}
            else{binding.buttonText.postDelayed({startActivity(Intent(this, ActivityProfileMenu::class.java));finish()}, 1600)}}
        binding.profileIconContainer.setOnClickListener {
            Fun.finishAnimationQuestionSlider(this, binding.profileIconContainer, binding.button, binding.valuesContainer, binding.seekBarContainer, binding.question, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, binding.user, binding.percentage)
            binding.buttonText.postDelayed({startActivity(Intent(this, ActivityProfileMenu::class.java));finish()}, 1600)}
    }
}