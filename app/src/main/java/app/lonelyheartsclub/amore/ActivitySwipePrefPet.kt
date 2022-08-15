package app.lonelyheartsclub.amore

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.lonelyheartsclub.amore.databinding.ActivitySwipePrefPetBinding

class ActivitySwipePrefPet : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;supportActionBar?.hide()
        val binding  = ActivitySwipePrefPetBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Info Check...
        if (Info.pet == null) {Helper.swipePref = true
            startActivity(Intent(this, ActivityProfilePet::class.java))
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
            if (Pref.pet == null) {
                binding.answerAllSwitch.isChecked = true
                binding.answerOneSwitch.isChecked = true
                binding.answerTwoSwitch.isChecked = true
                binding.answerThreeSwitch.isChecked = true
                binding.answerFourSwitch.isChecked = true
                binding.answerFiveSwitch.isChecked = true
                binding.answerSixSwitch.isChecked = true
                Fun.setUserPercentage(Stat.all,binding.progressBar,binding.percentage)
            } else {
                if (Pref.pet!!.contains("a")){
                    if (Pref.pet!!.contains("b")&&Pref.pet!!.contains("c")&&Pref.pet!!.contains("d")&&Pref.pet!!.contains("e")&&Pref.pet!!.contains("f")){
                        binding.answerAllSwitch.isChecked = true
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.all,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("b")&&Pref.pet!!.contains("c")&&Pref.pet!!.contains("d")&&Pref.pet!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.petABCDE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("b")&&Pref.pet!!.contains("c")&&Pref.pet!!.contains("d")&&Pref.pet!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.petABCDF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("b")&&Pref.pet!!.contains("c")&&Pref.pet!!.contains("f")&&Pref.pet!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.petABCEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("b")&&Pref.pet!!.contains("f")&&Pref.pet!!.contains("d")&&Pref.pet!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.petABDEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("f")&&Pref.pet!!.contains("c")&&Pref.pet!!.contains("d")&&Pref.pet!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.petACDEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("b")&&Pref.pet!!.contains("c")&&Pref.pet!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.petABCD,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("b")&&Pref.pet!!.contains("c")&&Pref.pet!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.petABCF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("b")&&Pref.pet!!.contains("e")&&Pref.pet!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.petABEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("d")&&Pref.pet!!.contains("e")&&Pref.pet!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.petADEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("b")&&Pref.pet!!.contains("c")&&Pref.pet!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.petABCE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("b")&&Pref.pet!!.contains("f")&&Pref.pet!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.petABDF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("e")&&Pref.pet!!.contains("c")&&Pref.pet!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.petACEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("e")&&Pref.pet!!.contains("c")&&Pref.pet!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.petACDE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("b")&&Pref.pet!!.contains("c")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.petABC,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("b")&&Pref.pet!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.petABD,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("b")&&Pref.pet!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.petABE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("b")&&Pref.pet!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.petABF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("c")&&Pref.pet!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.petACD,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("e")&&Pref.pet!!.contains("c")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.petACE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("f")&&Pref.pet!!.contains("c")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.petACF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("d")&&Pref.pet!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.petADE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("d")&&Pref.pet!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.petADF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("e")&&Pref.pet!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.petAEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("b")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.petAB,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("c")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.petAC,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.petAD,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.petAE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.petAF,binding.progressBar,binding.percentage)
                    }

                    else{
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.petA,binding.progressBar,binding.percentage)
                    }

                }
                else if (Pref.pet!!.contains("b")){
                    if (Pref.pet!!.contains("f")&&Pref.pet!!.contains("c")&&Pref.pet!!.contains("d")&&Pref.pet!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.petBCDEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("e")&&Pref.pet!!.contains("c")&&Pref.pet!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.petBCDE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("e")&&Pref.pet!!.contains("f")&&Pref.pet!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.petBDEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("f")&&Pref.pet!!.contains("c")&&Pref.pet!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.petBCDF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("d")&&Pref.pet!!.contains("c")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.petBCD,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("d")&&Pref.pet!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.petBDE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("e")&&Pref.pet!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.petBEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("c")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.petBC,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.petBD,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.petBE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.petBF,binding.progressBar,binding.percentage)
                    }

                    else{binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.petF,binding.progressBar,binding.percentage)}

                }
                else if (Pref.pet!!.contains("c")){
                    if (Pref.pet!!.contains("d")&&Pref.pet!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.petCDE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("e")&&Pref.pet!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.petCEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.petCD,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.petCE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.petCF,binding.progressBar,binding.percentage)
                    }

                    else{
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.petC,binding.progressBar,binding.percentage)}}

                else if (Pref.pet!!.contains("d")){
                    if (Pref.pet!!.contains("e")&&Pref.pet!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.petDEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.petDE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.pet!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.petDF,binding.progressBar,binding.percentage)
                    }

                    else{binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.petD,binding.progressBar,binding.percentage)}

                }
                else if (Pref.pet!!.contains("e")){
                    if (Pref.pet!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.petEF,binding.progressBar,binding.percentage)
                    }

                    else{binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.petE,binding.progressBar,binding.percentage)}

                }
                else {
                    binding.answerAllSwitch.isChecked = false
                    binding.answerOneSwitch.isChecked = false
                    binding.answerTwoSwitch.isChecked = false
                    binding.answerThreeSwitch.isChecked = false
                    binding.answerFourSwitch.isChecked = false
                    binding.answerFiveSwitch.isChecked = false
                    binding.answerSixSwitch.isChecked = true
                    Fun.setUserPercentage(Stat.petF,binding.progressBar,binding.percentage)

                }}};buildCheckAndSet()
        //on button click
        fun statCheck(){
            Pref.pet = null
                if (binding.answerAllSwitch.isChecked){Pref.pet = mutableListOf("a","b","c","d","e","f")}
            if (binding.answerOneSwitch.isChecked){if (Pref.pet != null ){Pref.pet?.add("a")} else {Pref.pet = mutableListOf("a")}}
            if (binding.answerTwoSwitch.isChecked){if (Pref.pet != null ){Pref.pet?.add("b")} else {Pref.pet = mutableListOf("b")}}
            if (binding.answerThreeSwitch.isChecked){if (Pref.pet != null ){Pref.pet?.add("c")} else {Pref.pet = mutableListOf("c")}}
            if (binding.answerFourSwitch.isChecked){if (Pref.pet != null ){Pref.pet?.add("d")} else {Pref.pet = mutableListOf("d")}}
            if (binding.answerFiveSwitch.isChecked){if (Pref.pet != null ){Pref.pet?.add("e")} else {Pref.pet = mutableListOf("e")}}
            if (binding.answerSixSwitch.isChecked){if (Pref.pet != null ){Pref.pet?.add("f")} else {Pref.pet = mutableListOf("f")}}
            if (Pref.pet != null ){Pref.pet = Pref.pet!!.distinct().toMutableList()} else {Pref.pet = mutableListOf("a","b","c","d","e","f")}
            if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petA, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petB, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petC, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petD, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petAB, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petAC, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petAD, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petAE, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petAF, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petBC, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petBD, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petBE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petBF, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petCD, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petCE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petCF, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petDE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petDF, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petEF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petABC, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petABD, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petABE, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petABF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petACD, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petACE, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petACF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petADE, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petADF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petAEF, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petBCD, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petBDE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petBEF, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petCDE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petCEF, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petDEF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petABCD, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petABCF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petABEF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petADEF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petABCE, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petABDF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petACEF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petACDE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petBCDE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petBDEF, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petBCDF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petABCDE, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petABCDF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petABCEF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petABDEF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petACDEF, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petBCDEF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.petABCDEF, binding.progressBar, binding.percentage)}
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