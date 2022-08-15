package app.lonelyheartsclub.amore

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.lonelyheartsclub.amore.databinding.ActivitySwipePrefBuildBinding

class ActivitySwipePrefBuild : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;supportActionBar?.hide()
        val binding  = ActivitySwipePrefBuildBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Info Check...
        if (Info.bmi == null) {Helper.swipePref = true
            startActivity(Intent(this, ActivityProfileHeight::class.java))
        }
        //body font
        binding.question.typeface = Fun.setFont(this, "body")
        binding.answerAll.typeface = Fun.setFont(this, "headline")
        binding.answerOne.typeface = Fun.setFont(this, "headline")
        binding.answerTwo.typeface = Fun.setFont(this, "headline")
        binding.answerThree.typeface = Fun.setFont(this, "headline")
        binding.answerFour.typeface = Fun.setFont(this, "headline")
        binding.answerFive.typeface = Fun.setFont(this, "headline")
        binding.answerSix.typeface = Fun.setFont(this, "headline")
        binding.user.typeface = Fun.setFont(this, "headline")
        binding.percentage.typeface = Fun.setFont(this, "headline")
        binding.confirm.typeface = Fun.setFont(this, "body")
        //init animation
        Fun.startAnimationQuestionTickBox(this, binding.headlineContainer, binding.bodyContainer, binding.footerContainer,
                                          binding.question, binding.answerAllContainer, binding.answerOneContainer, binding.answerTwoContainer, binding.answerThreeContainer,
                                          binding.answerFourContainer, binding.answerFiveContainer, binding.answerSixContainer,
                                          binding.confirm, binding.user, binding.swipeIconContainer, binding.percentage)
        //check & set status
        fun buildCheckAndSet(){
            if (Pref.bmi == null) {
                binding.answerAllSwitch.isChecked = true
                binding.answerOneSwitch.isChecked = true
                binding.answerTwoSwitch.isChecked = true
                binding.answerThreeSwitch.isChecked = true
                binding.answerFourSwitch.isChecked = true
                binding.answerFiveSwitch.isChecked = true
                binding.answerSixSwitch.isChecked = true
                Fun.setUserPercentage(Stat.all,binding.progressBar,binding.percentage)
            } else {
                if (Pref.bmi!!.contains("a")){
                    if (Pref.bmi!!.contains("e")&&Pref.bmi!!.contains("c")) {
                        //all
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerAllSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.all, binding.progressBar, binding.percentage)
                    }
                    else if(Pref.bmi!!.contains("e")){
                        //buildSmallAndLarge
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.buildSmallAndLarge, binding.progressBar, binding.percentage)
                    }
                    else if (Pref.bmi!!.contains("c")){
                        //buildSmallAndAverage
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.buildSmallAndAverage, binding.progressBar, binding.percentage)
                    }
                    else{
                        //buildSmall
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.buildSmall, binding.progressBar, binding.percentage)}
                }
                else if (Pref.bmi!!.contains("c")){
                    if (Pref.bmi!!.contains("e")){
                        //buildLargeAndAverage
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.buildLargeAndAverage, binding.progressBar, binding.percentage)
                    }
                    else{
                        //buildAverage
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.buildAverage, binding.progressBar, binding.percentage)
                    }

                }
                else {
                    //buildLarge
                    binding.answerOneSwitch.isChecked = false
                    binding.answerTwoSwitch.isChecked = false
                    binding.answerThreeSwitch.isChecked = true
                    binding.answerAllSwitch.isChecked = false
                    Fun.setUserPercentage(Stat.buildLarge, binding.progressBar, binding.percentage)
                }}
        };buildCheckAndSet()
        fun buttonClick() {Pref.bmi = null
            if (binding.answerAllSwitch.isChecked){Pref.bmi = mutableListOf("a","b","c","d","e")}
            if (binding.answerOneSwitch.isChecked){if (Pref.bmi != null ){Pref.bmi?.add("a");Pref.bmi?.add("b")} else {Pref.bmi = mutableListOf("a","b")}}
            if (binding.answerTwoSwitch.isChecked){if (Pref.bmi != null ){Pref.bmi?.add("b");Pref.bmi?.add("c");Pref.bmi?.add("d")} else {Pref.bmi = mutableListOf("b","c","d")}}
            if (binding.answerThreeSwitch.isChecked){if (Pref.bmi != null ){Pref.bmi?.add("d");Pref.bmi?.add("e")} else {Pref.bmi = mutableListOf("d","e")}}
            if (Pref.bmi != null ){Pref.bmi = Pref.bmi!!.distinct().toMutableList()} else {Pref.bmi = mutableListOf("a","b","c","d","e")}}
        //on button click
        binding.answerAllSwitch.setOnClickListener {
            binding.answerOneSwitch.isChecked = true
            binding.answerTwoSwitch.isChecked = true
            binding.answerThreeSwitch.isChecked = true
            binding.answerFourSwitch.isChecked = true
            binding.answerFiveSwitch.isChecked = true
            binding.answerSixSwitch.isChecked = true
            binding.answerAllSwitch.isChecked = true
            buttonClick()
            Fun.setUserPercentage(Stat.all, binding.progressBar, binding.percentage)}
        binding.answerOneSwitch.setOnClickListener {
            if (! binding.answerTwoSwitch.isChecked &&
                ! binding.answerThreeSwitch.isChecked ) {
                binding.answerOneSwitch.isChecked = true
                binding.answerTwoSwitch.isChecked = true
                binding.answerThreeSwitch.isChecked = true
                binding.answerFourSwitch.isChecked = true
                binding.answerFiveSwitch.isChecked = true
                binding.answerSixSwitch.isChecked = true
                binding.answerAllSwitch.isChecked = true
                buttonClick()
                Fun.setUserPercentage(Stat.all, binding.progressBar, binding.percentage)}
            else {binding.answerAllSwitch.isChecked = false
                if (binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked) {
                    buttonClick()
                    Fun.setUserPercentage(Stat.buildSmall, binding.progressBar, binding.percentage)}
                else if (binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked) {
            buttonClick()
                    Fun.setUserPercentage(Stat.buildSmallAndAverage, binding.progressBar, binding.percentage)}
                else if (binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked) {
            buttonClick()
                    Fun.setUserPercentage(Stat.buildSmallAndLarge, binding.progressBar, binding.percentage)}
                else if (binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked) {
            buttonClick()
                    Fun.setUserPercentage(Stat.all, binding.progressBar, binding.percentage)}
                else if (!binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked) {
            buttonClick()
                    Fun.setUserPercentage(Stat.buildAverage, binding.progressBar, binding.percentage)}
                else if (!binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked) {
            buttonClick()
                    Fun.setUserPercentage(Stat.buildLargeAndAverage, binding.progressBar, binding.percentage)}
            }}
        binding.answerTwoSwitch.setOnClickListener {
            if (! binding.answerOneSwitch.isChecked &&
                ! binding.answerThreeSwitch.isChecked ) {
                binding.answerOneSwitch.isChecked = true
                binding.answerTwoSwitch.isChecked = true
                binding.answerThreeSwitch.isChecked = true
                binding.answerFourSwitch.isChecked = true
                binding.answerFiveSwitch.isChecked = true
                binding.answerSixSwitch.isChecked = true
                binding.answerAllSwitch.isChecked = true
                buttonClick()
                Fun.setUserPercentage(Stat.all, binding.progressBar, binding.percentage)}
            else {binding.answerAllSwitch.isChecked = false
                if (binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked) {
                    buttonClick()
                    Fun.setUserPercentage(Stat.buildSmall, binding.progressBar, binding.percentage)}
                else if (binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked) {
                    buttonClick()
                    Fun.setUserPercentage(Stat.buildSmallAndAverage, binding.progressBar, binding.percentage)}
                else if (binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked) {
                    buttonClick()
                    Fun.setUserPercentage(Stat.buildSmallAndLarge, binding.progressBar, binding.percentage)}
                else if (binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked) {
                    buttonClick()
                    Fun.setUserPercentage(Stat.all, binding.progressBar, binding.percentage)}
                else if (!binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked) {
                    buttonClick()
                    Fun.setUserPercentage(Stat.buildAverage, binding.progressBar, binding.percentage)}
                else if (!binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked) {
                    buttonClick()
                    Fun.setUserPercentage(Stat.buildLargeAndAverage, binding.progressBar, binding.percentage)}
            }}
        binding.answerThreeSwitch.setOnClickListener {
            if (! binding.answerOneSwitch.isChecked && ! binding.answerTwoSwitch.isChecked ) {
                binding.answerOneSwitch.isChecked = true
                binding.answerTwoSwitch.isChecked = true
                binding.answerThreeSwitch.isChecked = true
                binding.answerFourSwitch.isChecked = true
                binding.answerFiveSwitch.isChecked = true
                binding.answerSixSwitch.isChecked = true
                binding.answerAllSwitch.isChecked = true
                buttonClick()
                Fun.setUserPercentage(Stat.all, binding.progressBar, binding.percentage)}
            else {binding.answerAllSwitch.isChecked = false
                if (binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.buildSmall, binding.progressBar, binding.percentage)}
                else if (binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.buildSmallAndAverage, binding.progressBar, binding.percentage)}
                else if (binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.buildSmallAndLarge, binding.progressBar, binding.percentage)}
                else if (binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.all, binding.progressBar, binding.percentage)}
                else if (!binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.buildAverage, binding.progressBar, binding.percentage)}
                else if (!binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.buildLargeAndAverage, binding.progressBar, binding.percentage)}
            }}
        //on confirm button
        binding.confirm.setOnClickListener {
            Fun.finishAnimationQuestionTickBox(this, binding.headlineContainer, binding.bodyContainer, binding.footerContainer,
                                               binding.question, binding.answerAllContainer, binding.answerOneContainer, binding.answerTwoContainer, binding.answerThreeContainer,
                                               binding.answerFourContainer, binding.answerFiveContainer, binding.answerSixContainer,
                                               binding.confirm, binding.user, binding.swipeIconContainer, binding.percentage)
            binding.confirm.postDelayed({startActivity(Intent(this, ActivitySwipePrefMenu::class.java))}, 1600)
        }
    }
}
