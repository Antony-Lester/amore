package app.lonelyheartsclub.amore

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.lonelyheartsclub.amore.databinding.ActivityLaunchBinding
import app.lonelyheartsclub.amore.databinding.ActivityMessageCheckingBinding
import app.lonelyheartsclub.amore.databinding.ActivityMessageNoMessagesBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ActivityMessageNoMessages : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;supportActionBar?.hide()
        val binding  = ActivityMessageNoMessagesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //init fonts
        binding.title.typeface = Fun.setFont(this, "headline")
        binding.bodyText.typeface = Fun.setFont(this, "headline")
        binding.tips.typeface = Fun.setFont(this, "headline") }

    override fun onStart() {
        super.onStart()
        val binding  = ActivityLaunchBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Fun.startAnimationLoading(this@ActivityMessageNoMessages,binding.headlineContainer,binding.bodyContainer,binding.footerContainer,binding.loadingBar,binding.loadingContainer, binding.title,binding.bodyText , binding.loadingBar, binding.loadingIcon, binding.tips)
        GlobalScope.launch{
            doLoadingWork()
            Fun.finishAnimationLoading(this@ActivityMessageNoMessages,binding.headlineContainer,binding.bodyContainer,binding.footerContainer,binding.loadingBar,binding.loadingContainer, binding.title,binding.bodyText , binding.loadingBar, binding.loadingIcon, binding.tips)
            binding.headlineContainer.postDelayed({startActivity(Intent(this@ActivityMessageNoMessages, ActivitySwipeLoading::class.java));finish()}, 1600) }
    }

    suspend fun doLoadingWork() {
    }
}