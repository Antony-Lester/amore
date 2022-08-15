package app.lonelyheartsclub.amore

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.lonelyheartsclub.amore.databinding.ActivitySwipePrefRaceBinding

class ActivitySwipePrefRace : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;supportActionBar?.hide()
        val binding  = ActivitySwipePrefRaceBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Info Check...
        if (Info.race == null) {Helper.swipePref = true
            startActivity(Intent(this, ActivityProfileRace::class.java))
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
            if (Pref.race == null) {
                binding.answerAllSwitch.isChecked = true
                binding.answerOneSwitch.isChecked = true
                binding.answerTwoSwitch.isChecked = true
                binding.answerThreeSwitch.isChecked = true
                binding.answerFourSwitch.isChecked = true
                binding.answerFiveSwitch.isChecked = true
                binding.answerSixSwitch.isChecked = true
                Fun.setUserPercentage(Stat.all,binding.progressBar,binding.percentage)
            } else {
                if (Pref.race!!.contains("a")){
                    if (Pref.race!!.contains("b")&&Pref.race!!.contains("c")&&Pref.race!!.contains("d")&&Pref.race!!.contains("e")&&Pref.race!!.contains("f")){
                        binding.answerAllSwitch.isChecked = true
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.all,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("b")&&Pref.race!!.contains("c")&&Pref.race!!.contains("d")&&Pref.race!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.raceABCDE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("b")&&Pref.race!!.contains("c")&&Pref.race!!.contains("d")&&Pref.race!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.raceABCDF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("b")&&Pref.race!!.contains("c")&&Pref.race!!.contains("f")&&Pref.race!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.raceABCEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("b")&&Pref.race!!.contains("f")&&Pref.race!!.contains("d")&&Pref.race!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.raceABDEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("f")&&Pref.race!!.contains("c")&&Pref.race!!.contains("d")&&Pref.race!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.raceACDEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("b")&&Pref.race!!.contains("c")&&Pref.race!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.raceABCD,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("b")&&Pref.race!!.contains("c")&&Pref.race!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.raceABCF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("b")&&Pref.race!!.contains("e")&&Pref.race!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.raceABEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("d")&&Pref.race!!.contains("e")&&Pref.race!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.raceADEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("b")&&Pref.race!!.contains("c")&&Pref.race!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.raceABCE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("b")&&Pref.race!!.contains("f")&&Pref.race!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.raceABDF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("e")&&Pref.race!!.contains("c")&&Pref.race!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.raceACEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("e")&&Pref.race!!.contains("c")&&Pref.race!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.raceACDE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("b")&&Pref.race!!.contains("c")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.raceABC,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("b")&&Pref.race!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.raceABD,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("b")&&Pref.race!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.raceABE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("b")&&Pref.race!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.raceABF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("c")&&Pref.race!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.raceACD,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("e")&&Pref.race!!.contains("c")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.raceACE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("f")&&Pref.race!!.contains("c")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.raceACF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("d")&&Pref.race!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.raceADE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("d")&&Pref.race!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.raceADF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("e")&&Pref.race!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.raceAEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("b")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.raceAB,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("c")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.raceAC,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.raceAD,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.raceAE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.raceAF,binding.progressBar,binding.percentage)
                    }

                    else{
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.raceA,binding.progressBar,binding.percentage)
                    }

                }
                else if (Pref.race!!.contains("b")){
                    if (Pref.race!!.contains("f")&&Pref.race!!.contains("c")&&Pref.race!!.contains("d")&&Pref.race!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.raceBCDEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("e")&&Pref.race!!.contains("c")&&Pref.race!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.raceBCDE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("e")&&Pref.race!!.contains("f")&&Pref.race!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.raceBDEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("f")&&Pref.race!!.contains("c")&&Pref.race!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.raceBCDF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("d")&&Pref.race!!.contains("c")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.raceBCD,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("d")&&Pref.race!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.raceBDE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("e")&&Pref.race!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.raceBEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("c")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.raceBC,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.raceBD,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.raceBE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.raceBF,binding.progressBar,binding.percentage)
                    }

                    else{binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.raceF,binding.progressBar,binding.percentage)}

                }
                else if (Pref.race!!.contains("c")){
                    if (Pref.race!!.contains("d")&&Pref.race!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.raceCDE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("e")&&Pref.race!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.raceCEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.raceCD,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.raceCE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.raceCF,binding.progressBar,binding.percentage)
                    }

                    else{
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.raceC,binding.progressBar,binding.percentage)}}

                else if (Pref.race!!.contains("d")){
                    if (Pref.race!!.contains("e")&&Pref.race!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.raceDEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.raceDE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.race!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.raceDF,binding.progressBar,binding.percentage)
                    }

                    else{binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.raceD,binding.progressBar,binding.percentage)}

                }
                else if (Pref.race!!.contains("e")){
                    if (Pref.race!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.raceEF,binding.progressBar,binding.percentage)
                    }

                    else{binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.raceE,binding.progressBar,binding.percentage)}

                }
                else {
                    binding.answerAllSwitch.isChecked = false
                    binding.answerOneSwitch.isChecked = false
                    binding.answerTwoSwitch.isChecked = false
                    binding.answerThreeSwitch.isChecked = false
                    binding.answerFourSwitch.isChecked = false
                    binding.answerFiveSwitch.isChecked = false
                    binding.answerSixSwitch.isChecked = true
                    Fun.setUserPercentage(Stat.raceF,binding.progressBar,binding.percentage)

                }}};buildCheckAndSet()
        //on button click
        fun statCheck(){
            Pref.race = null
            if (binding.answerAllSwitch.isChecked){Pref.race = mutableListOf("a","b","c","d","e","f")}
            if (binding.answerOneSwitch.isChecked){if (Pref.race != null ){Pref.race?.add("a")} else {Pref.race = mutableListOf("a")}}
            if (binding.answerTwoSwitch.isChecked){if (Pref.race != null ){Pref.race?.add("b")} else {Pref.race = mutableListOf("b")}}
            if (binding.answerThreeSwitch.isChecked){if (Pref.race != null ){Pref.race?.add("c")} else {Pref.race = mutableListOf("c")}}
            if (binding.answerFourSwitch.isChecked){if (Pref.race != null ){Pref.race?.add("d")} else {Pref.race = mutableListOf("d")}}
            if (binding.answerFiveSwitch.isChecked){if (Pref.race != null ){Pref.race?.add("e")} else {Pref.race = mutableListOf("e")}}
            if (binding.answerSixSwitch.isChecked){if (Pref.race != null ){Pref.race?.add("f")} else {Pref.race = mutableListOf("f")}}
            if (Pref.race != null ){Pref.race = Pref.race!!.distinct().toMutableList()} else {Pref.race = mutableListOf("a","b","c","d","e","f")}
            if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceA, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceB, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceC, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceD, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceAB, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceAC, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceAD, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceAE, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceAF, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceBC, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceBD, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceBE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceBF, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceCD, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceCE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceCF, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceDE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceDF, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceEF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceABC, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceABD, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceABE, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceABF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceACD, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceACE, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceACF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceADE, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceADF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceAEF, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceBCD, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceBDE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceBEF, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceCDE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceCEF, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceDEF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceABCD, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceABCF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceABEF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceADEF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceABCE, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceABDF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceACEF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceACDE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceBCDE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceBDEF, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceBCDF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceABCDE, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceABCDF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceABCEF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceABDEF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceACDEF, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceBCDEF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.raceABCDEF, binding.progressBar, binding.percentage)}
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
                ! binding.answerFiveSwitch.isChecked
                && ! binding.answerSixSwitch.isChecked) {
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
                ! binding.answerFiveSwitch.isChecked
                && ! binding.answerSixSwitch.isChecked) {
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
                ! binding.answerFiveSwitch.isChecked
                && ! binding.answerSixSwitch.isChecked) {
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
                ! binding.answerFiveSwitch.isChecked
                && ! binding.answerSixSwitch.isChecked) {
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
                ! binding.answerFourSwitch.isChecked
                && ! binding.answerSixSwitch.isChecked) {
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