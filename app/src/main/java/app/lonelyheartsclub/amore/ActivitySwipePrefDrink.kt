package app.lonelyheartsclub.amore

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.lonelyheartsclub.amore.databinding.ActivitySwipePrefDrinkBinding

class ActivitySwipePrefDrink : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;supportActionBar?.hide()
        val binding  = ActivitySwipePrefDrinkBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Info Check...
        if (Info.drink == null) {Helper.swipePref = true
            startActivity(Intent(this, ActivityProfileDrink::class.java))
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
            if (Pref.drink == null) {
                binding.answerAllSwitch.isChecked = true
                binding.answerOneSwitch.isChecked = true
                binding.answerTwoSwitch.isChecked = true
                binding.answerThreeSwitch.isChecked = true
                binding.answerFourSwitch.isChecked = true
                binding.answerFiveSwitch.isChecked = true
                binding.answerSixSwitch.isChecked = true
                Fun.setUserPercentage(Stat.all,binding.progressBar,binding.percentage)
            } else {
                if (Pref.drink!!.contains("a")){

                    if (Pref.drink!!.contains("b")&&Pref.drink!!.contains("c")&&Pref.drink!!.contains("d")) {
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerAllSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.all, binding.progressBar, binding.percentage)
                    }

                    else if (Pref.drink!!.contains("c")&&Pref.drink!!.contains("d")) {
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.drinkACD, binding.progressBar, binding.percentage)
                    }

                    else if (Pref.drink!!.contains("b")&&Pref.drink!!.contains("d")) {
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.drinkABD, binding.progressBar, binding.percentage)
                    }

                    else if (Pref.drink!!.contains("b")&&Pref.drink!!.contains("c")) {
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.drinkABC, binding.progressBar, binding.percentage)
                    }

                    else if (Pref.drink!!.contains("b")) {
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.drinkAB, binding.progressBar, binding.percentage)
                    }

                    else if (Pref.drink!!.contains("c")) {
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.drinkAC, binding.progressBar, binding.percentage)
                    }

                    else if (Pref.drink!!.contains("d")) {
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.drinkAD, binding.progressBar, binding.percentage)
                    }

                    else {
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.drinkA, binding.progressBar, binding.percentage)
                    }}
                else if (Pref.drink!!.contains("b")){

                    if (Pref.drink!!.contains("c")&&Pref.drink!!.contains("d")) {
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.drinkBCD, binding.progressBar, binding.percentage)
                    }

                    else if (Pref.drink!!.contains("c")) {
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.drinkBC, binding.progressBar, binding.percentage)
                    }

                    else if (Pref.drink!!.contains("d")) {
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.drinkBD, binding.progressBar, binding.percentage)
                    }

                    else {
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.drinkB, binding.progressBar, binding.percentage)
                    }
                }
                else if (Pref.drink!!.contains("c")){

                    if (Pref.drink!!.contains("d")) {
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.drinkCD, binding.progressBar, binding.percentage)
                    }

                    else {
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerAllSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.drinkC, binding.progressBar, binding.percentage)}}
                else {

                    binding.answerOneSwitch.isChecked = false
                    binding.answerTwoSwitch.isChecked = false
                    binding.answerThreeSwitch.isChecked = false
                    binding.answerFourSwitch.isChecked = true
                    binding.answerAllSwitch.isChecked = false
                    Fun.setUserPercentage(Stat.drinkD, binding.progressBar, binding.percentage)}
            }};buildCheckAndSet()
        //on button click
        fun statCheck(){
            Pref.drink = null
            if (binding.answerAllSwitch.isChecked){Pref.drink = mutableListOf("a","b","c","d")}
            if (binding.answerOneSwitch.isChecked){if (Pref.drink != null ){Pref.drink?.add("a")} else {Pref.drink = mutableListOf("a")}}
            if (binding.answerTwoSwitch.isChecked){if (Pref.drink != null ){Pref.drink?.add("b")} else {Pref.drink = mutableListOf("b")}}
            if (binding.answerThreeSwitch.isChecked){if (Pref.drink != null ){Pref.drink?.add("c")} else {Pref.drink = mutableListOf("c")}}
            if (binding.answerFourSwitch.isChecked){if (Pref.drink != null ){Pref.drink?.add("d")} else {Pref.drink = mutableListOf("d")}}
            if (Pref.drink != null ){Pref.drink = Pref.drink!!.distinct().toMutableList()} else {Pref.drink = mutableListOf("a","b","c","d")}
            if (binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked && !binding.answerFourSwitch.isChecked){Fun.setUserPercentage(Stat.drinkA, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked && !binding.answerFourSwitch.isChecked){Fun.setUserPercentage(Stat.drinkB, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked && !binding.answerFourSwitch.isChecked){Fun.setUserPercentage(Stat.drinkC, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked && binding.answerFourSwitch.isChecked){Fun.setUserPercentage(Stat.drinkD, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked && !binding.answerFourSwitch.isChecked){Fun.setUserPercentage(Stat.drinkAB, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked && !binding.answerFourSwitch.isChecked){Fun.setUserPercentage(Stat.drinkAC, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked && binding.answerFourSwitch.isChecked){Fun.setUserPercentage(Stat.drinkAD, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked && !binding.answerFourSwitch.isChecked){Fun.setUserPercentage(Stat.drinkBC, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked && binding.answerFourSwitch.isChecked){Fun.setUserPercentage(Stat.drinkBD, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked && binding.answerFourSwitch.isChecked){Fun.setUserPercentage(Stat.drinkCD, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked && !binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked && binding.answerFourSwitch.isChecked){Fun.setUserPercentage(Stat.drinkACD, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && !binding.answerThreeSwitch.isChecked && binding.answerFourSwitch.isChecked){Fun.setUserPercentage(Stat.drinkABD, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked && !binding.answerFourSwitch.isChecked){Fun.setUserPercentage(Stat.drinkABC, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked && binding.answerTwoSwitch.isChecked && binding.answerThreeSwitch.isChecked && binding.answerFourSwitch.isChecked){Fun.setUserPercentage(Stat.drinkBCD, binding.progressBar, binding.percentage)}
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