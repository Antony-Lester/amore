package app.lonelyheartsclub.amore

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.lonelyheartsclub.amore.databinding.ActivitySwipePrefIntentionsBinding

class ActivitySwipePrefIntentions : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;supportActionBar?.hide()
        val binding  = ActivitySwipePrefIntentionsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Info Check...
        if (Info.easy == null) {Helper.swipePref = true
            startActivity(Intent(this, ActivityProfileEasy::class.java))
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
            if (Pref.easy == null) {
                binding.answerAllSwitch.isChecked = true
                binding.answerOneSwitch.isChecked = true
                binding.answerTwoSwitch.isChecked = true
                binding.answerThreeSwitch.isChecked = true
                binding.answerFourSwitch.isChecked = true
                binding.answerFiveSwitch.isChecked = true
                binding.answerSixSwitch.isChecked = true
                Fun.setUserPercentage(Stat.all,binding.progressBar,binding.percentage)
            } else {
                if (Pref.easy!!.contains("a")){
                    if (Pref.easy!!.contains("b")&&Pref.easy!!.contains("c")) {
                        //all
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerAllSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.all, binding.progressBar, binding.percentage)
                    }
                    else if(Pref.easy!!.contains("b")){
                        //buildSmallAndLarge
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.easyAAndB, binding.progressBar, binding.percentage)
                    }
                    else if (Pref.easy!!.contains("c")){
                        //buildSmallAndAverage
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.easyAAndC, binding.progressBar, binding.percentage)
                    }
                    else{
                        //buildSmall
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.easyA, binding.progressBar, binding.percentage)}
                }
                else if (Pref.easy!!.contains("b")){
                    if (Pref.easy!!.contains("c")){
                        //buildLargeAndAverage
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.easyBAndC, binding.progressBar, binding.percentage)
                    }
                    else{
                        //buildAverage
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.easyB, binding.progressBar, binding.percentage)
                    }
                }
                else {
                    //buildLarge
                    binding.answerOneSwitch.isChecked = false
                    binding.answerTwoSwitch.isChecked = false
                    binding.answerThreeSwitch.isChecked = true
                    binding.answerAllSwitch.isChecked = false
                    Fun.setUserPercentage(Stat.easyC, binding.progressBar, binding.percentage)
                }}
        };buildCheckAndSet()
        fun buttonClick(){
            Pref.easy = null
            if (binding.answerAllSwitch.isChecked){Pref.easy = mutableListOf("a","b","c")}
            if (binding.answerOneSwitch.isChecked){if (Pref.easy != null ){Pref.easy?.add("a")} else {Pref.easy = mutableListOf("a")}}
            if (binding.answerTwoSwitch.isChecked){if (Pref.easy != null ){Pref.easy?.add("b")} else {Pref.easy = mutableListOf("b")}}
            if (binding.answerThreeSwitch.isChecked){if (Pref.easy != null ){Pref.easy?.add("c")} else {Pref.easy = mutableListOf("c")}}
            if (Pref.easy != null ){Pref.easy = Pref.easy!!.distinct().toMutableList()} else {Pref.easy = mutableListOf("a","b","c")}
        }
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
                if (binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.easyA, binding.progressBar, binding.percentage)}
                else if (binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.easyAAndB, binding.progressBar, binding.percentage)}
                else if (binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.easyAAndC, binding.progressBar, binding.percentage)}
                else if (binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.all, binding.progressBar, binding.percentage)}
                else if (!binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.easyB, binding.progressBar, binding.percentage)}
                else if (!binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.easyBAndC, binding.progressBar, binding.percentage)}
                else if (!binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.easyC, binding.progressBar, binding.percentage)}
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
                if (binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.easyA, binding.progressBar, binding.percentage)}
                else if (binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.easyAAndB, binding.progressBar, binding.percentage)}
                else if (binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.easyAAndC, binding.progressBar, binding.percentage)}
                else if (binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.all, binding.progressBar, binding.percentage)}
                else if (!binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.easyB, binding.progressBar, binding.percentage)}
                else if (!binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.easyBAndC, binding.progressBar, binding.percentage)}
                else if (!binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.easyC, binding.progressBar, binding.percentage)}
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
                if (binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.easyA, binding.progressBar, binding.percentage)}
                else if (binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.easyAAndB, binding.progressBar, binding.percentage)}
                else if (binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.easyAAndC, binding.progressBar, binding.percentage)}
                else if (binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.all, binding.progressBar, binding.percentage)}
                else if (!binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.easyB, binding.progressBar, binding.percentage)}
                else if (!binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.easyBAndC, binding.progressBar, binding.percentage)}
                else if (!binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.easyC, binding.progressBar, binding.percentage)}
            }}
        binding.answerFourSwitch.setOnClickListener {
            if (! binding.answerOneSwitch.isChecked && ! binding.answerTwoSwitch.isChecked &&
                ! binding.answerThreeSwitch.isChecked &&
                ! binding.answerFiveSwitch.isChecked && ! binding.answerSixSwitch.isChecked) {
                binding.answerOneSwitch.isChecked = true
                binding.answerTwoSwitch.isChecked = true
                binding.answerThreeSwitch.isChecked = true
                binding.answerFourSwitch.isChecked = true
                binding.answerFiveSwitch.isChecked = true
                binding.answerSixSwitch.isChecked = true
                binding.answerAllSwitch.isChecked = true
                buttonClick()
                Fun.setUserPercentage(Stat.all, binding.progressBar, binding.percentage)}
            else {binding.answerAllSwitch.isChecked = false}}
        binding.answerFiveSwitch.setOnClickListener {
            if (! binding.answerOneSwitch.isChecked && ! binding.answerTwoSwitch.isChecked &&
                ! binding.answerThreeSwitch.isChecked &&
                ! binding.answerFourSwitch.isChecked && ! binding.answerSixSwitch.isChecked) {
                binding.answerOneSwitch.isChecked = true
                binding.answerTwoSwitch.isChecked = true
                binding.answerThreeSwitch.isChecked = true
                binding.answerFourSwitch.isChecked = true
                binding.answerFiveSwitch.isChecked = true
                binding.answerSixSwitch.isChecked = true
                binding.answerAllSwitch.isChecked = true
                buttonClick()
                Fun.setUserPercentage(Stat.all, binding.progressBar, binding.percentage)}
            else {binding.answerAllSwitch.isChecked = false}}
        binding.answerSixSwitch.setOnClickListener {
            if (! binding.answerOneSwitch.isChecked && ! binding.answerTwoSwitch.isChecked &&
                ! binding.answerThreeSwitch.isChecked &&
                ! binding.answerFourSwitch.isChecked && ! binding.answerFiveSwitch.isChecked) {
                binding.answerOneSwitch.isChecked = true
                binding.answerTwoSwitch.isChecked = true
                binding.answerThreeSwitch.isChecked = true
                binding.answerFourSwitch.isChecked = true
                binding.answerFiveSwitch.isChecked = true
                binding.answerSixSwitch.isChecked = true
                binding.answerAllSwitch.isChecked = true
                buttonClick()
                Fun.setUserPercentage(Stat.all, binding.progressBar, binding.percentage)}
            else {binding.answerAllSwitch.isChecked = false}}
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