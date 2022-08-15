package app.lonelyheartsclub.amore

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.lonelyheartsclub.amore.databinding.ActivitySwipePrefRelationshipBinding

class ActivitySwipePrefRelationship : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;supportActionBar?.hide()
        val binding  = ActivitySwipePrefRelationshipBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Info Check...
        if (Info.relationship == null) {Helper.swipePref = true
            startActivity(Intent(this, ActivityProfileRelationship::class.java))
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
            if (Pref.food == null) {
                binding.answerAllSwitch.isChecked = true
                binding.answerOneSwitch.isChecked = true
                binding.answerTwoSwitch.isChecked = true
                binding.answerThreeSwitch.isChecked = true
                binding.answerFourSwitch.isChecked = true
                binding.answerFiveSwitch.isChecked = true
                binding.answerSixSwitch.isChecked = true
                Fun.setUserPercentage(Stat.all,binding.progressBar,binding.percentage)
            } else {
                if (Pref.relationship!!.contains("a")){
                    if (Pref.relationship!!.contains("b")&&Pref.relationship!!.contains("c")&&Pref.relationship!!.contains("d")&&Pref.relationship!!.contains("e")&&Pref.relationship!!.contains("f")){
                        binding.answerAllSwitch.isChecked = true
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.all,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("b")&&Pref.relationship!!.contains("c")&&Pref.relationship!!.contains("d")&&Pref.relationship!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.relationshipABCDE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("b")&&Pref.relationship!!.contains("c")&&Pref.relationship!!.contains("d")&&Pref.relationship!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.relationshipABCDF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("b")&&Pref.relationship!!.contains("c")&&Pref.relationship!!.contains("f")&&Pref.relationship!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.relationshipABCEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("b")&&Pref.relationship!!.contains("f")&&Pref.relationship!!.contains("d")&&Pref.relationship!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.relationshipABDEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("f")&&Pref.relationship!!.contains("c")&&Pref.relationship!!.contains("d")&&Pref.relationship!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.relationshipACDEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("b")&&Pref.relationship!!.contains("c")&&Pref.relationship!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.relationshipABCD,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("b")&&Pref.relationship!!.contains("c")&&Pref.relationship!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.relationshipABCF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("b")&&Pref.relationship!!.contains("e")&&Pref.relationship!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.relationshipABEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("d")&&Pref.relationship!!.contains("e")&&Pref.relationship!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.relationshipADEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("b")&&Pref.relationship!!.contains("c")&&Pref.relationship!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.relationshipABCE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("b")&&Pref.relationship!!.contains("f")&&Pref.relationship!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.relationshipABDF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("e")&&Pref.relationship!!.contains("c")&&Pref.relationship!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.relationshipACEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("e")&&Pref.relationship!!.contains("c")&&Pref.relationship!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.relationshipACDE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("b")&&Pref.relationship!!.contains("c")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.relationshipABC,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("b")&&Pref.relationship!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.relationshipABD,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("b")&&Pref.relationship!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.relationshipABE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("b")&&Pref.relationship!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.relationshipABF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("c")&&Pref.relationship!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.relationshipACD,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("e")&&Pref.relationship!!.contains("c")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.relationshipACE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("f")&&Pref.relationship!!.contains("c")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.relationshipACF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("d")&&Pref.relationship!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.relationshipADE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("d")&&Pref.relationship!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.relationshipADF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("e")&&Pref.relationship!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.relationshipAEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("b")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.relationshipAB,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("c")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.relationshipAC,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.relationshipAD,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.relationshipAE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.relationshipAF,binding.progressBar,binding.percentage)
                    }

                    else{
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = true
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.relationshipA,binding.progressBar,binding.percentage)
                    }

                }
                else if (Pref.relationship!!.contains("b")){
                    if (Pref.relationship!!.contains("f")&&Pref.relationship!!.contains("c")&&Pref.relationship!!.contains("d")&&Pref.relationship!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.relationshipBCDEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("e")&&Pref.relationship!!.contains("c")&&Pref.relationship!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.relationshipBCDE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("e")&&Pref.relationship!!.contains("f")&&Pref.relationship!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.relationshipBDEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("f")&&Pref.relationship!!.contains("c")&&Pref.relationship!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.relationshipBCDF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("d")&&Pref.relationship!!.contains("c")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.relationshipBCD,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("d")&&Pref.relationship!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.relationshipBDE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("e")&&Pref.relationship!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.relationshipBEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("c")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.relationshipBC,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.relationshipBD,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.relationshipBE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.relationshipBF,binding.progressBar,binding.percentage)
                    }

                    else{binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = true
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.relationshipF,binding.progressBar,binding.percentage)}

                }
                else if (Pref.relationship!!.contains("c")){
                    if (Pref.relationship!!.contains("d")&&Pref.relationship!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.relationshipCDE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("e")&&Pref.relationship!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.relationshipCEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("d")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.relationshipCD,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.relationshipCE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.relationshipCF,binding.progressBar,binding.percentage)
                    }

                    else{
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = true
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.relationshipC,binding.progressBar,binding.percentage)}}

                else if (Pref.relationship!!.contains("d")){
                    if (Pref.food!!.contains("e")&&Pref.food!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.relationshipDEF,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("e")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.relationshipDE,binding.progressBar,binding.percentage)
                    }

                    else if (Pref.relationship!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.relationshipDF,binding.progressBar,binding.percentage)
                    }

                    else{binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = true
                        binding.answerFiveSwitch.isChecked = false
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.relationshipD,binding.progressBar,binding.percentage)}

                }
                else if (Pref.relationship!!.contains("e")){
                    if (Pref.relationship!!.contains("f")){
                        binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = true
                        Fun.setUserPercentage(Stat.relationshipEF,binding.progressBar,binding.percentage)
                    }

                    else{binding.answerAllSwitch.isChecked = false
                        binding.answerOneSwitch.isChecked = false
                        binding.answerTwoSwitch.isChecked = false
                        binding.answerThreeSwitch.isChecked = false
                        binding.answerFourSwitch.isChecked = false
                        binding.answerFiveSwitch.isChecked = true
                        binding.answerSixSwitch.isChecked = false
                        Fun.setUserPercentage(Stat.relationshipE,binding.progressBar,binding.percentage)}

                }
                else {
                    binding.answerAllSwitch.isChecked = false
                    binding.answerOneSwitch.isChecked = false
                    binding.answerTwoSwitch.isChecked = false
                    binding.answerThreeSwitch.isChecked = false
                    binding.answerFourSwitch.isChecked = false
                    binding.answerFiveSwitch.isChecked = false
                    binding.answerSixSwitch.isChecked = true
                    Fun.setUserPercentage(Stat.relationshipF,binding.progressBar,binding.percentage)

                }}};buildCheckAndSet()
        //on button click
        fun statCheck(){
            Pref.relationship = null
            if (binding.answerAllSwitch.isChecked){Pref.relationship = mutableListOf("a","b","c","d","e","f")}
            if (binding.answerOneSwitch.isChecked){if (Pref.relationship != null ){Pref.relationship?.add("a")} else {Pref.relationship = mutableListOf("a")}}
            if (binding.answerTwoSwitch.isChecked){if (Pref.relationship != null ){Pref.relationship?.add("b")} else {Pref.relationship = mutableListOf("b")}}
            if (binding.answerThreeSwitch.isChecked){if (Pref.relationship != null ){Pref.relationship?.add("c")} else {Pref.relationship = mutableListOf("c")}}
            if (binding.answerFourSwitch.isChecked){if (Pref.relationship != null ){Pref.relationship?.add("d")} else {Pref.relationship = mutableListOf("d")}}
            if (binding.answerFiveSwitch.isChecked){if (Pref.relationship != null ){Pref.relationship?.add("e")} else {Pref.relationship = mutableListOf("e")}}
            if (binding.answerSixSwitch.isChecked){if (Pref.relationship != null ){Pref.relationship?.add("f")} else {Pref.relationship = mutableListOf("f")}}
            if (Pref.relationship != null ){Pref.relationship = Pref.relationship!!.distinct().toMutableList()} else {Pref.relationship = mutableListOf("a","b","c","d","e","f")}
            if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipA, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipB, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipC, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipD, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipAB, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipAC, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipAD, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipAE, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipAF, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipBC, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipBD, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipBE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipBF, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipCD, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipCE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipCF, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipDE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipDF, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipEF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipABC, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipABD, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipABE, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipABF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipACD, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipACE, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipACF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipADE, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipADF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipAEF, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipBCD, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipBDE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipBEF, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipCDE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipCEF, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipDEF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipABCD, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipABCF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipABEF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipADEF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipABCE, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipABDF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipACEF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipACDE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipBCDE, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipBDEF, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipBCDF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&!binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipABCDE, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&!binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipABCDF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&!binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipABCEF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&!binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipABDEF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&!binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipACDEF, binding.progressBar, binding.percentage)}
            else if (!binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipBCDEF, binding.progressBar, binding.percentage)}
            else if (binding.answerOneSwitch.isChecked&&binding.answerTwoSwitch.isChecked&&binding.answerThreeSwitch.isChecked&&binding.answerFourSwitch.isChecked&&binding.answerFiveSwitch.isChecked&&binding.answerSixSwitch.isChecked){Fun.setUserPercentage(Stat.relationshipABCDEF, binding.progressBar, binding.percentage)}
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