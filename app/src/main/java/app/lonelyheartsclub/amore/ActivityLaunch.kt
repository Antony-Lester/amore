package app.lonelyheartsclub.amore

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import app.lonelyheartsclub.amore.databinding.ActivityLaunchBinding
import com.google.firebase.FirebaseApp
import kotlinx.coroutines.*
class ActivityLaunch : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        FirebaseApp.initializeApp(this)
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;supportActionBar?.hide()
        val binding  = ActivityLaunchBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //init fonts
        binding.title.typeface = Fun.setFont(this, "headline")
        binding.bodyText.typeface = Fun.setFont(this, "headline")
        binding.tips.typeface = Fun.setFont(this, "headline") }

    override fun onStart() {
        super.onStart()
        val binding  = ActivityLaunchBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Fun.startAnimationLoading(this@ActivityLaunch,binding.headlineContainer,binding.bodyContainer,binding.footerContainer,binding.loadingBar,binding.loadingContainer, binding.title,binding.bodyText , binding.loadingBar, binding.loadingIcon, binding.tips)
        GlobalScope.launch{
            doLoadingWork()
            Fun.finishAnimationLoading(this@ActivityLaunch,binding.headlineContainer,binding.bodyContainer,binding.footerContainer,binding.loadingBar,binding.loadingContainer, binding.title,binding.bodyText , binding.loadingBar, binding.loadingIcon, binding.tips)
            binding.headlineContainer.postDelayed({startActivity(Intent(this@ActivityLaunch, ActivityProfileMenu::class.java));finish()}, 1600) }
    }

    suspend fun doLoadingWork() {
        //todo loading work....
    }
}