package app.lonelyheartsclub.amore

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.lonelyheartsclub.amore.databinding.ActivitySwipePrefHeightBinding
import com.google.android.material.slider.RangeSlider
import kotlin.math.floor

class ActivitySwipePrefHeight : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;supportActionBar?.hide()
        val binding = ActivitySwipePrefHeightBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //init fonts
        binding.question.typeface = Fun.setFont(this, "headline")
        binding.imperialTitle.typeface = Fun.setFont(this, "headline")
        binding.metricTitle.typeface = Fun.setFont(this, "headline")
        binding.minValue.typeface = Fun.setFont(this, "headline")
        binding.minValueMetric.typeface = Fun.setFont(this, "headline")
        binding.maxValue.typeface = Fun.setFont(this, "headline")
        binding.maxValueMetric.typeface = Fun.setFont(this, "headline")
        binding.buttonText.typeface = Fun.setFont(this, "sub_body")
        //footer font
        binding.user.typeface = Fun.setFont(this, "body")
        binding.percentage.typeface = Fun.setFont(this, "body")
        binding.percentage.text = Fun.calculateSwipePreferencePercentageTotal()
        //init seekbar
        if (Pref.minHeight != null ) {binding.seekBar.valueFrom = Pref.minHeight!!.toFloat()}
        if (Pref.maxHeight != null ) {binding.seekBar.valueTo = Pref.maxHeight!!.toFloat()}
        (((binding.seekBar.values[0])/100).toString() + "m").also { binding.minValueMetric.text = it }//min
        "${floor((binding.seekBar.values[0].toFloat()) / 30.48f).toInt()}'${floor((((binding.seekBar.values[0].toFloat()) / 30.48f) - floor((binding.seekBar.values[0].toFloat()) / 30.48f).toInt().toFloat())*12).toInt()}\"".also { binding.minValue.text = it }
        (((binding.seekBar.values[1])/100).toString() + "m").also { binding.maxValueMetric.text = it }//min
        "${floor((binding.seekBar.values[1].toFloat()) / 30.48f).toInt()}'${floor((((binding.seekBar.values[1].toFloat()) / 30.48f) - floor((binding.seekBar.values[1].toFloat()) / 30.48f).toInt().toFloat())*12).toInt()}\"".also { binding.maxValue.text = it }
        //init animation
        Fun.startAnimationQuestionSlider(this, binding.swipeIconContainer, binding.button, binding.valuesContainer, binding.seekBarContainer, binding.question, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, binding.user, binding.percentage)
        //Fun.setWidgetAndProgress(Helper.profileWidget, Helper.profileProgress, binding.profileWidget, binding.profileWidgetText, binding.profileProgressBar)
        binding.seekBar.addOnSliderTouchListener(object : RangeSlider.OnSliderTouchListener {
            override fun onStartTrackingTouch(slider: RangeSlider) {
                // Responds to when slider's touch event is being started
            }
            override fun onStopTrackingTouch(slider: RangeSlider) {
                // Responds to when slider's touch event is being stopped
            }})
        binding.seekBar.addOnChangeListener { _, _, _ ->
            // Responds to when slider's value is changed
            (((binding.seekBar.values[0])/100).toString() + "m").also { binding.minValueMetric.text = it }//min
            "${floor((binding.seekBar.values[0].toFloat()) / 30.48f).toInt()}'${floor((((binding.seekBar.values[0].toFloat()) / 30.48f) - floor((binding.seekBar.values[0].toFloat()) / 30.48f).toInt().toFloat())*12).toInt()}\"".also { binding.minValue.text = it }
            (((binding.seekBar.values[1])/100).toString() + "m").also { binding.maxValueMetric.text = it }//min
            "${floor((binding.seekBar.values[1].toFloat()) / 30.48f).toInt()}'${floor((((binding.seekBar.values[1].toFloat()) / 30.48f) - floor((binding.seekBar.values[1].toFloat()) / 30.48f).toInt().toFloat())*12).toInt()}\"".also { binding.maxValue.text = it }
            Pref.minHeight = if (((binding.seekBar.values[1]).toInt())-(binding.seekBar.values[0]).toInt() < 15) {((binding.seekBar.values[1]).toInt())-15} else {(binding.seekBar.values[0]).toInt()}
            Pref.maxHeight = ((binding.seekBar.values[1]).toInt())
            Fun.calculateSwipePreferencePercentageItem("height", binding.progressBar)
            binding.percentage.text = Fun.calculateSwipePreferencePercentageTotal()
        }
        binding.buttonText.setOnClickListener {
            Fun.finishAnimationQuestionSlider(this, binding.swipeIconContainer, binding.button, binding.valuesContainer, binding.seekBarContainer, binding.question, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, binding.user, binding.percentage)
            binding.buttonText.postDelayed({startActivity(Intent(this, ActivitySwipePrefMenu::class.java));finish()}, 1600)}
        binding.swipeIconContainer.setOnClickListener {
            Fun.finishAnimationQuestionSlider(this, binding.swipeIconContainer, binding.button, binding.valuesContainer, binding.seekBarContainer, binding.question, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, binding.user, binding.percentage)
            binding.buttonText.postDelayed({startActivity(Intent(this, ActivitySwipePrefMenu::class.java));finish()}, 1600)}
    }
}