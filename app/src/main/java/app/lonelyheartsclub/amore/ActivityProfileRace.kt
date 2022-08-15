package app.lonelyheartsclub.amore

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.lonelyheartsclub.amore.databinding.ActivityProfileRaceBinding

class ActivityProfileRace : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;supportActionBar?.hide()
        val binding  = ActivityProfileRaceBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //body font
        binding.question.typeface = Fun.setFont(this, "body")
        binding.answerOne.typeface = Fun.setFont(this, "headline")
        binding.answerTwo.typeface = Fun.setFont(this, "headline")
        binding.answerThree.typeface = Fun.setFont(this, "headline")
        binding.answerFour.typeface = Fun.setFont(this, "headline")
        binding.answerFive.typeface = Fun.setFont(this, "headline")
        binding.answerSix.typeface = Fun.setFont(this, "headline")
        //footer font
        binding.profileText.typeface = Fun.setFont(this, "body")
        //init footer widget & progress
        Fun.setWidgetAndProgress(Helper.profileWidget, Helper.profileProgress, binding.profileWidget, binding.profileWidgetText, binding.profileProgressBar)
        //init animation
        Fun.startAnimationQuestionSix(this, binding.profileIconContainer, binding.question, binding.answerOne, binding.answerTwo, binding.answerThree, binding.answerFour, binding.answerFive, binding.answerSix, binding.headlineContainer, binding.bodyContainer, binding.footerContainer)
        //init body button click
        binding.answerOne.setOnClickListener{
            Info.race = "a";Fun.saveToInternalInfo();Fun.calculateIncreaseReputationScore(5.0f)
            Fun.finishAnimationQuestionSix(this, binding.answerOne, binding.question, binding.answerOne, binding.answerTwo, binding.answerThree,
                                           binding.answerFour, binding.answerFive, binding.answerSix,
                                           binding.profileIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000)
            if (Helper.swipePref) {Helper.swipePref = false;binding.profileWidget.postDelayed({startActivity(Intent(this, ActivitySwipePrefRace::class.java))}, 1600)}
            else {binding.profileWidget.postDelayed({startActivity(Intent(this, ActivityProfileMenu::class.java))}, 1600)}
        }
        binding.answerTwo.setOnClickListener{
            Info.race = "b";Fun.saveToInternalInfo();Fun.calculateIncreaseReputationScore(3.3f)
            Fun.finishAnimationQuestionSix(this, binding.answerTwo, binding.question, binding.answerOne, binding.answerTwo, binding.answerThree,
                                           binding.answerFour, binding.answerFive, binding.answerSix,
                                           binding.profileIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000)
            if (Helper.swipePref) {Helper.swipePref = false;binding.profileWidget.postDelayed({startActivity(Intent(this, ActivitySwipePrefRace::class.java))}, 1600)}
            else {binding.profileWidget.postDelayed({startActivity(Intent(this, ActivityProfileMenu::class.java))}, 1600)}
        }
        binding.answerThree.setOnClickListener{
            Info.race = "c";Fun.saveToInternalInfo();Fun.calculateIncreaseReputationScore(1.0f)
            Fun.finishAnimationQuestionSix(this, binding.answerThree, binding.question, binding.answerOne, binding.answerTwo, binding.answerThree,
                                           binding.answerFour, binding.answerFive, binding.answerSix,
                                           binding.profileIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000)
            if (Helper.swipePref) {Helper.swipePref = false;binding.profileWidget.postDelayed({startActivity(Intent(this, ActivitySwipePrefRace::class.java))}, 1600)}
            else {binding.profileWidget.postDelayed({startActivity(Intent(this, ActivityProfileMenu::class.java))}, 1600)}
        }
        binding.answerFour.setOnClickListener{
            Info.race = "d";Fun.saveToInternalInfo();Fun.calculateReduceReputationScore(5.0f)
            Fun.finishAnimationQuestionSix(this, binding.answerFour, binding.question, binding.answerOne, binding.answerTwo, binding.answerThree,
                                           binding.answerFour, binding.answerFive, binding.answerSix,
                                           binding.profileIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000)
            if (Helper.swipePref) {Helper.swipePref = false;binding.profileWidget.postDelayed({startActivity(Intent(this, ActivitySwipePrefRace::class.java))}, 1600)}
            else {binding.profileWidget.postDelayed({startActivity(Intent(this, ActivityProfileMenu::class.java))}, 1600)}
        }
        binding.answerFive.setOnClickListener{
            Info.race = "e";Fun.saveToInternalInfo();Fun.calculateReduceReputationScore(1.0f)
            Fun.finishAnimationQuestionSix(this, binding.answerFive, binding.question, binding.answerOne, binding.answerTwo, binding.answerThree,
                                           binding.answerFour, binding.answerFive, binding.answerSix,
                                           binding.profileIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000)
            if (Helper.swipePref) {Helper.swipePref = false;binding.profileWidget.postDelayed({startActivity(Intent(this, ActivitySwipePrefRace::class.java))}, 1600)}
            else {binding.profileWidget.postDelayed({startActivity(Intent(this, ActivityProfileMenu::class.java))}, 1600)}
        }
        binding.answerSix.setOnClickListener{
            Info.race = "f";Fun.saveToInternalInfo();Fun.calculateReduceReputationScore(2.5f)
            Fun.finishAnimationQuestionSix(this, binding.answerSix, binding.question, binding.answerOne, binding.answerTwo, binding.answerThree,
                                           binding.answerFour, binding.answerFive, binding.answerSix,
                                           binding.profileIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000)
            if (Helper.swipePref) {Helper.swipePref = false;binding.profileWidget.postDelayed({startActivity(Intent(this, ActivitySwipePrefRace::class.java))}, 1600)}
            else {binding.profileWidget.postDelayed({startActivity(Intent(this, ActivityProfileMenu::class.java))}, 1600)}
        }
        //init footer button click
        binding.profileIconContainer.setOnClickListener{
            Fun.finishAnimationQuestionSix(this, binding.profileIconContainer, binding.question, binding.answerOne, binding.answerTwo, binding.answerThree,
                                           binding.answerFour, binding.answerFive, binding.answerSix,
                                           binding.profileIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000)
            binding.profileWidget.postDelayed({startActivity(Intent(this, ActivityProfileMenu::class.java))}, 1600)
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        Fun.saveToServerInfo()
    }
}