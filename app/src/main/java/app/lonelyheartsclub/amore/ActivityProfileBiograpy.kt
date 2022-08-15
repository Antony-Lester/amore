package app.lonelyheartsclub.amore

import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.lonelyheartsclub.amore.databinding.ActivityProfileBiograpyBinding

class ActivityProfileBiograpy : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;supportActionBar?.hide()
        setContentView(ActivityProfileBiograpyBinding.inflate(layoutInflater).root)
    }
}