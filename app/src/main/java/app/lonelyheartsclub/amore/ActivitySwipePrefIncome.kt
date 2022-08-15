package app.lonelyheartsclub.amore

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import app.lonelyheartsclub.amore.databinding.ActivitySwipePrefIncomeBinding
import java.util.*

class ActivitySwipePrefIncome : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;supportActionBar?.hide()
        val binding = ActivitySwipePrefIncomeBinding.inflate(layoutInflater)
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
        //Fun.swipePrefProgress("income",binding.progressBar)
        //init currency look up
        val name : String ;val code : String ;val symbol : String ;val step : Float ;val value : Float
        if (Info.country != null) {
            val list : List<Any> = Helper.IncomeCountryIndex.getOrElse(Info.country!!.uppercase(Locale.getDefault())) {
                listOf("US Dollar", "USD", "$", 515.1204511, 1)
            }
            name = list[0].toString()
            code = list[1].toString()
            symbol = list[2].toString()
            step = list[3].toString().toFloat()
            value = list[4].toString().toFloat()
        } else { name = "US Dollar";code = "USD";symbol = "$";step = 515.1204511f;value = 1.0f}
        if (Info.income == null) {binding.question.text = resources.getString(R.string.profile_income) }
        //init seekbar
        binding.seekBar.progress = 50;binding.metricTitle.text = "$name $code";binding.metricValue.text = symbol + ((binding.seekBar.progress.toFloat())*(step)).toInt().toString();binding.imperialTitle.text = "US Dollar USD";binding.imperialValue.text = symbol + ((binding.seekBar.progress * step)*value).toInt().toString()
        //init animation
        Fun.startAnimationQuestionSlider(this, binding.swipeIconContainer, binding.button, binding.valuesContainer, binding.seekBarContainer, binding.question, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, binding.user, binding.percentage)
        binding.seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0 : SeekBar?, p1 : Int, p2 : Boolean) {
                binding.metricValue.text = symbol + ((binding.seekBar.progress.toFloat())*(step)).toInt().toString()
                binding.imperialValue.text = symbol +((binding.seekBar.progress * step)*value).toInt().toString()
                if (Info.income != null) {
                    Pref.income = mutableListOf()
                    //set Pref Income
                    if (binding.seekBar.progress < 30) {Pref.income?.add("a");Pref.income?.add("b");Pref.income?.add("c");Pref.income?.add("d");Pref.income?.add("e")}
                    else if (binding.seekBar.progress < 50) { if (Info.income == "a") {Pref.income?.add("a");Pref.income?.add("b");Pref.income?.add("c");Pref.income?.add("d");Pref.income?.add("e")} else {Pref.income?.add("b");Pref.income?.add("c");Pref.income?.add("d");Pref.income?.add("e")} }
                    else if (binding.seekBar.progress < 70) {
                        when (Info.income) {
                            "a" -> {Pref.income?.add("a");Pref.income?.add("b");Pref.income?.add("c");Pref.income?.add("d");Pref.income?.add("e")}
                            "b" -> {Pref.income?.add("b");Pref.income?.add("c");Pref.income?.add("d");Pref.income?.add("e")}
                            else -> {Pref.income?.add("c");Pref.income?.add("d");Pref.income?.add("e")}}}
                    else if (binding.seekBar.progress < 90) {
                        when (Info.income) {
                            "a" -> {Pref.income?.add("a");Pref.income?.add("b");Pref.income?.add("c");Pref.income?.add("d");Pref.income?.add("e")}
                            "b" -> {Pref.income?.add("b");Pref.income?.add("c");Pref.income?.add("d");Pref.income?.add("e")}
                            "c" -> {Pref.income?.add("c");Pref.income?.add("d");Pref.income?.add("e")}
                            else -> {Pref.income?.add("d");Pref.income?.add("e")}}}
                    else {when (Info.income) {
                        "a" -> {Pref.income?.add("a");Pref.income?.add("b");Pref.income?.add("c");Pref.income?.add("d");Pref.income?.add("e")}
                        "b" -> {Pref.income?.add("b");Pref.income?.add("c");Pref.income?.add("d");Pref.income?.add("e")}
                        "c" -> {Pref.income?.add("c");Pref.income?.add("d");Pref.income?.add("e")}
                        "d" -> {Pref.income?.add("d");Pref.income?.add("e")}
                        else -> {Pref.income?.add("e")}}}
                    binding.percentage.text = Fun.calculateSwipePreferencePercentageTotal()
                    Fun.calculateSwipePreferencePercentageItem("income", binding.progressBar)
                }
            }
            override fun onStartTrackingTouch(p0 : SeekBar?) {}
            override fun onStopTrackingTouch(p0 : SeekBar?) {}})
        binding.buttonText.setOnClickListener {
            //set Income
            if (Info.income == null) {if (binding.seekBar.progress < 20) {Info.income = "a"}
            else if (binding.seekBar.progress < 40) {Info.income = "b"}
            else if (binding.seekBar.progress < 60) {Info.income = "c"}
            else if (binding.seekBar.progress < 80) {Info.income = "d"}
            else {Info.income = "e"}
            binding.swipeIconContainer.visibility = View.VISIBLE
            binding.question.text = resources.getString(R.string.swipe_pref_income)
            } else {
            Fun.finishAnimationQuestionSlider(this, binding.swipeIconContainer, binding.button, binding.valuesContainer, binding.seekBarContainer, binding.question, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, binding.user, binding.percentage)
            binding.buttonText.postDelayed({startActivity(Intent(this, ActivitySwipePrefMenu::class.java));finish()}, 1600)
            }}
        binding.swipeIconContainer.setOnClickListener {
            Fun.finishAnimationQuestionSlider(this, binding.swipeIconContainer, binding.button, binding.valuesContainer, binding.seekBarContainer, binding.question, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, binding.user, binding.percentage)
            binding.buttonText.postDelayed({startActivity(Intent(this, ActivitySwipePrefMenu::class.java));finish()}, 1600)}
    }
}