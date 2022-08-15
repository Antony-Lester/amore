package app.lonelyheartsclub.amore

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.lonelyheartsclub.amore.databinding.ActivityLaunchBinding
import app.lonelyheartsclub.amore.databinding.ActivityProfileHomeBinding
import app.lonelyheartsclub.amore.databinding.ActivitySwipeLoadingBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ActivitySwipeLoading : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;supportActionBar?.hide()
        val binding  = ActivitySwipeLoadingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //init fonts
        binding.title.typeface = Fun.setFont(this, "headline")
        binding.bodyText.typeface = Fun.setFont(this, "headline")
        binding.tips.typeface = Fun.setFont(this, "headline") }

    override fun onStart() {
        super.onStart()
        val binding  = ActivityLaunchBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Fun.startAnimationLoading(this@ActivitySwipeLoading,binding.headlineContainer,binding.bodyContainer,binding.footerContainer,binding.loadingBar,binding.loadingContainer, binding.title,binding.bodyText , binding.loadingBar, binding.loadingIcon, binding.tips)
        GlobalScope.launch{
            doLoadingWork()
            Fun.finishAnimationLoading(this@ActivitySwipeLoading,binding.headlineContainer,binding.bodyContainer,binding.footerContainer,binding.loadingBar,binding.loadingContainer, binding.title,binding.bodyText , binding.loadingBar, binding.loadingIcon, binding.tips)
            binding.headlineContainer.postDelayed({startActivity(Intent(this@ActivitySwipeLoading, ActivitySwipePrefMenu::class.java));finish()}, 1600) }
    }

    suspend fun doLoadingWork() {


        //a)
        //if swipe groups null generate SwipeGroups
        //if swipe groups empty then load country
        //1 Local)
            //for group:
                //check swipe results against... prefs
                //check swipe results against... kiss marry avoid,
                //remove item from list...
        //2 Country)
            //for group:
                //check swipe results against... prefs
                //check swipe results against... kiss marry avoid,
                //if swipe count 100 then... to swiping
        //3 NeighbouringCountries )
            //for group:
                //check swipe results against... prefs
                //check swipe results against... kiss marry avoid,
                //if swipe count 100 then... to swiping

        //todo if yes load swipe screen else if swipe prefs.. swipe pref menu, else

    }
}