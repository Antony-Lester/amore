package app.lonelyheartsclub.amore

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import app.lonelyheartsclub.amore.databinding.ActivityLaunchBinding
import app.lonelyheartsclub.amore.databinding.ActivityProfilePictureFaceRetakeBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class ActivityProfilePictureFaceRetake : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;supportActionBar?.hide()
        val binding  = ActivityProfilePictureFaceRetakeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //init fonts
        binding.title.typeface = Fun.setFont(this, "headline")
        binding.bodyText.typeface = Fun.setFont(this, "headline")
        binding.tips.typeface = Fun.setFont(this, "headline")
        Log.d("Main","Helper.retake:${Helper.retake}")
        when (Helper.retake) {
            "M" -> {binding.bodyText.text = resources.getString(R.string.more_then_one_face);binding.tips.text = resources.getString(R.string.more_then_one_face_tip);binding.loadingIcon.setImageDrawable(ResourcesCompat.getDrawable(resources, R.drawable.icon_two_faces, null))}
            "N" -> {binding.bodyText.text = resources.getString(R.string.no_faces_detected);binding.tips.text = resources.getString(R.string.no_faces_detected_tip);binding.loadingIcon.setImageDrawable(ResourcesCompat.getDrawable(resources, R.drawable.icon_no_face, null))}
            "SE" -> {binding.bodyText.text = resources.getString(R.string.not_smiling_and_eyes_closed);binding.tips.text = resources.getString(R.string.not_smiling_and_eyes_closed_tip);binding.loadingIcon.setImageDrawable(ResourcesCompat.getDrawable(resources, R.drawable.icon_eye, null))}
            "S" -> {binding.bodyText.text = resources.getString(R.string.not_smiling);binding.tips.text = resources.getString(R.string.not_smiling_tip); binding.loadingIcon.setImageDrawable(ResourcesCompat.getDrawable(resources, R.drawable.icon_smile, null))}
            else -> {binding.bodyText.text = resources.getString(R.string.eyes_closed);binding.tips.text = resources.getString(R.string.eyes_closed_tip);binding.loadingIcon.setImageDrawable(ResourcesCompat.getDrawable(resources, R.drawable.icon_eye, null))}
        }}

    override fun onStart() {
        super.onStart()
        val binding  = ActivityLaunchBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Fun.startAnimationLoading(this@ActivityProfilePictureFaceRetake,binding.headlineContainer,binding.bodyContainer,binding.footerContainer,binding.loadingBar,binding.loadingContainer, binding.title,binding.bodyText , binding.loadingBar, binding.loadingIcon, binding.tips)
        GlobalScope.launch{
            doLoadingWork()
            Fun.finishAnimationLoading(this@ActivityProfilePictureFaceRetake,binding.headlineContainer,binding.bodyContainer,binding.footerContainer,binding.loadingBar,binding.loadingContainer, binding.title,binding.bodyText , binding.loadingBar, binding.loadingIcon, binding.tips)
            binding.headlineContainer.postDelayed({startActivity(Intent(this@ActivityProfilePictureFaceRetake, ActivityProfilePictureFace::class.java));finish()}, 1600) }
    }

    suspend fun doLoadingWork() {
        delay(5000)
        // M = more then one face. N = no faces detected. SE = Not smiling and eyes closed, S = not smiling, e = Eyes Closed. 0k = file ok
    }
}