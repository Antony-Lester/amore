package app.lonelyheartsclub.amore

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import app.lonelyheartsclub.amore.databinding.ActivitySwipePrefRatingBinding

class ActivitySwipePrefRating : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;supportActionBar?.hide()
        val binding = ActivitySwipePrefRatingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //init fonts
        binding.question.typeface = Fun.setFont(this, "headline")
        binding.imperialTitle.typeface = Fun.setFont(this, "headline")
        binding.metricTitle.typeface = Fun.setFont(this, "headline")
        binding.imperialValue.typeface = Fun.setFont(this, "headline")
        binding.metricValue.typeface = Fun.setFont(this, "headline")
        binding.buttonText.typeface = Fun.setFont(this, "sub_body")
        //footer font
        binding.user.typeface = Fun.setFont(this, "body")
        binding.percentage.typeface = Fun.setFont(this, "body")
        binding.percentage.text = Fun.calculateSwipePreferencePercentageTotal()
        Fun.calculateSwipePreferencePercentageItem("reputationScore", binding.progressBar)
        //init seekbar
        binding.seekBar.progress = if (Pref.reputationScore == 0) {0} else {(Pref.reputationScore /100)}
        binding.imperialValue.text = if (binding.seekBar.progress != 0) {(binding.seekBar.progress.toFloat()/10.0f).toString()} else {"0.0"}
        binding.metricValue.text = if (binding.seekBar.progress != 0) {
            when (binding.seekBar.progress) {
                1 -> {(Stat.reputationScore1.toFloat()/1000.0f).toString()+ "%"}
                2 -> {(Stat.reputationScore2.toFloat()/1000.0f).toString()+ "%"}
                3 -> {(Stat.reputationScore3.toFloat()/1000.0f).toString()+ "%"}
                4 -> {(Stat.reputationScore4.toFloat()/1000.0f).toString()+ "%"}
                5 -> {(Stat.reputationScore5.toFloat()/1000.0f).toString()+ "%"}
                6 -> {(Stat.reputationScore6.toFloat()/1000.0f).toString()+ "%"}
                7 -> {(Stat.reputationScore7.toFloat()/1000.0f).toString()+ "%"}
                8 -> {(Stat.reputationScore8.toFloat()/1000.0f).toString()+ "%"}
                9 -> {(Stat.reputationScore9.toFloat()/1000.0f).toString()+ "%"}
                10 -> {(Stat.reputationScore10.toFloat()/1000.0f).toString()+ "%"}
                11 -> {(Stat.reputationScore11.toFloat()/1000.0f).toString()+ "%"}
                12 -> {(Stat.reputationScore12.toFloat()/1000.0f).toString()+ "%"}
                13 -> {(Stat.reputationScore13.toFloat()/1000.0f).toString()+ "%"}
                14 -> {(Stat.reputationScore14.toFloat()/1000.0f).toString()+ "%"}
                15 -> {(Stat.reputationScore15.toFloat()/1000.0f).toString()+ "%"}
                16 -> {(Stat.reputationScore16.toFloat()/1000.0f).toString()+ "%"}
                17 -> {(Stat.reputationScore17.toFloat()/1000.0f).toString()+ "%"}
                18 -> {(Stat.reputationScore18.toFloat()/1000.0f).toString()+ "%"}
                19 -> {(Stat.reputationScore19.toFloat()/1000.0f).toString()+ "%"}
                20 -> {(Stat.reputationScore20.toFloat()/1000.0f).toString()+ "%"}
                21 -> {(Stat.reputationScore21.toFloat()/1000.0f).toString()+ "%"}
                22 -> {(Stat.reputationScore22.toFloat()/1000.0f).toString()+ "%"}
                23 -> {(Stat.reputationScore23.toFloat()/1000.0f).toString()+ "%"}
                24 -> {(Stat.reputationScore24.toFloat()/1000.0f).toString()+ "%"}
                25 -> {(Stat.reputationScore25.toFloat()/1000.0f).toString()+ "%"}
                26 -> {(Stat.reputationScore26.toFloat()/1000.0f).toString()+ "%"}
                27 -> {(Stat.reputationScore27.toFloat()/1000.0f).toString()+ "%"}
                28 -> {(Stat.reputationScore28.toFloat()/1000.0f).toString()+ "%"}
                29 -> {(Stat.reputationScore29.toFloat()/1000.0f).toString()+ "%"}
                30 -> {(Stat.reputationScore30.toFloat()/1000.0f).toString()+ "%"}
                31 -> {(Stat.reputationScore31.toFloat()/1000.0f).toString()+ "%"}
                32 -> {(Stat.reputationScore32.toFloat()/1000.0f).toString()+ "%"}
                33 -> {(Stat.reputationScore33.toFloat()/1000.0f).toString()+ "%"}
                34 -> {(Stat.reputationScore34.toFloat()/1000.0f).toString()+ "%"}
                35 -> {(Stat.reputationScore35.toFloat()/1000.0f).toString()+ "%"}
                36 -> {(Stat.reputationScore36.toFloat()/1000.0f).toString()+ "%"}
                37 -> {(Stat.reputationScore37.toFloat()/1000.0f).toString()+ "%"}
                38 -> {(Stat.reputationScore38.toFloat()/1000.0f).toString()+ "%"}
                39 -> {(Stat.reputationScore39.toFloat()/1000.0f).toString()+ "%"}
                40 -> {(Stat.reputationScore40.toFloat()/1000.0f).toString()+ "%"}
                41 -> {(Stat.reputationScore41.toFloat()/1000.0f).toString()+ "%"}
                42 -> {(Stat.reputationScore42.toFloat()/1000.0f).toString()+ "%"}
                43 -> {(Stat.reputationScore43.toFloat()/1000.0f).toString()+ "%"}
                44 -> {(Stat.reputationScore44.toFloat()/1000.0f).toString()+ "%"}
                45 -> {(Stat.reputationScore45.toFloat()/1000.0f).toString()+ "%"}
                46 -> {(Stat.reputationScore46.toFloat()/1000.0f).toString()+ "%"}
                47 -> {(Stat.reputationScore47.toFloat()/1000.0f).toString()+ "%"}
                48 -> {(Stat.reputationScore48.toFloat()/1000.0f).toString()+ "%"}
                49 -> {(Stat.reputationScore49.toFloat()/1000.0f).toString()+ "%"}
                50 -> {(Stat.reputationScore50.toFloat()/1000.0f).toString()+ "%"}
                51 -> {(Stat.reputationScore51.toFloat()/1000.0f).toString()+ "%"}
                52 -> {(Stat.reputationScore52.toFloat()/1000.0f).toString()+ "%"}
                53 -> {(Stat.reputationScore53.toFloat()/1000.0f).toString()+ "%"}
                54 -> {(Stat.reputationScore54.toFloat()/1000.0f).toString()+ "%"}
                55 -> {(Stat.reputationScore55.toFloat()/1000.0f).toString()+ "%"}
                56 -> {(Stat.reputationScore56.toFloat()/1000.0f).toString()+ "%"}
                57 -> {(Stat.reputationScore57.toFloat()/1000.0f).toString()+ "%"}
                58 -> {(Stat.reputationScore58.toFloat()/1000.0f).toString()+ "%"}
                59 -> {(Stat.reputationScore59.toFloat()/1000.0f).toString()+ "%"}
                60 -> {(Stat.reputationScore60.toFloat()/1000.0f).toString()+ "%"}
                61 -> {(Stat.reputationScore61.toFloat()/1000.0f).toString()+ "%"}
                62 -> {(Stat.reputationScore62.toFloat()/1000.0f).toString()+ "%"}
                63 -> {(Stat.reputationScore63.toFloat()/1000.0f).toString()+ "%"}
                64 -> {(Stat.reputationScore64.toFloat()/1000.0f).toString()+ "%"}
                65 -> {(Stat.reputationScore65.toFloat()/1000.0f).toString()+ "%"}
                66 -> {(Stat.reputationScore66.toFloat()/1000.0f).toString()+ "%"}
                67 -> {(Stat.reputationScore67.toFloat()/1000.0f).toString()+ "%"}
                68 -> {(Stat.reputationScore68.toFloat()/1000.0f).toString()+ "%"}
                69 -> {(Stat.reputationScore69.toFloat()/1000.0f).toString()+ "%"}
                70 -> {(Stat.reputationScore70.toFloat()/1000.0f).toString()+ "%"}
                71 -> {(Stat.reputationScore71.toFloat()/1000.0f).toString()+ "%"}
                72 -> {(Stat.reputationScore72.toFloat()/1000.0f).toString()+ "%"}
                73 -> {(Stat.reputationScore73.toFloat()/1000.0f).toString()+ "%"}
                74 -> {(Stat.reputationScore74.toFloat()/1000.0f).toString()+ "%"}
                75 -> {(Stat.reputationScore75.toFloat()/1000.0f).toString()+ "%"}
                76 -> {(Stat.reputationScore76.toFloat()/1000.0f).toString()+ "%"}
                77 -> {(Stat.reputationScore77.toFloat()/1000.0f).toString()+ "%"}
                78 -> {(Stat.reputationScore78.toFloat()/1000.0f).toString()+ "%"}
                79 -> {(Stat.reputationScore79.toFloat()/1000.0f).toString()+ "%"}
                80 -> {(Stat.reputationScore80.toFloat()/1000.0f).toString()+ "%"}
                81 -> {(Stat.reputationScore81.toFloat()/1000.0f).toString()+ "%"}
                82 -> {(Stat.reputationScore82.toFloat()/1000.0f).toString()+ "%"}
                83 -> {(Stat.reputationScore83.toFloat()/1000.0f).toString()+ "%"}
                84 -> {(Stat.reputationScore84.toFloat()/1000.0f).toString()+ "%"}
                85 -> {(Stat.reputationScore85.toFloat()/1000.0f).toString()+ "%"}
                86 -> {(Stat.reputationScore86.toFloat()/1000.0f).toString()+ "%"}
                87 -> {(Stat.reputationScore87.toFloat()/1000.0f).toString()+ "%"}
                88 -> {(Stat.reputationScore88.toFloat()/1000.0f).toString()+ "%"}
                89 -> {(Stat.reputationScore89.toFloat()/1000.0f).toString()+ "%"}
                90 -> {(Stat.reputationScore90.toFloat()/1000.0f).toString()+ "%"}
                91 -> {(Stat.reputationScore91.toFloat()/1000.0f).toString()+ "%"}
                92 -> {(Stat.reputationScore92.toFloat()/1000.0f).toString()+ "%"}
                93 -> {(Stat.reputationScore93.toFloat()/1000.0f).toString()+ "%"}
                94 -> {(Stat.reputationScore94.toFloat()/1000.0f).toString()+ "%"}
                95 -> {(Stat.reputationScore95.toFloat()/1000.0f).toString()+ "%"}
                96 -> {(Stat.reputationScore96.toFloat()/1000.0f).toString()+ "%"}
                97 -> {(Stat.reputationScore97.toFloat()/1000.0f).toString()+ "%"}
                98 -> {(Stat.reputationScore98.toFloat()/1000.0f).toString()+ "%"}
                99 -> {(Stat.reputationScore99.toFloat()/1000.0f).toString()+ "%"}
                100 -> {(Stat.reputationScore100.toFloat()/1000.0f).toString()+ "%"}
                else -> {"0.0"}}
        } else {"100%"}
        //init animation
        Fun.startAnimationQuestionSlider(this, binding.swipeIconContainer, binding.button, binding.valuesContainer, binding.seekBarContainer, binding.question, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, binding.user, binding.percentage)

        binding.seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0 : SeekBar?, p1 : Int, p2 : Boolean) {
                Pref.reputationScore = if (binding.seekBar.progress != 0){(binding.seekBar.progress*1000)} else if (binding.seekBar.progress == 100) {100000} else {0}
                binding.imperialValue.text = if (binding.seekBar.progress != 0) {(binding.seekBar.progress.toFloat()/10.0f).toString()} else {"0.0"}
                binding.metricValue.text = if (binding.seekBar.progress != 0) { when (binding.seekBar.progress) {
                        1 -> {(Stat.reputationScore1.toFloat()/1000.0f).toString()+ "%"}
                        2 -> {(Stat.reputationScore2.toFloat()/1000.0f).toString()+ "%"}
                        3 -> {(Stat.reputationScore3.toFloat()/1000.0f).toString()+ "%"}
                        4 -> {(Stat.reputationScore4.toFloat()/1000.0f).toString()+ "%"}
                        5 -> {(Stat.reputationScore5.toFloat()/1000.0f).toString()+ "%"}
                        6 -> {(Stat.reputationScore6.toFloat()/1000.0f).toString()+ "%"}
                        7 -> {(Stat.reputationScore7.toFloat()/1000.0f).toString()+ "%"}
                        8 -> {(Stat.reputationScore8.toFloat()/1000.0f).toString()+ "%"}
                        9 -> {(Stat.reputationScore9.toFloat()/1000.0f).toString()+ "%"}
                        10 -> {(Stat.reputationScore10.toFloat()/1000.0f).toString()+ "%"}
                        11 -> {(Stat.reputationScore11.toFloat()/1000.0f).toString()+ "%"}
                        12 -> {(Stat.reputationScore12.toFloat()/1000.0f).toString()+ "%"}
                        13 -> {(Stat.reputationScore13.toFloat()/1000.0f).toString()+ "%"}
                        14 -> {(Stat.reputationScore14.toFloat()/1000.0f).toString()+ "%"}
                        15 -> {(Stat.reputationScore15.toFloat()/1000.0f).toString()+ "%"}
                        16 -> {(Stat.reputationScore16.toFloat()/1000.0f).toString()+ "%"}
                        17 -> {(Stat.reputationScore17.toFloat()/1000.0f).toString()+ "%"}
                        18 -> {(Stat.reputationScore18.toFloat()/1000.0f).toString()+ "%"}
                        19 -> {(Stat.reputationScore19.toFloat()/1000.0f).toString()+ "%"}
                        20 -> {(Stat.reputationScore20.toFloat()/1000.0f).toString()+ "%"}
                        21 -> {(Stat.reputationScore21.toFloat()/1000.0f).toString()+ "%"}
                        22 -> {(Stat.reputationScore22.toFloat()/1000.0f).toString()+ "%"}
                        23 -> {(Stat.reputationScore23.toFloat()/1000.0f).toString()+ "%"}
                        24 -> {(Stat.reputationScore24.toFloat()/1000.0f).toString()+ "%"}
                        25 -> {(Stat.reputationScore25.toFloat()/1000.0f).toString()+ "%"}
                        26 -> {(Stat.reputationScore26.toFloat()/1000.0f).toString()+ "%"}
                        27 -> {(Stat.reputationScore27.toFloat()/1000.0f).toString()+ "%"}
                        28 -> {(Stat.reputationScore28.toFloat()/1000.0f).toString()+ "%"}
                        29 -> {(Stat.reputationScore29.toFloat()/1000.0f).toString()+ "%"}
                        30 -> {(Stat.reputationScore30.toFloat()/1000.0f).toString()+ "%"}
                        31 -> {(Stat.reputationScore31.toFloat()/1000.0f).toString()+ "%"}
                        32 -> {(Stat.reputationScore32.toFloat()/1000.0f).toString()+ "%"}
                        33 -> {(Stat.reputationScore33.toFloat()/1000.0f).toString()+ "%"}
                        34 -> {(Stat.reputationScore34.toFloat()/1000.0f).toString()+ "%"}
                        35 -> {(Stat.reputationScore35.toFloat()/1000.0f).toString()+ "%"}
                        36 -> {(Stat.reputationScore36.toFloat()/1000.0f).toString()+ "%"}
                        37 -> {(Stat.reputationScore37.toFloat()/1000.0f).toString()+ "%"}
                        38 -> {(Stat.reputationScore38.toFloat()/1000.0f).toString()+ "%"}
                        39 -> {(Stat.reputationScore39.toFloat()/1000.0f).toString()+ "%"}
                        40 -> {(Stat.reputationScore40.toFloat()/1000.0f).toString()+ "%"}
                        41 -> {(Stat.reputationScore41.toFloat()/1000.0f).toString()+ "%"}
                        42 -> {(Stat.reputationScore42.toFloat()/1000.0f).toString()+ "%"}
                        43 -> {(Stat.reputationScore43.toFloat()/1000.0f).toString()+ "%"}
                        44 -> {(Stat.reputationScore44.toFloat()/1000.0f).toString()+ "%"}
                        45 -> {(Stat.reputationScore45.toFloat()/1000.0f).toString()+ "%"}
                        46 -> {(Stat.reputationScore46.toFloat()/1000.0f).toString()+ "%"}
                        47 -> {(Stat.reputationScore47.toFloat()/1000.0f).toString()+ "%"}
                        48 -> {(Stat.reputationScore48.toFloat()/1000.0f).toString()+ "%"}
                        49 -> {(Stat.reputationScore49.toFloat()/1000.0f).toString()+ "%"}
                        50 -> {(Stat.reputationScore50.toFloat()/1000.0f).toString()+ "%"}
                        51 -> {(Stat.reputationScore51.toFloat()/1000.0f).toString()+ "%"}
                        52 -> {(Stat.reputationScore52.toFloat()/1000.0f).toString()+ "%"}
                        53 -> {(Stat.reputationScore53.toFloat()/1000.0f).toString()+ "%"}
                        54 -> {(Stat.reputationScore54.toFloat()/1000.0f).toString()+ "%"}
                        55 -> {(Stat.reputationScore55.toFloat()/1000.0f).toString()+ "%"}
                        56 -> {(Stat.reputationScore56.toFloat()/1000.0f).toString()+ "%"}
                        57 -> {(Stat.reputationScore57.toFloat()/1000.0f).toString()+ "%"}
                        58 -> {(Stat.reputationScore58.toFloat()/1000.0f).toString()+ "%"}
                        59 -> {(Stat.reputationScore59.toFloat()/1000.0f).toString()+ "%"}
                        60 -> {(Stat.reputationScore60.toFloat()/1000.0f).toString()+ "%"}
                        61 -> {(Stat.reputationScore61.toFloat()/1000.0f).toString()+ "%"}
                        62 -> {(Stat.reputationScore62.toFloat()/1000.0f).toString()+ "%"}
                        63 -> {(Stat.reputationScore63.toFloat()/1000.0f).toString()+ "%"}
                        64 -> {(Stat.reputationScore64.toFloat()/1000.0f).toString()+ "%"}
                        65 -> {(Stat.reputationScore65.toFloat()/1000.0f).toString()+ "%"}
                        66 -> {(Stat.reputationScore66.toFloat()/1000.0f).toString()+ "%"}
                        67 -> {(Stat.reputationScore67.toFloat()/1000.0f).toString()+ "%"}
                        68 -> {(Stat.reputationScore68.toFloat()/1000.0f).toString()+ "%"}
                        69 -> {(Stat.reputationScore69.toFloat()/1000.0f).toString()+ "%"}
                        70 -> {(Stat.reputationScore70.toFloat()/1000.0f).toString()+ "%"}
                        71 -> {(Stat.reputationScore71.toFloat()/1000.0f).toString()+ "%"}
                        72 -> {(Stat.reputationScore72.toFloat()/1000.0f).toString()+ "%"}
                        73 -> {(Stat.reputationScore73.toFloat()/1000.0f).toString()+ "%"}
                        74 -> {(Stat.reputationScore74.toFloat()/1000.0f).toString()+ "%"}
                        75 -> {(Stat.reputationScore75.toFloat()/1000.0f).toString()+ "%"}
                        76 -> {(Stat.reputationScore76.toFloat()/1000.0f).toString()+ "%"}
                        77 -> {(Stat.reputationScore77.toFloat()/1000.0f).toString()+ "%"}
                        78 -> {(Stat.reputationScore78.toFloat()/1000.0f).toString()+ "%"}
                        79 -> {(Stat.reputationScore79.toFloat()/1000.0f).toString()+ "%"}
                        80 -> {(Stat.reputationScore80.toFloat()/1000.0f).toString()+ "%"}
                        81 -> {(Stat.reputationScore81.toFloat()/1000.0f).toString()+ "%"}
                        82 -> {(Stat.reputationScore82.toFloat()/1000.0f).toString()+ "%"}
                        83 -> {(Stat.reputationScore83.toFloat()/1000.0f).toString()+ "%"}
                        84 -> {(Stat.reputationScore84.toFloat()/1000.0f).toString()+ "%"}
                        85 -> {(Stat.reputationScore85.toFloat()/1000.0f).toString()+ "%"}
                        86 -> {(Stat.reputationScore86.toFloat()/1000.0f).toString()+ "%"}
                        87 -> {(Stat.reputationScore87.toFloat()/1000.0f).toString()+ "%"}
                        88 -> {(Stat.reputationScore88.toFloat()/1000.0f).toString()+ "%"}
                        89 -> {(Stat.reputationScore89.toFloat()/1000.0f).toString()+ "%"}
                        90 -> {(Stat.reputationScore90.toFloat()/1000.0f).toString()+ "%"}
                        91 -> {(Stat.reputationScore91.toFloat()/1000.0f).toString()+ "%"}
                        92 -> {(Stat.reputationScore92.toFloat()/1000.0f).toString()+ "%"}
                        93 -> {(Stat.reputationScore93.toFloat()/1000.0f).toString()+ "%"}
                        94 -> {(Stat.reputationScore94.toFloat()/1000.0f).toString()+ "%"}
                        95 -> {(Stat.reputationScore95.toFloat()/1000.0f).toString()+ "%"}
                        96 -> {(Stat.reputationScore96.toFloat()/1000.0f).toString()+ "%"}
                        97 -> {(Stat.reputationScore97.toFloat()/1000.0f).toString()+ "%"}
                        98 -> {(Stat.reputationScore98.toFloat()/1000.0f).toString()+ "%"}
                        99 -> {(Stat.reputationScore99.toFloat()/1000.0f).toString()+ "%"}
                        100 -> {(Stat.reputationScore100.toFloat()/1000.0f).toString()+ "%"}
                        else -> {"0.0"}} } else {"100%"}
                binding.percentage.text = Fun.calculateSwipePreferencePercentageTotal()
                Fun.calculateSwipePreferencePercentageItem("reputationScore", binding.progressBar)
            }
            override fun onStartTrackingTouch(p0 : SeekBar?) {}
            override fun onStopTrackingTouch(p0 : SeekBar?) {}})
        binding.buttonText.setOnClickListener {
            Fun.finishAnimationQuestionSlider(this, binding.swipeIconContainer, binding.button, binding.valuesContainer, binding.seekBarContainer, binding.question, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, binding.user, binding.percentage)
            binding.buttonText.postDelayed({startActivity(Intent(this, ActivitySwipePrefMenu::class.java));finish()}, 1600)}
        binding.swipeIconContainer.setOnClickListener {
            Fun.finishAnimationQuestionSlider(this, binding.swipeIconContainer, binding.button, binding.valuesContainer, binding.seekBarContainer, binding.question, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, binding.user, binding.percentage)
            binding.buttonText.postDelayed({startActivity(Intent(this, ActivityProfileMenu::class.java));finish()}, 1600)}
    }
    }