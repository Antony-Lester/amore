package app.lonelyheartsclub.amore

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.lonelyheartsclub.amore.databinding.ActivityProfileMenuBinding

class ActivityProfileView : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;supportActionBar?.hide()
        val binding  = ActivityProfileMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}