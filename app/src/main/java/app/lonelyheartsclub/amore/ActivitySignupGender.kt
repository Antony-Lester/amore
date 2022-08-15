package app.lonelyheartsclub.amore

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.lonelyheartsclub.amore.databinding.ActivitySignupGenderBinding

class ActivitySignupGender : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;supportActionBar?.hide()
        val binding  = ActivitySignupGenderBinding.inflate(layoutInflater)
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
            Info.gender = "a";Fun.saveToInternalInfo();Fun.calculateIncreaseReputationScore(10.0f)
            Fun.finishAnimationQuestionSix(this, binding.answerOne, binding.question, binding.answerOne, binding.answerTwo, binding.answerThree,
                                           binding.answerFour, binding.answerFive, binding.answerSix,
                                           binding.profileIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000)
            binding.profileWidget.postDelayed({startActivity(Intent(this, ActivitySignupOrientation::class.java))}, 1600)
        }
        binding.answerTwo.setOnClickListener{
            Info.gender = "b";Fun.saveToInternalInfo();Fun.calculateIncreaseReputationScore(20.0f)
            Fun.finishAnimationQuestionSix(this, binding.answerTwo, binding.question, binding.answerOne, binding.answerTwo, binding.answerThree,
                                           binding.answerFour, binding.answerFive, binding.answerSix,
                                           binding.profileIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000)
            binding.profileWidget.postDelayed({startActivity(Intent(this, ActivitySignupOrientation::class.java))}, 1600)
        }
        binding.answerThree.setOnClickListener{
            Info.gender = "c";Fun.saveToInternalInfo();Fun.calculateIncreaseReputationScore(2.5f)
            Fun.finishAnimationQuestionSix(this, binding.answerThree, binding.question, binding.answerOne, binding.answerTwo, binding.answerThree,
                                           binding.answerFour, binding.answerFive, binding.answerSix,
                                           binding.profileIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000)
            binding.profileWidget.postDelayed({startActivity(Intent(this, ActivitySignupOrientation::class.java))}, 1600)
        }

    }
}