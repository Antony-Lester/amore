package app.lonelyheartsclub.amore

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.lonelyheartsclub.amore.databinding.ActivitySwipePrefSmokeBinding

class ActivitySwipePrefSmoke : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;supportActionBar?.hide()
        val binding  = ActivitySwipePrefSmokeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Info Check...
        if (Info.smoke == null) {Helper.swipePref = true
            startActivity(Intent(this, ActivityProfileSmoke::class.java))
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
            if (Pref.smoke == null) {
                binding.answerAllSwitch.isChecked = true
                binding.answerOneSwitch.isChecked = true
                binding.answerTwoSwitch.isChecked = true
                binding.answerThreeSwitch.isChecked = true
                binding.answerFourSwitch.isChecked = true
                binding.answerFiveSwitch.isChecked = true
                binding.answerSixSwitch.isChecked = true
                Fun.setUserPercentage(Stat.all,binding.progressBar,binding.percentage)
            } else {
                if (Pref.smoke!!.contains("a")){
                    if (Pref.smoke!!.contains("b")&&Pref.smoke!!.contains("c")&&Pref.smoke!!.contains("d")&&Pref.smoke!!.contains("e")){
                        binding.answerAllSwitch.isChecked = true
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.all,binding.progressBar,binding.percentage)}
                    else if (Pref.smoke!!.contains("b")&&Pref.smoke!!.contains("c")&&Pref.smoke!!.contains("d")){
                            binding.answerAllSwitch.isChecked = false
                            binding.answerOneSwitch.isChecked = true
                            binding.answerTwoSwitch.isChecked = true
                            binding.answerThreeSwitch.isChecked = true
                            binding.answerFourSwitch.isChecked = true
                            binding.answerFiveSwitch.isChecked = false
                            Fun.setUserPercentage(Stat.smokeABCD,binding.progressBar,binding.percentage)}
                    else if (Pref.smoke!!.contains("b")&&Pref.smoke!!.contains("c")&&Pref.smoke!!.contains("e")){
                            binding.answerAllSwitch.isChecked = false
                            binding.answerOneSwitch.isChecked = true
                            binding.answerTwoSwitch.isChecked = true
                            binding.answerThreeSwitch.isChecked = true
                            binding.answerFourSwitch.isChecked = false
                            binding.answerFiveSwitch.isChecked = true
                            Fun.setUserPercentage(Stat.smokeABCE,binding.progressBar,binding.percentage)}
                    else if (Pref.smoke!!.contains("b")&&Pref.smoke!!.contains("d")&&Pref.smoke!!.contains("e")){
                            binding.answerAllSwitch.isChecked = false
                            binding.answerOneSwitch.isChecked = true
                            binding.answerTwoSwitch.isChecked = true
                            binding.answerThreeSwitch.isChecked = false
                            binding.answerFourSwitch.isChecked = true
                            binding.answerFiveSwitch.isChecked = true
                            Fun.setUserPercentage(Stat.smokeABDE,binding.progressBar,binding.percentage)}
                    else if (Pref.smoke!!.contains("c")&&Pref.smoke!!.contains("d")&&Pref.smoke!!.contains("e")){
                            binding.answerAllSwitch.isChecked = false
                            binding.answerOneSwitch.isChecked = true
                            binding.answerTwoSwitch.isChecked = false
                            binding.answerThreeSwitch.isChecked = true
                            binding.answerFourSwitch.isChecked = true
                            binding.answerFiveSwitch.isChecked = true
                            Fun.setUserPercentage(Stat.smokeACDE,binding.progressBar,binding.percentage)}
                    else if (Pref.smoke!!.contains("b")&&Pref.smoke!!.contains("c")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.smokeABC,binding.progressBar,binding.percentage)}
                    else if (Pref.smoke!!.contains("b")&&Pref.smoke!!.contains("d")){
                            binding.answerAllSwitch.isChecked = false
                            binding.answerOneSwitch.isChecked = true
                            binding.answerTwoSwitch.isChecked = true
                            binding.answerThreeSwitch.isChecked = false
                            binding.answerFourSwitch.isChecked = true
                            binding.answerFiveSwitch.isChecked = false
                            Fun.setUserPercentage(Stat.smokeABD,binding.progressBar,binding.percentage)}
                    else if (Pref.smoke!!.contains("b")&&Pref.smoke!!.contains("e")){
                            binding.answerAllSwitch.isChecked = false
                            binding.answerOneSwitch.isChecked = true
                            binding.answerTwoSwitch.isChecked = true
                            binding.answerThreeSwitch.isChecked = false
                            binding.answerFourSwitch.isChecked = false
                            binding.answerFiveSwitch.isChecked = true
                            Fun.setUserPercentage(Stat.smokeABE,binding.progressBar,binding.percentage)}
                    else if (Pref.smoke!!.contains("c")&&Pref.smoke!!.contains("d")){
                            binding.answerAllSwitch.isChecked = false
                            binding.answerOneSwitch.isChecked = true
                            binding.answerTwoSwitch.isChecked = false
                            binding.answerThreeSwitch.isChecked = true
                            binding.answerFourSwitch.isChecked = true
                            binding.answerFiveSwitch.isChecked = false
                            Fun.setUserPercentage(Stat.smokeACD,binding.progressBar,binding.percentage)}
                    else if (Pref.smoke!!.contains("c")&&Pref.smoke!!.contains("e")){
                            binding.answerAllSwitch.isChecked = false
                            binding.answerOneSwitch.isChecked = true
                            binding.answerTwoSwitch.isChecked = false
                            binding.answerThreeSwitch.isChecked = true
                            binding.answerFourSwitch.isChecked = false
                            binding.answerFiveSwitch.isChecked = true
                            Fun.setUserPercentage(Stat.smokeACE,binding.progressBar,binding.percentage)}
                    else if (Pref.smoke!!.contains("d")&&Pref.smoke!!.contains("e")){
                            binding.answerAllSwitch.isChecked = false
                            binding.answerOneSwitch.isChecked = true
                            binding.answerTwoSwitch.isChecked = false
                            binding.answerThreeSwitch.isChecked = false
                            binding.answerFourSwitch.isChecked = true
                            binding.answerFiveSwitch.isChecked = true
                            Fun.setUserPercentage(Stat.smokeADE,binding.progressBar,binding.percentage)}
                    else if (Pref.smoke!!.contains("b")){
                            binding.answerAllSwitch.isChecked = false
                            binding.answerOneSwitch.isChecked = true
                            binding.answerTwoSwitch.isChecked = true
                            binding.answerThreeSwitch.isChecked = false
                            binding.answerFourSwitch.isChecked = false
                            binding.answerFiveSwitch.isChecked = false
                            Fun.setUserPercentage(Stat.smokeAB,binding.progressBar,binding.percentage)}
                    else if (Pref.smoke!!.contains("c")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.smokeAC,binding.progressBar,binding.percentage)}
                    else if (Pref.smoke!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.smokeAD,binding.progressBar,binding.percentage)}
                    else if (Pref.smoke!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.smokeAE,binding.progressBar,binding.percentage)}
                    else {binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.smokeA,binding.progressBar,binding.percentage)}}

                if (Pref.smoke!!.contains("b")){
                    if (Pref.smoke!!.contains("c")&&Pref.smoke!!.contains("d")&&Pref.smoke!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.smokeBCDE,binding.progressBar,binding.percentage)}
                    else if (Pref.smoke!!.contains("c")&&Pref.smoke!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.smokeBCD,binding.progressBar,binding.percentage)}
                    else if (Pref.smoke!!.contains("c")&&Pref.smoke!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.smokeBCE,binding.progressBar,binding.percentage)}
                    else if (Pref.smoke!!.contains("d")&&Pref.smoke!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.smokeBDE,binding.progressBar,binding.percentage)}
                    else if (Pref.smoke!!.contains("c")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.smokeBC,binding.progressBar,binding.percentage)}
                    else if (Pref.smoke!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.smokeBC,binding.progressBar,binding.percentage)}
                    else if (Pref.smoke!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.smokeBE,binding.progressBar,binding.percentage)}
                    else {binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.smokeB,binding.progressBar,binding.percentage)}}

                if (Pref.smoke!!.contains("c")){
                    if (Pref.smoke!!.contains("d")&&Pref.smoke!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.smokeCDE,binding.progressBar,binding.percentage)}
                    if (Pref.smoke!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.smokeCD,binding.progressBar,binding.percentage)}
                    if (Pref.smoke!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.smokeCE,binding.progressBar,binding.percentage)}
                    else{binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.smokeC,binding.progressBar,binding.percentage)}}
                if (Pref.smoke!!.contains("d")){
                    if (Pref.smoke!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.smokeDE,binding.progressBar,binding.percentage)}
                    else {
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.smokeD,binding.progressBar,binding.percentage)}}
                else {
                    binding.answerAllSwitch.isChecked = false
                    binding.answerOneSwitch.isChecked = false
                    binding.answerTwoSwitch.isChecked = false
                    binding.answerThreeSwitch.isChecked = false
                    binding.answerFourSwitch.isChecked = false
                    binding.answerFiveSwitch.isChecked = true
                    Fun.setUserPercentage(Stat.smokeE,binding.progressBar,binding.percentage)}}};buildCheckAndSet()
        //on button click
        fun statCheck(){
            Pref.smoke = null
            if (binding.answerAllSwitch.isChecked){Pref.smoke = mutableListOf("a","b","c","d","e")}
            if (binding.answerOneSwitch.isChecked){if (Pref.smoke != null ){Pref.smoke?.add("a")} else {Pref.smoke = mutableListOf("a")}}
            if (binding.answerTwoSwitch.isChecked){if (Pref.smoke != null ){Pref.smoke?.add("b")} else {Pref.smoke = mutableListOf("b")}}
            if (binding.answerThreeSwitch.isChecked){if (Pref.smoke != null ){Pref.smoke?.add("c")} else {Pref.smoke = mutableListOf("c")}}
            if (binding.answerFourSwitch.isChecked){if (Pref.smoke != null ){Pref.smoke?.add("d")} else {Pref.smoke = mutableListOf("d")}}
            if (binding.answerFiveSwitch.isChecked){if (Pref.smoke != null ){Pref.smoke?.add("e")} else {Pref.smoke = mutableListOf("e")}}
            if (Pref.smoke != null ){Pref.smoke = Pref.smoke!!.distinct().toMutableList()} else {Pref.smoke = mutableListOf("a","b","c","d","e")}
            if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked){Fun.setUserPercentage(Stat.all, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked){Fun.setUserPercentage(Stat.smokeA, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked){Fun.setUserPercentage(Stat.smokeB, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked){Fun.setUserPercentage(Stat.smokeC, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked){Fun.setUserPercentage(Stat.smokeD, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked){Fun.setUserPercentage(Stat.smokeE, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked){Fun.setUserPercentage(Stat.smokeAB, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked){Fun.setUserPercentage(Stat.smokeAC, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked){Fun.setUserPercentage(Stat.smokeAD, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked){Fun.setUserPercentage(Stat.smokeAE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked){Fun.setUserPercentage(Stat.smokeBC, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked){Fun.setUserPercentage(Stat.smokeBD, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked){Fun.setUserPercentage(Stat.smokeBE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked){Fun.setUserPercentage(Stat.smokeCD, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked){Fun.setUserPercentage(Stat.smokeCE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked){Fun.setUserPercentage(Stat.smokeDE, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked){Fun.setUserPercentage(Stat.smokeACD, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked){Fun.setUserPercentage(Stat.smokeABD, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked){Fun.setUserPercentage(Stat.smokeABC, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked){Fun.setUserPercentage(Stat.smokeBCD, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked){Fun.setUserPercentage(Stat.smokeABE, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked){Fun.setUserPercentage(Stat.smokeACE, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked){Fun.setUserPercentage(Stat.smokeADE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked){Fun.setUserPercentage(Stat.smokeBCE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked){Fun.setUserPercentage(Stat.smokeBDE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked){Fun.setUserPercentage(Stat.smokeCDE, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked){Fun.setUserPercentage(Stat.smokeABCD, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked){Fun.setUserPercentage(Stat.smokeABCE, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked){Fun.setUserPercentage(Stat.smokeABDE, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked){Fun.setUserPercentage(Stat.smokeACDE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked){Fun.setUserPercentage(Stat.smokeBCDE, binding.progressBar, binding.percentage)}
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
                ! binding.answerFourSwitch.isChecked &&
                ! binding.answerFiveSwitch.isChecked) {
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
                ! binding.answerFourSwitch.isChecked &&
                ! binding.answerFiveSwitch.isChecked ) {
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
                ! binding.answerFourSwitch.isChecked &&
                ! binding.answerFiveSwitch.isChecked ) {
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
                ! binding.answerThreeSwitch.isChecked &&
                ! binding.answerFiveSwitch.isChecked) {
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