package app.lonelyheartsclub.amore

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.lonelyheartsclub.amore.databinding.ActivitySwipePrefAgeBinding
import com.google.android.material.slider.RangeSlider

class ActivitySwipePrefAge : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;supportActionBar?.hide()
        val binding = ActivitySwipePrefAgeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //init fonts
        binding.question.typeface = Fun.setFont(this, "headline")
        binding.imperialTitle.typeface = Fun.setFont(this, "headline")
        binding.metricTitle.typeface = Fun.setFont(this, "headline")
        binding.imperialValue.typeface = Fun.setFont(this, "headline")
        binding.metricValue.typeface = Fun.setFont(this, "headline")
        binding.buttonText.typeface = Fun.setFont(this, "sub_body")
        //footer font
        binding.user.typeface = Fun.setFont(this, "body")
        binding.percentage.typeface = Fun.setFont(this, "body")
        binding.percentage.text = Fun.calculateSwipePreferencePercentageTotal()
        //init seekbar
        if (Pref.minAge != null ) {binding.seekBar.valueFrom = Pref.minAge!!.toFloat()}
        if (Pref.maxAge != null ) {binding.seekBar.valueTo = Pref.maxAge!!.toFloat()}
        binding.imperialValue.text = ((binding.seekBar.values[0])).toInt().toString()//min
        binding.metricValue.text = ((binding.seekBar.values[1]).toInt()).toString()//max
        //init animation
        Fun.startAnimationQuestionSlider(this, binding.swipeIconContainer, binding.button, binding.valuesContainer, binding.seekBarContainer, binding.question, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, binding.user, binding.percentage)
        binding.seekBar.addOnSliderTouchListener(object : RangeSlider.OnSliderTouchListener {
            override fun onStartTrackingTouch(slider: RangeSlider) {
                // Responds to when slider's touch event is being started
            }
            override fun onStopTrackingTouch(slider: RangeSlider) {
                // Responds to when slider's touch event is being stopped
            }})
        binding.seekBar.addOnChangeListener { _, _, _ ->
            // Responds to when slider's value is changed
            Pref.minAge = ((binding.seekBar.values[0]).toInt())
            Pref.maxAge = if ((binding.seekBar.values[1]).toInt()-(binding.seekBar.values[0]).toInt() < 10) {((binding.seekBar.values[0]).toInt())+10} else {((binding.seekBar.values[1]).toInt())}
            binding.imperialValue.text = ((binding.seekBar.values[0])).toInt().toString()//min
            binding.metricValue.text = ((binding.seekBar.values[1]).toInt()).toString()//max
            Fun.calculateSwipePreferencePercentageItem("age", binding.progressBar)
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