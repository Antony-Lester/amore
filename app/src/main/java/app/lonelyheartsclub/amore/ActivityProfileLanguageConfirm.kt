package app.lonelyheartsclub.amore

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.lonelyheartsclub.amore.databinding.ActivityProfileLanguageConfirmBinding

class ActivityProfileLanguageConfirm : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;supportActionBar?.hide()
        val binding = ActivityProfileLanguageConfirmBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //init fonts
        binding.question.typeface = Fun.setFont(this, "headline")
        binding.hint.typeface = Fun.setFont(this, "headline")
        binding.profileText.typeface = Fun.setFont(this, "headline")
        binding.questionMark.typeface = Fun.setFont(this, "headline")
        binding.yesButtonText.typeface = Fun.setFont(this, "sub_body")
        binding.noButtonText.typeface = Fun.setFont(this, "sub_body")
        //init animation
        Fun.startAnimationQuestionSingle(this, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, binding.questionContainer, binding.hintContainer, binding.yesButton, binding.noButton, binding.profileIconContainer)
        Fun.setWidgetAndProgress(Helper.profileWidget, Helper.profileProgress, binding.profileWidget, binding.profileWidgetText, binding.profileProgressBar)
        binding.question.text = Helper.languageSelectedName
        //set on click listener
        binding.yesButton.setOnClickListener {
            when (Helper.languageNumber) {
                1 -> {Info.languageOneOverride = Helper.languageSelected}
                2 -> {Info.languageTwo = Helper.languageSelected}
                3 -> {Info.languageThree = Helper.languageSelected}
                4 -> {Info.languageFour = Helper.languageSelected}
                5 -> {Info.languageFive = Helper.languageSelected} }
            Fun.finishAnimationQuestionSingle(this, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, binding.questionContainer, binding.hintContainer, binding.yesButton, binding.noButton, binding.profileIconContainer)
            binding.question.postDelayed({startActivity(Intent(this, ActivityProfileLanguageAdditional::class.java));finish()}, 1600)}
        binding.noButton.setOnClickListener {
            Fun.finishAnimationQuestionSingle(this, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, binding.questionContainer, binding.hintContainer, binding.yesButton, binding.noButton, binding.profileIconContainer)
            if (Helper.swipePref) {Helper.swipePref = false ;binding.question.postDelayed({startActivity(Intent(this, ActivitySwipePrefLanguage::class.java));finish()}, 1600) }
            binding.question.postDelayed({startActivity(Intent(this, ActivityProfileLanguageSelect::class.java));finish()}, 1600) }
        binding.profileIconContainer.setOnClickListener {
            Fun.finishAnimationQuestionSingle(this, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, binding.questionContainer, binding.hintContainer, binding.yesButton, binding.noButton, binding.profileIconContainer)
            binding.question.postDelayed({startActivity(Intent(this, ActivityProfileMenu::class.java));finish()}, 1600) }
    }
}