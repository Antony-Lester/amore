package app.lonelyheartsclub.amore

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.lonelyheartsclub.amore.databinding.ActivitySwipePrefTravelBinding


class ActivitySwipePrefTravel : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;supportActionBar?.hide()
        val binding  = ActivitySwipePrefTravelBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Info Check...
        if (Info.travel == null) {Helper.swipePref = true
            startActivity(Intent(this, ActivityProfileTravel::class.java))
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
            if (Pref.travel == null) {
                binding.answerAllSwitch.isChecked = true
                binding.answerOneSwitch.isChecked = true
                binding.answerTwoSwitch.isChecked = true
                binding.answerThreeSwitch.isChecked = true
                binding.answerFourSwitch.isChecked = true
                binding.answerFiveSwitch.isChecked = true
                binding.answerSixSwitch.isChecked = true
                Fun.setUserPercentage(Stat.all,binding.progressBar,binding.percentage)
            } else {
                if (Pref.travel!!.contains("a")){
                    if (Pref.travel!!.contains("b")&&Pref.travel!!.contains("c")) {
                        //all
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerAllSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.all, binding.progressBar, binding.percentage)
                    }
                    else if(Pref.travel!!.contains("b")){
                        //buildSmallAndLarge
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.travelAAndB, binding.progressBar, binding.percentage)
                    }
                    else if (Pref.travel!!.contains("c")){
                        //buildSmallAndAverage
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.travelAAndC, binding.progressBar, binding.percentage)
                    }
                    else{
                        //buildSmall
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.travelA, binding.progressBar, binding.percentage)}
                }
                else if (Pref.travel!!.contains("b")){
                    if (Pref.travel!!.contains("c")){
                        //buildLargeAndAverage
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.travelBAndC, binding.progressBar, binding.percentage)
                    }
                    else{
                        //buildAverage
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.travelB, binding.progressBar, binding.percentage)
                    }
                }
                else {
                    //buildLarge
                    binding.answerOneSwitch.isChecked = false
                    binding.answerTwoSwitch.isChecked = false
                    binding.answerThreeSwitch.isChecked = true
                    binding.answerAllSwitch.isChecked = false
                    Fun.setUserPercentage(Stat.travelC, binding.progressBar, binding.percentage)
                }}
        };buildCheckAndSet()
        fun buttonClick(){
            Pref.travel = null
            if (binding.answerAllSwitch.isChecked){Pref.travel = mutableListOf("a","b","c")}
            if (binding.answerOneSwitch.isChecked){if (Pref.travel != null ){Pref.travel?.add("a")} else {Pref.travel = mutableListOf("a")}}
            if (binding.answerTwoSwitch.isChecked){if (Pref.travel != null ){Pref.travel?.add("b")} else {Pref.travel = mutableListOf("b")}}
            if (binding.answerThreeSwitch.isChecked){if (Pref.travel != null ){Pref.travel?.add("c")} else {Pref.travel = mutableListOf("c")}}
            if (Pref.travel != null ){Pref.travel = Pref.travel!!.distinct().toMutableList()} else {Pref.travel = mutableListOf("a","b","c")}
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
                if (binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.travelA, binding.progressBar, binding.percentage)}
                else if (binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.travelAAndB, binding.progressBar, binding.percentage)}
                else if (binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.travelAAndC, binding.progressBar, binding.percentage)}
                else if (binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.all, binding.progressBar, binding.percentage)}
                else if (!binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.travelB, binding.progressBar, binding.percentage)}
                else if (!binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.travelBAndC, binding.progressBar, binding.percentage)}
                else if (!binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.travelC, binding.progressBar, binding.percentage)}
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
                if (binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.travelA, binding.progressBar, binding.percentage)}
                else if (binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.travelAAndB, binding.progressBar, binding.percentage)}
                else if (binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.travelAAndC, binding.progressBar, binding.percentage)}
                else if (binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.all, binding.progressBar, binding.percentage)}
                else if (!binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.travelB, binding.progressBar, binding.percentage)}
                else if (!binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.travelBAndC, binding.progressBar, binding.percentage)}
                else if (!binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.travelC, binding.progressBar, binding.percentage)}
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
                if (binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.travelA, binding.progressBar, binding.percentage)}
                else if (binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.travelAAndB, binding.progressBar, binding.percentage)}
                else if (binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.travelAAndC, binding.progressBar, binding.percentage)}
                else if (binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.all, binding.progressBar, binding.percentage)}
                else if (!binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.travelB, binding.progressBar, binding.percentage)}
                else if (!binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.travelBAndC, binding.progressBar, binding.percentage)}
                else if (!binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked) {buttonClick();Fun.setUserPercentage(Stat.travelC, binding.progressBar, binding.percentage)}
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