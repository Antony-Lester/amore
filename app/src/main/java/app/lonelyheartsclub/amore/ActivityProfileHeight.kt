package app.lonelyheartsclub.amore

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import app.lonelyheartsclub.amore.databinding.ActivityProfileHeightBinding
import kotlin.math.floor

class ActivityProfileHeight : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;supportActionBar?.hide()
        val binding = ActivityProfileHeightBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //init fonts
        binding.question.typeface = Fun.setFont(this, "headline")
        binding.imperialTitle.typeface = Fun.setFont(this, "headline")
        binding.metricTitle.typeface = Fun.setFont(this, "headline")
        binding.buttonText.typeface = Fun.setFont(this, "sub_body")
        //init seekbar
        binding.seekBar.progress = 50
        val feet = floor((binding.seekBar.progress.toFloat()+ 120.0f ) / 30.48f).toInt().toString()
        val inch = floor((((binding.seekBar.progress.toFloat()+ 120.0f ) / 30.48f) - feet.toFloat())*12).toInt()
        ((binding.seekBar.progress.toFloat() + 120.0f) / 100.0f).toString()
            .also { binding.metricValue.text = it }
        "$feet'$inch\"".also { binding.imperialValue.text = it }
        //init animation
        Fun.startAnimationQuestionSlider(this, binding.profileIconContainer, binding.button, binding.valuesContainer, binding.seekBarContainer, binding.question, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, binding.user, binding.percentage)
        Fun.setWidgetAndProgress(Helper.profileWidget, Helper.profileProgress, binding.profileWidget, binding.profileWidgetText, binding.profileProgressBar)
        binding.seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0 : SeekBar?, p1 : Int, p2 : Boolean) {
                val feet = floor((binding.seekBar.progress.toFloat()+ 120.0f ) / 30.48f).toInt().toString()
                val inch = floor((((binding.seekBar.progress.toFloat()+ 120.0f ) / 30.48f) - feet.toFloat())*12).toInt()
                ((binding.seekBar.progress.toFloat() + 120.0f) / 100.0f).toString()
                    .also { binding.metricValue.text = it }
                "$feet'$inch\"".also { binding.imperialValue.text = it }
            }
            override fun onStartTrackingTouch(p0 : SeekBar?) {}
            override fun onStopTrackingTouch(p0 : SeekBar?) {}})
        binding.buttonText.setOnClickListener { Info.height = (binding.seekBar.progress.toFloat() + 120.0f).toInt()
            Fun.finishAnimationQuestionSlider(this, binding.profileIconContainer, binding.button, binding.valuesContainer, binding.seekBarContainer, binding.question, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, binding.user, binding.percentage)
            binding.buttonText.postDelayed({startActivity(Intent(this, ActivityProfileWeight::class.java));finish()}, 1600)}
        binding.profileIconContainer.setOnClickListener {
            Fun.finishAnimationQuestionSlider(this, binding.profileIconContainer, binding.button, binding.valuesContainer, binding.seekBarContainer, binding.question, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, binding.user, binding.percentage)
            binding.buttonText.postDelayed({startActivity(Intent(this, ActivityProfileMenu::class.java));finish()}, 1600)}
    }
}

