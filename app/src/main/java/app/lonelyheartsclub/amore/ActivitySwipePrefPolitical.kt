package app.lonelyheartsclub.amore

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.lonelyheartsclub.amore.databinding.ActivitySwipePrefPoliticalBinding

class ActivitySwipePrefPolitical : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;supportActionBar?.hide()
        val binding  = ActivitySwipePrefPoliticalBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Info Check...
        if (Info.political == null) {Helper.swipePref = true
            startActivity(Intent(this, ActivityProfilePolitical::class.java))
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
            if (Pref.political == null) {
                binding.answerAllSwitch.isChecked = true
                binding.answerOneSwitch.isChecked = true
                binding.answerTwoSwitch.isChecked = true
                binding.answerThreeSwitch.isChecked = true
                binding.answerFourSwitch.isChecked = true
                binding.answerFiveSwitch.isChecked = true
                binding.answerSixSwitch.isChecked = true
                Fun.setUserPercentage(Stat.all,binding.progressBar,binding.percentage)
            } else {
                if (Pref.political!!.contains("a")){
                    if (Pref.political!!.contains("b")&&Pref.political!!.contains("c")&&Pref.political!!.contains("d")&&Pref.political!!.contains("e")&&Pref.political!!.contains("f")){
                        binding.answerAllSwitch.isChecked = true
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.all,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("b")&&Pref.political!!.contains("c")&&Pref.political!!.contains("d")&&Pref.political!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.politicalABCDE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("b")&&Pref.political!!.contains("c")&&Pref.political!!.contains("d")&&Pref.political!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.politicalABCDF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("b")&&Pref.political!!.contains("c")&&Pref.political!!.contains("f")&&Pref.political!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.politicalABCEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("b")&&Pref.political!!.contains("f")&&Pref.political!!.contains("d")&&Pref.political!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.politicalABDEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("f")&&Pref.political!!.contains("c")&&Pref.political!!.contains("d")&&Pref.political!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.politicalACDEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("b")&&Pref.political!!.contains("c")&&Pref.political!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.politicalABCD,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("b")&&Pref.political!!.contains("c")&&Pref.political!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.politicalABCF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("b")&&Pref.political!!.contains("e")&&Pref.political!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.politicalABEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("d")&&Pref.political!!.contains("e")&&Pref.political!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.politicalADEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("b")&&Pref.political!!.contains("c")&&Pref.political!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.politicalABCE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("b")&&Pref.political!!.contains("f")&&Pref.political!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.politicalABDF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("e")&&Pref.political!!.contains("c")&&Pref.political!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.politicalACEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("e")&&Pref.political!!.contains("c")&&Pref.political!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.politicalACDE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("b")&&Pref.political!!.contains("c")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.politicalABC,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("b")&&Pref.political!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.politicalABD,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("b")&&Pref.political!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.politicalABE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("b")&&Pref.political!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.politicalABF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("c")&&Pref.political!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.politicalACD,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("e")&&Pref.political!!.contains("c")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.politicalACE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("f")&&Pref.political!!.contains("c")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.politicalACF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("d")&&Pref.political!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.politicalADE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("d")&&Pref.political!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.politicalADF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("e")&&Pref.political!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.politicalAEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("b")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.politicalAB,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("c")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.politicalAC,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.politicalAD,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.politicalAE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.politicalAF,binding.progressBar,binding.percentage)
                    }

                    else{
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.politicalA,binding.progressBar,binding.percentage)
                    }

                }
                else if (Pref.political!!.contains("b")){
                    if (Pref.political!!.contains("f")&&Pref.political!!.contains("c")&&Pref.political!!.contains("d")&&Pref.political!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.politicalBCDEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("e")&&Pref.political!!.contains("c")&&Pref.political!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.politicalBCDE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("e")&&Pref.political!!.contains("f")&&Pref.political!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.politicalBDEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("f")&&Pref.political!!.contains("c")&&Pref.political!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.politicalBCDF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("d")&&Pref.political!!.contains("c")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.politicalBCD,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("d")&&Pref.political!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.politicalBDE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("e")&&Pref.political!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.politicalBEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("c")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.politicalBC,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.politicalBD,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.politicalBE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.politicalBF,binding.progressBar,binding.percentage)
                    }

                    else{binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.politicalF,binding.progressBar,binding.percentage)}

                }
                else if (Pref.political!!.contains("c")){
                    if (Pref.political!!.contains("d")&&Pref.political!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.politicalCDE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("e")&&Pref.political!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.politicalCEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.politicalCD,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.politicalCE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.politicalCF,binding.progressBar,binding.percentage)
                    }

                    else{
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.politicalC,binding.progressBar,binding.percentage)}}

                else if (Pref.political!!.contains("d")){
                    if (Pref.political!!.contains("e")&&Pref.political!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.politicalDEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.politicalDE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.political!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.politicalDF,binding.progressBar,binding.percentage)
                    }

                    else{binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.politicalD,binding.progressBar,binding.percentage)}

                }
                else if (Pref.political!!.contains("e")){
                    if (Pref.political!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.politicalEF,binding.progressBar,binding.percentage)
                    }

                    else{binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.politicalE,binding.progressBar,binding.percentage)}

                }
                else {
                    binding.answerAllSwitch.isChecked = false
                    binding.answerOneSwitch.isChecked = false
                    binding.answerTwoSwitch.isChecked = false
                    binding.answerThreeSwitch.isChecked = false
                    binding.answerFourSwitch.isChecked = false
                    binding.answerFiveSwitch.isChecked = false
                    binding.answerSixSwitch.isChecked = true
                    Fun.setUserPercentage(Stat.politicalF,binding.progressBar,binding.percentage)

                }}};buildCheckAndSet()
        //on button click
        fun statCheck(){
            Pref.political = null
                if (binding.answerAllSwitch.isChecked){Pref.political = mutableListOf("a","b","c","d","e","f")}
            if (binding.answerOneSwitch.isChecked){if (Pref.political != null ){Pref.political?.add("a")} else {Pref.political = mutableListOf("a")}}
            if (binding.answerTwoSwitch.isChecked){if (Pref.political != null ){Pref.political?.add("b")} else {Pref.political = mutableListOf("b")}}
            if (binding.answerThreeSwitch.isChecked){if (Pref.political != null ){Pref.political?.add("c")} else {Pref.political = mutableListOf("c")}}
            if (binding.answerFourSwitch.isChecked){if (Pref.political != null ){Pref.political?.add("d")} else {Pref.political = mutableListOf("d")}}
            if (binding.answerFiveSwitch.isChecked){if (Pref.political != null ){Pref.political?.add("e")} else {Pref.political = mutableListOf("e")}}
            if (binding.answerSixSwitch.isChecked){if (Pref.political != null ){Pref.political?.add("f")} else {Pref.political = mutableListOf("f")}}
            if (Pref.political != null ){Pref.political = Pref.political!!.distinct().toMutableList()} else {Pref.political = mutableListOf("a","b","c","d","e","f")}
            if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalA, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalB, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalC, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalD, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalAB, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalAC, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalAD, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalAE, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalAF, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalBC, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalBD, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalBE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalBF, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalCD, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalCE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalCF, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalDE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalDF, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalEF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalABC, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalABD, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalABE, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalABF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalACD, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalACE, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalACF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalADE, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalADF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalAEF, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalBCD, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalBDE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalBEF, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalCDE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalCEF, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalDEF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalABCD, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalABCF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalABEF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalADEF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalABCE, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalABDF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalACEF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalACDE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalBCDE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalBDEF, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalBCDF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalABCDE, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalABCDF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalABCEF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalABDEF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalACDEF, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalBCDEF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.politicalABCDEF, binding.progressBar, binding.percentage)}
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
            else {binding.answerAllSwitch.isChecked = false;statCheck()}}
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