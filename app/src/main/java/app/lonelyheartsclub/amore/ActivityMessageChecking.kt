package app.lonelyheartsclub.amore

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.lonelyheartsclub.amore.databinding.ActivityLaunchBinding
import app.lonelyheartsclub.amore.databinding.ActivityMessageCheckingBinding
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.getField
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.sql.Timestamp


class ActivityMessageChecking : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;supportActionBar?.hide()
        val binding  = ActivityMessageCheckingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //init fonts
        binding.title.typeface = Fun.setFont(this, "headline")
        binding.bodyText.typeface = Fun.setFont(this, "headline")
        binding.tips.typeface = Fun.setFont(this, "headline") }

    override fun onStart() {
        super.onStart()
        val binding  = ActivityLaunchBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Fun.startAnimationLoading(this@ActivityMessageChecking,binding.headlineContainer,binding.bodyContainer,binding.footerContainer,binding.loadingBar,binding.loadingContainer, binding.title,binding.bodyText , binding.loadingBar, binding.loadingIcon, binding.tips)
        GlobalScope.launch{
            if(getMessagesFromServer()){
                Fun.finishAnimationLoading(this@ActivityMessageChecking,binding.headlineContainer,binding.bodyContainer,binding.footerContainer,binding.loadingBar,binding.loadingContainer, binding.title,binding.bodyText , binding.loadingBar, binding.loadingIcon, binding.tips)
                binding.headlineContainer.postDelayed({startActivity(Intent(this@ActivityMessageChecking, ActivityMessageMain::class.java));finish()}, 1600) }
            else{
            Fun.finishAnimationLoading(this@ActivityMessageChecking,binding.headlineContainer,binding.bodyContainer,binding.footerContainer,binding.loadingBar,binding.loadingContainer, binding.title,binding.bodyText , binding.loadingBar, binding.loadingIcon, binding.tips)
            binding.headlineContainer.postDelayed({startActivity(Intent(this@ActivityMessageChecking, ActivityMessageNoMessages::class.java));finish()}, 1600) }}

    }

    private fun getMessagesFromServer() : Boolean  {
        var messages = false
        val messageCheck = getSharedPreferences("messages", MODE_PRIVATE)
        if (!messageCheck.all.isNullOrEmpty()){messages = true} else{val db = Firebase.firestore;db.collection(Info.uid + "m").get().addOnSuccessListener { result -> ;messages = true;for (document in result) {
                    //save in a file named uid
                    val messageUid = document.reference.id //get uid
                    val sharedPreferences = getSharedPreferences(messageUid, MODE_PRIVATE)
                    val messageSaver = sharedPreferences.edit()
                    messageSaver.putString("n",document.getField<String>("n"))//name (field n)
                    document.getField<Int>("r")?.let{messageSaver.putInt("r", it)}//rating (field r)
                    messageSaver.putString("d",document.getField<Timestamp>("d").toString())//timestamp (field d) as String
                    messageSaver.putString("m",document.getField<String>("m"))//get message 1 (field m)
                    messageSaver.putString("s",document.getField<String>("s"))//get message 2 (field s)
                    messageSaver.putString("t",document.getField<String>("t"))//get message 3 (field t)
                    messageSaver.putString("u",document.getField<String>("u"))//get message 4 (field u)
                    messageSaver.putString("v",document.getField<String>("v"))//get message 5 (field v)
                    messageSaver.putString("w",document.getField<String>("w"))//get message 6 (field w)
                    messageSaver.putString("x",document.getField<String>("x"))//get message 7 (field x)
                    messageSaver.putString("y",document.getField<String>("y"))//get message 8 (field y)
                    messageSaver.putString("z",document.getField<String>("z"))//get message 9 (field z)
                    messageSaver.apply()
                    //add the uid to messages file
                    val messageManagerSharedPreferences = getSharedPreferences("messages", MODE_PRIVATE)
                    val messageManager = messageManagerSharedPreferences.edit()
                    messageManager.putString(messageUid,messageUid)
                    messageManager.apply()}}
        }
        return messages
    }
}