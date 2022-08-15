package app.lonelyheartsclub.amore

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.lonelyheartsclub.amore.databinding.ActivitySignupDateOfBirthBinding
import java.time.LocalDate
import java.time.ZoneId
import java.time.ZoneOffset

class ActivitySignupDateOfBirth : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;supportActionBar?.hide()
        val binding  = ActivitySignupDateOfBirthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //init fonts
        binding.headline.typeface = Fun.setFont(this, "headline")
        binding.buttonText.typeface = Fun.setFont(this, "sub_body")




        //init animation
        Fun.startAnimationCalendar(this,binding.headlineContainer,binding.bodyContainer,binding.footerContainer,binding.buttonText,binding.datePicker,binding.headline)

        val maxDate : LocalDate = (LocalDate.now(ZoneOffset.UTC).minusYears(18))
        binding.datePicker.maxDate = maxDate.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli()
        val minDate : LocalDate = (LocalDate.now(ZoneOffset.UTC).minusYears(80))
        binding.datePicker.minDate = minDate.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli()

        binding.buttonText.setOnClickListener {
            Info.yearOfBirth = binding.datePicker.year
            Info.monthOfBirth = binding.datePicker.month
            Info.dayOfBirth = binding.datePicker.dayOfMonth
            Fun.finishAnimationCalendar(this, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, binding.buttonText, binding.datePicker, binding.headline)
            binding.buttonText.postDelayed({startActivity(Intent(this, ActivitySignupGender::class.java));finish()}, 1600)
        }
    }}
