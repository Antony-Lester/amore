package app.lonelyheartsclub.amore

import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.lonelyheartsclub.amore.databinding.ActivityMessageMainBinding

class ActivityMessageMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;supportActionBar?.hide()
        setContentView(ActivityMessageMainBinding.inflate(layoutInflater).root)
    }
}

//todo get messages from  getSharedPreferences("messages", MODE_PRIVATE).getAll()
//todo send reply on reply/unmatched delete message on server & delete message on internal & uid from messages file
//on finish send back to check messages...