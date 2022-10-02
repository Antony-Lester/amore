package app.lonelyheartsclub.amore

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import app.lonelyheartsclub.amore.databinding.ActivityProfileIncomeBinding
import java.util.*

class ActivityProfileIncome : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;supportActionBar?.hide()
        val binding = ActivityProfileIncomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //init fonts
        binding.question.typeface = Fun.setFont(this, "headline")
        binding.imperialTitle.typeface = Fun.setFont(this, "headline")
        binding.metricTitle.typeface = Fun.setFont(this, "headline")
        binding.buttonText.typeface = Fun.setFont(this, "sub_body")
        //init currency look up
        val name : String
        val code : String
        val symbol : String
        val step : Float
        val value : Float

        if (Info.country != null) {
            val list : List<Any> = Helper.IncomeCountryIndex.getOrElse(Info.country!!.uppercase(Locale.getDefault())) {
                listOf("US Dollar", "USD", "$", 515.1204511, 1)
            }
            name = list[0].toString()
            code = list[1].toString()
            symbol = list[2].toString()
            step = list[3].toString().toFloat()
            value = list[4].toString().toFloat()
        } else {
            name = "US Dollar"
            code = "USD"
            symbol = "$"
            step = 515.1204f
            value = 1.0f}
        //init seekbar
        binding.seekBar.progress = 50
        ("$name $code").also { binding.metricTitle.text = it }
        (symbol + ((binding.seekBar.progress.toFloat())*(step)).toInt().toString()).also { binding.metricValue.text = it }
        binding.imperialTitle.text = "US Dollar USD"
        binding.imperialValue.text = symbol + ((binding.seekBar.progress * step)*value).toInt().toString()
        //init animation
        Fun.startAnimationQuestionSlider(this, binding.profileIconContainer, binding.button, binding.valuesContainer, binding.seekBarContainer, binding.question, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, binding.user, binding.percentage)
        Fun.setWidgetAndProgress(Helper.profileWidget, Helper.profileProgress, binding.profileWidget, binding.profileWidgetText, binding.profileProgressBar)
        binding.seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0 : SeekBar?, p1 : Int, p2 : Boolean) {
                binding.metricValue.text = symbol + ((binding.seekBar.progress.toFloat())*(step)).toInt().toString()
                binding.imperialValue.text = symbol +((binding.seekBar.progress * step)*value).toInt().toString()
            }
            override fun onStartTrackingTouch(p0 : SeekBar?) {}
            override fun onStopTrackingTouch(p0 : SeekBar?) {}})
        binding.buttonText.setOnClickListener {
            if (binding.seekBar.progress < 20) {Info.income = "a"}
            else if (binding.seekBar.progress < 40) {Info.income = "b"}
            else if (binding.seekBar.progress < 60) {Info.income = "c"}
            else if (binding.seekBar.progress < 80) {Info.income = "d"}
            else {Info.income = "e"}
            Fun.finishAnimationQuestionSlider(this, binding.profileIconContainer, binding.button, binding.valuesContainer, binding.seekBarContainer, binding.question, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, binding.user, binding.percentage)
            if (Helper.swipePref) {Helper.swipePref = false;binding.profileWidget.postDelayed({startActivity(Intent(this, ActivitySwipePrefIncome::class.java))}, 1600)}
            else {binding.buttonText.postDelayed({startActivity(Intent(this, ActivityProfileMenu::class.java));finish()}, 1600)}}
        binding.profileIconContainer.setOnClickListener {
            Fun.finishAnimationQuestionSlider(this, binding.profileIconContainer, binding.button, binding.valuesContainer, binding.seekBarContainer, binding.question, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, binding.user, binding.percentage)
            binding.buttonText.postDelayed({startActivity(Intent(this, ActivityProfileMenu::class.java));finish()}, 1600)}
    }
}