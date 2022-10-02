package app.lonelyheartsclub.amore

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.lonelyheartsclub.amore.databinding.ActivityLaunchBinding
import app.lonelyheartsclub.amore.databinding.ActivityMessageNoneBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ActivityMessageNone : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;supportActionBar?.hide()
        val binding  = ActivityMessageNoneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //init fonts
        binding.title.typeface = Fun.setFont(this, "headline")
        binding.bodyText.typeface = Fun.setFont(this, "headline")
        binding.tips.typeface = Fun.setFont(this, "headline") }

    override fun onStart() {
        super.onStart()
        val binding  = ActivityLaunchBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Fun.startAnimationLoading(this@ActivityMessageNone,binding.headlineContainer,binding.bodyContainer,binding.footerContainer,binding.loadingBar,binding.loadingContainer, binding.title,binding.bodyText , binding.loadingBar, binding.loadingIcon, binding.tips)
        GlobalScope.launch{
            doLoadingWork()
            Fun.finishAnimationLoading(this@ActivityMessageNone,binding.headlineContainer,binding.bodyContainer,binding.footerContainer,binding.loadingBar,binding.loadingContainer, binding.title,binding.bodyText , binding.loadingBar, binding.loadingIcon, binding.tips)
            binding.headlineContainer.postDelayed({startActivity(Intent(this@ActivityMessageNone, ActivitySwipePrefMenu::class.java));finish()}, 1600) }
    }

    suspend fun doLoadingWork() {
        //todo loading work....
    }
}