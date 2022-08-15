package app.lonelyheartsclub.amore

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.lonelyheartsclub.amore.databinding.ActivitySwipePrefLanguageBinding

class ActivitySwipePrefLanguage : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;supportActionBar?.hide()
        val binding  = ActivitySwipePrefLanguageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Info Check...
        if (Info.languageTwo == null|| Info.languageThree == null|| Info.languageFour == null|| Info.languageFive == null)
        {Helper.swipePref = true; startActivity(Intent(this, ActivityProfileLanguageFirst::class.java))}
        //body font
        binding.question.typeface = Fun.setFont(this, "body")
        binding.answerAll.typeface = Fun.setFont(this, "headline")
        binding.answerOne.typeface = Fun.setFont(this, "headline")
        binding.answerTwo.typeface = Fun.setFont(this, "headline")
        binding.answerThree.typeface = Fun.setFont(this, "headline")
        binding.answerFour.typeface = Fun.setFont(this, "headline")
        binding.answerFive.typeface = Fun.setFont(this, "headline")
        binding.answerSix.typeface = Fun.setFont(this, "headline")
        binding.user.typeface = Fun.setFont(this, "headline")
        binding.percentage.typeface = Fun.setFont(this, "headline")
        binding.confirm.typeface = Fun.setFont(this, "body")
        //init animation
        Fun.startAnimationQuestionTickBox(this, binding.headlineContainer, binding.bodyContainer, binding.footerContainer,
                                          binding.question, binding.answerAllContainer, binding.answerOneContainer, binding.answerTwoContainer, binding.answerThreeContainer,
                                          binding.answerFourContainer, binding.answerFiveContainer, binding.answerSixContainer,
                                          binding.confirm, binding.user, binding.swipeIconContainer, binding.percentage)
        //init set languages text
        fun languageText(infoLang: String?) : String{
            when (infoLang) {
                "af" -> {return getString(R.string.language_af)}
                "ar" -> {return getString(R.string.language_ar)}
                "be" -> {return getString(R.string.language_be)}
                "bg" -> {return getString(R.string.language_bg)}
                "bn" -> {return getString(R.string.language_bn)}
                "ca" -> {return getString(R.string.language_ca)}
                "cs" -> {return getString(R.string.language_cs)}
                "cy" -> {return getString(R.string.language_cy)}
                "da" -> {return getString(R.string.language_da)}
                "de" -> {return getString(R.string.language_de)}
                "el" -> {return getString(R.string.language_el)}
                "en" -> {return getString(R.string.language_en)}
                "eo" -> {return getString(R.string.language_eo)}
                "es" -> {return getString(R.string.language_es)}
                "et" -> {return getString(R.string.language_et)}
                "fa" -> {return getString(R.string.language_fa)}
                "fi" -> {return getString(R.string.language_fi)}
                "fr" -> {return getString(R.string.language_fr)}
                "ga" -> {return getString(R.string.language_ga)}
                "gl" -> {return getString(R.string.language_gl)}
                "gu" -> {return getString(R.string.language_gu)}
                "he" -> {return getString(R.string.language_he)}
                "hi" -> {return getString(R.string.language_hi)}
                "hr" -> {return getString(R.string.language_hr)}
                "ht" -> {return getString(R.string.language_ht)}
                "hu" -> {return getString(R.string.language_hu)}
                "id" -> {return getString(R.string.language_id)}
                "is" -> {return getString(R.string.language_is)}
                "it" -> {return getString(R.string.language_it)}
                "ja" -> {return getString(R.string.language_ja)}
                "ka" -> {return getString(R.string.language_ka)}
                "kn" -> {return getString(R.string.language_kn)}
                "ko" -> {return getString(R.string.language_ko)}
                "lt" -> {return getString(R.string.language_lt)}
                "lv" -> {return getString(R.string.language_lv)}
                "mk" -> {return getString(R.string.language_mk)}
                "mr" -> {return getString(R.string.language_mr)}
                "ms" -> {return getString(R.string.language_ms)}
                "mt" -> {return getString(R.string.language_mt)}
                "nl" -> {return getString(R.string.language_nl)}
                "no" -> {return getString(R.string.language_no)}
                "pl" -> {return getString(R.string.language_pl)}
                "pt" -> {return getString(R.string.language_pt)}
                "ro" -> {return getString(R.string.language_ro)}
                "ru" -> {return getString(R.string.language_ru)}
                "sk" -> {return getString(R.string.language_sk)}
                "sl" -> {return getString(R.string.language_sl)}
                "sq" -> {return getString(R.string.language_sq)}
                "sv" -> {return getString(R.string.language_sv)}
                "sw" -> {return getString(R.string.language_sw)}
                "ta" -> {return getString(R.string.language_ta)}
                "te" -> {return getString(R.string.language_te)}
                "th" -> {return getString(R.string.language_th)}
                "tr" -> {return getString(R.string.language_tr)}
                "uk" -> {return getString(R.string.language_uk)}
                "ur" -> {return getString(R.string.language_ur)}
                "vi" -> {return getString(R.string.language_vi)}
                "zh" -> {return getString(R.string.language_zh)}
                else -> {return "*ERROR*${infoLang}"}
            }
        }
        fun languageStat(infoLang: String?) : Int {
            when (infoLang) {
                "af" -> {return Stat.languageAF}
                "ar" -> {return Stat.languageAR}
                "be" -> {return Stat.languageBE}
                "bg" -> {return Stat.languageBG}
                "bn" -> {return Stat.languageBN}
                "ca" -> {return Stat.languageCA}
                "cs" -> {return Stat.languageCS}
                "cy" -> {return Stat.languageCY}
                "da" -> {return Stat.languageDA}
                "de" -> {return Stat.languageDE}
                "el" -> {return Stat.languageEL}
                "en" -> {return Stat.languageEN}
                "eo" -> {return Stat.languageEO}
                "es" -> {return Stat.languageES}
                "et" -> {return Stat.languageET}
                "fa" -> {return Stat.languageFA}
                "fi" -> {return Stat.languageFI}
                "fr" -> {return Stat.languageFR}
                "ga" -> {return Stat.languageGA}
                "gl" -> {return Stat.languageGL}
                "gu" -> {return Stat.languageGU}
                "he" -> {return Stat.languageHE}
                "hi" -> {return Stat.languageHI}
                "hr" -> {return Stat.languageHR}
                "ht" -> {return Stat.languageHT}
                "hu" -> {return Stat.languageHU}
                "id" -> {return Stat.languageID}
                "is" -> {return Stat.languageIS}
                "it" -> {return Stat.languageIT}
                "ja" -> {return Stat.languageJA}
                "ka" -> {return Stat.languageKA}
                "kn" -> {return Stat.languageKN}
                "ko" -> {return Stat.languageKO}
                "lt" -> {return Stat.languageLT}
                "lv" -> {return Stat.languageLV}
                "mk" -> {return Stat.languageMK}
                "mr" -> {return Stat.languageMR}
                "ms" -> {return Stat.languageMS}
                "mt" -> {return Stat.languageMT}
                "nl" -> {return Stat.languageNL}
                "no" -> {return Stat.languageNO}
                "pl" -> {return Stat.languagePL}
                "pt" -> {return Stat.languagePT}
                "ro" -> {return Stat.languageRO}
                "ru" -> {return Stat.languageRU}
                "sk" -> {return Stat.languageSK}
                "sl" -> {return Stat.languageSL}
                "sq" -> {return Stat.languageSQ}
                "sv" -> {return Stat.languageSV}
                "sw" -> {return Stat.languageSW}
                "ta" -> {return Stat.languageTA}
                "te" -> {return Stat.languageTE}
                "th" -> {return Stat.languageTH}
                "tr" -> {return Stat.languageTR}
                "uk" -> {return Stat.languageUK}
                "ur" -> {return Stat.languageUR}
                "vi" -> {return Stat.languageVI}
                "zh" -> {return Stat.languageZH}
                else -> {return 0}
            }
        }
        if (Info.languageOne != null && Info.languageOne != "NONE") {binding.answerOne.text = languageText(Info.languageOne)}
        if (Info.languageTwo != null && Info.languageTwo != "NONE") {binding.answerTwo.text = languageText(Info.languageTwo)}
        if (Info.languageThree != null && Info.languageThree != "NONE") {binding.answerThree.text = languageText(Info.languageThree)}
        if (Info.languageFour != null && Info.languageFour != "NONE") {binding.answerFour.text = languageText(Info.languageFour)}
        if (Info.languageFive != null && Info.languageFive != "NONE") {binding.answerFive.text = languageText(Info.languageFive)}
        //stat check
        fun langStatCheck():Int{
            var stat = 0
            if (binding.answerOne.text.isNotEmpty() &&binding.answerOneSwitch.isChecked){stat += languageStat(Info.languageOne)}
            if (binding.answerTwo.text.isNotEmpty() &&binding.answerTwoSwitch.isChecked){stat +=languageStat(Info.languageTwo)}
            if (binding.answerThree.text.isNotEmpty() &&binding.answerThreeSwitch.isChecked){stat +=languageStat(Info.languageThree)}
            if (binding.answerFour.text.isNotEmpty() &&binding.answerFourSwitch.isChecked){stat +=languageStat(Info.languageFour)}
            if (binding.answerFive.text.isNotEmpty() &&binding.answerFiveSwitch.isChecked){stat +=languageStat(Info.languageFive)}
            return stat}
        //check & set status
        fun buildCheckAndSet(){
                if (Pref.language == null){binding.answerAllSwitch.isChecked = true}
                else {  if (Pref.language !!.contains(Info.languageOne)){binding.answerOneSwitch.isChecked = true}
                        if (Pref.language !!.contains(Info.languageTwo)){binding.answerTwoSwitch.isChecked = true}
                        if (Pref.language !!.contains(Info.languageThree)){binding.answerThreeSwitch.isChecked = true}
                        if (Pref.language !!.contains(Info.languageFour)){binding.answerFourSwitch.isChecked = true}
                        if (Pref.language !!.contains(Info.languageFive)){binding.answerFiveSwitch.isChecked = true}}
                if (binding.answerOne.text.isEmpty()){binding.answerOneSwitch.isEnabled = false}
                if (binding.answerTwo.text.isEmpty()){binding.answerTwoSwitch.isEnabled = false}
                if (binding.answerThree.text.isEmpty()){binding.answerThreeSwitch.isEnabled = false}
                if (binding.answerFour.text.isEmpty()){binding.answerFourSwitch.isEnabled = false}
                if (binding.answerFive.text.isEmpty()){binding.answerFiveSwitch.isEnabled = false}
                Fun.setUserPercentage(langStatCheck(),binding.progressBar,binding.percentage)};buildCheckAndSet()
        //on button click
        binding.answerAllSwitch.setOnClickListener {
            binding.answerOneSwitch.isChecked = true
            binding.answerTwoSwitch.isChecked = true
            binding.answerThreeSwitch.isChecked = true
            binding.answerFourSwitch.isChecked = true
            binding.answerFiveSwitch.isChecked = true
            binding.answerSixSwitch.isChecked = true
            binding.answerAllSwitch.isChecked = true
            Pref.language = null
            if (binding.answerAllSwitch.isChecked){Pref.language = mutableListOf()}
            if (binding.answerOneSwitch.isChecked){if (Pref.language != null ){Pref.language?.add(Info.languageOne!!)} else {Pref.language = mutableListOf(Info.languageOne!!)}}
            if (binding.answerTwoSwitch.isChecked){if (Pref.language != null ){Pref.language?.add(Info.languageTwo!!)} else {Pref.language = mutableListOf(Info.languageTwo!!)}}
            if (binding.answerThreeSwitch.isChecked){if (Pref.language != null ){Pref.language?.add(Info.languageThree!!)} else {Pref.language = mutableListOf(Info.languageThree!!)}}
            if (binding.answerFourSwitch.isChecked){if (Pref.language != null ){Pref.language?.add(Info.languageFour!!)} else {Pref.language = mutableListOf(Info.languageFour!!)}}
            if (binding.answerFiveSwitch.isChecked){if (Pref.language != null ){Pref.language?.add(Info.languageFive!!)} else {Pref.language = mutableListOf(Info.languageFive!!)}}
            if (Pref.language != null ){Pref.language = Pref.language!!.distinct().toMutableList()} else {Pref.language = mutableListOf()}
            Fun.setUserPercentage(Stat.all, binding.progressBar, binding.percentage)}
        binding.answerOneSwitch.setOnClickListener {
            Pref.language = null
            if (binding.answerAllSwitch.isChecked){Pref.language = mutableListOf()}
            if (binding.answerOneSwitch.isChecked){if (Pref.language != null ){Pref.language?.add(Info.languageOne!!)} else {Pref.language = mutableListOf(Info.languageOne!!)}}
            if (binding.answerTwoSwitch.isChecked){if (Pref.language != null ){Pref.language?.add(Info.languageTwo!!)} else {Pref.language = mutableListOf(Info.languageTwo!!)}}
            if (binding.answerThreeSwitch.isChecked){if (Pref.language != null ){Pref.language?.add(Info.languageThree!!)} else {Pref.language = mutableListOf(Info.languageThree!!)}}
            if (binding.answerFourSwitch.isChecked){if (Pref.language != null ){Pref.language?.add(Info.languageFour!!)} else {Pref.language = mutableListOf(Info.languageFour!!)}}
            if (binding.answerFiveSwitch.isChecked){if (Pref.language != null ){Pref.language?.add(Info.languageFive!!)} else {Pref.language = mutableListOf(Info.languageFive!!)}}
            if (Pref.language != null ){Pref.language = Pref.language!!.distinct().toMutableList()} else {Pref.language = mutableListOf()}
            if (! binding.answerTwoSwitch.isChecked &&
                ! binding.answerThreeSwitch.isChecked &&
                ! binding.answerFourSwitch.isChecked &&
                ! binding.answerFiveSwitch.isChecked) {
                binding.answerOneSwitch.isChecked = true
                binding.answerTwoSwitch.isChecked = true
                binding.answerThreeSwitch.isChecked = true
                binding.answerFourSwitch.isChecked = true
                binding.answerFiveSwitch.isChecked = true
                binding.answerSixSwitch.isChecked = true
                binding.answerAllSwitch.isChecked = true
                Fun.setUserPercentage(Stat.all, binding.progressBar, binding.percentage)}
            else {binding.answerAllSwitch.isChecked = false;langStatCheck()}}
        binding.answerTwoSwitch.setOnClickListener {
            Pref.language = null
            if (binding.answerAllSwitch.isChecked){Pref.language = mutableListOf()}
            if (binding.answerOneSwitch.isChecked){if (Pref.language != null ){Pref.language?.add(Info.languageOne!!)} else {Pref.language = mutableListOf(Info.languageOne!!)}}
            if (binding.answerTwoSwitch.isChecked){if (Pref.language != null ){Pref.language?.add(Info.languageTwo!!)} else {Pref.language = mutableListOf(Info.languageTwo!!)}}
            if (binding.answerThreeSwitch.isChecked){if (Pref.language != null ){Pref.language?.add(Info.languageThree!!)} else {Pref.language = mutableListOf(Info.languageThree!!)}}
            if (binding.answerFourSwitch.isChecked){if (Pref.language != null ){Pref.language?.add(Info.languageFour!!)} else {Pref.language = mutableListOf(Info.languageFour!!)}}
            if (binding.answerFiveSwitch.isChecked){if (Pref.language != null ){Pref.language?.add(Info.languageFive!!)} else {Pref.language = mutableListOf(Info.languageFive!!)}}
            if (Pref.language != null ){Pref.language = Pref.language!!.distinct().toMutableList()} else {Pref.language = mutableListOf()}
            if (! binding.answerOneSwitch.isChecked &&
                ! binding.answerThreeSwitch.isChecked &&
                ! binding.answerFourSwitch.isChecked &&
                ! binding.answerFiveSwitch.isChecked ) {
                binding.answerOneSwitch.isChecked = true
                binding.answerTwoSwitch.isChecked = true
                binding.answerThreeSwitch.isChecked = true
                binding.answerFourSwitch.isChecked = true
                binding.answerFiveSwitch.isChecked = true
                binding.answerSixSwitch.isChecked = true
                binding.answerAllSwitch.isChecked = true
                Fun.setUserPercentage(Stat.all, binding.progressBar, binding.percentage)}
            else {binding.answerAllSwitch.isChecked = false;langStatCheck()}}
        binding.answerThreeSwitch.setOnClickListener {
            Pref.language = null
            if (binding.answerAllSwitch.isChecked){Pref.language = mutableListOf()}
            if (binding.answerOneSwitch.isChecked){if (Pref.language != null ){Pref.language?.add(Info.languageOne!!)} else {Pref.language = mutableListOf(Info.languageOne!!)}}
            if (binding.answerTwoSwitch.isChecked){if (Pref.language != null ){Pref.language?.add(Info.languageTwo!!)} else {Pref.language = mutableListOf(Info.languageTwo!!)}}
            if (binding.answerThreeSwitch.isChecked){if (Pref.language != null ){Pref.language?.add(Info.languageThree!!)} else {Pref.language = mutableListOf(Info.languageThree!!)}}
            if (binding.answerFourSwitch.isChecked){if (Pref.language != null ){Pref.language?.add(Info.languageFour!!)} else {Pref.language = mutableListOf(Info.languageFour!!)}}
            if (binding.answerFiveSwitch.isChecked){if (Pref.language != null ){Pref.language?.add(Info.languageFive!!)} else {Pref.language = mutableListOf(Info.languageFive!!)}}
            if (Pref.language != null ){Pref.language = Pref.language!!.distinct().toMutableList()} else {Pref.language = mutableListOf()}
            if (! binding.answerOneSwitch.isChecked && ! binding.answerTwoSwitch.isChecked &&
                ! binding.answerFourSwitch.isChecked &&
                ! binding.answerFiveSwitch.isChecked ) {
                binding.answerOneSwitch.isChecked = true
                binding.answerTwoSwitch.isChecked = true
                binding.answerThreeSwitch.isChecked = true
                binding.answerFourSwitch.isChecked = true
                binding.answerFiveSwitch.isChecked = true
                binding.answerSixSwitch.isChecked = true
                binding.answerAllSwitch.isChecked = true
                Fun.setUserPercentage(Stat.all, binding.progressBar, binding.percentage)}
            else {binding.answerAllSwitch.isChecked = false;langStatCheck()}}
        binding.answerFourSwitch.setOnClickListener {
            Pref.language = null
            if (binding.answerAllSwitch.isChecked){Pref.language = mutableListOf()}
            if (binding.answerOneSwitch.isChecked){if (Pref.language != null ){Pref.language?.add(Info.languageOne!!)} else {Pref.language = mutableListOf(Info.languageOne!!)}}
            if (binding.answerTwoSwitch.isChecked){if (Pref.language != null ){Pref.language?.add(Info.languageTwo!!)} else {Pref.language = mutableListOf(Info.languageTwo!!)}}
            if (binding.answerThreeSwitch.isChecked){if (Pref.language != null ){Pref.language?.add(Info.languageThree!!)} else {Pref.language = mutableListOf(Info.languageThree!!)}}
            if (binding.answerFourSwitch.isChecked){if (Pref.language != null ){Pref.language?.add(Info.languageFour!!)} else {Pref.language = mutableListOf(Info.languageFour!!)}}
            if (binding.answerFiveSwitch.isChecked){if (Pref.language != null ){Pref.language?.add(Info.languageFive!!)} else {Pref.language = mutableListOf(Info.languageFive!!)}}
            if (Pref.language != null ){Pref.language = Pref.language!!.distinct().toMutableList()} else {Pref.language = mutableListOf()}
            if (! binding.answerOneSwitch.isChecked && ! binding.answerTwoSwitch.isChecked &&
                ! binding.answerThreeSwitch.isChecked &&
                ! binding.answerFiveSwitch.isChecked) {
                binding.answerOneSwitch.isChecked = true
                binding.answerTwoSwitch.isChecked = true
                binding.answerThreeSwitch.isChecked = true
                binding.answerFourSwitch.isChecked = true
                binding.answerFiveSwitch.isChecked = true
                binding.answerSixSwitch.isChecked = true
                binding.answerAllSwitch.isChecked = true
                Fun.setUserPercentage(Stat.all, binding.progressBar, binding.percentage)}
            else {binding.answerAllSwitch.isChecked = false;langStatCheck()}}
        binding.answerFiveSwitch.setOnClickListener {
            Pref.language = null
            if (binding.answerAllSwitch.isChecked){Pref.language = mutableListOf()}
            if (binding.answerOneSwitch.isChecked){if (Pref.language != null ){Pref.language?.add(Info.languageOne!!)} else {Pref.language = mutableListOf(Info.languageOne!!)}}
            if (binding.answerTwoSwitch.isChecked){if (Pref.language != null ){Pref.language?.add(Info.languageTwo!!)} else {Pref.language = mutableListOf(Info.languageTwo!!)}}
            if (binding.answerThreeSwitch.isChecked){if (Pref.language != null ){Pref.language?.add(Info.languageThree!!)} else {Pref.language = mutableListOf(Info.languageThree!!)}}
            if (binding.answerFourSwitch.isChecked){if (Pref.language != null ){Pref.language?.add(Info.languageFour!!)} else {Pref.language = mutableListOf(Info.languageFour!!)}}
            if (binding.answerFiveSwitch.isChecked){if (Pref.language != null ){Pref.language?.add(Info.languageFive!!)} else {Pref.language = mutableListOf(Info.languageFive!!)}}
            if (Pref.language != null ){Pref.language = Pref.language!!.distinct().toMutableList()} else {Pref.language = mutableListOf()}
            if (! binding.answerOneSwitch.isChecked && ! binding.answerTwoSwitch.isChecked &&
                ! binding.answerThreeSwitch.isChecked &&
                ! binding.answerFourSwitch.isChecked) {
                binding.answerOneSwitch.isChecked = true
                binding.answerTwoSwitch.isChecked = true
                binding.answerThreeSwitch.isChecked = true
                binding.answerFourSwitch.isChecked = true
                binding.answerFiveSwitch.isChecked = true
                binding.answerSixSwitch.isChecked = true
                binding.answerAllSwitch.isChecked = true
                Fun.setUserPercentage(Stat.all, binding.progressBar, binding.percentage)}
            else {binding.answerAllSwitch.isChecked = false;langStatCheck()}}
        //on confirm button
        binding.confirm.setOnClickListener {
            Fun.finishAnimationQuestionTickBox(this, binding.headlineContainer, binding.bodyContainer, binding.footerContainer,
                                               binding.question, binding.answerAllContainer, binding.answerOneContainer, binding.answerTwoContainer, binding.answerThreeContainer,
                                               binding.answerFourContainer, binding.answerFiveContainer, binding.answerSixContainer,
                                               binding.confirm, binding.user, binding.swipeIconContainer, binding.percentage)
            binding.confirm.postDelayed({startActivity(Intent(this, ActivitySwipePrefMenu::class.java))}, 1600)
        }

    }
}