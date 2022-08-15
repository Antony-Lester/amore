package app.lonelyheartsclub.amore

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.lonelyheartsclub.amore.databinding.ActivitySwipePrefEducationBinding

class ActivitySwipePrefEducation : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;supportActionBar?.hide()
        val binding  = ActivitySwipePrefEducationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Info Check...
        if (Info.education == null) {Helper.swipePref = true
            startActivity(Intent(this, ActivityProfileEducation::class.java))
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
            if (Pref.education == null) {
                binding.answerAllSwitch.isChecked = true
                binding.answerOneSwitch.isChecked = true
                binding.answerTwoSwitch.isChecked = true
                binding.answerThreeSwitch.isChecked = true
                binding.answerFourSwitch.isChecked = true
                binding.answerFiveSwitch.isChecked = true
                binding.answerSixSwitch.isChecked = true
                Fun.setUserPercentage(Stat.all,binding.progressBar,binding.percentage)
            } else {
                if (Pref.education!!.contains("a")){

                    if (Pref.education!!.contains("b")&&Pref.education!!.contains("c")&&Pref.education!!.contains("d")) {
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerAllSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.all, binding.progressBar, binding.percentage)
                    }

                    else if (Pref.education!!.contains("c")&&Pref.education!!.contains("d")) {
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.educationACD, binding.progressBar, binding.percentage)
                    }

                    else if (Pref.education!!.contains("b")&&Pref.education!!.contains("d")) {
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.educationABD, binding.progressBar, binding.percentage)
                    }

                    else if (Pref.education!!.contains("b")&&Pref.education!!.contains("c")) {
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.educationABC, binding.progressBar, binding.percentage)
                    }

                    else if (Pref.education!!.contains("b")) {
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.educationAB, binding.progressBar, binding.percentage)
                    }

                    else if (Pref.education!!.contains("c")) {
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.educationAC, binding.progressBar, binding.percentage)
                    }

                    else if (Pref.education!!.contains("d")) {
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.educationAD, binding.progressBar, binding.percentage)
                    }

                    else {
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.educationA, binding.progressBar, binding.percentage)
                    }}
                else if (Pref.education!!.contains("b")){

                    if (Pref.education!!.contains("c")&&Pref.education!!.contains("d")) {
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.educationBCD, binding.progressBar, binding.percentage)
                    }

                    else if (Pref.education!!.contains("c")) {
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.educationBC, binding.progressBar, binding.percentage)
                    }

                    else if (Pref.education!!.contains("d")) {
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.educationBD, binding.progressBar, binding.percentage)
                    }

                    else {
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.educationB, binding.progressBar, binding.percentage)
                    }
                }
                else if (Pref.education!!.contains("c")){

                    if (Pref.education!!.contains("d")) {
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.educationCD, binding.progressBar, binding.percentage)
                    }

                    else {
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.educationC, binding.progressBar, binding.percentage)}}
                else {

                    binding.answerOneSwitch.isChecked = false
                    binding.answerTwoSwitch.isChecked = false
                    binding.answerThreeSwitch.isChecked = false
                    binding.answerFourSwitch.isChecked = true
                    binding.answerAllSwitch.isChecked = false
                    Fun.setUserPercentage(Stat.educationD, binding.progressBar, binding.percentage)}
            }};buildCheckAndSet()
        //on button click
        fun statCheck(){
            Pref.education = null
            if (binding.answerAllSwitch.isChecked){Pref.education = mutableListOf("a","b","c","d")}
            if (binding.answerOneSwitch.isChecked){if (Pref.education != null ){Pref.education?.add("a")} else {Pref.education = mutableListOf("a")}}
            if (binding.answerTwoSwitch.isChecked){if (Pref.education != null ){Pref.education?.add("b")} else {Pref.education = mutableListOf("b")}}
            if (binding.answerThreeSwitch.isChecked){if (Pref.education != null ){Pref.education?.add("c")} else {Pref.education = mutableListOf("c")}}
            if (binding.answerFourSwitch.isChecked){if (Pref.education != null ){Pref.education?.add("d")} else {Pref.education = mutableListOf("d")}}
            if (Pref.education != null ){Pref.education = Pref.education!!.distinct().toMutableList()} else {Pref.education = mutableListOf("a","b","c","d")}
            if (binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked && !binding.answerFourSwitch.isChecked){Fun.setUserPercentage(Stat.educationA, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked && !binding.answerFourSwitch.isChecked){Fun.setUserPercentage(Stat.educationB, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked && !binding.answerFourSwitch.isChecked){Fun.setUserPercentage(Stat.educationC, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked && binding.answerFourSwitch.isChecked){Fun.setUserPercentage(Stat.educationD, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked && !binding.answerFourSwitch.isChecked){Fun.setUserPercentage(Stat.educationAB, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked && !binding.answerFourSwitch.isChecked){Fun.setUserPercentage(Stat.educationAC, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked && binding.answerFourSwitch.isChecked){Fun.setUserPercentage(Stat.educationAD, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked && !binding.answerFourSwitch.isChecked){Fun.setUserPercentage(Stat.educationBC, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked && binding.answerFourSwitch.isChecked){Fun.setUserPercentage(Stat.educationBD, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked && binding.answerFourSwitch.isChecked){Fun.setUserPercentage(Stat.educationCD, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked && binding.answerFourSwitch.isChecked){Fun.setUserPercentage(Stat.educationACD, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked && binding.answerFourSwitch.isChecked){Fun.setUserPercentage(Stat.educationABD, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked && !binding.answerFourSwitch.isChecked){Fun.setUserPercentage(Stat.educationABC, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked && binding.answerFourSwitch.isChecked){Fun.setUserPercentage(Stat.educationBCD, binding.progressBar, binding.percentage)}
        }
        binding.answerAllSwitch.setOnClickListener {
            binding.answerOneSwitch.isChecked = true
            binding.answerTwoSwitch.isChecked = true
            binding.answerThreeSwitch.isChecked = true
            binding.answerFourSwitch.isChecked = true
            binding.answerFiveSwitch.isChecked = true
            binding.answerSixSwitch.isChecked = true
            binding.answerAllSwitch.isChecked = true
            Fun.setUserPercentage(Stat.all, binding.progressBar, binding.percentage)}
        binding.answerOneSwitch.setOnClickListener {
            if (! binding.answerTwoSwitch.isChecked &&
                ! binding.answerThreeSwitch.isChecked &&
                ! binding.answerFourSwitch.isChecked) {
                binding.answerOneSwitch.isChecked = true
                binding.answerTwoSwitch.isChecked = true
                binding.answerThreeSwitch.isChecked = true
                binding.answerFourSwitch.isChecked = true
                binding.answerFiveSwitch.isChecked = true
                binding.answerSixSwitch.isChecked = true
                binding.answerAllSwitch.isChecked = true
                Fun.setUserPercentage(Stat.all, binding.progressBar, binding.percentage)}
            else {binding.answerAllSwitch.isChecked = false;statCheck()}}
        binding.answerTwoSwitch.setOnClickListener {
            if (! binding.answerOneSwitch.isChecked &&
                ! binding.answerThreeSwitch.isChecked &&
                ! binding.answerFourSwitch.isChecked ) {
                binding.answerOneSwitch.isChecked = true
                binding.answerTwoSwitch.isChecked = true
                binding.answerThreeSwitch.isChecked = true
                binding.answerFourSwitch.isChecked = true
                binding.answerFiveSwitch.isChecked = true
                binding.answerSixSwitch.isChecked = true
                binding.answerAllSwitch.isChecked = true
                Fun.setUserPercentage(Stat.all, binding.progressBar, binding.percentage)}
            else {binding.answerAllSwitch.isChecked = false;statCheck()}}
        binding.answerThreeSwitch.setOnClickListener {
            if (! binding.answerOneSwitch.isChecked && ! binding.answerTwoSwitch.isChecked &&
                ! binding.answerFourSwitch.isChecked ) {
                binding.answerOneSwitch.isChecked = true
                binding.answerTwoSwitch.isChecked = true
                binding.answerThreeSwitch.isChecked = true
                binding.answerFourSwitch.isChecked = true
                binding.answerFiveSwitch.isChecked = true
                binding.answerSixSwitch.isChecked = true
                binding.answerAllSwitch.isChecked = true
                Fun.setUserPercentage(Stat.all, binding.progressBar, binding.percentage)}
            else {binding.answerAllSwitch.isChecked = false;statCheck()}}
        binding.answerFourSwitch.setOnClickListener {
            if (! binding.answerOneSwitch.isChecked && ! binding.answerTwoSwitch.isChecked &&
                ! binding.answerThreeSwitch.isChecked) {
                binding.answerOneSwitch.isChecked = true
                binding.answerTwoSwitch.isChecked = true
                binding.answerThreeSwitch.isChecked = true
                binding.answerFourSwitch.isChecked = true
                binding.answerFiveSwitch.isChecked = true
                binding.answerSixSwitch.isChecked = true
                binding.answerAllSwitch.isChecked = true
                Fun.setUserPercentage(Stat.all, binding.progressBar, binding.percentage)}
            else {binding.answerAllSwitch.isChecked = false;statCheck()}}

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