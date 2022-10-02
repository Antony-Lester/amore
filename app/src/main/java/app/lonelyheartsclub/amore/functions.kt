@file:Suppress("unused", "unused", "unused", "unused")

package app.lonelyheartsclub.amore

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Typeface
import android.graphics.drawable.Icon
import android.graphics.drawable.TransitionDrawable
import android.icu.util.Calendar
import android.os.Handler
import android.os.Looper
import android.util.TypedValue
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlin.math.roundToInt

object Fun {
    //=============== CALCULATE =======================
    fun calculateHomeWidgetAndProgress(){
        //TODO homeCalculateWidgetAndProgress()
        //widget is total of to-do tasks...profile...messages...swipes...
        //progress??
    }
    fun calculateProfileWidgetAndProgress(){
        Helper.profileWidget = 0
        if(! Info.photoFace){Helper.profileWidget=Helper.profileWidget!!+1}
        if(! Info.photoBody){Helper.profileWidget=Helper.profileWidget!!+1}
        if(Info.easy == null) {Helper.profileWidget=Helper.profileWidget!!+1}
        if(Info.bio == null || Info.bio !!.contains("**ADMIN MODERATED THIS BIOGRAPHY**")) {Helper.profileWidget=Helper.profileWidget!!+1}
        if(Info.children == null){Helper.profileWidget=Helper.profileWidget!!+1}
        if(Info.travel == null){Helper.profileWidget=Helper.profileWidget!!+1}
        if(Info.bmi == null){Helper.profileWidget=Helper.profileWidget!!+1}
        if(Info.pet == null){Helper.profileWidget=Helper.profileWidget!!+1}
        if(Info.music == null){Helper.profileWidget=Helper.profileWidget!!+1}
        if(Info.food == null){Helper.profileWidget=Helper.profileWidget!!+1}
        if(Info.political == null){Helper.profileWidget=Helper.profileWidget!!+1}
        if(Info.education == null){Helper.profileWidget=Helper.profileWidget!!+1}
        if(Info.languageTwo == null){Helper.profileWidget=Helper.profileWidget!!+1}
        if(Info.employment == null){Helper.profileWidget=Helper.profileWidget!!+1}
        if(Info.income == null){Helper.profileWidget=Helper.profileWidget!!+1}
        if(Info.views == null){Helper.profileWidget=Helper.profileWidget!!+1}
        if(Info.drink == null){Helper.profileWidget=Helper.profileWidget!!+1}
        if(Info.smoke == null){Helper.profileWidget=Helper.profileWidget!!+1}
        if(Info.drugs == null){Helper.profileWidget=Helper.profileWidget!!+1}
        if(Info.race == null){Helper.profileWidget=Helper.profileWidget!!+1}
        if(Info.religion == null){Helper.profileWidget=Helper.profileWidget!!+1}
        if (Helper.profileWidget!! == 21) {Helper.profileProgress = 0} else {Helper.profileProgress = ((100.0f/21.0f)*(21.0f-Helper.profileWidget!!.toFloat())).toInt()}}
    fun calculateSwipeWidgetAndProgress(){
        //TODO swipeCalculateWidgetAndProgress()
        //widget is number of users available yet to be swiped
        //progress is % of swiped users from total users available to swipe
    }
    fun calculateMessageWidgetAndProgress(){
        //TODO messageCalculateWidgetAndProgress()
        //widget is number of messages waiting for reply
        //progress is % of messages replied to???
    }
    fun calculateIncreaseReputationScore(percentage : Float){
        Info.reputationScore = (((100 - Info.reputationScore.toFloat()) / 100f) * (100f - percentage)).toInt()
        if (Info.reputationScore > 10000) {Info.reputationScore = 10000}}
    fun calculateReduceReputationScore(percentage : Float){
        Info.reputationScore = (((0 - Info.reputationScore.toFloat()) / 100f) * (100f - percentage)).toInt()
        if (Info.reputationScore < 0) {Info.reputationScore = 0}}
    fun calculateSwipePreferencePercentageItem(preferenceName : String, progressBar : ProgressBar){
        var progress = 0
        when (preferenceName) {
            "language" -> {
                val iterator = Pref.language!!.iterator()

                iterator.forEach {
                    when (it) {
                        "af" -> {progress += Stat.languageAF}
                        "ar" -> {progress += Stat.languageAR}
                        "be" -> {progress += Stat.languageBE}
                        "bg" -> {progress += Stat.languageBG}
                        "bn" -> {progress += Stat.languageBN}
                        "ca" -> {progress += Stat.languageCA}
                        "cs" -> {progress += Stat.languageCS}
                        "cy" -> {progress += Stat.languageCY}
                        "da" -> {progress += Stat.languageDA}
                        "de" -> {progress += Stat.languageDE}
                        "el" -> {progress += Stat.languageEL}
                        "en" -> {progress += Stat.languageEN}
                        "eo" -> {progress += Stat.languageEO}
                        "es" -> {progress += Stat.languageES}
                        "et" -> {progress += Stat.languageET}
                        "fa" -> {progress += Stat.languageFA}
                        "fi" -> {progress += Stat.languageFI}
                        "fr" -> {progress += Stat.languageFR}
                        "ga" -> {progress += Stat.languageGA}
                        "gl" -> {progress += Stat.languageGL}
                        "gu" -> {progress += Stat.languageGU}
                        "he" -> {progress += Stat.languageHE}
                        "hi" -> {progress += Stat.languageHI}
                        "hr" -> {progress += Stat.languageHR}
                        "ht" -> {progress += Stat.languageHT}
                        "hu" -> {progress += Stat.languageHU}
                        "id" -> {progress += Stat.languageID}
                        "is" -> {progress += Stat.languageIS}
                        "it" -> {progress += Stat.languageIT}
                        "ja" -> {progress += Stat.languageJA}
                        "ka" -> {progress += Stat.languageKA}
                        "kn" -> {progress += Stat.languageKN}
                        "ko" -> {progress += Stat.languageKO}
                        "lt" -> {progress += Stat.languageLT}
                        "lv" -> {progress += Stat.languageLV}
                        "mk" -> {progress += Stat.languageMK}
                        "mr" -> {progress += Stat.languageMR}
                        "ms" -> {progress += Stat.languageMS}
                        "mt" -> {progress += Stat.languageMT}
                        "nl" -> {progress += Stat.languageNL}
                        "no" -> {progress += Stat.languageNO}
                        "pl" -> {progress += Stat.languagePL}
                        "pt" -> {progress += Stat.languagePT}
                        "ro" -> {progress += Stat.languageRO}
                        "ru" -> {progress += Stat.languageRU}
                        "sk" -> {progress += Stat.languageSK}
                        "sl" -> {progress += Stat.languageSL}
                        "sq" -> {progress += Stat.languageSQ}
                        "sv" -> {progress += Stat.languageSV}
                        "sw" -> {progress += Stat.languageSW}
                        "ta" -> {progress += Stat.languageTA}
                        "te" -> {progress += Stat.languageTE}
                        "th" -> {progress += Stat.languageTH}
                        "tr" -> {progress += Stat.languageTR}
                        "uk" -> {progress += Stat.languageUK}
                        "ur" -> {progress += Stat.languageUR}
                        "vi" -> {progress += Stat.languageVI}
                        "zh" -> {progress += Stat.languageZH}}
                    progress /= 1000}
            }
            "employment" -> {val iterator = Pref.employment!!.iterator()

                iterator.forEach {
                    when (it) {
                        "a" -> {progress += Stat.employmentA}
                        "b" -> {progress += Stat.employmentB}
                        "c" -> {progress += Stat.employmentC}
                        "d" -> {progress += Stat.employmentD}
                        "e" -> {progress += Stat.employmentE}
                        "f" -> {progress += Stat.employmentF}}}
                progress /= 1000}
            "religion" -> {
                val iterator = Pref.religion!!.iterator()

                iterator.forEach {
                    when (it) {
                        "a" -> {progress += Stat.religionA}
                        "b" -> {progress += Stat.religionB}
                        "c" -> {progress += Stat.religionC}
                        "d" -> {progress += Stat.religionD}
                        "e" -> {progress += Stat.religionE}
                        "f" -> {progress += Stat.religionF}}}
                progress /= 1000}
            "political" -> {
                val iterator = Pref.political!!.iterator()

                iterator.forEach {
                    when (it) {
                        "a" -> {progress += Stat.politicalA}
                        "b" -> {progress += Stat.politicalB}
                        "c" -> {progress += Stat.politicalC}
                        "d" -> {progress += Stat.politicalD}
                        "e" -> {progress += Stat.politicalE}
                        "f" -> {progress += Stat.politicalF}}}
                progress /= 1000}
            "pet" -> {
                val iterator = Pref.pet!!.iterator()

                iterator.forEach {
                    when (it) {
                        "a" -> {progress += Stat.petA}
                        "b" -> {progress += Stat.petB}
                        "c" -> {progress += Stat.petC}
                        "d" -> {progress += Stat.petD}
                        "e" -> {progress += Stat.petE}
                        "f" -> {progress += Stat.petF}}}
                progress /= 1000}
            "children" -> {
                val iterator = Pref.children!!.iterator()

                iterator.forEach {
                    when (it) {
                        "a" -> {progress += Stat.childrenA}
                        "b" -> {progress += Stat.childrenB}
                        "c" -> {progress += Stat.childrenC}
                        "d" -> {progress += Stat.childrenD}
                        "e" -> {progress += Stat.childrenE}
                        "f" -> {progress += Stat.childrenF}}}
                progress /= 1000
            }
            "relationship" -> {
                val iterator = Pref.relationship!!.iterator()

                iterator.forEach {
                    when (it) {
                        "a" -> {progress += Stat.relationshipA}
                        "b" -> {progress += Stat.relationshipB}
                        "c" -> {progress += Stat.relationshipC}
                        "d" -> {progress += Stat.relationshipD}
                        "e" -> {progress += Stat.relationshipE}
                        "f" -> {progress += Stat.relationshipF}}}
                progress /= 1000}
            "food" -> {
                val iterator = Pref.food!!.iterator()

                iterator.forEach {
                    when (it) {
                        "a" -> {progress += Stat.foodA}
                        "b" -> {progress += Stat.foodB}
                        "c" -> {progress += Stat.foodC}
                        "d" -> {progress += Stat.foodD}
                        "e" -> {progress += Stat.foodE}}}
                progress /= 1000}
            "smoke" -> {
                val iterator = Pref.smoke!!.iterator()

                iterator.forEach {
                    when (it) {
                        "a" -> {progress += Stat.smokeA}
                        "b" -> {progress += Stat.smokeB}
                        "c" -> {progress += Stat.smokeC}
                        "d" -> {progress += Stat.smokeD}
                        "e" -> {progress += Stat.smokeE}}}
                progress /= 1000}
            "education" -> {
                val iterator = Pref.education!!.iterator()

                iterator.forEach {
                    when (it) {
                        "a" -> {progress += Stat.educationA}
                        "b" -> {progress += Stat.educationB}
                        "c" -> {progress += Stat.educationC}
                        "d" -> {progress += Stat.educationD}}}
                progress /= 1000}
            "drink" -> {
                val iterator = Pref.drink!!.iterator()

                iterator.forEach {
                    when (it) {
                        "a" -> {progress += Stat.drinkA}
                        "b" -> {progress += Stat.drinkB}
                        "c" -> {progress += Stat.drinkC}
                        "d" -> {progress += Stat.drinkD}}}
                progress /= 1000}
            "drugs" -> {
                val iterator = Pref.drugs!!.iterator()

                iterator.forEach {
                    when (it) {
                        "a" -> {progress += Stat.drugsA}
                        "b" -> {progress += Stat.drugsB}
                        "c" -> {progress += Stat.drugsC}
                        "d" -> {progress += Stat.drugsD}}}
                progress /= 1000 }
            "travel" -> {
                val iterator = Pref.travel!!.iterator()

                iterator.forEach {
                    when (it) {
                        "a" -> {progress += Stat.travelA}
                        "b" -> {progress += Stat.travelB}
                        "c" -> {progress += Stat.travelC}}}
                progress /= 1000}
            "age" -> {

                for (it in Pref.minAge!!..Pref.maxAge!!){when (it) {
                    18 -> {progress += Stat.age18}
                    19 -> {progress += Stat.age19}
                    20 -> {progress += Stat.age20}
                    21 -> {progress += Stat.age18}
                    22 -> {progress += Stat.age19}
                    23 -> {progress += Stat.age20}
                    24 -> {progress += Stat.age18}
                    25 -> {progress += Stat.age19}
                    26 -> {progress += Stat.age20}
                    27 -> {progress += Stat.age18}
                    28 -> {progress += Stat.age19}
                    29 -> {progress += Stat.age20}
                    30 -> {progress += Stat.age20}
                    31 -> {progress += Stat.age18}
                    32 -> {progress += Stat.age19}
                    33 -> {progress += Stat.age20}
                    34 -> {progress += Stat.age18}
                    35 -> {progress += Stat.age19}
                    36 -> {progress += Stat.age20}
                    37 -> {progress += Stat.age18}
                    38 -> {progress += Stat.age19}
                    39 -> {progress += Stat.age20}
                    40 -> {progress += Stat.age20}
                    41 -> {progress += Stat.age18}
                    42 -> {progress += Stat.age19}
                    43 -> {progress += Stat.age20}
                    44 -> {progress += Stat.age18}
                    45 -> {progress += Stat.age19}
                    46 -> {progress += Stat.age20}
                    47 -> {progress += Stat.age18}
                    48 -> {progress += Stat.age19}
                    49 -> {progress += Stat.age20}
                    50 -> {progress += Stat.age20}
                    51 -> {progress += Stat.age18}
                    52 -> {progress += Stat.age19}
                    53 -> {progress += Stat.age20}
                    54 -> {progress += Stat.age18}
                    55 -> {progress += Stat.age19}
                    56 -> {progress += Stat.age20}
                    57 -> {progress += Stat.age18}
                    58 -> {progress += Stat.age19}
                    59 -> {progress += Stat.age20}
                    60 -> {progress += Stat.age20}
                    61 -> {progress += Stat.age18}
                    62 -> {progress += Stat.age19}
                    63 -> {progress += Stat.age20}
                    64 -> {progress += Stat.age18}
                    65 -> {progress += Stat.age19}
                    66 -> {progress += Stat.age20}
                    67 -> {progress += Stat.age18}
                    68 -> {progress += Stat.age19}
                    69 -> {progress += Stat.age20}
                    70 -> {progress += Stat.age20}
                    71 -> {progress += Stat.age18}
                    72 -> {progress += Stat.age19}
                    73 -> {progress += Stat.age20}
                    74 -> {progress += Stat.age18}
                    75 -> {progress += Stat.age19}
                    76 -> {progress += Stat.age20}
                    77 -> {progress += Stat.age18}
                    78 -> {progress += Stat.age19}
                    79 -> {progress += Stat.age20}
                    80 -> {progress += Stat.age20}}}
                progress /= 1000}
            "bmi" -> {
                val iterator = Pref.bmi!!.iterator()

                iterator.forEach {
                    when (it) {
                        "a" -> {progress += Stat.bmiA}
                        "b" -> {progress += Stat.bmiB}
                        "c" -> {progress += Stat.bmiC}
                        "d" -> {progress += Stat.bmiD}
                        "e" -> {progress += Stat.bmiE}}}
                progress /= 1000}
            "easy" -> {
                val iterator = Pref.easy!!.iterator()

                iterator.forEach {
                    when (it) {
                        "a" -> {progress += Stat.easyA}
                        "b" -> {progress += Stat.easyB}
                        "c" -> {progress += Stat.easyC}}}
                progress /= 1000 }
            "height" -> {

                for (it in Pref.minHeight!!..Pref.maxHeight!!){when (it) {
                    120 -> {progress += Stat.height120}
                    121 -> {progress += Stat.height121}
                    122 -> {progress += Stat.height122}
                    123 -> {progress += Stat.height123}
                    124 -> {progress += Stat.height124}
                    125 -> {progress += Stat.height125}
                    126 -> {progress += Stat.height126}
                    127 -> {progress += Stat.height127}
                    128 -> {progress += Stat.height128}
                    129 -> {progress += Stat.height129}
                    130 -> {progress += Stat.height130}
                    131 -> {progress += Stat.height131}
                    132 -> {progress += Stat.height132}
                    133 -> {progress += Stat.height133}
                    134 -> {progress += Stat.height134}
                    135 -> {progress += Stat.height135}
                    136 -> {progress += Stat.height136}
                    137 -> {progress += Stat.height137}
                    138 -> {progress += Stat.height138}
                    139 -> {progress += Stat.height139}
                    140 -> {progress += Stat.height140}
                    141 -> {progress += Stat.height141}
                    142 -> {progress += Stat.height142}
                    143 -> {progress += Stat.height143}
                    144 -> {progress += Stat.height144}
                    145 -> {progress += Stat.height145}
                    146 -> {progress += Stat.height146}
                    147 -> {progress += Stat.height147}
                    148 -> {progress += Stat.height148}
                    149 -> {progress += Stat.height149}
                    150 -> {progress += Stat.height150}
                    151 -> {progress += Stat.height151}
                    152 -> {progress += Stat.height152}
                    153 -> {progress += Stat.height153}
                    154 -> {progress += Stat.height154}
                    155 -> {progress += Stat.height155}
                    156 -> {progress += Stat.height156}
                    157 -> {progress += Stat.height157}
                    158 -> {progress += Stat.height158}
                    159 -> {progress += Stat.height159}
                    160 -> {progress += Stat.height160}
                    161 -> {progress += Stat.height161}
                    162 -> {progress += Stat.height162}
                    163 -> {progress += Stat.height163}
                    164 -> {progress += Stat.height164}
                    165 -> {progress += Stat.height165}
                    166 -> {progress += Stat.height166}
                    167 -> {progress += Stat.height167}
                    168 -> {progress += Stat.height168}
                    169 -> {progress += Stat.height169}
                    170 -> {progress += Stat.height170}
                    171 -> {progress += Stat.height171}
                    172 -> {progress += Stat.height172}
                    173 -> {progress += Stat.height173}
                    174 -> {progress += Stat.height174}
                    175 -> {progress += Stat.height175}
                    176 -> {progress += Stat.height176}
                    177 -> {progress += Stat.height177}
                    178 -> {progress += Stat.height178}
                    179 -> {progress += Stat.height179}
                    180 -> {progress += Stat.height180}
                    181 -> {progress += Stat.height181}
                    182 -> {progress += Stat.height182}
                    183 -> {progress += Stat.height183}
                    184 -> {progress += Stat.height184}
                    185 -> {progress += Stat.height185}
                    186 -> {progress += Stat.height186}
                    187 -> {progress += Stat.height187}
                    188 -> {progress += Stat.height188}
                    189 -> {progress += Stat.height189}
                    190 -> {progress += Stat.height190}
                    191 -> {progress += Stat.height191}
                    192 -> {progress += Stat.height192}
                    193 -> {progress += Stat.height193}
                    194 -> {progress += Stat.height194}
                    195 -> {progress += Stat.height195}
                    196 -> {progress += Stat.height196}
                    197 -> {progress += Stat.height197}
                    198 -> {progress += Stat.height198}
                    199 -> {progress += Stat.height199}
                    200 -> {progress += Stat.height200}
                    201 -> {progress += Stat.height201}
                    202 -> {progress += Stat.height202}
                    203 -> {progress += Stat.height203}
                    204 -> {progress += Stat.height204}
                    205 -> {progress += Stat.height205}
                    206 -> {progress += Stat.height206}
                    207 -> {progress += Stat.height207}
                    208 -> {progress += Stat.height208}
                    209 -> {progress += Stat.height209}
                    210 -> {progress += Stat.height210}
                    211 -> {progress += Stat.height211}
                    212 -> {progress += Stat.height212}
                    213 -> {progress += Stat.height213}
                    214 -> {progress += Stat.height214}
                    215 -> {progress += Stat.height215}
                    216 -> {progress += Stat.height216}
                    217 -> {progress += Stat.height217}
                    218 -> {progress += Stat.height218}
                    219 -> {progress += Stat.height219}
                    220 -> {progress += Stat.height220}}}
                progress /= 1000}
            "income" -> {
                val iterator = Pref.income!!.iterator()
                iterator.forEach {
                    when (it) {
                        "a" -> {progress += Stat.incomeA}
                        "b" -> {progress += Stat.incomeB}
                        "c" -> {progress += Stat.incomeC}
                        "d" -> {progress += Stat.incomeD}
                        "e" -> {progress += Stat.incomeE}}}
                progress /= 1000}
            "reputationScore" -> {
                when (Pref.reputationScore/1000) {
                    0 -> {progress += Stat.reputationScore1}
                    1 -> {progress += Stat.reputationScore1}
                    2 -> {progress += Stat.reputationScore2}
                    3 -> {progress += Stat.reputationScore3}
                    4 -> {progress += Stat.reputationScore4}
                    5 -> {progress += Stat.reputationScore5}
                    6 -> {progress += Stat.reputationScore6}
                    7 -> {progress += Stat.reputationScore7}
                    8 -> {progress += Stat.reputationScore8}
                    9 -> {progress += Stat.reputationScore9}
                    10 -> {progress += Stat.reputationScore10}
                    11 -> {progress += Stat.reputationScore11}
                    12 -> {progress += Stat.reputationScore12}
                    13 -> {progress += Stat.reputationScore13}
                    14 -> {progress += Stat.reputationScore14}
                    15 -> {progress += Stat.reputationScore15}
                    16 -> {progress += Stat.reputationScore16}
                    17 -> {progress += Stat.reputationScore17}
                    18 -> {progress += Stat.reputationScore18}
                    19 -> {progress += Stat.reputationScore19}
                    20 -> {progress += Stat.reputationScore20}
                    21 -> {progress += Stat.reputationScore21}
                    22 -> {progress += Stat.reputationScore22}
                    23 -> {progress += Stat.reputationScore23}
                    24 -> {progress += Stat.reputationScore24}
                    25 -> {progress += Stat.reputationScore25}
                    26 -> {progress += Stat.reputationScore26}
                    27 -> {progress += Stat.reputationScore27}
                    28 -> {progress += Stat.reputationScore28}
                    29 -> {progress += Stat.reputationScore29}
                    30 -> {progress += Stat.reputationScore30}
                    31 -> {progress += Stat.reputationScore31}
                    32 -> {progress += Stat.reputationScore32}
                    33 -> {progress += Stat.reputationScore33}
                    34 -> {progress += Stat.reputationScore34}
                    35 -> {progress += Stat.reputationScore35}
                    36 -> {progress += Stat.reputationScore36}
                    37 -> {progress += Stat.reputationScore37}
                    38 -> {progress += Stat.reputationScore38}
                    39 -> {progress += Stat.reputationScore39}
                    40 -> {progress += Stat.reputationScore40}
                    41 -> {progress += Stat.reputationScore41}
                    42 -> {progress += Stat.reputationScore42}
                    43 -> {progress += Stat.reputationScore43}
                    44 -> {progress += Stat.reputationScore44}
                    45 -> {progress += Stat.reputationScore45}
                    46 -> {progress += Stat.reputationScore46}
                    47 -> {progress += Stat.reputationScore47}
                    48 -> {progress += Stat.reputationScore48}
                    49 -> {progress += Stat.reputationScore49}
                    50 -> {progress += Stat.reputationScore50}
                    51 -> {progress += Stat.reputationScore51}
                    52 -> {progress += Stat.reputationScore52}
                    53 -> {progress += Stat.reputationScore53}
                    54 -> {progress += Stat.reputationScore54}
                    55 -> {progress += Stat.reputationScore55}
                    56 -> {progress += Stat.reputationScore56}
                    57 -> {progress += Stat.reputationScore57}
                    58 -> {progress += Stat.reputationScore58}
                    59 -> {progress += Stat.reputationScore59}
                    60 -> {progress += Stat.reputationScore60}
                    61 -> {progress += Stat.reputationScore61}
                    62 -> {progress += Stat.reputationScore62}
                    63 -> {progress += Stat.reputationScore63}
                    64 -> {progress += Stat.reputationScore64}
                    65 -> {progress += Stat.reputationScore65}
                    66 -> {progress += Stat.reputationScore66}
                    67 -> {progress += Stat.reputationScore67}
                    68 -> {progress += Stat.reputationScore68}
                    69 -> {progress += Stat.reputationScore69}
                    70 -> {progress += Stat.reputationScore70}
                    71 -> {progress += Stat.reputationScore71}
                    72 -> {progress += Stat.reputationScore72}
                    73 -> {progress += Stat.reputationScore73}
                    74 -> {progress += Stat.reputationScore74}
                    75 -> {progress += Stat.reputationScore75}
                    76 -> {progress += Stat.reputationScore76}
                    77 -> {progress += Stat.reputationScore77}
                    78 -> {progress += Stat.reputationScore78}
                    79 -> {progress += Stat.reputationScore79}
                    80 -> {progress += Stat.reputationScore80}
                    81 -> {progress += Stat.reputationScore81}
                    82 -> {progress += Stat.reputationScore82}
                    83 -> {progress += Stat.reputationScore83}
                    84 -> {progress += Stat.reputationScore84}
                    85 -> {progress += Stat.reputationScore85}
                    86 -> {progress += Stat.reputationScore86}
                    87 -> {progress += Stat.reputationScore87}
                    88 -> {progress += Stat.reputationScore88}
                    89 -> {progress += Stat.reputationScore89}
                    90 -> {progress += Stat.reputationScore90}
                    91 -> {progress += Stat.reputationScore91}
                    92 -> {progress += Stat.reputationScore92}
                    93 -> {progress += Stat.reputationScore93}
                    94 -> {progress += Stat.reputationScore94}
                    95 -> {progress += Stat.reputationScore95}
                    96 -> {progress += Stat.reputationScore96}
                    97 -> {progress += Stat.reputationScore97}
                    98 -> {progress += Stat.reputationScore98}
                    99 -> {progress += Stat.reputationScore99}
                    100 -> {progress += Stat.reputationScore100}}
                progress /= 1000
            } }
        progressBar.setProgress(progress, true)}
    fun calculateSwipePreferencePercentageTotal() : String {
        var percentage = 100.000f
        percentage = when (Info.orientation) {
            "a" -> { (percentage/100.000f)*(Stat.genderA.toFloat()/1000) }
            "b" -> { (percentage/100.000f)*(Stat.genderB.toFloat()/1000) }
            "c" -> { (percentage/100.000f)*((Stat.genderA + Stat.genderB.toFloat())/1000) }
            else -> { (percentage/100.000f)*100.000f }}
        if (Pref.language != null) {val iterator = Pref.language!!.iterator()
            var percentageBuilder = 0
            iterator.forEach {
                when (it) {
                    "af" -> {percentageBuilder += Stat.languageAF}
                    "ar" -> {percentageBuilder += Stat.languageAR}
                    "be" -> {percentageBuilder += Stat.languageBE}
                    "bg" -> {percentageBuilder += Stat.languageBG}
                    "bn" -> {percentageBuilder += Stat.languageBN}
                    "ca" -> {percentageBuilder += Stat.languageCA}
                    "cs" -> {percentageBuilder += Stat.languageCS}
                    "cy" -> {percentageBuilder += Stat.languageCY}
                    "da" -> {percentageBuilder += Stat.languageDA}
                    "de" -> {percentageBuilder += Stat.languageDE}
                    "el" -> {percentageBuilder += Stat.languageEL}
                    "en" -> {percentageBuilder += Stat.languageEN}
                    "eo" -> {percentageBuilder += Stat.languageEO}
                    "es" -> {percentageBuilder += Stat.languageES}
                    "et" -> {percentageBuilder += Stat.languageET}
                    "fa" -> {percentageBuilder += Stat.languageFA}
                    "fi" -> {percentageBuilder += Stat.languageFI}
                    "fr" -> {percentageBuilder += Stat.languageFR}
                    "ga" -> {percentageBuilder += Stat.languageGA}
                    "gl" -> {percentageBuilder += Stat.languageGL}
                    "gu" -> {percentageBuilder += Stat.languageGU}
                    "he" -> {percentageBuilder += Stat.languageHE}
                    "hi" -> {percentageBuilder += Stat.languageHI}
                    "hr" -> {percentageBuilder += Stat.languageHR}
                    "ht" -> {percentageBuilder += Stat.languageHT}
                    "hu" -> {percentageBuilder += Stat.languageHU}
                    "id" -> {percentageBuilder += Stat.languageID}
                    "is" -> {percentageBuilder += Stat.languageIS}
                    "it" -> {percentageBuilder += Stat.languageIT}
                    "ja" -> {percentageBuilder += Stat.languageJA}
                    "ka" -> {percentageBuilder += Stat.languageKA}
                    "kn" -> {percentageBuilder += Stat.languageKN}
                    "ko" -> {percentageBuilder += Stat.languageKO}
                    "lt" -> {percentageBuilder += Stat.languageLT}
                    "lv" -> {percentageBuilder += Stat.languageLV}
                    "mk" -> {percentageBuilder += Stat.languageMK}
                    "mr" -> {percentageBuilder += Stat.languageMR}
                    "ms" -> {percentageBuilder += Stat.languageMS}
                    "mt" -> {percentageBuilder += Stat.languageMT}
                    "nl" -> {percentageBuilder += Stat.languageNL}
                    "no" -> {percentageBuilder += Stat.languageNO}
                    "pl" -> {percentageBuilder += Stat.languagePL}
                    "pt" -> {percentageBuilder += Stat.languagePT}
                    "ro" -> {percentageBuilder += Stat.languageRO}
                    "ru" -> {percentageBuilder += Stat.languageRU}
                    "sk" -> {percentageBuilder += Stat.languageSK}
                    "sl" -> {percentageBuilder += Stat.languageSL}
                    "sq" -> {percentageBuilder += Stat.languageSQ}
                    "sv" -> {percentageBuilder += Stat.languageSV}
                    "sw" -> {percentageBuilder += Stat.languageSW}
                    "ta" -> {percentageBuilder += Stat.languageTA}
                    "te" -> {percentageBuilder += Stat.languageTE}
                    "th" -> {percentageBuilder += Stat.languageTH}
                    "tr" -> {percentageBuilder += Stat.languageTR}
                    "uk" -> {percentageBuilder += Stat.languageUK}
                    "ur" -> {percentageBuilder += Stat.languageUR}
                    "vi" -> {percentageBuilder += Stat.languageVI}
                    "zh" -> {percentageBuilder += Stat.languageZH}};percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}}
        if (Pref.employment != null) {
            val iterator = Pref.employment!!.iterator()
            var percentageBuilder = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.employmentA}
                    "b" -> {percentageBuilder += Stat.employmentB}
                    "c" -> {percentageBuilder += Stat.employmentC}
                    "d" -> {percentageBuilder += Stat.employmentD}
                    "e" -> {percentageBuilder += Stat.employmentE}
                    "f" -> {percentageBuilder += Stat.employmentF}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.religion != null) {
            val iterator = Pref.religion!!.iterator()
            var percentageBuilder = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.religionA}
                    "b" -> {percentageBuilder += Stat.religionB}
                    "c" -> {percentageBuilder += Stat.religionC}
                    "d" -> {percentageBuilder += Stat.religionD}
                    "e" -> {percentageBuilder += Stat.religionE}
                    "f" -> {percentageBuilder += Stat.religionF}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.political != null) {
            val iterator = Pref.political!!.iterator()
            var percentageBuilder = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.politicalA}
                    "b" -> {percentageBuilder += Stat.politicalB}
                    "c" -> {percentageBuilder += Stat.politicalC}
                    "d" -> {percentageBuilder += Stat.politicalD}
                    "e" -> {percentageBuilder += Stat.politicalE}
                    "f" -> {percentageBuilder += Stat.politicalF}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.pet != null) {
            val iterator = Pref.pet!!.iterator()
            var percentageBuilder = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.petA}
                    "b" -> {percentageBuilder += Stat.petB}
                    "c" -> {percentageBuilder += Stat.petC}
                    "d" -> {percentageBuilder += Stat.petD}
                    "e" -> {percentageBuilder += Stat.petE}
                    "f" -> {percentageBuilder += Stat.petF}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.children != null) {
            val iterator = Pref.children!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.childrenA}
                    "b" -> {percentageBuilder += Stat.childrenB}
                    "c" -> {percentageBuilder += Stat.childrenC}
                    "d" -> {percentageBuilder += Stat.childrenD}
                    "e" -> {percentageBuilder += Stat.childrenE}
                    "f" -> {percentageBuilder += Stat.childrenF}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.relationship != null) {
            val iterator = Pref.relationship!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.relationshipA}
                    "b" -> {percentageBuilder += Stat.relationshipB}
                    "c" -> {percentageBuilder += Stat.relationshipC}
                    "d" -> {percentageBuilder += Stat.relationshipD}
                    "e" -> {percentageBuilder += Stat.relationshipE}
                    "f" -> {percentageBuilder += Stat.relationshipF}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.food != null) {
            val iterator = Pref.food!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.foodA}
                    "b" -> {percentageBuilder += Stat.foodB}
                    "c" -> {percentageBuilder += Stat.foodC}
                    "d" -> {percentageBuilder += Stat.foodD}
                    "e" -> {percentageBuilder += Stat.foodE}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.smoke != null) {
            val iterator = Pref.smoke!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.smokeA}
                    "b" -> {percentageBuilder += Stat.smokeB}
                    "c" -> {percentageBuilder += Stat.smokeC}
                    "d" -> {percentageBuilder += Stat.smokeD}
                    "e" -> {percentageBuilder += Stat.smokeE}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.education != null) {
            val iterator = Pref.education!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.educationA}
                    "b" -> {percentageBuilder += Stat.educationB}
                    "c" -> {percentageBuilder += Stat.educationC}
                    "d" -> {percentageBuilder += Stat.educationD}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.drink != null) {
            val iterator = Pref.drink!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.drinkA}
                    "b" -> {percentageBuilder += Stat.drinkB}
                    "c" -> {percentageBuilder += Stat.drinkC}
                    "d" -> {percentageBuilder += Stat.drinkD}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.drugs != null) {
            val iterator = Pref.drugs!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.drugsA}
                    "b" -> {percentageBuilder += Stat.drugsB}
                    "c" -> {percentageBuilder += Stat.drugsC}
                    "d" -> {percentageBuilder += Stat.drugsD}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.travel != null) {
            val iterator = Pref.travel!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.travelA}
                    "b" -> {percentageBuilder += Stat.travelB}
                    "c" -> {percentageBuilder += Stat.travelC}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.minAge != null && Pref.maxAge != null) {
            var percentageBuilder  = 0
            for (it in Pref.minAge!!..Pref.maxAge!!){when (it) {
                18 -> {percentageBuilder += Stat.age18}
                19 -> {percentageBuilder += Stat.age19}
                20 -> {percentageBuilder += Stat.age20}
                21 -> {percentageBuilder += Stat.age21}
                22 -> {percentageBuilder += Stat.age22}
                23 -> {percentageBuilder += Stat.age23}
                24 -> {percentageBuilder += Stat.age24}
                25 -> {percentageBuilder += Stat.age25}
                26 -> {percentageBuilder += Stat.age26}
                27 -> {percentageBuilder += Stat.age27}
                28 -> {percentageBuilder += Stat.age28}
                29 -> {percentageBuilder += Stat.age29}
                30 -> {percentageBuilder += Stat.age30}
                31 -> {percentageBuilder += Stat.age31}
                32 -> {percentageBuilder += Stat.age32}
                33 -> {percentageBuilder += Stat.age33}
                34 -> {percentageBuilder += Stat.age34}
                35 -> {percentageBuilder += Stat.age35}
                36 -> {percentageBuilder += Stat.age36}
                37 -> {percentageBuilder += Stat.age37}
                38 -> {percentageBuilder += Stat.age38}
                39 -> {percentageBuilder += Stat.age39}
                40 -> {percentageBuilder += Stat.age40}
                41 -> {percentageBuilder += Stat.age41}
                42 -> {percentageBuilder += Stat.age42}
                43 -> {percentageBuilder += Stat.age43}
                44 -> {percentageBuilder += Stat.age44}
                45 -> {percentageBuilder += Stat.age45}
                46 -> {percentageBuilder += Stat.age46}
                47 -> {percentageBuilder += Stat.age47}
                48 -> {percentageBuilder += Stat.age48}
                49 -> {percentageBuilder += Stat.age49}
                50 -> {percentageBuilder += Stat.age50}
                51 -> {percentageBuilder += Stat.age51}
                52 -> {percentageBuilder += Stat.age52}
                53 -> {percentageBuilder += Stat.age53}
                54 -> {percentageBuilder += Stat.age54}
                55 -> {percentageBuilder += Stat.age55}
                56 -> {percentageBuilder += Stat.age56}
                57 -> {percentageBuilder += Stat.age57}
                58 -> {percentageBuilder += Stat.age58}
                59 -> {percentageBuilder += Stat.age59}
                60 -> {percentageBuilder += Stat.age60}
                61 -> {percentageBuilder += Stat.age61}
                62 -> {percentageBuilder += Stat.age62}
                63 -> {percentageBuilder += Stat.age63}
                64 -> {percentageBuilder += Stat.age64}
                65 -> {percentageBuilder += Stat.age65}
                66 -> {percentageBuilder += Stat.age66}
                67 -> {percentageBuilder += Stat.age67}
                68 -> {percentageBuilder += Stat.age68}
                69 -> {percentageBuilder += Stat.age69}
                70 -> {percentageBuilder += Stat.age70}
                71 -> {percentageBuilder += Stat.age71}
                72 -> {percentageBuilder += Stat.age72}
                73 -> {percentageBuilder += Stat.age73}
                74 -> {percentageBuilder += Stat.age74}
                75 -> {percentageBuilder += Stat.age75}
                76 -> {percentageBuilder += Stat.age76}
                77 -> {percentageBuilder += Stat.age77}
                78 -> {percentageBuilder += Stat.age78}
                79 -> {percentageBuilder += Stat.age79}
                80 -> {percentageBuilder += Stat.age80}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.bmi != null) {
            val iterator = Pref.bmi!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.bmiA}
                    "b" -> {percentageBuilder += Stat.bmiB}
                    "c" -> {percentageBuilder += Stat.bmiC}
                    "d" -> {percentageBuilder += Stat.bmiD}
                    "e" -> {percentageBuilder += Stat.bmiE}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.easy != null) {
            val iterator = Pref.easy!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.easyA}
                    "b" -> {percentageBuilder += Stat.easyB}
                    "c" -> {percentageBuilder += Stat.easyC}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.minHeight != null && Pref.maxHeight != null) {
            var percentageBuilder  = 0
            for (it in Pref.minHeight!!..Pref.maxHeight!!){when (it) {
                120 -> {percentageBuilder += Stat.height120}
                121 -> {percentageBuilder += Stat.height121}
                122 -> {percentageBuilder += Stat.height122}
                123 -> {percentageBuilder += Stat.height123}
                124 -> {percentageBuilder += Stat.height124}
                125 -> {percentageBuilder += Stat.height125}
                126 -> {percentageBuilder += Stat.height126}
                127 -> {percentageBuilder += Stat.height127}
                128 -> {percentageBuilder += Stat.height128}
                129 -> {percentageBuilder += Stat.height129}
                130 -> {percentageBuilder += Stat.height130}
                131 -> {percentageBuilder += Stat.height131}
                132 -> {percentageBuilder += Stat.height132}
                133 -> {percentageBuilder += Stat.height133}
                134 -> {percentageBuilder += Stat.height134}
                135 -> {percentageBuilder += Stat.height135}
                136 -> {percentageBuilder += Stat.height136}
                137 -> {percentageBuilder += Stat.height137}
                138 -> {percentageBuilder += Stat.height138}
                139 -> {percentageBuilder += Stat.height139}
                140 -> {percentageBuilder += Stat.height140}
                141 -> {percentageBuilder += Stat.height141}
                142 -> {percentageBuilder += Stat.height142}
                143 -> {percentageBuilder += Stat.height143}
                144 -> {percentageBuilder += Stat.height144}
                145 -> {percentageBuilder += Stat.height145}
                146 -> {percentageBuilder += Stat.height146}
                147 -> {percentageBuilder += Stat.height147}
                148 -> {percentageBuilder += Stat.height148}
                149 -> {percentageBuilder += Stat.height149}
                150 -> {percentageBuilder += Stat.height150}
                151 -> {percentageBuilder += Stat.height151}
                152 -> {percentageBuilder += Stat.height152}
                153 -> {percentageBuilder += Stat.height153}
                154 -> {percentageBuilder += Stat.height154}
                155 -> {percentageBuilder += Stat.height155}
                156 -> {percentageBuilder += Stat.height156}
                157 -> {percentageBuilder += Stat.height157}
                158 -> {percentageBuilder += Stat.height158}
                159 -> {percentageBuilder += Stat.height159}
                160 -> {percentageBuilder += Stat.height160}
                161 -> {percentageBuilder += Stat.height161}
                162 -> {percentageBuilder += Stat.height162}
                163 -> {percentageBuilder += Stat.height163}
                164 -> {percentageBuilder += Stat.height164}
                165 -> {percentageBuilder += Stat.height165}
                166 -> {percentageBuilder += Stat.height166}
                167 -> {percentageBuilder += Stat.height167}
                168 -> {percentageBuilder += Stat.height168}
                169 -> {percentageBuilder += Stat.height169}
                170 -> {percentageBuilder += Stat.height170}
                171 -> {percentageBuilder += Stat.height171}
                172 -> {percentageBuilder += Stat.height172}
                173 -> {percentageBuilder += Stat.height173}
                174 -> {percentageBuilder += Stat.height174}
                175 -> {percentageBuilder += Stat.height175}
                176 -> {percentageBuilder += Stat.height176}
                177 -> {percentageBuilder += Stat.height177}
                178 -> {percentageBuilder += Stat.height178}
                179 -> {percentageBuilder += Stat.height179}
                180 -> {percentageBuilder += Stat.height180}
                181 -> {percentageBuilder += Stat.height181}
                182 -> {percentageBuilder += Stat.height182}
                183 -> {percentageBuilder += Stat.height183}
                184 -> {percentageBuilder += Stat.height184}
                185 -> {percentageBuilder += Stat.height185}
                186 -> {percentageBuilder += Stat.height186}
                187 -> {percentageBuilder += Stat.height187}
                188 -> {percentageBuilder += Stat.height188}
                189 -> {percentageBuilder += Stat.height189}
                190 -> {percentageBuilder += Stat.height190}
                191 -> {percentageBuilder += Stat.height191}
                192 -> {percentageBuilder += Stat.height192}
                193 -> {percentageBuilder += Stat.height193}
                194 -> {percentageBuilder += Stat.height194}
                195 -> {percentageBuilder += Stat.height195}
                196 -> {percentageBuilder += Stat.height196}
                197 -> {percentageBuilder += Stat.height197}
                198 -> {percentageBuilder += Stat.height198}
                199 -> {percentageBuilder += Stat.height199}
                200 -> {percentageBuilder += Stat.height200}
                201 -> {percentageBuilder += Stat.height201}
                202 -> {percentageBuilder += Stat.height202}
                203 -> {percentageBuilder += Stat.height203}
                204 -> {percentageBuilder += Stat.height204}
                205 -> {percentageBuilder += Stat.height205}
                206 -> {percentageBuilder += Stat.height206}
                207 -> {percentageBuilder += Stat.height207}
                208 -> {percentageBuilder += Stat.height208}
                209 -> {percentageBuilder += Stat.height209}
                210 -> {percentageBuilder += Stat.height210}
                211 -> {percentageBuilder += Stat.height211}
                212 -> {percentageBuilder += Stat.height212}
                213 -> {percentageBuilder += Stat.height213}
                214 -> {percentageBuilder += Stat.height214}
                215 -> {percentageBuilder += Stat.height215}
                216 -> {percentageBuilder += Stat.height216}
                217 -> {percentageBuilder += Stat.height217}
                218 -> {percentageBuilder += Stat.height218}
                219 -> {percentageBuilder += Stat.height219}
                220 -> {percentageBuilder += Stat.height220}}}
            if (percentageBuilder > 100000) {percentageBuilder = 100000}
            if (percentageBuilder != 0) {percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        }
        if (Pref.income != null) {
            val iterator = Pref.income!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.incomeA}
                    "b" -> {percentageBuilder += Stat.incomeB}
                    "c" -> {percentageBuilder += Stat.incomeC}
                    "d" -> {percentageBuilder += Stat.incomeD}
                    "e" -> {percentageBuilder += Stat.incomeE}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.reputationScore != 0) {
            var percentageBuilder  = 0
            when (Pref.reputationScore /100) {
                1 -> {percentageBuilder += Stat.reputationScore1}
                2 -> {percentageBuilder += Stat.reputationScore2}
                3 -> {percentageBuilder += Stat.reputationScore3}
                4 -> {percentageBuilder += Stat.reputationScore4}
                5 -> {percentageBuilder += Stat.reputationScore5}
                6 -> {percentageBuilder += Stat.reputationScore6}
                7 -> {percentageBuilder += Stat.reputationScore7}
                8 -> {percentageBuilder += Stat.reputationScore8}
                9 -> {percentageBuilder += Stat.reputationScore9}
                10 -> {percentageBuilder += Stat.reputationScore10}
                11 -> {percentageBuilder += Stat.reputationScore11}
                12 -> {percentageBuilder += Stat.reputationScore12}
                13 -> {percentageBuilder += Stat.reputationScore13}
                14 -> {percentageBuilder += Stat.reputationScore14}
                15 -> {percentageBuilder += Stat.reputationScore15}
                16 -> {percentageBuilder += Stat.reputationScore16}
                17 -> {percentageBuilder += Stat.reputationScore17}
                18 -> {percentageBuilder += Stat.reputationScore18}
                19 -> {percentageBuilder += Stat.reputationScore19}
                20 -> {percentageBuilder += Stat.reputationScore20}
                21 -> {percentageBuilder += Stat.reputationScore21}
                22 -> {percentageBuilder += Stat.reputationScore22}
                23 -> {percentageBuilder += Stat.reputationScore23}
                24 -> {percentageBuilder += Stat.reputationScore24}
                25 -> {percentageBuilder += Stat.reputationScore25}
                26 -> {percentageBuilder += Stat.reputationScore26}
                27 -> {percentageBuilder += Stat.reputationScore27}
                28 -> {percentageBuilder += Stat.reputationScore28}
                29 -> {percentageBuilder += Stat.reputationScore29}
                30 -> {percentageBuilder += Stat.reputationScore30}
                31 -> {percentageBuilder += Stat.reputationScore31}
                32 -> {percentageBuilder += Stat.reputationScore32}
                33 -> {percentageBuilder += Stat.reputationScore33}
                34 -> {percentageBuilder += Stat.reputationScore34}
                35 -> {percentageBuilder += Stat.reputationScore35}
                36 -> {percentageBuilder += Stat.reputationScore36}
                37 -> {percentageBuilder += Stat.reputationScore37}
                38 -> {percentageBuilder += Stat.reputationScore38}
                39 -> {percentageBuilder += Stat.reputationScore39}
                40 -> {percentageBuilder += Stat.reputationScore40}
                41 -> {percentageBuilder += Stat.reputationScore41}
                42 -> {percentageBuilder += Stat.reputationScore42}
                43 -> {percentageBuilder += Stat.reputationScore43}
                44 -> {percentageBuilder += Stat.reputationScore44}
                45 -> {percentageBuilder += Stat.reputationScore45}
                46 -> {percentageBuilder += Stat.reputationScore46}
                47 -> {percentageBuilder += Stat.reputationScore47}
                48 -> {percentageBuilder += Stat.reputationScore48}
                49 -> {percentageBuilder += Stat.reputationScore49}
                50 -> {percentageBuilder += Stat.reputationScore50}
                51 -> {percentageBuilder += Stat.reputationScore51}
                52 -> {percentageBuilder += Stat.reputationScore52}
                53 -> {percentageBuilder += Stat.reputationScore53}
                54 -> {percentageBuilder += Stat.reputationScore54}
                55 -> {percentageBuilder += Stat.reputationScore55}
                56 -> {percentageBuilder += Stat.reputationScore56}
                57 -> {percentageBuilder += Stat.reputationScore57}
                58 -> {percentageBuilder += Stat.reputationScore58}
                59 -> {percentageBuilder += Stat.reputationScore59}
                60 -> {percentageBuilder += Stat.reputationScore60}
                61 -> {percentageBuilder += Stat.reputationScore61}
                62 -> {percentageBuilder += Stat.reputationScore62}
                63 -> {percentageBuilder += Stat.reputationScore63}
                64 -> {percentageBuilder += Stat.reputationScore64}
                65 -> {percentageBuilder += Stat.reputationScore65}
                66 -> {percentageBuilder += Stat.reputationScore66}
                67 -> {percentageBuilder += Stat.reputationScore67}
                68 -> {percentageBuilder += Stat.reputationScore68}
                69 -> {percentageBuilder += Stat.reputationScore69}
                70 -> {percentageBuilder += Stat.reputationScore70}
                71 -> {percentageBuilder += Stat.reputationScore71}
                72 -> {percentageBuilder += Stat.reputationScore72}
                73 -> {percentageBuilder += Stat.reputationScore73}
                74 -> {percentageBuilder += Stat.reputationScore74}
                75 -> {percentageBuilder += Stat.reputationScore75}
                76 -> {percentageBuilder += Stat.reputationScore76}
                77 -> {percentageBuilder += Stat.reputationScore77}
                78 -> {percentageBuilder += Stat.reputationScore78}
                79 -> {percentageBuilder += Stat.reputationScore79}
                80 -> {percentageBuilder += Stat.reputationScore80}
                81 -> {percentageBuilder += Stat.reputationScore81}
                82 -> {percentageBuilder += Stat.reputationScore82}
                83 -> {percentageBuilder += Stat.reputationScore83}
                84 -> {percentageBuilder += Stat.reputationScore84}
                85 -> {percentageBuilder += Stat.reputationScore85}
                86 -> {percentageBuilder += Stat.reputationScore86}
                87 -> {percentageBuilder += Stat.reputationScore87}
                88 -> {percentageBuilder += Stat.reputationScore88}
                89 -> {percentageBuilder += Stat.reputationScore89}
                90 -> {percentageBuilder += Stat.reputationScore90}
                91 -> {percentageBuilder += Stat.reputationScore91}
                92 -> {percentageBuilder += Stat.reputationScore92}
                93 -> {percentageBuilder += Stat.reputationScore93}
                94 -> {percentageBuilder += Stat.reputationScore94}
                95 -> {percentageBuilder += Stat.reputationScore95}
                96 -> {percentageBuilder += Stat.reputationScore96}
                97 -> {percentageBuilder += Stat.reputationScore97}
                98 -> {percentageBuilder += Stat.reputationScore98}
                99 -> {percentageBuilder += Stat.reputationScore99}
                100 -> {percentageBuilder += Stat.reputationScore100}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)
        }
        val numberOfUsers : Int = ((Stat.users.toString().toFloat()/100.000F)*percentage).toInt() ;var percentageString = ((percentage * 10000.0f).roundToInt().toFloat() / 10000.0f).toString() ;val check = percentageString.contains("E");if (check) {percentageString = "0.001"}
        return "~${numberOfUsers}~${percentageString}%~"}
    //--- Grouping ---
    fun calculateAge() : Int{
        return if (Info.yearOfBirth != null) {
            val currentYear : Int = Calendar.getInstance().get(Calendar.YEAR)
            currentYear - Info.yearOfBirth!!} else {81}}
    fun calculateAgeGroup() : String {
        val age = calculateAge()
        when (age) {
            18, 19 -> {return "a"}
            20, 21 -> {return "b"}
            22, 23 -> {return "c"}
            24, 25 -> {return "d"}
            26, 27 -> {return "e"}
            28, 29 -> {return "f"}
            30, 31 -> {return "g"}
            32, 33 -> {return "h"}
            34, 35 -> {return "i"}
            36, 37 -> {return "j"}
            38, 39 -> {return "k"}
            40, 41 -> {return "l"}
            42, 43 -> {return "m"}
            44, 45 -> {return "n"}
            46, 47 -> {return "o"}
            48, 49 -> {return "p"}
            50, 51 -> {return "q"}
            52, 53 -> {return "r"}
            54, 55 -> {return "s"}
            56, 57 -> {return "t"}
            58, 59 -> {return "u"}
            60, 61 -> {return "v"}
            62, 63 -> {return "w"}
            64, 65 -> {return "x"}
            66, 67 -> {return "y"}
            68, 69 -> {return "z"}
            70, 71 -> {return "1"}
            72, 73 -> {return "2"}
            74, 75 -> {return "3"}
            76, 77 -> {return "4"}
            78, 79 -> {return "5"}
            else -> {return "6"}
        }
        //2 years per group.

    }
    fun calculateLatLongGroup() {
        //var lat : Double? = null//Double (53.3276953)
        //var long : Double? = null//Double (-2.6933446)
        return
    }



    fun calculateLocationGroup(){
        //FORMAT = [gender][age-group][country][lat/long-group]
        Info.locationGroup = Info.gender + calculateAgeGroup() + Info.country?.lowercase() + calculateLatLongGroup()}

    fun calculateSwipeGroupsFromLocationGroup() {
        if (Info.locationGroup == null) {calculateLocationGroup()}

        //Pref.locationGroups =
    }
    //--- Older Grouping ---
    fun calculateSwipeGroupsInCountry(): List<String?>{
        var swipeGroups : MutableList<String> = arrayListOf()
        //EXAMPLE: "UK110053.200-2.6"
        //Get CountryCode
        //Info.country //should be CountryCode(CC)
        //Get SexOrenataion
        //Info.sexCompatible // list of bytes Male Straight = 11, Male Gay = 12, Male Bisexual = 13, Male Anyone = 19, Female Straight = 21, Female Gay = 22, Female Bisexual = 23, Female Anyone = 29, Other Male = 31, Other Female = 32, Other Other = 33, Other Anyone = 39
        //Get LatGroup (4-9)
        val centralLatGroup = Info.gps!!.substring(4, 9).toDouble()//53.2
        //Get LongGroup (10-15)
        val centralLongGroup = Info.gps!!.substring(10, 15).toDouble() //-2.6
        //In Country
        //1 (all SexOrenataion options)
        for (i in Info.sexCompatible!!) {swipeGroups.add(Info.country!! + i + centralLatGroup + centralLongGroup)}
        //long
        //up 1
        val longUp1 = centralLongGroup + 0.2 //-2.40
        var longUp1String = String.format("%.1f", longUp1) // "-2.4"
        if(longUp1String.length == 4) {longUp1String = "00$longUp1String"}
        if(longUp1String.length == 5) {longUp1String = "0$longUp1String"} //should return("00-2.4")
        //up 2
        val longUp2 = centralLongGroup + 0.4 //-2.20
        var longUp2String = String.format("%.1f", longUp2)
        if(longUp2String.length == 4) {longUp2String = "00$longUp2String"}
        if(longUp2String.length == 5) {longUp2String = "0$longUp2String"} //should return("00-2.2")
        //down 1
        val longDown1 = centralLongGroup - 0.2 //-2.80 //should return("00-2.8")
        var longDown1String = String.format("%.1f", longDown1)
        if(longDown1String.length == 4) {longDown1String = "00$longDown1String"}
        if(longDown1String.length == 5) {longDown1String = "0$longDown1String"} //should return("00-2.8")
        //down 2
        val longDown2 = centralLongGroup - 0.4 //-3.00 //should return("00-3.0")
        var longDown2String = String.format("%.1f", longDown2)
        if(longDown2String.length == 4) {longDown2String = "00$longDown2String"}
        if(longDown2String.length == 5) {longDown2String = "0$longDown2String"} //should return("00-3.0")
        //lat
        //up 1
        val latUp1 = centralLatGroup + 0.2 //53.40
        var latUp1String = String.format("%.1f", latUp1)
        if(latUp1String.length == 4) {latUp1String = "00$latUp1String"}
        if(latUp1String.length == 5) {latUp1String = "0$latUp1String"} //should return("0053.4")
        //up 2
        val latUp2 = centralLatGroup + 0.4 //53.60
        var latUp2String = String.format("%.1f", latUp2)
        if(latUp2String.length == 4) {latUp2String = "00$latUp2String"}
        if(latUp2String.length == 5) {latUp2String = "0$latUp2String"} //should return("0053.6")
        //down 1
        val latDown1 = centralLatGroup - 0.2 //53.00
        var latDown1String = String.format("%.1f", latDown1)
        if(latDown1String.length == 4) {latDown1String = "00$latDown1String"}
        if(latDown1String.length == 5) {latDown1String = "0$latDown1String"} //should return("0053.00")
        //down 2
        val latDown2 = centralLatGroup - 0.4 //52.80
        var latDown2String = String.format("%.1f", latDown2)
        if(latDown2String.length == 4) {latDown2String = "00$latDown2String"}
        if(latDown2String.length == 5) {latDown2String = "0$latDown2String"} //should return("0052.8")
        for (i in Info.sexCompatible!!) {swipeGroups.add(Info.country!! + i + centralLatGroup + longDown1String)}
        for (i in Info.sexCompatible!!) {swipeGroups.add(Info.country!! + i + centralLatGroup + longUp1String)}
        for (i in Info.sexCompatible!!) {swipeGroups.add(Info.country!! + i + latDown1String + centralLongGroup)}
        for (i in Info.sexCompatible!!) {swipeGroups.add(Info.country!! + i + latUp1String + centralLongGroup)}
        for (i in Info.sexCompatible!!) {swipeGroups.add(Info.country!! + i + latDown1String + longDown1String)}
        for (i in Info.sexCompatible!!) {swipeGroups.add(Info.country!! + i + latUp1String + longUp1String)}
        for (i in Info.sexCompatible!!) {swipeGroups.add(Info.country!! + i + latDown1String + longUp1String)}
        for (i in Info.sexCompatible!!) {swipeGroups.add(Info.country!! + i + latUp1String + longDown1String)}
        for (i in Info.sexCompatible!!) {swipeGroups.add(Info.country!! + i + centralLatGroup + longUp2String)}
        for (i in Info.sexCompatible!!) {swipeGroups.add(Info.country!! + i + centralLatGroup + longDown2String)}
        for (i in Info.sexCompatible!!) {swipeGroups.add(Info.country!! + i + latDown2String + centralLongGroup)}
        for (i in Info.sexCompatible!!) {swipeGroups.add(Info.country!! + i + latUp2String + centralLongGroup)}
        for (i in Info.sexCompatible!!) {swipeGroups.add(Info.country!! + i + latDown1String + longDown2String)}
        for (i in Info.sexCompatible!!) {swipeGroups.add(Info.country!! + i + latUp1String + longUp2String)}
        for (i in Info.sexCompatible!!) {swipeGroups.add(Info.country!! + i + latUp1String + longDown2String)}
        for (i in Info.sexCompatible!!) {swipeGroups.add(Info.country!! + i + latDown1String + longUp2String)}
        for (i in Info.sexCompatible!!) {swipeGroups.add(Info.country!! + i + latUp2String + longDown1String)}
        for (i in Info.sexCompatible!!) {swipeGroups.add(Info.country!! + i + latDown2String + longUp1String)}
        for (i in Info.sexCompatible!!) {swipeGroups.add(Info.country!! + i + latUp2String + longUp1String)}
        for (i in Info.sexCompatible!!) {swipeGroups.add(Info.country!! + i + latDown2String + longDown1String)}
        for (i in Info.sexCompatible!!) {swipeGroups.add(Info.country!! + i + latUp2String + longUp2String)}
        for (i in Info.sexCompatible!!) {swipeGroups.add(Info.country!! + i + latDown2String + longDown2String)}
        for (i in Info.sexCompatible!!) {swipeGroups.add(Info.country!! + i + latDown2String + longUp2String)}
        for (i in Info.sexCompatible!!) {swipeGroups.add(Info.country!! + i + latUp2String + longDown2String)}
        return swipeGroups
    }
    fun calculateNeighbouringCountries(CountryCode : String): List<String>? {
        val countryCodeToNeighbouringCountrys = mapOf(
                "AC" to listOf("SH"),
                "AD" to listOf(
                        "FR",
                        "ES"),
                "AE" to listOf("OM"),
                "AF" to listOf(
                        "CN",
                        "IR",
                        "PK",
                        "TJ",
                        "TM",
                        "UZ"),
                "AG" to listOf(
                        "AI",
                        "GP",
                        "MS",
                        "KN",
                        "BL"),
                "AI" to listOf(
                        "NL",
                        "MF",
                        "VG"),
                "AL" to listOf(
                        "GR",
                        "XK",
                        "MK",
                        "ME"),
                "AM" to listOf(
                        "AZ",
                        "GE",
                        "IR",
                        "TR"),
                "AO" to listOf(
                        "CD",
                        "CG",
                        "NA",
                        "ZM"),
                "AR" to listOf(
                        "BO",
                        "BR",
                        "CL",
                        "PY",
                        "UY"),
                "AQ" to listOf("GL"),
                "AS" to listOf(
                        "CK",
                        "NU",
                        "WS",
                        "TK",
                        "TO"),
                "AT" to listOf(
                        "CZ",
                        "DE",
                        "HU",
                        "IT",
                        "LI",
                        "SK",
                        "SI",
                        "CH"),
                "AU" to listOf(
                        "TL",
                        "ID",
                        "AC",
                        "NC",
                        "NZ",
                        "PG",
                        "SB"),
                "AW" to listOf("VE"),
                "AX" to listOf(
                        "FI",
                        "SE"),
                "AZ" to listOf(
                        "AM",
                        "GE",
                        "IR",
                        "RU",
                        "TR"),
                "BA" to listOf(
                        "HR",
                        "ME",
                        "RS"),
                "BB" to listOf(
                        "GP",
                        "MQ",
                        "LC",
                        "VC",
                        "TT"),
                "BD" to listOf(
                        "IN",
                        "MM"),
                "BE" to listOf(
                        "FR",
                        "DE",
                        "LU",
                        "NL"),
                "BF" to listOf(
                        "BJ",
                        "GH",
                        "ML",
                        "NE",
                        "TG"),
                "BG" to listOf(
                        "GR",
                        "MK",
                        "RO",
                        "RS",
                        "TR"),
                "BH" to listOf(
                        "IR",
                        "QA",
                        "SA"),
                "BI" to listOf(
                        "CD",
                        "RW",
                        "TZ"),
                "BJ" to listOf(
                        "BF",
                        "NE",
                        "NG",
                        "TG"),
                "BL" to listOf(
                        "AG",
                        "NL",
                        "KN",
                        "SX"),
                "BM" to listOf("US-NC"),
                "BN" to listOf("MY"),
                "BO" to listOf(
                        "AR",
                        "BR",
                        "CL",
                        "PY",
                        "PE"),
                "BQ" to listOf("AW"),
                "BR" to listOf(
                        "AR",
                        "BO",
                        "CO",
                        "GF",
                        "GY",
                        "PY",
                        "PE",
                        "SR",
                        "UY",
                        "VE"),
                "BS" to listOf(
                        "CU",
                        "HT",
                        "TC",
                        "US"),
                "BT" to listOf(
                        "CN",
                        "IN"),
                "BV" to listOf(
                        "DK",
                        "FO",
                        "GL",
                        "IS",
                        "RU",
                        "SE",
                        "GB"),
                "BW" to listOf(
                        "NA",
                        "ZA",
                        "ZM",
                        "ZW"),
                "BY" to listOf(
                        "LV",
                        "LT",
                        "PL",
                        "RU",
                        "UA"),
                "BZ" to listOf(
                        "GT",
                        "MX"),
                "CC" to listOf(
                        "TL",
                        "ID",
                        "AC",
                        "NC",
                        "NZ",
                        "PG",
                        "SB"),
                "CD" to listOf(
                        "AO",
                        "BI",
                        "CF",
                        "CG",
                        "RW",
                        "SS",
                        "TZ",
                        "UG",
                        "ZM"),
                "CF" to listOf(
                        "CM",
                        "TD",
                        "CD",
                        "CG",
                        "SS",
                        "SD"),
                "CG" to listOf(
                        "AO",
                        "CM",
                        "CF",
                        "CD",
                        "GA"),
                "CH" to listOf(
                        "AT",
                        "FR",
                        "IT",
                        "LI",
                        "DE"),
                "CK" to listOf(
                        "AS",
                        "PF",
                        "KI",
                        "NU",
                        "TK"),
                "CL" to listOf(
                        "AR",
                        "BO",
                        "PE"),
                "CM" to listOf(
                        "CF",
                        "TD",
                        "CG",
                        "GQ",
                        "GA",
                        "NG"),
                "CN" to listOf(
                        "AF",
                        "BT",
                        "IN",
                        "KZ",
                        "KR",
                        "KG",
                        "LA",
                        "MN",
                        "MM",
                        "NP",
                        "PK",
                        "RU",
                        "TJ",
                        "VN"),
                "CO" to listOf(
                        "BR",
                        "EC",
                        "PA",
                        "PE",
                        "VE"),
                "CR" to listOf(
                        "NI",
                        "PA"),
                "CU" to listOf(
                        "BS",
                        "KY",
                        "HT",
                        "HN",
                        "JM",
                        "MX"),
                "CV" to listOf("SN"),
                "CW" to listOf("VE"),
                "CX" to listOf("ID"),
                "CY" to listOf("TR"),
                "CZ" to listOf(
                        "AT",
                        "DE",
                        "PL",
                        "SK"),
                "DE" to listOf(
                        "AT",
                        "BE",
                        "CZ",
                        "DK",
                        "FR",
                        "LU",
                        "NL",
                        "PL",
                        "CH"),
                "DJ" to listOf(
                        "ER",
                        "ET",
                        "SO"),
                "DK" to listOf("DE"),
                "DM" to listOf(
                        "GP",
                        "MQ",
                        "VE"),
                "DO" to listOf("HT"),
                "DZ" to listOf(
                        "LY",
                        "ML",
                        "MR",
                        "MA",
                        "NE",
                        "TN",
                        "EH"),
                "EC" to listOf(
                        "CO",
                        "PE"),
                "EE" to listOf(
                        "LV",
                        "RU"),
                "EG" to listOf(
                        "PS",
                        "IL",
                        "LY",
                        "SD"),
                "EH" to listOf(
                        "DZ",
                        "MR",
                        "MA"),
                "ER" to listOf(
                        "DJ",
                        "ET",
                        "SD"),
                "ES" to listOf(
                        "AD",
                        "FR",
                        "GI",
                        "PT",
                        "MA"),
                "ET" to listOf(
                        "DJ",
                        "ER",
                        "KE",
                        "SO",
                        "SS",
                        "SD"),
                "FI" to listOf(
                        "NO",
                        "SE",
                        "RU"),
                "FJ" to listOf(
                        "NC",
                        "NZ",
                        "TO",
                        "TV",
                        "VU",
                        "WF"),
                "FK" to listOf(
                        "AR",
                        "GB"),
                "FM" to listOf(
                        "GU",
                        "MH",
                        "PW",
                        "PG"),
                "FO" to listOf(
                        "CA",
                        "DE",
                        "IS",
                        "SJ",
                        "NO",
                        "PL",
                        "SE",
                        "GB"),
                "FR" to listOf(
                        "AD",
                        "BE",
                        "DE",
                        "IT",
                        "LU",
                        "MC",
                        "ES",
                        "CH"),
                "GA" to listOf(
                        "CM",
                        "CG",
                        "GQ"),
                "GB" to listOf("IE"),
                "GB-E" to listOf(
                        "GB",
                        "GB-W",
                        "GB-S"),
                "GB-N" to listOf(
                        "IE",
                        "GB"),
                "GB-S" to listOf(
                        "GB",
                        "GB-E"),
                "GB-W" to listOf(
                        "GB",
                        "GB-E"),
                "GD" to listOf(
                        "VC",
                        "TT"),
                "GE" to listOf(
                        "AM",
                        "AZ",
                        "RU",
                        "TR"),
                "GF" to listOf(
                        "BR",
                        "SR"),
                "GG" to listOf(
                        "FR",
                        "JE"),
                "GH" to listOf(
                        "BF",
                        "TG"),
                "GI" to listOf("ES"),
                "GL" to listOf("CA"),
                "GM" to listOf("SN"),
                "GN" to listOf(
                        "GW",
                        "LR",
                        "ML",
                        "SN",
                        "SL"),
                "GP" to listOf(
                        "AG",
                        "BB",
                        "DM",
                        "MS",
                        "VE"),
                "GQ" to listOf(
                        "CM",
                        "GA"),
                "GR" to listOf(
                        "AL",
                        "BG",
                        "TR",
                        "MK"),
                "GS" to listOf("AR"),
                "GT" to listOf(
                        "BZ",
                        "SV",
                        "HN",
                        "MX"),
                "GU" to listOf("FM"),
                "GW" to listOf(
                        "GN",
                        "SN"),
                "GY" to listOf(
                        "BR",
                        "SR",
                        "VE"),
                "HK" to listOf("CN"),
                "HM" to listOf("AC"),
                "HN" to listOf(
                        "GT",
                        "SV",
                        "NI"),
                "HR" to listOf(
                        "BA",
                        "HU",
                        "ME",
                        "RS",
                        "SI"),
                "HT" to listOf("DO"),
                "HU" to listOf(
                        "AT",
                        "HR",
                        "RO",
                        "RS",
                        "SK",
                        "SI",
                        "UA"),
                "ID" to listOf(
                        "TL",
                        "MY",
                        "PG"),
                "IE" to listOf("GB"),
                "IL" to listOf(
                        "EG",
                        "JO",
                        "LB",
                        "SY",
                        "PS"),
                "IM" to listOf("GB"),
                "IN" to listOf(
                        "BD",
                        "BT",
                        "CN",
                        "MM",
                        "NP",
                        "PK",
                        "LK",
                        "IN"),
                "IO" to listOf("MV"),
                "IQ" to listOf(
                        "IR",
                        "JO",
                        "KW",
                        "SA",
                        "SY",
                        "TR"),
                "IR" to listOf(
                        "AF",
                        "AM",
                        "AZ",
                        "IQ",
                        "PK",
                        "TR",
                        "TM"),
                "IS" to listOf(
                        "FO",
                        "GL",
                        "SJ"),
                "IT" to listOf(
                        "AT",
                        "FR",
                        "SM",
                        "SI",
                        "CH",
                        "VA"),
                "JE" to listOf(
                        "FR",
                        "GG"),
                "JM" to listOf(
                        "KY",
                        "CO",
                        "CU",
                        "HT"),
                "JO" to listOf(
                        "IQ",
                        "IL",
                        "SA",
                        "SY",
                        "PS"),
                "JP" to listOf(
                        "CN",
                        "KR",
                        "KP",
                        "MP",
                        "PH",
                        "RU",
                        "TW"),
                "KE" to listOf(
                        "ET",
                        "SO",
                        "SS",
                        "TZ",
                        "UG"),
                "KG" to listOf(
                        "CN",
                        "KZ",
                        "TJ",
                        "UZ"),
                "KH" to listOf(
                        "LA",
                        "TH",
                        "VN"),
                "KI" to listOf(
                        "CK",
                        "PF",
                        "US",
                        "MH",
                        "NR",
                        "TK",
                        "TV"),
                "KM" to listOf(
                        "AC",
                        "MG",
                        "YT",
                        "MZ",
                        "RE",
                        "SC",
                        "TZ"),
                "KN" to listOf(
                        "AG",
                        "MS",
                        "NL",
                        "BL",
                        "VE"),
                "KP" to listOf("KR"),
                "KR" to listOf(
                        "CN",
                        "KP",
                        "RU"),
                "KW" to listOf(
                        "IQ",
                        "SA"),
                "KY" to listOf(
                        "CO",
                        "CU",
                        "HN",
                        "JM"),
                "KZ" to listOf(
                        "CN",
                        "KG",
                        "RU",
                        "TM",
                        "UZ"),
                "LA" to listOf(
                        "KH",
                        "CN",
                        "MM",
                        "TH",
                        "VN"),
                "LB" to listOf(
                        "IL",
                        "SY"),
                "LC" to listOf(
                        "BB",
                        "MQ",
                        "VC",
                        "VE"),
                "LI" to listOf(
                        "AT",
                        "CH"),
                "LK" to listOf(
                        "IN",
                        "MV"),
                "LR" to listOf(
                        "GN",
                        "SL"),
                "LS" to listOf("ZA"),
                "LT" to listOf(
                        "BY",
                        "LV",
                        "PL",
                        "RU"),
                "LU" to listOf(
                        "BE",
                        "FR",
                        "DE"),
                "LV" to listOf(
                        "BY",
                        "EE",
                        "LT",
                        "RU"),
                "LY" to listOf(
                        "DZ",
                        "TD",
                        "EG",
                        "NE",
                        "SD",
                        "TN"),
                "MA" to listOf(
                        "DZ",
                        "EH",
                        "ES"),
                "MC" to listOf("FR"),
                "MD" to listOf(
                        "RO",
                        "UA"),
                "ME" to listOf(
                        "AL",
                        "BA",
                        "HR",
                        "XK",
                        "RS"),
                "MF" to listOf(
                        "NL",
                        "AI",
                        "SX"),
                "MG" to listOf(
                        "KM",
                        "AC",
                        "YT",
                        "MZ",
                        "RE",
                        "SC"),
                "MH" to listOf(
                        "KI",
                        "FM",
                        "NR"),
                "MK" to listOf(
                        "AL",
                        "BG",
                        "GR",
                        "XK",
                        "RS"),
                "ML" to listOf(
                        "DZ",
                        "BF",
                        "GN",
                        "MR",
                        "NE",
                        "SN"),
                "MM" to listOf(
                        "BD",
                        "CN",
                        "IN",
                        "LA",
                        "TH"),
                "MN" to listOf(
                        "CN",
                        "RU"),
                "MO" to listOf("CN"),
                "MP" to listOf("JP"),
                "MQ" to listOf(
                        "BB",
                        "DM",
                        "LC",
                        "VE"),
                "MR" to listOf(
                        "DZ",
                        "ML",
                        "SN",
                        "EH"),
                "MS" to listOf(
                        "AG",
                        "GP",
                        "KN",
                        "VE"),
                "MT" to listOf(
                        "IT",
                        "LY"),
                "MU" to listOf(
                        "RE",
                        "SC",
                        "AC"),
                "MV" to listOf(
                        "IO",
                        "IN",
                        "LK"),
                "MW" to listOf(
                        "MZ",
                        "TZ",
                        "ZM"),
                "MX" to listOf(
                        "BZ",
                        "GT",
                        "US"),
                "MY" to listOf(
                        "BN",
                        "ID",
                        "TH"),
                "MZ" to listOf(
                        "SZ",
                        "MW",
                        "ZA",
                        "TZ",
                        "ZM",
                        "ZW"),
                "NA" to listOf(
                        "AO",
                        "BW",
                        "ZA",
                        "ZM"),
                "NC" to listOf(
                        "AU",
                        "FJ",
                        "NF",
                        "PG",
                        "SB",
                        "VU"),
                "NE" to listOf(
                        "DZ",
                        "BJ",
                        "BF",
                        "TD",
                        "LY",
                        "ML",
                        "NG"),
                "NF" to listOf("AU"),
                "NG" to listOf(
                        "BJ",
                        "CM",
                        "TD",
                        "NE"),
                "NI" to listOf(
                        "CR",
                        "HN"),
                "NL" to listOf(
                        "BE",
                        "DE",
                        "MF"),
                "NO" to listOf(
                        "FI",
                        "SE",
                        "RU"),
                "NP" to listOf(
                        "CN",
                        "IN"),
                "NR" to listOf(
                        "KI",
                        "MH"),
                "NU" to listOf(
                        "AS",
                        "CK",
                        "TO"),
                "NZ" to listOf(
                        "AS",
                        "AU",
                        "FJ",
                        "PF",
                        "KI",
                        "NF",
                        "WS",
                        "TO",
                        "WF"),
                "OM" to listOf(
                        "SA",
                        "AE",
                        "YE"),
                "PA" to listOf(
                        "CO",
                        "CR"),
                "PE" to listOf(
                        "BO",
                        "BR",
                        "CL",
                        "CO",
                        "EC"),
                "PF" to listOf(
                        "CK",
                        "KI",
                        "PN"),
                "PG" to listOf("ID"),
                "PH" to listOf(
                        "CN",
                        "ID",
                        "JP",
                        "MY",
                        "PW",
                        "VN",
                        "TW"),
                "PK" to listOf(
                        "AF",
                        "IN",
                        "IR",
                        "CN"),
                "PL" to listOf(
                        "BY",
                        "CZ",
                        "DE",
                        "LT",
                        "RU",
                        "SK",
                        "UA"),
                "PM" to listOf("CA"),
                "PN" to listOf("PF"),
                "PR" to listOf(
                        "VI",
                        "DO",
                        "VE"),
                "PS" to listOf(
                        "EG",
                        "IL",
                        "JO"),
                "PT" to listOf("ES"),
                "PW" to listOf(
                        "ID",
                        "FM",
                        "PH"),
                "PY" to listOf(
                        "AR",
                        "BO",
                        "BR"),
                "QA" to listOf("SA"),
                "RE" to listOf(
                        "KM",
                        "MG",
                        "MU",
                        "MZ"),
                "RO" to listOf(
                        "BG",
                        "HU",
                        "MD",
                        "RS",
                        "UA"),
                "RS" to listOf(
                        "BA",
                        "BG",
                        "HR",
                        "HU",
                        "XK",
                        "ME",
                        "MK",
                        "RO"),
                "RU" to listOf(
                        "AZ",
                        "BY",
                        "CN",
                        "EE",
                        "FI",
                        "GE",
                        "KZ",
                        "KR",
                        "LV",
                        "LT",
                        "MN",
                        "NO",
                        "PL",
                        "UA"),
                "RW" to listOf(
                        "BI",
                        "CD",
                        "TZ",
                        "UG"),
                "SA" to listOf(
                        "IQ",
                        "JO",
                        "KW",
                        "OM",
                        "QA",
                        "AE",
                        "YE"),
                "SB" to listOf(
                        "AU",
                        "NC",
                        "PG",
                        "VU"),
                "SC" to listOf(
                        "KM",
                        "AC",
                        "MG",
                        "MU",
                        "TZ"),
                "SD" to listOf(
                        "CF",
                        "TD",
                        "EG",
                        "ER",
                        "ET",
                        "LY",
                        "SS"),
                "SE" to listOf(
                        "FI",
                        "AX",
                        "NO"),
                "SG" to listOf(
                        "ID",
                        "MY"),
                "SH" to listOf("AC"),
                "SI" to listOf(
                        "AT",
                        "HR",
                        "IT",
                        "HU"),
                "SK" to listOf(
                        "AT",
                        "CZ",
                        "HU",
                        "PL",
                        "UA"),
                "SL" to listOf(
                        "GN",
                        "LR"),
                "SM" to listOf("IT"),
                "SN" to listOf(
                        "GM",
                        "GN",
                        "GW",
                        "ML",
                        "MR"),
                "SO" to listOf(
                        "DJ",
                        "ET",
                        "KE"),
                "SR" to listOf(
                        "BR",
                        "GF",
                        "GY"),
                "SS" to listOf(
                        "CF",
                        "CD",
                        "ET",
                        "KE",
                        "SD",
                        "UG"),
                "ST" to listOf(
                        "GQ",
                        "GA",
                        "NG"),
                "SV" to listOf(
                        "GT",
                        "HN"),
                "SX" to listOf(
                        "BL",
                        "MF"),
                "SY" to listOf("IQ"),
                "SZ" to listOf(
                        "MZ",
                        "ZA"),
                "TC" to listOf(
                        "BS",
                        "DO",
                        "HT"),
                "TD" to listOf(
                        "CM",
                        "CF",
                        "LY",
                        "NE",
                        "NG",
                        "SD"),
                "TF" to listOf("AQ"),
                "TG" to listOf(
                        "BJ",
                        "BF",
                        "GH"),
                "TH" to listOf(
                        "KH",
                        "LA",
                        "MY",
                        "MM"),
                "TJ" to listOf(
                        "AF",
                        "CN",
                        "KG",
                        "UZ"),
                "TK" to listOf(
                        "AS",
                        "CK",
                        "KI",
                        "WS",
                        "WF"),
                "TL" to listOf("ID"),
                "TM" to listOf(
                        "AF",
                        "IR",
                        "KZ",
                        "UZ"),
                "TN" to listOf(
                        "DZ",
                        "LY"),
                "TO" to listOf(
                        "AS",
                        "FJ",
                        "NZ",
                        "NU",
                        "WS",
                        "WF"),
                "TR" to listOf(
                        "AM",
                        "AZ",
                        "BG",
                        "GE",
                        "GR",
                        "IR",
                        "IQ",
                        "SY"),
                "TT" to listOf(
                        "BB",
                        "GD",
                        "GY",
                        "VC",
                        "VE"),
                "TV" to listOf(
                        "FJ",
                        "KI",
                        "WF"),
                "TW" to listOf(
                        "CN",
                        "JP",
                        "PH"),
                "TZ" to listOf(
                        "BI",
                        "CD",
                        "KE",
                        "MW",
                        "MZ",
                        "RW",
                        "UG",
                        "ZM"),
                "UA" to listOf(
                        "BY",
                        "HU",
                        "MD",
                        "PL",
                        "RO",
                        "RU",
                        "SK"),
                "UG" to listOf(
                        "CD",
                        "KE",
                        "RW",
                        "SS",
                        "TZ"),
                "UM" to listOf("US"),
                "UY" to listOf(
                        "AR",
                        "BR"),
                "UZ" to listOf(
                        "AF",
                        "KZ",
                        "KG",
                        "TJ",
                        "TM"),
                "VA" to listOf("IT"),
                "VC" to listOf(
                        "BB",
                        "GD",
                        "LC",
                        "TT",
                        "VE"),
                "VE" to listOf(
                        "BR",
                        "CO",
                        "GY"),
                "VG" to listOf(
                        "AI",
                        "VI",
                        "NL",
                        "VE"),
                "VI" to listOf(
                        "PR",
                        "VG"),
                "VN" to listOf(
                        "KH",
                        "CN",
                        "LA"),
                "VU" to listOf(
                        "FJ",
                        "NC",
                        "SB"),
                "WF" to listOf(
                        "FJ",
                        "WS",
                        "TO",
                        "TV"),
                "WS" to listOf(
                        "AS",
                        "TK",
                        "TO",
                        "WF"),
                "YE" to listOf(
                        "OM",
                        "SA"),
                "YT" to listOf(
                        "KM",
                        "MG"),
                "ZA" to listOf(
                        "BW",
                        "SZ",
                        "LS",
                        "MZ",
                        "NA",
                        "ZW"),
                "ZM" to listOf(
                        "AO",
                        "BW",
                        "CD",
                        "MW",
                        "MZ",
                        "NA",
                        "TZ",
                        "ZW"),
                "ZW" to listOf(
                        "BW",
                        "MZ",
                        "ZA",
                        "ZM"),
                "XD" to listOf(
                        "OM",
                        "SA"),
                "XK" to listOf(
                        "AL",
                        "ME",
                        "MK",
                        "RS"),
                "XN" to listOf("XK"),
                "XS" to listOf(
                        "BA",
                        "BG",
                        "HR",
                        "HU",
                        "XK",
                        "ME",
                        "MK",
                        "RO"),
                "GB" to listOf(
                        "GB-N",
                        "IE"),
                "CA" to listOf("US"),
                "CA-AB" to listOf(
                        "CA-BC",
                        "CA-SK",
                        "CA"),
                "CA-BC" to listOf(
                        "CA-AB",
                        "CA-YT"),
                "CA-MB" to listOf(
                        "CA-SK",
                        "CA-ON"),
                "CA-NB" to listOf(
                        "CA-QC",
                        "CA-NS"),
                "CA-NL" to listOf(
                        "CA-QC",
                        "CA-NS"),
                "CA-NS" to listOf(
                        "CA-NB",
                        "CA-NL"),
                "CA-ON" to listOf(
                        "CA-MB",
                        "CA-QC",
                        "CA"),
                "CA-QC" to listOf(
                        "CA-NL",
                        "CA-NB",
                        "CA-NL"),
                "CA-SK" to listOf(
                        "CA-AB",
                        "CA-BC"),
                "CA-YT" to listOf(
                        "CA-BC",
                        "CA-SK"),
                "US" to listOf(
                        "CA",
                        "MX"),
                "US-AK" to listOf("CA"),
                "US-AL" to listOf(
                        "US-MS",
                        "US-TN",
                        "US-GA",
                        "US-FL"),
                "US-AR" to listOf(
                        "US-TX",
                        "US-OK",
                        "US-MO",
                        "US-TN",
                        "US-MS",
                        "US-LA"),
                "US-AZ" to listOf(
                        "US-CA",
                        "US-NV",
                        "US-UT",
                        "US-NM",
                        "MX"),
                "US-CA" to listOf(
                        "US-OR",
                        "US-NV",
                        "US-AZ",
                        "MX"),
                "US-CO" to listOf(
                        "US-UT",
                        "US-WY",
                        "US-NE",
                        "US-KS",
                        "US-OK",
                        "US-NM"),
                "US-CT" to listOf(
                        "US-RI",
                        "US-MA",
                        "US-NY"),
                "US-DE" to listOf(
                        "US-MD",
                        "US-NJ",
                        "US-PA"),
                "US-DC" to listOf(
                        "US-MD",
                        "US-VA",
                        "US-WV"),
                "US-FL" to listOf(
                        "US-GA",
                        "US-AL"),
                "US-GA" to listOf(
                        "US-AL",
                        "US-TN",
                        "US-NC",
                        "US-SC",
                        "US-FL"),
                "US-HI" to listOf(
                        "MX",
                        "US-CA"),
                "US-IA" to listOf(
                        "US-MN",
                        "US-WI",
                        "US-IL",
                        "US-MO",
                        "US-NE",
                        "US-SD"),
                "US-ID" to listOf(
                        "US-MT",
                        "US-WY",
                        "US-UT",
                        "US-NV",
                        "US-OR",
                        "US-WA"),
                "US-IL" to listOf(
                        "US-IN",
                        "US-KY",
                        "US-MO",
                        "US-IA",
                        "US-WI"),
                "US-IN" to listOf(
                        "US-MI",
                        "US-OH",
                        "US-KY",
                        "US-IL"),
                "US-KS" to listOf(
                        "US-NE",
                        "US-MO",
                        "US-OK",
                        "US-CO"),
                "US-KY" to listOf(
                        "US-IL",
                        "US-IN",
                        "US-OH",
                        "US-WV",
                        "US-VA",
                        "US-TN",
                        "US-MO"),
                "US-LA" to listOf(
                        "US-TX",
                        "US-AR",
                        "US-MS"),
                "US-MA" to listOf(
                        "US-RI",
                        "US-CT",
                        "US-NY",
                        "US-VT",
                        "US-NH"),
                "US-MD" to listOf(
                        "US-DE",
                        "US-PA",
                        "US-WV",
                        "US-VA",
                        "US-DC",
                        "US-WA"),
                "US-ME" to listOf(
                        "US-NH",
                        "CA"),
                "US-MI" to listOf(
                        "US-IN",
                        "US-OH",
                        "CA"),
                "US-MN" to listOf(
                        "US-WI",
                        "US-IA",
                        "US-SD",
                        "US-ND",
                        "CA"),
                "US-MO" to listOf(
                        "US-IA",
                        "US-IL",
                        "US-AR",
                        "US-KS"),
                "US-MS" to listOf(
                        "US-LA",
                        "US-AR",
                        "US-TN",
                        "US-AL"),
                "US-MT" to listOf(
                        "US-ID",
                        "US-WY",
                        "US-ND",
                        "CA"),
                "US-NC" to listOf(
                        "US-SC",
                        "US-TN",
                        "US-VA"),
                "US-ND" to listOf(
                        "US-MN",
                        "US-SD",
                        "US-MT",
                        "CA"),
                "US-NE" to listOf(
                        "US-SD",
                        "US-IA",
                        "US-KS",
                        "US-CO",
                        "US-WY"),
                "US-NH" to listOf(
                        "US-ME",
                        "US-VT",
                        "US-MA"),
                "US-NJ" to listOf(
                        "US-NY",
                        "US-PA"),
                "US-NM" to listOf(
                        "US-AZ",
                        "US-CO",
                        "US-TX",
                        "MX"),
                "US-NV" to listOf(
                        "US-CA",
                        "US-OR",
                        "US-ID",
                        "US-UT",
                        "US-AZ"),
                "US-NY" to listOf(
                        "US-VT",
                        "US-MA",
                        "US-CT",
                        "US-NJ",
                        "US-PA",
                        "CA"),
                "US-OH" to listOf(
                        "US-PA",
                        "US-WV",
                        "US-KY",
                        "US-IN",
                        "US-MI"),
                "US-OK" to listOf(
                        "US-KS",
                        "US-AR",
                        "US-TX"),
                "US-OR" to listOf(
                        "US-WA",
                        "US-ID",
                        "US-NV",
                        "US-CA"),
                "US-PA" to listOf(
                        "US-NY",
                        "US-MD",
                        "US-WV",
                        "US-OH"),
                "US-RI" to listOf(
                        "US-MA",
                        "US-CT"),
                "US-SC" to listOf(
                        "US-NC",
                        "US-GA"),
                "US-SD" to listOf(
                        "US-ND",
                        "US-MN",
                        "US-NE",
                        "US-WY"),
                "US-TN" to listOf(
                        "US-KY",
                        "US-NC",
                        "US-AL",
                        "US-MS"),
                "US-TX" to listOf(
                        "US-NM",
                        "US-OK",
                        "US-AR",
                        "US-LA",
                        "MX"),
                "US-UT" to listOf(
                        "US-NV",
                        "US-ID",
                        "US-WY",
                        "US-CO",
                        "US-AZ"),
                "US-VA" to listOf(
                        "US-MD",
                        "US-WV",
                        "US-NC",
                        "US-KY",
                        "US-DC",
                        "US-WA"),
                "US-VT" to listOf(
                        "US-NH",
                        "US-NY",
                        "CA"),
                "US-WA" to listOf(
                        "US-DC",
                        "US-VA",
                        "US-MD",
                        "CA"),
                "US-WI" to listOf(
                        "US-MN",
                        "US-IL",
                        "US-MI"),
                "US-WV" to listOf(
                        "US-OH",
                        "US-MD",
                        "US-VA",
                        "US-DC",
                        "US-WA"),
                "US-WY" to listOf(
                        "US-MT",
                        "US-CO",
                        "US-ID"),
        )
        return countryCodeToNeighbouringCountrys[CountryCode]
    }

    //=============== SET =============================
    fun setFont(context: Context, type :String) : Typeface {return if(Info.languageOne =="en") {Typeface.createFromAsset(context.assets, "${type}_en.ttf")}else{Typeface.createFromAsset(context.assets, "${type}.ttf")}}
    fun setWidgetAndProgress(widget : Int?, progress : Int?, widgetBackground : ImageView, widgetText : TextView, profileProgress : ProgressBar){
        if (widget != null){when {
            widget <= 0 -> {widgetBackground.visibility = View.INVISIBLE;widgetText.visibility = View.INVISIBLE}
            widget <= 9 -> {widgetBackground.visibility = View.VISIBLE;widgetText.textSize = 18f;widgetText.text = widget.toString()}
            widget in 10..99 -> {widgetBackground.visibility = View.VISIBLE;widgetText.textSize = 16f;widgetText.text = widget.toString()}
            else -> { if (widget > 999) {widgetText.text = "999"}}}}
        if (progress != null && progress != 0){
            val handler = Handler(Looper.getMainLooper())
            var i = 0
            val duration = (2000 / progress)
            handler.postDelayed(object : Runnable {override fun run() {if (i <= progress) {
                profileProgress.setProgress(i, true)
                i += 1
                handler.postDelayed(this, duration.toLong())
            } else {handler.removeCallbacks(this)}}}, 0)} }
    fun setUserPercentage(percentage2:Int,progressBar : ProgressBar, progressText : TextView){
        val percentage1 = percentage2/1000
        if (percentage1 != 0){
            val handler = Handler(Looper.getMainLooper())
            var i = progressBar.progress
            val duration = if (progressBar.progress > percentage1) {(2000 / (progressBar.progress - percentage1))} else {(2000 / (percentage1 - progressBar.progress))}
            handler.postDelayed(object : Runnable {override fun run() {
                if (i < percentage1) {
                    progressBar.setProgress(i, true)
                    i += 1
                    handler.postDelayed(this, duration.toLong()) }
                else if (i > percentage1) {
                    progressBar.setProgress(i, true)
                    i -= 1
                    handler.postDelayed(this, duration.toLong()) }

                else {handler.removeCallbacks(this)}}}, 0)}

        var percentage = 100.000f
        percentage =
            when (Info.orientation) {
                "a" -> {
                    (percentage/100.000f)*(Stat.genderA.toFloat()/1000)
                }
                "b" -> {
                    (percentage/100.000f)*(Stat.genderB.toFloat()/1000)
                }
                "c" -> {
                    (percentage/100.000f)*((Stat.genderA + Stat.genderB.toFloat())/1000)
                }
                else -> {
                    (percentage/100.000f)*100.000f
                }}
        if (Pref.language != null) {val iterator = Pref.language!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "af" -> {percentageBuilder += Stat.languageAF}
                    "ar" -> {percentageBuilder += Stat.languageAR}
                    "be" -> {percentageBuilder += Stat.languageBE}
                    "bg" -> {percentageBuilder += Stat.languageBG}
                    "bn" -> {percentageBuilder += Stat.languageBN}
                    "ca" -> {percentageBuilder += Stat.languageCA}
                    "cs" -> {percentageBuilder += Stat.languageCS}
                    "cy" -> {percentageBuilder += Stat.languageCY}
                    "da" -> {percentageBuilder += Stat.languageDA}
                    "de" -> {percentageBuilder += Stat.languageDE}
                    "el" -> {percentageBuilder += Stat.languageEL}
                    "en" -> {percentageBuilder += Stat.languageEN}
                    "eo" -> {percentageBuilder += Stat.languageEO}
                    "es" -> {percentageBuilder += Stat.languageES}
                    "et" -> {percentageBuilder += Stat.languageET}
                    "fa" -> {percentageBuilder += Stat.languageFA}
                    "fi" -> {percentageBuilder += Stat.languageFI}
                    "fr" -> {percentageBuilder += Stat.languageFR}
                    "ga" -> {percentageBuilder += Stat.languageGA}
                    "gl" -> {percentageBuilder += Stat.languageGL}
                    "gu" -> {percentageBuilder += Stat.languageGU}
                    "he" -> {percentageBuilder += Stat.languageHE}
                    "hi" -> {percentageBuilder += Stat.languageHI}
                    "hr" -> {percentageBuilder += Stat.languageHR}
                    "ht" -> {percentageBuilder += Stat.languageHT}
                    "hu" -> {percentageBuilder += Stat.languageHU}
                    "id" -> {percentageBuilder += Stat.languageID}
                    "is" -> {percentageBuilder += Stat.languageIS}
                    "it" -> {percentageBuilder += Stat.languageIT}
                    "ja" -> {percentageBuilder += Stat.languageJA}
                    "ka" -> {percentageBuilder += Stat.languageKA}
                    "kn" -> {percentageBuilder += Stat.languageKN}
                    "ko" -> {percentageBuilder += Stat.languageKO}
                    "lt" -> {percentageBuilder += Stat.languageLT}
                    "lv" -> {percentageBuilder += Stat.languageLV}
                    "mk" -> {percentageBuilder += Stat.languageMK}
                    "mr" -> {percentageBuilder += Stat.languageMR}
                    "ms" -> {percentageBuilder += Stat.languageMS}
                    "mt" -> {percentageBuilder += Stat.languageMT}
                    "nl" -> {percentageBuilder += Stat.languageNL}
                    "no" -> {percentageBuilder += Stat.languageNO}
                    "pl" -> {percentageBuilder += Stat.languagePL}
                    "pt" -> {percentageBuilder += Stat.languagePT}
                    "ro" -> {percentageBuilder += Stat.languageRO}
                    "ru" -> {percentageBuilder += Stat.languageRU}
                    "sk" -> {percentageBuilder += Stat.languageSK}
                    "sl" -> {percentageBuilder += Stat.languageSL}
                    "sq" -> {percentageBuilder += Stat.languageSQ}
                    "sv" -> {percentageBuilder += Stat.languageSV}
                    "sw" -> {percentageBuilder += Stat.languageSW}
                    "ta" -> {percentageBuilder += Stat.languageTA}
                    "te" -> {percentageBuilder += Stat.languageTE}
                    "th" -> {percentageBuilder += Stat.languageTH}
                    "tr" -> {percentageBuilder += Stat.languageTR}
                    "uk" -> {percentageBuilder += Stat.languageUK}
                    "ur" -> {percentageBuilder += Stat.languageUR}
                    "vi" -> {percentageBuilder += Stat.languageVI}
                    "zh" -> {percentageBuilder += Stat.languageZH}};percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}}
        if (Pref.employment != null) {
            val iterator = Pref.employment!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.employmentA}
                    "b" -> {percentageBuilder += Stat.employmentB}
                    "c" -> {percentageBuilder += Stat.employmentC}
                    "d" -> {percentageBuilder += Stat.employmentD}
                    "e" -> {percentageBuilder += Stat.employmentE}
                    "f" -> {percentageBuilder += Stat.employmentF}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.religion != null) {
            val iterator = Pref.religion!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.religionA}
                    "b" -> {percentageBuilder += Stat.religionB}
                    "c" -> {percentageBuilder += Stat.religionC}
                    "d" -> {percentageBuilder += Stat.religionD}
                    "e" -> {percentageBuilder += Stat.religionE}
                    "f" -> {percentageBuilder += Stat.religionF}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.political != null) {
            val iterator = Pref.political!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.politicalA}
                    "b" -> {percentageBuilder += Stat.politicalB}
                    "c" -> {percentageBuilder += Stat.politicalC}
                    "d" -> {percentageBuilder += Stat.politicalD}
                    "e" -> {percentageBuilder += Stat.politicalE}
                    "f" -> {percentageBuilder += Stat.politicalF}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.pet != null) {
            val iterator = Pref.pet!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.petA}
                    "b" -> {percentageBuilder += Stat.petB}
                    "c" -> {percentageBuilder += Stat.petC}
                    "d" -> {percentageBuilder += Stat.petD}
                    "e" -> {percentageBuilder += Stat.petE}
                    "f" -> {percentageBuilder += Stat.petF}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.children != null) {
            val iterator = Pref.children!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.childrenA}
                    "b" -> {percentageBuilder += Stat.childrenB}
                    "c" -> {percentageBuilder += Stat.childrenC}
                    "d" -> {percentageBuilder += Stat.childrenD}
                    "e" -> {percentageBuilder += Stat.childrenE}
                    "f" -> {percentageBuilder += Stat.childrenF}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.relationship != null) {
            val iterator = Pref.relationship!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.relationshipA}
                    "b" -> {percentageBuilder += Stat.relationshipB}
                    "c" -> {percentageBuilder += Stat.relationshipC}
                    "d" -> {percentageBuilder += Stat.relationshipD}
                    "e" -> {percentageBuilder += Stat.relationshipE}
                    "f" -> {percentageBuilder += Stat.relationshipF}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.food != null) {
            val iterator = Pref.food!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.foodA}
                    "b" -> {percentageBuilder += Stat.foodB}
                    "c" -> {percentageBuilder += Stat.foodC}
                    "d" -> {percentageBuilder += Stat.foodD}
                    "e" -> {percentageBuilder += Stat.foodE}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.smoke != null) {
            val iterator = Pref.smoke!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.smokeA}
                    "b" -> {percentageBuilder += Stat.smokeB}
                    "c" -> {percentageBuilder += Stat.smokeC}
                    "d" -> {percentageBuilder += Stat.smokeD}
                    "e" -> {percentageBuilder += Stat.smokeE}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.education != null) {
            val iterator = Pref.education!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.educationA}
                    "b" -> {percentageBuilder += Stat.educationB}
                    "c" -> {percentageBuilder += Stat.educationC}
                    "d" -> {percentageBuilder += Stat.educationD}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.drink != null) {
            val iterator = Pref.drink!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.drinkA}
                    "b" -> {percentageBuilder += Stat.drinkB}
                    "c" -> {percentageBuilder += Stat.drinkC}
                    "d" -> {percentageBuilder += Stat.drinkD}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.drugs != null) {
            val iterator = Pref.drugs!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.drugsA}
                    "b" -> {percentageBuilder += Stat.drugsB}
                    "c" -> {percentageBuilder += Stat.drugsC}
                    "d" -> {percentageBuilder += Stat.drugsD}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.travel != null) {
            val iterator = Pref.travel!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.travelA}
                    "b" -> {percentageBuilder += Stat.travelB}
                    "c" -> {percentageBuilder += Stat.travelC}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.minAge != null && Pref.maxAge != null) {
            var percentageBuilder  = 0
            for (it in Pref.minAge!!..Pref.maxAge!!){when (it) {
                18 -> {percentageBuilder += Stat.age18}
                19 -> {percentageBuilder += Stat.age19}
                20 -> {percentageBuilder += Stat.age20}
                21 -> {percentageBuilder += Stat.age21}
                22 -> {percentageBuilder += Stat.age22}
                23 -> {percentageBuilder += Stat.age23}
                24 -> {percentageBuilder += Stat.age24}
                25 -> {percentageBuilder += Stat.age25}
                26 -> {percentageBuilder += Stat.age26}
                27 -> {percentageBuilder += Stat.age27}
                28 -> {percentageBuilder += Stat.age28}
                29 -> {percentageBuilder += Stat.age29}
                30 -> {percentageBuilder += Stat.age30}
                31 -> {percentageBuilder += Stat.age31}
                32 -> {percentageBuilder += Stat.age32}
                33 -> {percentageBuilder += Stat.age33}
                34 -> {percentageBuilder += Stat.age34}
                35 -> {percentageBuilder += Stat.age35}
                36 -> {percentageBuilder += Stat.age36}
                37 -> {percentageBuilder += Stat.age37}
                38 -> {percentageBuilder += Stat.age38}
                39 -> {percentageBuilder += Stat.age39}
                40 -> {percentageBuilder += Stat.age40}
                41 -> {percentageBuilder += Stat.age41}
                42 -> {percentageBuilder += Stat.age42}
                43 -> {percentageBuilder += Stat.age43}
                44 -> {percentageBuilder += Stat.age44}
                45 -> {percentageBuilder += Stat.age45}
                46 -> {percentageBuilder += Stat.age46}
                47 -> {percentageBuilder += Stat.age47}
                48 -> {percentageBuilder += Stat.age48}
                49 -> {percentageBuilder += Stat.age49}
                50 -> {percentageBuilder += Stat.age50}
                51 -> {percentageBuilder += Stat.age51}
                52 -> {percentageBuilder += Stat.age52}
                53 -> {percentageBuilder += Stat.age53}
                54 -> {percentageBuilder += Stat.age54}
                55 -> {percentageBuilder += Stat.age55}
                56 -> {percentageBuilder += Stat.age56}
                57 -> {percentageBuilder += Stat.age57}
                58 -> {percentageBuilder += Stat.age58}
                59 -> {percentageBuilder += Stat.age59}
                60 -> {percentageBuilder += Stat.age60}
                61 -> {percentageBuilder += Stat.age61}
                62 -> {percentageBuilder += Stat.age62}
                63 -> {percentageBuilder += Stat.age63}
                64 -> {percentageBuilder += Stat.age64}
                65 -> {percentageBuilder += Stat.age65}
                66 -> {percentageBuilder += Stat.age66}
                67 -> {percentageBuilder += Stat.age67}
                68 -> {percentageBuilder += Stat.age68}
                69 -> {percentageBuilder += Stat.age69}
                70 -> {percentageBuilder += Stat.age70}
                71 -> {percentageBuilder += Stat.age71}
                72 -> {percentageBuilder += Stat.age72}
                73 -> {percentageBuilder += Stat.age73}
                74 -> {percentageBuilder += Stat.age74}
                75 -> {percentageBuilder += Stat.age75}
                76 -> {percentageBuilder += Stat.age76}
                77 -> {percentageBuilder += Stat.age77}
                78 -> {percentageBuilder += Stat.age78}
                79 -> {percentageBuilder += Stat.age79}
                80 -> {percentageBuilder += Stat.age80}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.bmi != null) {
            val iterator = Pref.bmi!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.bmiA}
                    "b" -> {percentageBuilder += Stat.bmiB}
                    "c" -> {percentageBuilder += Stat.bmiC}
                    "d" -> {percentageBuilder += Stat.bmiD}
                    "e" -> {percentageBuilder += Stat.bmiE}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.easy != null) {
            val iterator = Pref.easy!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.easyA}
                    "b" -> {percentageBuilder += Stat.easyB}
                    "c" -> {percentageBuilder += Stat.easyC}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.minHeight != null && Pref.maxHeight != null) {
            var percentageBuilder  = 0
            for (it in Pref.minHeight!!..Pref.maxHeight!!){when (it) {
                120 -> {percentageBuilder += Stat.height120}
                121 -> {percentageBuilder += Stat.height121}
                122 -> {percentageBuilder += Stat.height122}
                123 -> {percentageBuilder += Stat.height123}
                124 -> {percentageBuilder += Stat.height124}
                125 -> {percentageBuilder += Stat.height125}
                126 -> {percentageBuilder += Stat.height126}
                127 -> {percentageBuilder += Stat.height127}
                128 -> {percentageBuilder += Stat.height128}
                129 -> {percentageBuilder += Stat.height129}
                130 -> {percentageBuilder += Stat.height130}
                131 -> {percentageBuilder += Stat.height131}
                132 -> {percentageBuilder += Stat.height132}
                133 -> {percentageBuilder += Stat.height133}
                134 -> {percentageBuilder += Stat.height134}
                135 -> {percentageBuilder += Stat.height135}
                136 -> {percentageBuilder += Stat.height136}
                137 -> {percentageBuilder += Stat.height137}
                138 -> {percentageBuilder += Stat.height138}
                139 -> {percentageBuilder += Stat.height139}
                140 -> {percentageBuilder += Stat.height140}
                141 -> {percentageBuilder += Stat.height141}
                142 -> {percentageBuilder += Stat.height142}
                143 -> {percentageBuilder += Stat.height143}
                144 -> {percentageBuilder += Stat.height144}
                145 -> {percentageBuilder += Stat.height145}
                146 -> {percentageBuilder += Stat.height146}
                147 -> {percentageBuilder += Stat.height147}
                148 -> {percentageBuilder += Stat.height148}
                149 -> {percentageBuilder += Stat.height149}
                150 -> {percentageBuilder += Stat.height150}
                151 -> {percentageBuilder += Stat.height151}
                152 -> {percentageBuilder += Stat.height152}
                153 -> {percentageBuilder += Stat.height153}
                154 -> {percentageBuilder += Stat.height154}
                155 -> {percentageBuilder += Stat.height155}
                156 -> {percentageBuilder += Stat.height156}
                157 -> {percentageBuilder += Stat.height157}
                158 -> {percentageBuilder += Stat.height158}
                159 -> {percentageBuilder += Stat.height159}
                160 -> {percentageBuilder += Stat.height160}
                161 -> {percentageBuilder += Stat.height161}
                162 -> {percentageBuilder += Stat.height162}
                163 -> {percentageBuilder += Stat.height163}
                164 -> {percentageBuilder += Stat.height164}
                165 -> {percentageBuilder += Stat.height165}
                166 -> {percentageBuilder += Stat.height166}
                167 -> {percentageBuilder += Stat.height167}
                168 -> {percentageBuilder += Stat.height168}
                169 -> {percentageBuilder += Stat.height169}
                170 -> {percentageBuilder += Stat.height170}
                171 -> {percentageBuilder += Stat.height171}
                172 -> {percentageBuilder += Stat.height172}
                173 -> {percentageBuilder += Stat.height173}
                174 -> {percentageBuilder += Stat.height174}
                175 -> {percentageBuilder += Stat.height175}
                176 -> {percentageBuilder += Stat.height176}
                177 -> {percentageBuilder += Stat.height177}
                178 -> {percentageBuilder += Stat.height178}
                179 -> {percentageBuilder += Stat.height179}
                180 -> {percentageBuilder += Stat.height180}
                181 -> {percentageBuilder += Stat.height181}
                182 -> {percentageBuilder += Stat.height182}
                183 -> {percentageBuilder += Stat.height183}
                184 -> {percentageBuilder += Stat.height184}
                185 -> {percentageBuilder += Stat.height185}
                186 -> {percentageBuilder += Stat.height186}
                187 -> {percentageBuilder += Stat.height187}
                188 -> {percentageBuilder += Stat.height188}
                189 -> {percentageBuilder += Stat.height189}
                190 -> {percentageBuilder += Stat.height190}
                191 -> {percentageBuilder += Stat.height191}
                192 -> {percentageBuilder += Stat.height192}
                193 -> {percentageBuilder += Stat.height193}
                194 -> {percentageBuilder += Stat.height194}
                195 -> {percentageBuilder += Stat.height195}
                196 -> {percentageBuilder += Stat.height196}
                197 -> {percentageBuilder += Stat.height197}
                198 -> {percentageBuilder += Stat.height198}
                199 -> {percentageBuilder += Stat.height199}
                200 -> {percentageBuilder += Stat.height200}
                201 -> {percentageBuilder += Stat.height201}
                202 -> {percentageBuilder += Stat.height202}
                203 -> {percentageBuilder += Stat.height203}
                204 -> {percentageBuilder += Stat.height204}
                205 -> {percentageBuilder += Stat.height205}
                206 -> {percentageBuilder += Stat.height206}
                207 -> {percentageBuilder += Stat.height207}
                208 -> {percentageBuilder += Stat.height208}
                209 -> {percentageBuilder += Stat.height209}
                210 -> {percentageBuilder += Stat.height210}
                211 -> {percentageBuilder += Stat.height211}
                212 -> {percentageBuilder += Stat.height212}
                213 -> {percentageBuilder += Stat.height213}
                214 -> {percentageBuilder += Stat.height214}
                215 -> {percentageBuilder += Stat.height215}
                216 -> {percentageBuilder += Stat.height216}
                217 -> {percentageBuilder += Stat.height217}
                218 -> {percentageBuilder += Stat.height218}
                219 -> {percentageBuilder += Stat.height219}
                220 -> {percentageBuilder += Stat.height220}}}
            if (percentageBuilder > 100000) {percentageBuilder = 100000}
            if (percentageBuilder != 0) {percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        }
        if (Pref.income != null) {
            val iterator = Pref.income!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.incomeA}
                    "b" -> {percentageBuilder += Stat.incomeB}
                    "c" -> {percentageBuilder += Stat.incomeC}
                    "d" -> {percentageBuilder += Stat.incomeD}
                    "e" -> {percentageBuilder += Stat.incomeE}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.reputationScore != 0) {
            var percentageBuilder  = 0
            when (Pref.reputationScore /100) {
                1 -> {percentageBuilder += Stat.reputationScore1}
                2 -> {percentageBuilder += Stat.reputationScore2}
                3 -> {percentageBuilder += Stat.reputationScore3}
                4 -> {percentageBuilder += Stat.reputationScore4}
                5 -> {percentageBuilder += Stat.reputationScore5}
                6 -> {percentageBuilder += Stat.reputationScore6}
                7 -> {percentageBuilder += Stat.reputationScore7}
                8 -> {percentageBuilder += Stat.reputationScore8}
                9 -> {percentageBuilder += Stat.reputationScore9}
                10 -> {percentageBuilder += Stat.reputationScore10}
                11 -> {percentageBuilder += Stat.reputationScore11}
                12 -> {percentageBuilder += Stat.reputationScore12}
                13 -> {percentageBuilder += Stat.reputationScore13}
                14 -> {percentageBuilder += Stat.reputationScore14}
                15 -> {percentageBuilder += Stat.reputationScore15}
                16 -> {percentageBuilder += Stat.reputationScore16}
                17 -> {percentageBuilder += Stat.reputationScore17}
                18 -> {percentageBuilder += Stat.reputationScore18}
                19 -> {percentageBuilder += Stat.reputationScore19}
                20 -> {percentageBuilder += Stat.reputationScore20}
                21 -> {percentageBuilder += Stat.reputationScore21}
                22 -> {percentageBuilder += Stat.reputationScore22}
                23 -> {percentageBuilder += Stat.reputationScore23}
                24 -> {percentageBuilder += Stat.reputationScore24}
                25 -> {percentageBuilder += Stat.reputationScore25}
                26 -> {percentageBuilder += Stat.reputationScore26}
                27 -> {percentageBuilder += Stat.reputationScore27}
                28 -> {percentageBuilder += Stat.reputationScore28}
                29 -> {percentageBuilder += Stat.reputationScore29}
                30 -> {percentageBuilder += Stat.reputationScore30}
                31 -> {percentageBuilder += Stat.reputationScore31}
                32 -> {percentageBuilder += Stat.reputationScore32}
                33 -> {percentageBuilder += Stat.reputationScore33}
                34 -> {percentageBuilder += Stat.reputationScore34}
                35 -> {percentageBuilder += Stat.reputationScore35}
                36 -> {percentageBuilder += Stat.reputationScore36}
                37 -> {percentageBuilder += Stat.reputationScore37}
                38 -> {percentageBuilder += Stat.reputationScore38}
                39 -> {percentageBuilder += Stat.reputationScore39}
                40 -> {percentageBuilder += Stat.reputationScore40}
                41 -> {percentageBuilder += Stat.reputationScore41}
                42 -> {percentageBuilder += Stat.reputationScore42}
                43 -> {percentageBuilder += Stat.reputationScore43}
                44 -> {percentageBuilder += Stat.reputationScore44}
                45 -> {percentageBuilder += Stat.reputationScore45}
                46 -> {percentageBuilder += Stat.reputationScore46}
                47 -> {percentageBuilder += Stat.reputationScore47}
                48 -> {percentageBuilder += Stat.reputationScore48}
                49 -> {percentageBuilder += Stat.reputationScore49}
                50 -> {percentageBuilder += Stat.reputationScore50}
                51 -> {percentageBuilder += Stat.reputationScore51}
                52 -> {percentageBuilder += Stat.reputationScore52}
                53 -> {percentageBuilder += Stat.reputationScore53}
                54 -> {percentageBuilder += Stat.reputationScore54}
                55 -> {percentageBuilder += Stat.reputationScore55}
                56 -> {percentageBuilder += Stat.reputationScore56}
                57 -> {percentageBuilder += Stat.reputationScore57}
                58 -> {percentageBuilder += Stat.reputationScore58}
                59 -> {percentageBuilder += Stat.reputationScore59}
                60 -> {percentageBuilder += Stat.reputationScore60}
                61 -> {percentageBuilder += Stat.reputationScore61}
                62 -> {percentageBuilder += Stat.reputationScore62}
                63 -> {percentageBuilder += Stat.reputationScore63}
                64 -> {percentageBuilder += Stat.reputationScore64}
                65 -> {percentageBuilder += Stat.reputationScore65}
                66 -> {percentageBuilder += Stat.reputationScore66}
                67 -> {percentageBuilder += Stat.reputationScore67}
                68 -> {percentageBuilder += Stat.reputationScore68}
                69 -> {percentageBuilder += Stat.reputationScore69}
                70 -> {percentageBuilder += Stat.reputationScore70}
                71 -> {percentageBuilder += Stat.reputationScore71}
                72 -> {percentageBuilder += Stat.reputationScore72}
                73 -> {percentageBuilder += Stat.reputationScore73}
                74 -> {percentageBuilder += Stat.reputationScore74}
                75 -> {percentageBuilder += Stat.reputationScore75}
                76 -> {percentageBuilder += Stat.reputationScore76}
                77 -> {percentageBuilder += Stat.reputationScore77}
                78 -> {percentageBuilder += Stat.reputationScore78}
                79 -> {percentageBuilder += Stat.reputationScore79}
                80 -> {percentageBuilder += Stat.reputationScore80}
                81 -> {percentageBuilder += Stat.reputationScore81}
                82 -> {percentageBuilder += Stat.reputationScore82}
                83 -> {percentageBuilder += Stat.reputationScore83}
                84 -> {percentageBuilder += Stat.reputationScore84}
                85 -> {percentageBuilder += Stat.reputationScore85}
                86 -> {percentageBuilder += Stat.reputationScore86}
                87 -> {percentageBuilder += Stat.reputationScore87}
                88 -> {percentageBuilder += Stat.reputationScore88}
                89 -> {percentageBuilder += Stat.reputationScore89}
                90 -> {percentageBuilder += Stat.reputationScore90}
                91 -> {percentageBuilder += Stat.reputationScore91}
                92 -> {percentageBuilder += Stat.reputationScore92}
                93 -> {percentageBuilder += Stat.reputationScore93}
                94 -> {percentageBuilder += Stat.reputationScore94}
                95 -> {percentageBuilder += Stat.reputationScore95}
                96 -> {percentageBuilder += Stat.reputationScore96}
                97 -> {percentageBuilder += Stat.reputationScore97}
                98 -> {percentageBuilder += Stat.reputationScore98}
                99 -> {percentageBuilder += Stat.reputationScore99}
                100 -> {percentageBuilder += Stat.reputationScore100}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)
        }
        val numberOfUsers : Int = ((Stat.users.toString().toFloat()/100.000F)*percentage).toInt()
        var percentageString = ((percentage * 10000.0f).roundToInt().toFloat() / 10000.0f).toString()
        val check = percentageString.contains("E")
        if (check) {percentageString = "0.001"}
        progressText.text = "~" + numberOfUsers + "~" + percentageString + "%~"
    }
    fun setFocusProfileMenu(context: Context, photoBack : ImageView, photoIcon : ImageView, photoText : TextView, easyBack : ImageView, easyIcon : ImageView, easyText : TextView, bioBack : ImageView, bioIcon : ImageView, bioText : TextView, childrenBack : ImageView, childrenIcon : ImageView, childrenText : TextView, travelBack : ImageView, travelIcon : ImageView, travelText : TextView, heightBack : ImageView, heightIcon : ImageView, heightText : TextView, petBack : ImageView, petIcon : ImageView, petText : TextView, musicBack : ImageView, musicIcon : ImageView, musicText : TextView, foodBack : ImageView, foodIcon : ImageView, foodText : TextView, politicalBack : ImageView, politicalIcon : ImageView, politicalText : TextView, educationBack : ImageView, educationIcon : ImageView, educationText : TextView, languageBack : ImageView, languageIcon : ImageView, languageText : TextView, employmentBack : ImageView, employmentIcon : ImageView, employmentText : TextView, incomeBack : ImageView, incomeIcon : ImageView, incomeText : TextView, viewsBack : ImageView, viewsIcon : ImageView, viewsText : TextView, drinkBack : ImageView, drinkIcon : ImageView, drinkText : TextView, smokeBack : ImageView, smokeIcon : ImageView, smokeText : TextView, drugsBack : ImageView, drugsIcon : ImageView, drugsText : TextView, raceBack : ImageView, raceIcon : ImageView, raceText : TextView, religionBack : ImageView, religionIcon : ImageView, religionText : TextView, relationshipBack : ImageView, relationshipIcon : ImageView, relationshipText : TextView, photoToDo : TextView, easyToDo : TextView, bioToDo : TextView, childrenToDo : TextView, travelToDo : TextView, heightToDo : TextView, petToDo : TextView, musicToDo : TextView, foodToDo : TextView, politicalToDo : TextView, educationToDo : TextView, languageToDo : TextView, employmentToDo : TextView, incomeToDo : TextView, viewsToDo : TextView, drinkToDo : TextView, drugsToDo : TextView, smokeToDo : TextView, raceToDo : TextView, religionToDo : TextView,){
        //get focus colour
        val colorGetter = TypedValue();context.theme.resolveAttribute(com.google.android.material.R.attr.colorOnBackground, colorGetter, true);val colorFocused = colorGetter.data
        //set focus
        if(! Info.photoBody|| ! Info.photoFace){
            photoBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            photoIcon.setImageResource(R.drawable.icon_photo)
            photoText.setTextColor(colorFocused)}
        if(Info.easy == null){
            easyBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            easyIcon.setImageResource(R.drawable.icon_easy)
            easyText.setTextColor(colorFocused)}
        if(Info.bio == null||Info.bio !!.contains("**ADMIN MODERATED THIS BIOGRAPHY**")){
            bioBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            bioIcon.setImageResource(R.drawable.icon_bio)
            bioText.setTextColor(colorFocused)}
        if(Info.children == null){
            childrenBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            childrenIcon.setImageResource(R.drawable.icon_children)
            childrenText.setTextColor(colorFocused)}
        if(Info.travel == null){
            travelBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            travelIcon.setImageResource(R.drawable.icon_travel)
            travelText.setTextColor(colorFocused)}
        if(Info.bmi == null){
            heightBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            heightIcon.setImageResource(R.drawable.icon_height)
            heightText.setTextColor(colorFocused)}
        if(Info.pet == null){
            petBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            petIcon.setImageResource(R.drawable.icon_pet)
            petText.setTextColor(colorFocused)}
        if(Info.music == null){
            musicBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            musicIcon.setImageResource(R.drawable.icon_music)
            musicText.setTextColor(colorFocused)}
        if(Info.food == null){
            foodBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            foodIcon.setImageResource(R.drawable.icon_food)
            foodText.setTextColor(colorFocused)}
        if(Info.political == null){
            politicalBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            politicalIcon.setImageResource(R.drawable.icon_political)
            politicalText.setTextColor(colorFocused)}
        if(Info.education == null){
            educationBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            educationIcon.setImageResource(R.drawable.icon_education)
            educationText.setTextColor(colorFocused)}
        if(Info.languageTwo == null){
            languageBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            languageIcon.setImageResource(R.drawable.icon_language)
            languageText.setTextColor(colorFocused)}
        if(Info.employment == null){
            employmentBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            employmentIcon.setImageResource(R.drawable.icon_employment)
            employmentText.setTextColor(colorFocused)}
        if(Info.income == null){
            incomeBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            incomeIcon.setImageResource(R.drawable.icon_income)
            incomeText.setTextColor(colorFocused)}
        if(Info.views == null){
            viewsBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            viewsIcon.setImageResource(R.drawable.icon_views)
            viewsText.setTextColor(colorFocused)}
        if(Info.drink == null){
            drinkBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            drinkIcon.setImageResource(R.drawable.icon_drink)
            drinkText.setTextColor(colorFocused)}
        if(Info.smoke == null){
            smokeBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            smokeIcon.setImageResource(R.drawable.icon_smoke)
            smokeText.setTextColor(colorFocused)}
        if(Info.drugs == null){
            drugsBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            drugsIcon.setImageResource(R.drawable.icon_drug)
            drugsText.setTextColor(colorFocused)}
        if(Info.race == null){
            raceBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            raceIcon.setImageResource(R.drawable.icon_race)
            raceText.setTextColor(colorFocused)}
        if(Info.religion == null){
            religionBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            religionIcon.setImageResource(R.drawable.icon_religion)
            religionText.setTextColor(colorFocused)}
        if(Info.relationship == null){
            relationshipBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            relationshipIcon.setImageResource(R.drawable.icon_relationship)
            relationshipText.setTextColor(colorFocused)}
        //set To-Do button
        if(Info.bio == null||Info.bio !!.contains("**ADMIN MODERATED THIS BIOGRAPHY**")) {bioToDo.visibility = View.VISIBLE}
        else if (Info.easy == null) {easyToDo.visibility = View.VISIBLE}
        else if (! Info.photoFace || ! Info.photoBody) {photoToDo.visibility = View.VISIBLE}
        else if (Info.children == null) {childrenToDo.visibility = View.VISIBLE}
        else if (Info.languageTwo == null) {languageToDo.visibility = View.VISIBLE}
        else if (Info.drink == null) {drinkToDo.visibility = View.VISIBLE}
        else if (Info.bmi == null) {heightToDo.visibility = View.VISIBLE}
        else if (Info.smoke == null) {smokeToDo.visibility = View.VISIBLE}
        else if (Info.drugs == null) {drugsToDo.visibility = View.VISIBLE}
        else if (Info.race == null) {raceToDo.visibility = View.VISIBLE}
        else if (Info.employment == null) {employmentToDo.visibility = View.VISIBLE}
        else if (Info.income == null) {incomeToDo.visibility = View.VISIBLE}
        else if (Info.travel == null) {travelToDo.visibility = View.VISIBLE}
        else if (Info.religion == null) {religionToDo.visibility = View.VISIBLE}
        else if (Info.pet == null) {petToDo.visibility = View.VISIBLE}
        else if (Info.political == null) {politicalToDo.visibility = View.VISIBLE}
        else if (Info.education == null) {educationToDo.visibility = View.VISIBLE}
        else if (Info.music == null) {musicToDo.visibility = View.VISIBLE}
        else if (Info.food == null) {foodToDo.visibility = View.VISIBLE}
        else if (Info.views == null) {viewsToDo.visibility = View.VISIBLE}
    }
    fun setFocusSwipePreferencesMenu(context : Context, incomeBack : ImageView, incomeIcon : ImageView, incomeText : TextView, heightBack : ImageView, heightIcon : ImageView, heightText : TextView, ageBack : ImageView, ageIcon : ImageView, ageText : TextView, bmiBack : ImageView, bmiIcon : ImageView, bmiText : TextView, easyBack : ImageView, easyIcon : ImageView, easyText : TextView, travelBack : ImageView, travelIcon : ImageView, travelText : TextView, drugsBack : ImageView, drugsIcon : ImageView, drugsText : TextView, drinkBack : ImageView, drinkIcon : ImageView, drinkText : TextView, educationBack : ImageView, educationIcon : ImageView, educationText : TextView, smokeBack : ImageView, smokeIcon : ImageView, smokeText : TextView, foodBack : ImageView, foodIcon : ImageView, foodText : TextView, relationshipBack : ImageView, relationshipIcon : ImageView, relationshipText : TextView, childrenBack : ImageView, childrenIcon : ImageView, childrenText : TextView, petBack : ImageView, petIcon : ImageView, petText : TextView, politicalBack : ImageView, politicalIcon : ImageView, politicalText : TextView, religionBack : ImageView, religionIcon : ImageView, religionText : TextView, employmentBack : ImageView, employmentIcon : ImageView, employmentText : TextView, languageBack : ImageView, languageIcon : ImageView, languageText : TextView, raceBack : ImageView, raceIcon : ImageView, raceText : TextView, viewsBack : ImageView, viewsIcon : ImageView, viewsText : TextView, stats : TextView, repBack : ImageView, repIcon : ImageView, repText : TextView){
        //get focus colour
        val colorGetter = TypedValue();context.theme.resolveAttribute(com.google.android.material.R.attr.colorOnBackground, colorGetter, true);val colorFocused = colorGetter.data
        //set focus
        if (Pref.race == null) {
            raceBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            raceIcon.setImageResource(R.drawable.icon_race)
            raceText.setTextColor(colorFocused)}
        if (Pref.income == null) {
            incomeBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            incomeIcon.setImageResource(R.drawable.icon_income)
            incomeText.setTextColor(colorFocused)}
        if(Pref.minHeight == null || Pref.maxHeight == null){
            heightBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            heightIcon.setImageResource(R.drawable.icon_height)
            heightText.setTextColor(colorFocused)}
        if(Pref.minAge == null || Pref.maxAge == null ){
            ageBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            ageIcon.setImageResource(R.drawable.icon_age)
            ageText.setTextColor(colorFocused)}
        if(Pref.bmi == null || Pref.bmi == null ){
            bmiBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            bmiIcon.setImageResource(R.drawable.icon_body)
            bmiText.setTextColor(colorFocused)}
        if(Pref.easy == null ){
            easyBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            easyIcon.setImageResource(R.drawable.icon_easy)
            easyText.setTextColor(colorFocused)}
        if(Pref.travel == null ){
            travelBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            travelIcon.setImageResource(R.drawable.icon_travel)
            travelText.setTextColor(colorFocused)}
        if(Pref.drugs == null ){
            drugsBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            drugsIcon.setImageResource(R.drawable.icon_drug)
            drugsText.setTextColor(colorFocused)}
        if(Pref.drink == null ){
            drinkBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            drinkIcon.setImageResource(R.drawable.icon_drink)
            drinkText.setTextColor(colorFocused)}
        if(Pref.education == null ){
            educationBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            educationIcon.setImageResource(R.drawable.icon_education)
            educationText.setTextColor(colorFocused)}
        if(Pref.smoke == null ){
            smokeBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            smokeIcon.setImageResource(R.drawable.icon_smoke)
            smokeText.setTextColor(colorFocused)}
        if(Pref.food == null ){
            foodBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            foodIcon.setImageResource(R.drawable.icon_food)
            foodText.setTextColor(colorFocused)}
        if(Pref.relationship == null ){
            relationshipBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            relationshipIcon.setImageResource(R.drawable.icon_relationship)
            relationshipText.setTextColor(colorFocused)}
        if(Pref.children == null ){
            childrenBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            childrenIcon.setImageResource(R.drawable.icon_children)
            childrenText.setTextColor(colorFocused)}
        if(Pref.pet == null){
            petBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            petIcon.setImageResource(R.drawable.icon_pet)
            petText.setTextColor(colorFocused)}
        if(Pref.political == null){
            politicalBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            politicalIcon.setImageResource(R.drawable.icon_political)
            politicalText.setTextColor(colorFocused)}
        if(Pref.religion == null){
            religionBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            religionIcon.setImageResource(R.drawable.icon_religion)
            religionText.setTextColor(colorFocused)}
        if(Pref.employment == null){
            employmentBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            employmentIcon.setImageResource(R.drawable.icon_employment)
            employmentText.setTextColor(colorFocused)}
        if(Pref.language == null || Pref.language!!.isEmpty()){
            languageBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            languageIcon.setImageResource(R.drawable.icon_language)
            languageText.setTextColor(colorFocused)}
        if(Pref.views == null){
            viewsBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            viewsIcon.setImageResource(R.drawable.icon_views)
            viewsText.setTextColor(colorFocused)}
        if(Pref.reputationScore == 0){
            repBack.setImageResource(R.drawable.layout_menu_button_background_focused)
            repIcon.setImageResource(R.drawable.icon_rating)
            repText.setTextColor(colorFocused)}
        //calculate percentage to .3 decimal places
        var percentage = 100.000f
        percentage =
            when (Info.orientation) {
                "a" -> {
                    (percentage/100.000f)*(Stat.genderA.toFloat()/1000)
                }
                "b" -> {
                    (percentage/100.000f)*(Stat.genderB.toFloat()/1000)
                }
                "c" -> {
                    (percentage/100.000f)*((Stat.genderA + Stat.genderB.toFloat())/1000)
                }
                else -> {
                    (percentage/100.000f)*100.000f
                }}
        if (Pref.language != null) {val iterator = Pref.language!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "af" -> {percentageBuilder += Stat.languageAF}
                    "ar" -> {percentageBuilder += Stat.languageAR}
                    "be" -> {percentageBuilder += Stat.languageBE}
                    "bg" -> {percentageBuilder += Stat.languageBG}
                    "bn" -> {percentageBuilder += Stat.languageBN}
                    "ca" -> {percentageBuilder += Stat.languageCA}
                    "cs" -> {percentageBuilder += Stat.languageCS}
                    "cy" -> {percentageBuilder += Stat.languageCY}
                    "da" -> {percentageBuilder += Stat.languageDA}
                    "de" -> {percentageBuilder += Stat.languageDE}
                    "el" -> {percentageBuilder += Stat.languageEL}
                    "en" -> {percentageBuilder += Stat.languageEN}
                    "eo" -> {percentageBuilder += Stat.languageEO}
                    "es" -> {percentageBuilder += Stat.languageES}
                    "et" -> {percentageBuilder += Stat.languageET}
                    "fa" -> {percentageBuilder += Stat.languageFA}
                    "fi" -> {percentageBuilder += Stat.languageFI}
                    "fr" -> {percentageBuilder += Stat.languageFR}
                    "ga" -> {percentageBuilder += Stat.languageGA}
                    "gl" -> {percentageBuilder += Stat.languageGL}
                    "gu" -> {percentageBuilder += Stat.languageGU}
                    "he" -> {percentageBuilder += Stat.languageHE}
                    "hi" -> {percentageBuilder += Stat.languageHI}
                    "hr" -> {percentageBuilder += Stat.languageHR}
                    "ht" -> {percentageBuilder += Stat.languageHT}
                    "hu" -> {percentageBuilder += Stat.languageHU}
                    "id" -> {percentageBuilder += Stat.languageID}
                    "is" -> {percentageBuilder += Stat.languageIS}
                    "it" -> {percentageBuilder += Stat.languageIT}
                    "ja" -> {percentageBuilder += Stat.languageJA}
                    "ka" -> {percentageBuilder += Stat.languageKA}
                    "kn" -> {percentageBuilder += Stat.languageKN}
                    "ko" -> {percentageBuilder += Stat.languageKO}
                    "lt" -> {percentageBuilder += Stat.languageLT}
                    "lv" -> {percentageBuilder += Stat.languageLV}
                    "mk" -> {percentageBuilder += Stat.languageMK}
                    "mr" -> {percentageBuilder += Stat.languageMR}
                    "ms" -> {percentageBuilder += Stat.languageMS}
                    "mt" -> {percentageBuilder += Stat.languageMT}
                    "nl" -> {percentageBuilder += Stat.languageNL}
                    "no" -> {percentageBuilder += Stat.languageNO}
                    "pl" -> {percentageBuilder += Stat.languagePL}
                    "pt" -> {percentageBuilder += Stat.languagePT}
                    "ro" -> {percentageBuilder += Stat.languageRO}
                    "ru" -> {percentageBuilder += Stat.languageRU}
                    "sk" -> {percentageBuilder += Stat.languageSK}
                    "sl" -> {percentageBuilder += Stat.languageSL}
                    "sq" -> {percentageBuilder += Stat.languageSQ}
                    "sv" -> {percentageBuilder += Stat.languageSV}
                    "sw" -> {percentageBuilder += Stat.languageSW}
                    "ta" -> {percentageBuilder += Stat.languageTA}
                    "te" -> {percentageBuilder += Stat.languageTE}
                    "th" -> {percentageBuilder += Stat.languageTH}
                    "tr" -> {percentageBuilder += Stat.languageTR}
                    "uk" -> {percentageBuilder += Stat.languageUK}
                    "ur" -> {percentageBuilder += Stat.languageUR}
                    "vi" -> {percentageBuilder += Stat.languageVI}
                    "zh" -> {percentageBuilder += Stat.languageZH}};percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}}
        if (Pref.employment != null) {
            val iterator = Pref.employment!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.employmentA}
                    "b" -> {percentageBuilder += Stat.employmentB}
                    "c" -> {percentageBuilder += Stat.employmentC}
                    "d" -> {percentageBuilder += Stat.employmentD}
                    "e" -> {percentageBuilder += Stat.employmentE}
                    "f" -> {percentageBuilder += Stat.employmentF}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.religion != null) {
            val iterator = Pref.religion!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.religionA}
                    "b" -> {percentageBuilder += Stat.religionB}
                    "c" -> {percentageBuilder += Stat.religionC}
                    "d" -> {percentageBuilder += Stat.religionD}
                    "e" -> {percentageBuilder += Stat.religionE}
                    "f" -> {percentageBuilder += Stat.religionF}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.political != null) {
            val iterator = Pref.political!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.politicalA}
                    "b" -> {percentageBuilder += Stat.politicalB}
                    "c" -> {percentageBuilder += Stat.politicalC}
                    "d" -> {percentageBuilder += Stat.politicalD}
                    "e" -> {percentageBuilder += Stat.politicalE}
                    "f" -> {percentageBuilder += Stat.politicalF}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.pet != null) {
            val iterator = Pref.pet!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.petA}
                    "b" -> {percentageBuilder += Stat.petB}
                    "c" -> {percentageBuilder += Stat.petC}
                    "d" -> {percentageBuilder += Stat.petD}
                    "e" -> {percentageBuilder += Stat.petE}
                    "f" -> {percentageBuilder += Stat.petF}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.children != null) {
            val iterator = Pref.children!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.childrenA}
                    "b" -> {percentageBuilder += Stat.childrenB}
                    "c" -> {percentageBuilder += Stat.childrenC}
                    "d" -> {percentageBuilder += Stat.childrenD}
                    "e" -> {percentageBuilder += Stat.childrenE}
                    "f" -> {percentageBuilder += Stat.childrenF}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.relationship != null) {
            val iterator = Pref.relationship!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.relationshipA}
                    "b" -> {percentageBuilder += Stat.relationshipB}
                    "c" -> {percentageBuilder += Stat.relationshipC}
                    "d" -> {percentageBuilder += Stat.relationshipD}
                    "e" -> {percentageBuilder += Stat.relationshipE}
                    "f" -> {percentageBuilder += Stat.relationshipF}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.food != null) {
            val iterator = Pref.food!!.iterator()
            var percentageBuilder = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.foodA}
                    "b" -> {percentageBuilder += Stat.foodB}
                    "c" -> {percentageBuilder += Stat.foodC}
                    "d" -> {percentageBuilder += Stat.foodD}
                    "e" -> {percentageBuilder += Stat.foodE}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.smoke != null) {
            val iterator = Pref.smoke!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.smokeA}
                    "b" -> {percentageBuilder += Stat.smokeB}
                    "c" -> {percentageBuilder += Stat.smokeC}
                    "d" -> {percentageBuilder += Stat.smokeD}
                    "e" -> {percentageBuilder += Stat.smokeE}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.education != null) {
            val iterator = Pref.education!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.educationA}
                    "b" -> {percentageBuilder += Stat.educationB}
                    "c" -> {percentageBuilder += Stat.educationC}
                    "d" -> {percentageBuilder += Stat.educationD}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.drink != null) {
            val iterator = Pref.drink!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.drinkA}
                    "b" -> {percentageBuilder += Stat.drinkB}
                    "c" -> {percentageBuilder += Stat.drinkC}
                    "d" -> {percentageBuilder += Stat.drinkD}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.drugs != null) {
            val iterator = Pref.drugs!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.drugsA}
                    "b" -> {percentageBuilder += Stat.drugsB}
                    "c" -> {percentageBuilder += Stat.drugsC}
                    "d" -> {percentageBuilder += Stat.drugsD}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.travel != null) {
            val iterator = Pref.travel!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.travelA}
                    "b" -> {percentageBuilder += Stat.travelB}
                    "c" -> {percentageBuilder += Stat.travelC}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.minAge != null && Pref.maxAge != null) {
            var percentageBuilder  = 0
            for (it in Pref.minAge!!..Pref.maxAge!!){when (it) {
                18 -> {percentageBuilder += Stat.age18}
                19 -> {percentageBuilder += Stat.age19}
                20 -> {percentageBuilder += Stat.age20}
                21 -> {percentageBuilder += Stat.age18}
                22 -> {percentageBuilder += Stat.age19}
                23 -> {percentageBuilder += Stat.age20}
                24 -> {percentageBuilder += Stat.age18}
                25 -> {percentageBuilder += Stat.age19}
                26 -> {percentageBuilder += Stat.age20}
                27 -> {percentageBuilder += Stat.age18}
                28 -> {percentageBuilder += Stat.age19}
                29 -> {percentageBuilder += Stat.age20}
                30 -> {percentageBuilder += Stat.age20}
                31 -> {percentageBuilder += Stat.age18}
                32 -> {percentageBuilder += Stat.age19}
                33 -> {percentageBuilder += Stat.age20}
                34 -> {percentageBuilder += Stat.age18}
                35 -> {percentageBuilder += Stat.age19}
                36 -> {percentageBuilder += Stat.age20}
                37 -> {percentageBuilder += Stat.age18}
                38 -> {percentageBuilder += Stat.age19}
                39 -> {percentageBuilder += Stat.age20}
                40 -> {percentageBuilder += Stat.age20}
                41 -> {percentageBuilder += Stat.age18}
                42 -> {percentageBuilder += Stat.age19}
                43 -> {percentageBuilder += Stat.age20}
                44 -> {percentageBuilder += Stat.age18}
                45 -> {percentageBuilder += Stat.age19}
                46 -> {percentageBuilder += Stat.age20}
                47 -> {percentageBuilder += Stat.age18}
                48 -> {percentageBuilder += Stat.age19}
                49 -> {percentageBuilder += Stat.age20}
                50 -> {percentageBuilder += Stat.age20}
                51 -> {percentageBuilder += Stat.age18}
                52 -> {percentageBuilder += Stat.age19}
                53 -> {percentageBuilder += Stat.age20}
                54 -> {percentageBuilder += Stat.age18}
                55 -> {percentageBuilder += Stat.age19}
                56 -> {percentageBuilder += Stat.age20}
                57 -> {percentageBuilder += Stat.age18}
                58 -> {percentageBuilder += Stat.age19}
                59 -> {percentageBuilder += Stat.age20}
                60 -> {percentageBuilder += Stat.age20}
                61 -> {percentageBuilder += Stat.age18}
                62 -> {percentageBuilder += Stat.age19}
                63 -> {percentageBuilder += Stat.age20}
                64 -> {percentageBuilder += Stat.age18}
                65 -> {percentageBuilder += Stat.age19}
                66 -> {percentageBuilder += Stat.age20}
                67 -> {percentageBuilder += Stat.age18}
                68 -> {percentageBuilder += Stat.age19}
                69 -> {percentageBuilder += Stat.age20}
                70 -> {percentageBuilder += Stat.age20}
                71 -> {percentageBuilder += Stat.age18}
                72 -> {percentageBuilder += Stat.age19}
                73 -> {percentageBuilder += Stat.age20}
                74 -> {percentageBuilder += Stat.age18}
                75 -> {percentageBuilder += Stat.age19}
                76 -> {percentageBuilder += Stat.age20}
                77 -> {percentageBuilder += Stat.age18}
                78 -> {percentageBuilder += Stat.age19}
                79 -> {percentageBuilder += Stat.age20}
                80 -> {percentageBuilder += Stat.age20}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.bmi != null) {
            val iterator = Pref.bmi!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.bmiA}
                    "b" -> {percentageBuilder += Stat.bmiB}
                    "c" -> {percentageBuilder += Stat.bmiC}
                    "d" -> {percentageBuilder += Stat.bmiD}
                    "e" -> {percentageBuilder += Stat.bmiE}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.easy != null) {
            val iterator = Pref.easy!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.easyA}
                    "b" -> {percentageBuilder += Stat.easyB}
                    "c" -> {percentageBuilder += Stat.easyC}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.minHeight != null && Pref.maxHeight != null) {
            var percentageBuilder  = 0
            for (it in Pref.minHeight!!..Pref.maxHeight!!){when (it) {
                120 -> {percentageBuilder += Stat.height120}
                121 -> {percentageBuilder += Stat.height121}
                122 -> {percentageBuilder += Stat.height122}
                123 -> {percentageBuilder += Stat.height123}
                124 -> {percentageBuilder += Stat.height124}
                125 -> {percentageBuilder += Stat.height125}
                126 -> {percentageBuilder += Stat.height126}
                127 -> {percentageBuilder += Stat.height127}
                128 -> {percentageBuilder += Stat.height128}
                129 -> {percentageBuilder += Stat.height129}
                130 -> {percentageBuilder += Stat.height130}
                131 -> {percentageBuilder += Stat.height131}
                132 -> {percentageBuilder += Stat.height132}
                133 -> {percentageBuilder += Stat.height133}
                134 -> {percentageBuilder += Stat.height134}
                135 -> {percentageBuilder += Stat.height135}
                136 -> {percentageBuilder += Stat.height136}
                137 -> {percentageBuilder += Stat.height137}
                138 -> {percentageBuilder += Stat.height138}
                139 -> {percentageBuilder += Stat.height139}
                140 -> {percentageBuilder += Stat.height140}
                141 -> {percentageBuilder += Stat.height141}
                142 -> {percentageBuilder += Stat.height142}
                143 -> {percentageBuilder += Stat.height143}
                144 -> {percentageBuilder += Stat.height144}
                145 -> {percentageBuilder += Stat.height145}
                146 -> {percentageBuilder += Stat.height146}
                147 -> {percentageBuilder += Stat.height147}
                148 -> {percentageBuilder += Stat.height148}
                149 -> {percentageBuilder += Stat.height149}
                150 -> {percentageBuilder += Stat.height150}
                151 -> {percentageBuilder += Stat.height151}
                152 -> {percentageBuilder += Stat.height152}
                153 -> {percentageBuilder += Stat.height153}
                154 -> {percentageBuilder += Stat.height154}
                155 -> {percentageBuilder += Stat.height155}
                156 -> {percentageBuilder += Stat.height156}
                157 -> {percentageBuilder += Stat.height157}
                158 -> {percentageBuilder += Stat.height158}
                159 -> {percentageBuilder += Stat.height159}
                160 -> {percentageBuilder += Stat.height160}
                161 -> {percentageBuilder += Stat.height161}
                162 -> {percentageBuilder += Stat.height162}
                163 -> {percentageBuilder += Stat.height163}
                164 -> {percentageBuilder += Stat.height164}
                165 -> {percentageBuilder += Stat.height165}
                166 -> {percentageBuilder += Stat.height166}
                167 -> {percentageBuilder += Stat.height167}
                168 -> {percentageBuilder += Stat.height168}
                169 -> {percentageBuilder += Stat.height169}
                170 -> {percentageBuilder += Stat.height170}
                171 -> {percentageBuilder += Stat.height171}
                172 -> {percentageBuilder += Stat.height172}
                173 -> {percentageBuilder += Stat.height173}
                174 -> {percentageBuilder += Stat.height174}
                175 -> {percentageBuilder += Stat.height175}
                176 -> {percentageBuilder += Stat.height176}
                177 -> {percentageBuilder += Stat.height177}
                178 -> {percentageBuilder += Stat.height178}
                179 -> {percentageBuilder += Stat.height179}
                180 -> {percentageBuilder += Stat.height180}
                181 -> {percentageBuilder += Stat.height181}
                182 -> {percentageBuilder += Stat.height182}
                183 -> {percentageBuilder += Stat.height183}
                184 -> {percentageBuilder += Stat.height184}
                185 -> {percentageBuilder += Stat.height185}
                186 -> {percentageBuilder += Stat.height186}
                187 -> {percentageBuilder += Stat.height187}
                188 -> {percentageBuilder += Stat.height188}
                189 -> {percentageBuilder += Stat.height189}
                190 -> {percentageBuilder += Stat.height190}
                191 -> {percentageBuilder += Stat.height191}
                192 -> {percentageBuilder += Stat.height192}
                193 -> {percentageBuilder += Stat.height193}
                194 -> {percentageBuilder += Stat.height194}
                195 -> {percentageBuilder += Stat.height195}
                196 -> {percentageBuilder += Stat.height196}
                197 -> {percentageBuilder += Stat.height197}
                198 -> {percentageBuilder += Stat.height198}
                199 -> {percentageBuilder += Stat.height199}
                200 -> {percentageBuilder += Stat.height200}
                201 -> {percentageBuilder += Stat.height201}
                202 -> {percentageBuilder += Stat.height202}
                203 -> {percentageBuilder += Stat.height203}
                204 -> {percentageBuilder += Stat.height204}
                205 -> {percentageBuilder += Stat.height205}
                206 -> {percentageBuilder += Stat.height206}
                207 -> {percentageBuilder += Stat.height207}
                208 -> {percentageBuilder += Stat.height208}
                209 -> {percentageBuilder += Stat.height209}
                210 -> {percentageBuilder += Stat.height210}
                211 -> {percentageBuilder += Stat.height211}
                212 -> {percentageBuilder += Stat.height212}
                213 -> {percentageBuilder += Stat.height213}
                214 -> {percentageBuilder += Stat.height214}
                215 -> {percentageBuilder += Stat.height215}
                216 -> {percentageBuilder += Stat.height216}
                217 -> {percentageBuilder += Stat.height217}
                218 -> {percentageBuilder += Stat.height218}
                219 -> {percentageBuilder += Stat.height219}
                220 -> {percentageBuilder += Stat.height220}}}
            if (percentageBuilder != 0) {percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        }
        if (Pref.income != null) {
            val iterator = Pref.income!!.iterator()
            var percentageBuilder  = 0
            iterator.forEach {
                when (it) {
                    "a" -> {percentageBuilder += Stat.incomeA}
                    "b" -> {percentageBuilder += Stat.incomeB}
                    "c" -> {percentageBuilder += Stat.incomeC}
                    "d" -> {percentageBuilder += Stat.incomeD}
                    "e" -> {percentageBuilder += Stat.incomeE}}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)}
        if (Pref.reputationScore != 0) {
            var percentageBuilder  = 0
            when (Pref.reputationScore /100) {
                1 -> {percentageBuilder += Stat.reputationScore1}
                2 -> {percentageBuilder += Stat.reputationScore2}
                3 -> {percentageBuilder += Stat.reputationScore3}
                4 -> {percentageBuilder += Stat.reputationScore4}
                5 -> {percentageBuilder += Stat.reputationScore5}
                6 -> {percentageBuilder += Stat.reputationScore6}
                7 -> {percentageBuilder += Stat.reputationScore7}
                8 -> {percentageBuilder += Stat.reputationScore8}
                9 -> {percentageBuilder += Stat.reputationScore9}
                10 -> {percentageBuilder += Stat.reputationScore10}
                11 -> {percentageBuilder += Stat.reputationScore11}
                12 -> {percentageBuilder += Stat.reputationScore12}
                13 -> {percentageBuilder += Stat.reputationScore13}
                14 -> {percentageBuilder += Stat.reputationScore14}
                15 -> {percentageBuilder += Stat.reputationScore15}
                16 -> {percentageBuilder += Stat.reputationScore16}
                17 -> {percentageBuilder += Stat.reputationScore17}
                18 -> {percentageBuilder += Stat.reputationScore18}
                19 -> {percentageBuilder += Stat.reputationScore19}
                20 -> {percentageBuilder += Stat.reputationScore20}
                21 -> {percentageBuilder += Stat.reputationScore21}
                22 -> {percentageBuilder += Stat.reputationScore22}
                23 -> {percentageBuilder += Stat.reputationScore23}
                24 -> {percentageBuilder += Stat.reputationScore24}
                25 -> {percentageBuilder += Stat.reputationScore25}
                26 -> {percentageBuilder += Stat.reputationScore26}
                27 -> {percentageBuilder += Stat.reputationScore27}
                28 -> {percentageBuilder += Stat.reputationScore28}
                29 -> {percentageBuilder += Stat.reputationScore29}
                30 -> {percentageBuilder += Stat.reputationScore30}
                31 -> {percentageBuilder += Stat.reputationScore31}
                32 -> {percentageBuilder += Stat.reputationScore32}
                33 -> {percentageBuilder += Stat.reputationScore33}
                34 -> {percentageBuilder += Stat.reputationScore34}
                35 -> {percentageBuilder += Stat.reputationScore35}
                36 -> {percentageBuilder += Stat.reputationScore36}
                37 -> {percentageBuilder += Stat.reputationScore37}
                38 -> {percentageBuilder += Stat.reputationScore38}
                39 -> {percentageBuilder += Stat.reputationScore39}
                40 -> {percentageBuilder += Stat.reputationScore40}
                41 -> {percentageBuilder += Stat.reputationScore41}
                42 -> {percentageBuilder += Stat.reputationScore42}
                43 -> {percentageBuilder += Stat.reputationScore43}
                44 -> {percentageBuilder += Stat.reputationScore44}
                45 -> {percentageBuilder += Stat.reputationScore45}
                46 -> {percentageBuilder += Stat.reputationScore46}
                47 -> {percentageBuilder += Stat.reputationScore47}
                48 -> {percentageBuilder += Stat.reputationScore48}
                49 -> {percentageBuilder += Stat.reputationScore49}
                50 -> {percentageBuilder += Stat.reputationScore50}
                51 -> {percentageBuilder += Stat.reputationScore51}
                52 -> {percentageBuilder += Stat.reputationScore52}
                53 -> {percentageBuilder += Stat.reputationScore53}
                54 -> {percentageBuilder += Stat.reputationScore54}
                55 -> {percentageBuilder += Stat.reputationScore55}
                56 -> {percentageBuilder += Stat.reputationScore56}
                57 -> {percentageBuilder += Stat.reputationScore57}
                58 -> {percentageBuilder += Stat.reputationScore58}
                59 -> {percentageBuilder += Stat.reputationScore59}
                60 -> {percentageBuilder += Stat.reputationScore60}
                61 -> {percentageBuilder += Stat.reputationScore61}
                62 -> {percentageBuilder += Stat.reputationScore62}
                63 -> {percentageBuilder += Stat.reputationScore63}
                64 -> {percentageBuilder += Stat.reputationScore64}
                65 -> {percentageBuilder += Stat.reputationScore65}
                66 -> {percentageBuilder += Stat.reputationScore66}
                67 -> {percentageBuilder += Stat.reputationScore67}
                68 -> {percentageBuilder += Stat.reputationScore68}
                69 -> {percentageBuilder += Stat.reputationScore69}
                70 -> {percentageBuilder += Stat.reputationScore70}
                71 -> {percentageBuilder += Stat.reputationScore71}
                72 -> {percentageBuilder += Stat.reputationScore72}
                73 -> {percentageBuilder += Stat.reputationScore73}
                74 -> {percentageBuilder += Stat.reputationScore74}
                75 -> {percentageBuilder += Stat.reputationScore75}
                76 -> {percentageBuilder += Stat.reputationScore76}
                77 -> {percentageBuilder += Stat.reputationScore77}
                78 -> {percentageBuilder += Stat.reputationScore78}
                79 -> {percentageBuilder += Stat.reputationScore79}
                80 -> {percentageBuilder += Stat.reputationScore80}
                81 -> {percentageBuilder += Stat.reputationScore81}
                82 -> {percentageBuilder += Stat.reputationScore82}
                83 -> {percentageBuilder += Stat.reputationScore83}
                84 -> {percentageBuilder += Stat.reputationScore84}
                85 -> {percentageBuilder += Stat.reputationScore85}
                86 -> {percentageBuilder += Stat.reputationScore86}
                87 -> {percentageBuilder += Stat.reputationScore87}
                88 -> {percentageBuilder += Stat.reputationScore88}
                89 -> {percentageBuilder += Stat.reputationScore89}
                90 -> {percentageBuilder += Stat.reputationScore90}
                91 -> {percentageBuilder += Stat.reputationScore91}
                92 -> {percentageBuilder += Stat.reputationScore92}
                93 -> {percentageBuilder += Stat.reputationScore93}
                94 -> {percentageBuilder += Stat.reputationScore94}
                95 -> {percentageBuilder += Stat.reputationScore95}
                96 -> {percentageBuilder += Stat.reputationScore96}
                97 -> {percentageBuilder += Stat.reputationScore97}
                98 -> {percentageBuilder += Stat.reputationScore98}
                99 -> {percentageBuilder += Stat.reputationScore99}
                100 -> {percentageBuilder += Stat.reputationScore100}}
            percentage = (percentage/100.0f)*(percentageBuilder.toFloat()/1000)
        }
        val numberOfUsers : Int = ((Stat.users.toString().toFloat()/100.000F)*percentage).toInt()
        percentage = (percentage * 10000.0f).roundToInt().toFloat() / 10000.0f
        stats.text = "~" + numberOfUsers + "~ ~" + percentage + "%~"

    }
    //=============== SAVES =============================
    fun saveToInternalPreferences(){
        //TODO fun saveInfoToInternal
    }
    fun saveToServerPreferences(){
        //TODO fun saveInfoToServer
    }
    fun saveToInternalInfo(){
        //TODO fun saveInfoToInternal
    }
    fun saveToServerInfo(){
        //TODO fun saveInfoToServer
    }
    fun saveToServerMessage(){}
    fun saveToServerReport(){
        //TODO fun sendReportToServer()
        //(Report)(subject)(reason) (uid of reporter to uid of reported)
    }
    fun saveToInternalSettings(){}
    //=============== LOADS =============================
    fun loadFromInternalPreferences(){
        //TODO fun saveInfoToInternal
    }
    fun loadFromServerPreferences(){
        //TODO fun saveInfoToServer
    }
    fun loadFromInternalInfo(){
        //TODO fun saveInfoToInternal
    }
    fun loadFromServerInfo(){
        //TODO fun saveInfoToServer
    }
    fun loadFromServerMessage(){}
    fun loadFromServerReport(){
        //TODO fun sendReportToServer()
        //(Report)(subject)(reason) (uid of reporter to uid of reported)
    }
    fun loadFromInternalSettings(){}
    //=============== START ANIMATION ==============================
    fun startAnimation(context: Context, headline: TextView, home: RelativeLayout, profile: RelativeLayout, match: RelativeLayout, message: RelativeLayout, body: ScrollView, headerBackground: RelativeLayout,bodyBackground: RelativeLayout,footerBackground: LinearLayout){
        val startAnimation = AnimationUtils.loadAnimation(context, R.anim.start)
        headline.startAnimation(startAnimation)
        home.startAnimation(startAnimation);profile.startAnimation(startAnimation)
        match.startAnimation(startAnimation);message.startAnimation(startAnimation)
        body.startAnimation(startAnimation)
        val headerTransition = headerBackground.background as TransitionDrawable
        val bodyTransition = bodyBackground.background as TransitionDrawable
        val footerTransition = footerBackground.background as TransitionDrawable
        headerTransition.startTransition(3000)
        bodyTransition.startTransition(3000)
        footerTransition.startTransition(3000)
    }
    fun startAnimationCalendar(context : Context, headerBackground : RelativeLayout, bodyBackground : RelativeLayout, footerBackground : LinearLayout,button : TextView, datePicker : DatePicker, question : TextView ){
        val buttonAnimation = AnimationUtils.loadAnimation(context, R.anim.start_six_question_answer_three)
        val datePickerAnimation = AnimationUtils.loadAnimation(context, R.anim.start_six_question_answer_two)
        val questionAnimation = AnimationUtils.loadAnimation(context, R.anim.start_six_question_answer_one)
        button.startAnimation(buttonAnimation)
        datePicker.startAnimation(datePickerAnimation)
        question.startAnimation(questionAnimation)
        val headerTransition = headerBackground.background as TransitionDrawable
        val bodyTransition = bodyBackground.background as TransitionDrawable
        val footerTransition = footerBackground.background as TransitionDrawable
        headerTransition.startTransition(5000)
        bodyTransition.startTransition(5000)
        footerTransition.startTransition(5000)
    }
    fun startAnimationQuestionSix(context: Context, profile: RelativeLayout, question : TextView, answer1 : TextView, answer2 : TextView, answer3 : TextView, answer4 : TextView, answer5 : TextView, answer6 : TextView, headerBackground: RelativeLayout, bodyBackground: LinearLayout, footerBackground: LinearLayout){
        val startAnimation = AnimationUtils.loadAnimation(context, R.anim.start)
        val questionAnimation = AnimationUtils.loadAnimation(context, R.anim.start_six_question_question)
        val answerOneAnimation = AnimationUtils.loadAnimation(context, R.anim.start_six_question_answer_one)
        val answerTwoAnimation = AnimationUtils.loadAnimation(context, R.anim.start_six_question_answer_two)
        val answerThreeAnimation = AnimationUtils.loadAnimation(context, R.anim.start_six_question_answer_three)
        val answerFourAnimation = AnimationUtils.loadAnimation(context, R.anim.start_six_question_answer_four)
        val answerFiveAnimation = AnimationUtils.loadAnimation(context, R.anim.start_six_question_answer_five)
        val answerSixAnimation = AnimationUtils.loadAnimation(context, R.anim.start_six_question_answer_six)
        profile.startAnimation(startAnimation)
        question.startAnimation(questionAnimation)
        answer1.startAnimation(answerOneAnimation)
        answer2.startAnimation(answerTwoAnimation)
        answer3.startAnimation(answerThreeAnimation)
        answer4.startAnimation(answerFourAnimation)
        answer5.startAnimation(answerFiveAnimation)
        answer6.startAnimation(answerSixAnimation)
        val headerTransition = headerBackground.background as TransitionDrawable
        val bodyTransition = bodyBackground.background as TransitionDrawable
        val footerTransition = footerBackground.background as TransitionDrawable
        headerTransition.startTransition(2000)
        bodyTransition.startTransition(2000)
        footerTransition.startTransition(2000)}
    fun startAnimationQuestionSlider(context : Context, profile : RelativeLayout, button : RelativeLayout, values : RelativeLayout, slider : RelativeLayout, question : TextView, headerBackground : RelativeLayout, bodyBackground : RelativeLayout, footerBackground : LinearLayout, user : TextView, percentage : TextView){
        val questionAnimation = AnimationUtils.loadAnimation(context, R.anim.start_slider_question)
        val sliderAnimation = AnimationUtils.loadAnimation(context, R.anim.start_slider_slider)
        val valuesAnimation = AnimationUtils.loadAnimation(context, R.anim.start_slider_values)
        val buttonAnimation = AnimationUtils.loadAnimation(context, R.anim.start_slider_button)
        val profileAnimation = AnimationUtils.loadAnimation(context, R.anim.start_slider_profile)
        question.startAnimation(questionAnimation)
        slider.startAnimation(sliderAnimation)
        values.startAnimation(valuesAnimation)
        button.startAnimation(buttonAnimation)
        user.startAnimation(profileAnimation)
        profile.startAnimation(profileAnimation)
        percentage.startAnimation(profileAnimation)
        val headerTransition = headerBackground.background as TransitionDrawable
        val bodyTransition = bodyBackground.background as TransitionDrawable
        val footerTransition = footerBackground.background as TransitionDrawable
        headerTransition.startTransition(5000)
        bodyTransition.startTransition(5000)
        footerTransition.startTransition(5000) }
    fun startAnimationQuestionSingle(context : Context, headerBackground : RelativeLayout, bodyBackground : RelativeLayout, footerBackground : LinearLayout, question : RelativeLayout, hint : RelativeLayout, yesButton : RelativeLayout, noButton : RelativeLayout, profile : RelativeLayout){

        val oneAnimation = AnimationUtils.loadAnimation(context, R.anim.start_six_question_answer_one)
        val twoAnimation = AnimationUtils.loadAnimation(context, R.anim.start_six_question_answer_two)
        val threeAnimation = AnimationUtils.loadAnimation(context, R.anim.start_six_question_answer_three)
        val fourAnimation = AnimationUtils.loadAnimation(context, R.anim.start_six_question_answer_four)
        //question
        question.startAnimation(oneAnimation)
        //hint
        hint.startAnimation(twoAnimation)
        //buttons
        yesButton.startAnimation(threeAnimation)
        noButton.startAnimation(fourAnimation)
        //profile
        profile.startAnimation(fourAnimation)
        val headerTransition = headerBackground.background as TransitionDrawable
        val bodyTransition = bodyBackground.background as TransitionDrawable
        val footerTransition = footerBackground.background as TransitionDrawable
        headerTransition.startTransition(5000)
        bodyTransition.startTransition(5000)
        footerTransition.startTransition(5000)
    }
    fun startAnimationQuestionTickBox(context : Context, headerBackground : RelativeLayout, bodyBackground : LinearLayout, footerBackground : RelativeLayout, question : TextView, any : RelativeLayout, answer1 : RelativeLayout, answer2 : RelativeLayout, answer3 : RelativeLayout, answer4 : RelativeLayout, answer5 : RelativeLayout, answer6 : RelativeLayout, footButton : TextView, footText : TextView, footProgress : RelativeLayout, footFigure : TextView){
        val questionAnimation = AnimationUtils.loadAnimation(context, R.anim.start_six_question_question)
        val answerOneAnimation = AnimationUtils.loadAnimation(context, R.anim.start_six_question_answer_one)
        val answerTwoAnimation = AnimationUtils.loadAnimation(context, R.anim.start_six_question_answer_two)
        val answerThreeAnimation = AnimationUtils.loadAnimation(context, R.anim.start_six_question_answer_three)
        val answerFourAnimation = AnimationUtils.loadAnimation(context, R.anim.start_six_question_answer_four)
        val answerFiveAnimation = AnimationUtils.loadAnimation(context, R.anim.start_six_question_answer_five)
        val answerSixAnimation = AnimationUtils.loadAnimation(context, R.anim.start_six_question_answer_six)
        val answerSevenAnimation = AnimationUtils.loadAnimation(context, R.anim.start_six_question_answer_seven)
        question.startAnimation(questionAnimation)
        any.startAnimation(answerOneAnimation)
        answer1.startAnimation(answerTwoAnimation)
        answer2.startAnimation(answerThreeAnimation)
        answer3.startAnimation(answerFourAnimation)
        answer4.startAnimation(answerFiveAnimation)
        answer5.startAnimation(answerSixAnimation)
        answer6.startAnimation(answerSevenAnimation)
        footButton.startAnimation(answerTwoAnimation)
        footText.startAnimation(answerThreeAnimation)
        footProgress.startAnimation(answerFourAnimation)
        footFigure.startAnimation(answerFourAnimation)
        val headerTransition = headerBackground.background as TransitionDrawable
        val bodyTransition = bodyBackground.background as TransitionDrawable
        val footerTransition = footerBackground.background as TransitionDrawable
        headerTransition.startTransition(5000)
        bodyTransition.startTransition(5000)
        footerTransition.startTransition(5000)
    }
    fun startAnimationSwipePreferencesMenu(context: Context, headline: TextView, home: RelativeLayout, profile: RelativeLayout, match: RelativeLayout, message: RelativeLayout, body: ScrollView, headerBackground: RelativeLayout,bodyBackground: RelativeLayout,footerBackground: LinearLayout, row_0 : RelativeLayout){
        val startAnimation = AnimationUtils.loadAnimation(context, R.anim.start_six_question_question)
        val startAnimation2 = AnimationUtils.loadAnimation(context, R.anim.start_six_question_answer_one)
        val startAnimation3 = AnimationUtils.loadAnimation(context, R.anim.start_six_question_answer_two)
        val startAnimation4 = AnimationUtils.loadAnimation(context, R.anim.start_six_question_answer_three)
        val startAnimation5 = AnimationUtils.loadAnimation(context, R.anim.start_six_question_answer_four)
        val startAnimation6 = AnimationUtils.loadAnimation(context, R.anim.start_six_question_answer_five)
        val startAnimation7 = AnimationUtils.loadAnimation(context, R.anim.start_six_question_answer_six)
        headline.startAnimation(startAnimation5)
        row_0.startAnimation(startAnimation6)
        body.startAnimation(startAnimation7)
        home.startAnimation(startAnimation5);profile.startAnimation(startAnimation5);match.startAnimation(startAnimation6);message.startAnimation(startAnimation7)
        val headerTransition = headerBackground.background as TransitionDrawable
        val bodyTransition = bodyBackground.background as TransitionDrawable
        val footerTransition = footerBackground.background as TransitionDrawable
        headerTransition.startTransition(3000)
        bodyTransition.startTransition(3000)
        footerTransition.startTransition(3000)
    }
    fun startAnimationLoading(context : Context, headline : RelativeLayout, body : LinearLayout, footer : RelativeLayout, loading : ProgressBar,loadingContainer : RelativeLayout, title : TextView, bodyText : TextView, progressBar : ProgressBar, progressIcon : ImageView, hint : TextView){
        val headerTransition = headline.background as TransitionDrawable
        val bodyTransition = body.background as TransitionDrawable
        val loadingBarContainerTransition = loadingContainer.background as TransitionDrawable
        val loadingBarTransition = loading.background as TransitionDrawable
        val footerTransition = footer.background as TransitionDrawable
        headerTransition.startTransition(3000)
        bodyTransition.startTransition(3000)
        loadingBarContainerTransition.startTransition(3000)
        loadingBarTransition.startTransition(3000)
        footerTransition.startTransition(3000)
        val animation = AnimationUtils.loadAnimation(context, R.anim.fade_in)
        title.startAnimation(animation)
        bodyText.startAnimation(animation)
        progressBar.startAnimation(animation)
        progressIcon.startAnimation(animation)
        hint.startAnimation(animation)
    }
    //=============== FINISH ANIMATION =============================
    fun finishAnimation(context: Context, headline: TextView, home: RelativeLayout, profile: RelativeLayout, match: RelativeLayout, message: RelativeLayout, body: ScrollView, headerBackground: RelativeLayout, bodyBackground: RelativeLayout, footerBackground: LinearLayout, delay: Int){
        val finishAnimation = AnimationUtils.loadAnimation(context, R.anim.exit)
        headline.startAnimation(finishAnimation)
        home.startAnimation(finishAnimation);profile.startAnimation(finishAnimation)
        match.startAnimation(finishAnimation);message.startAnimation(finishAnimation)
        body.startAnimation(finishAnimation)
        val headerTransition = headerBackground.background as TransitionDrawable
        val bodyTransition = bodyBackground.background as TransitionDrawable
        val footerTransition = footerBackground.background as TransitionDrawable
        headerTransition.reverseTransition(delay)
        bodyTransition.reverseTransition(delay)
        footerTransition.reverseTransition(delay)
        Handler(Looper.getMainLooper()).postDelayed({headline.visibility = View.GONE;home.visibility = View.GONE;profile.visibility = View.GONE;match.visibility = View.GONE;message.visibility = View.GONE;body.visibility = View.GONE}, 2000) }
    fun finishAnimationCalendar(context : Context, headerBackground : RelativeLayout, bodyBackground : RelativeLayout, footerBackground : LinearLayout, button : TextView, datePicker : DatePicker, question : TextView ){
        val buttonAnimation = AnimationUtils.loadAnimation(context, R.anim.exit_six_question_delay_one)
        val datePickerAnimation = AnimationUtils.loadAnimation(context, R.anim.exit_six_question_delay_two)
        val questionAnimation = AnimationUtils.loadAnimation(context, R.anim.exit_six_question_delay_three)
        button.startAnimation(buttonAnimation)
        datePicker.startAnimation(datePickerAnimation)
        question.startAnimation(questionAnimation)
        val headerTransition = headerBackground.background as TransitionDrawable
        val bodyTransition = bodyBackground.background as TransitionDrawable
        val footerTransition = footerBackground.background as TransitionDrawable
        headerTransition.reverseTransition(2000)
        bodyTransition.reverseTransition(2000)
        footerTransition.reverseTransition(2000)
        Handler(Looper.getMainLooper()).postDelayed({button.visibility = View.GONE;datePicker.visibility = View.GONE;question.visibility = View.GONE}, 2000) }
    fun finishAnimationQuestionSix(context: Context, clickedButton:View, question : TextView, answer1 : TextView, answer2 : TextView, answer3 : TextView, answer4 : TextView, answer5 : TextView, answer6 : TextView, profile : RelativeLayout, headerBackground: RelativeLayout, bodyBackground: LinearLayout, footerBackground: LinearLayout, delay: Int){
        val animation = AnimationUtils.loadAnimation(context, R.anim.exit)
        val oneAnimation = AnimationUtils.loadAnimation(context, R.anim.exit_six_question_delay_one)
        val twoAnimation = AnimationUtils.loadAnimation(context, R.anim.exit_six_question_delay_two)
        val threeAnimation = AnimationUtils.loadAnimation(context, R.anim.exit_six_question_delay_three)
        val fourAnimation = AnimationUtils.loadAnimation(context, R.anim.exit_six_question_delay_four)
        val fiveAnimation = AnimationUtils.loadAnimation(context, R.anim.exit_six_question_delay_five)
        val sixAnimation = AnimationUtils.loadAnimation(context, R.anim.exit_six_question_delay_six)
        val sevenAnimation = AnimationUtils.loadAnimation(context, R.anim.exit_six_question_delay_seven)
        val headerTransition = headerBackground.background as TransitionDrawable
        val bodyTransition = bodyBackground.background as TransitionDrawable
        val footerTransition = footerBackground.background as TransitionDrawable
        when (clickedButton) {
            answer1 -> {
                question.startAnimation(oneAnimation)
                answer1.startAnimation(animation)
                answer2.startAnimation(oneAnimation)
                answer3.startAnimation(twoAnimation)
                answer4.startAnimation(threeAnimation)
                answer5.startAnimation(fourAnimation)
                answer6.startAnimation(fiveAnimation)
                profile.startAnimation(sixAnimation)
            }
            answer2 -> {
                question.startAnimation(twoAnimation)
                answer1.startAnimation(oneAnimation)
                answer2.startAnimation(animation)
                answer3.startAnimation(oneAnimation)
                answer4.startAnimation(twoAnimation)
                answer5.startAnimation(threeAnimation)
                answer6.startAnimation(fourAnimation)
                profile.startAnimation(fiveAnimation)
            }
            answer3 -> {
                question.startAnimation(threeAnimation)
                answer1.startAnimation(twoAnimation)
                answer2.startAnimation(oneAnimation)
                answer3.startAnimation(animation)
                answer4.startAnimation(oneAnimation)
                answer5.startAnimation(twoAnimation)
                answer6.startAnimation(threeAnimation)
                profile.startAnimation(fourAnimation)
            }
            answer4 -> {
                question.startAnimation(fourAnimation)
                answer1.startAnimation(threeAnimation)
                answer2.startAnimation(twoAnimation)
                answer3.startAnimation(oneAnimation)
                answer4.startAnimation(animation)
                answer5.startAnimation(oneAnimation)
                answer6.startAnimation(twoAnimation)
                profile.startAnimation(threeAnimation)
            }
            answer5 -> {
                question.startAnimation(fiveAnimation)
                answer1.startAnimation(fourAnimation)
                answer2.startAnimation(threeAnimation)
                answer3.startAnimation(twoAnimation)
                answer4.startAnimation(oneAnimation)
                answer5.startAnimation(animation)
                answer6.startAnimation(oneAnimation)
                profile.startAnimation(twoAnimation)
            }
            answer6 -> {
                question.startAnimation(sixAnimation)
                answer1.startAnimation(fiveAnimation)
                answer2.startAnimation(fourAnimation)
                answer3.startAnimation(threeAnimation)
                answer4.startAnimation(twoAnimation)
                answer5.startAnimation(oneAnimation)
                answer6.startAnimation(animation)
                profile.startAnimation(oneAnimation)

            }
            profile -> {
                question.startAnimation(sevenAnimation)
                answer1.startAnimation(sixAnimation)
                answer2.startAnimation(fiveAnimation)
                answer3.startAnimation(fourAnimation)
                answer4.startAnimation(threeAnimation)
                answer5.startAnimation(twoAnimation)
                answer6.startAnimation(oneAnimation)
                profile.startAnimation(animation)
            }
        }
        headerTransition.reverseTransition(delay)
        bodyTransition.reverseTransition(delay)
        footerTransition.reverseTransition(delay)
        Handler(Looper.getMainLooper()).postDelayed({question.visibility = View.GONE;answer1.visibility = View.GONE;answer2.visibility = View.GONE;answer3.visibility = View.GONE;answer4.visibility = View.GONE;answer5.visibility = View.GONE;answer6.visibility = View.GONE;profile.visibility = View.GONE;}, 2000) }
    fun finishAnimationQuestionSlider(context : Context, profile : RelativeLayout, button : RelativeLayout, values : RelativeLayout, slider : RelativeLayout, question : TextView, headerBackground : RelativeLayout, bodyBackground : RelativeLayout, footerBackground : LinearLayout, user : TextView, percentage : TextView ){
        val questionAnimation = AnimationUtils.loadAnimation(context, R.anim.exit_slider_question)
        val sliderAnimation = AnimationUtils.loadAnimation(context, R.anim.exit_slider_slider)
        val valuesAnimation = AnimationUtils.loadAnimation(context, R.anim.exit_slider_values)
        val buttonAnimation = AnimationUtils.loadAnimation(context, R.anim.exit_slider_button)
        val profileAnimation = AnimationUtils.loadAnimation(context, R.anim.exit_slider_profile)
        question.startAnimation(questionAnimation)
        slider.startAnimation(sliderAnimation)
        values.startAnimation(valuesAnimation)
        button.startAnimation(buttonAnimation)
        user.startAnimation(profileAnimation)
        profile.startAnimation(profileAnimation)
        percentage.startAnimation(profileAnimation)
        val headerTransition = headerBackground.background as TransitionDrawable
        val bodyTransition = bodyBackground.background as TransitionDrawable
        val footerTransition = footerBackground.background as TransitionDrawable
        headerTransition.reverseTransition(2000)
        bodyTransition.reverseTransition(2000)
        footerTransition.reverseTransition(2000)
        Handler(Looper.getMainLooper()).postDelayed({question.visibility = View.GONE;slider.visibility = View.GONE;values.visibility = View.GONE;button.visibility = View.GONE;user.visibility = View.GONE;profile.visibility = View.GONE;percentage.visibility = View.GONE}, 2000)
    }
    fun finishAnimationQuestionSingle(context : Context, headerBackground : RelativeLayout, bodyBackground : RelativeLayout, footerBackground : LinearLayout, question : RelativeLayout, hint : RelativeLayout, yesButton : RelativeLayout, noButton : RelativeLayout, profile : RelativeLayout){
        val oneAnimation = AnimationUtils.loadAnimation(context, R.anim.exit_six_question_delay_one)
        val twoAnimation = AnimationUtils.loadAnimation(context, R.anim.exit_six_question_delay_two)
        AnimationUtils.loadAnimation(context, R.anim.exit_six_question_delay_four)
        AnimationUtils.loadAnimation(context, R.anim.exit_six_question_delay_four)
        question.startAnimation(twoAnimation)
        hint.startAnimation(oneAnimation)
        yesButton.startAnimation(oneAnimation)
        noButton.startAnimation(oneAnimation)
        profile.startAnimation(twoAnimation)
        val headerTransition = headerBackground.background as TransitionDrawable
        val bodyTransition = bodyBackground.background as TransitionDrawable
        val footerTransition = footerBackground.background as TransitionDrawable
        headerTransition.reverseTransition(2000)
        bodyTransition.reverseTransition(2000)
        footerTransition.reverseTransition(2000)
        Handler(Looper.getMainLooper()).postDelayed({question.visibility = View.GONE;hint.visibility = View.GONE;yesButton.visibility = View.GONE;noButton.visibility = View.GONE;profile.visibility = View.GONE}, 2000)
    }
    fun finishAnimationQuestionTickBox(context : Context, headerBackground : RelativeLayout, bodyBackground : LinearLayout, footerBackground : RelativeLayout, question : TextView, any : RelativeLayout, answer1 : RelativeLayout, answer2 : RelativeLayout, answer3 : RelativeLayout, answer4 : RelativeLayout, answer5 : RelativeLayout, answer6 : RelativeLayout, footButton : TextView, footText : TextView, footProgress : RelativeLayout, footFigure : TextView){
        val questionAnimation = AnimationUtils.loadAnimation(context, R.anim.exit_six_question_delay_one)
        val answerOneAnimation = AnimationUtils.loadAnimation(context, R.anim.exit_six_question_delay_two)
        val answerTwoAnimation = AnimationUtils.loadAnimation(context, R.anim.exit_six_question_delay_three)
        val answerThreeAnimation = AnimationUtils.loadAnimation(context, R.anim.exit_six_question_delay_four)
        val answerFourAnimation = AnimationUtils.loadAnimation(context, R.anim.exit_six_question_delay_five)
        val answerFiveAnimation = AnimationUtils.loadAnimation(context, R.anim.exit_six_question_delay_six)
        val answerSixAnimation = AnimationUtils.loadAnimation(context, R.anim.exit_six_question_delay_seven)
        val answerSevenAnimation = AnimationUtils.loadAnimation(context, R.anim.exit_six_question_delay_seven)
        question.startAnimation(answerSevenAnimation)
        any.startAnimation(answerSevenAnimation)
        answer1.startAnimation(answerSixAnimation)
        answer2.startAnimation(answerFiveAnimation)
        answer3.startAnimation(answerFourAnimation)
        answer4.startAnimation(answerThreeAnimation)
        answer5.startAnimation(answerTwoAnimation)
        answer6.startAnimation(answerOneAnimation)
        footButton.startAnimation(questionAnimation)
        footText.startAnimation(questionAnimation)
        footProgress.startAnimation(questionAnimation)
        footFigure.startAnimation(questionAnimation)
        val headerTransition = headerBackground.background as TransitionDrawable
        val bodyTransition = bodyBackground.background as TransitionDrawable
        val footerTransition = footerBackground.background as TransitionDrawable
        headerTransition.reverseTransition(2000)
        bodyTransition.reverseTransition(2000)
        footerTransition.reverseTransition(2000)
        Handler(Looper.getMainLooper()).postDelayed({question.visibility = View.GONE;any.visibility = View.GONE;answer1.visibility = View.GONE;answer2.visibility = View.GONE;answer3.visibility = View.GONE;answer4.visibility = View.GONE;answer5.visibility = View.GONE;answer6.visibility = View.GONE;footButton.visibility = View.GONE;footText.visibility = View.GONE;footProgress.visibility = View.GONE;footFigure.visibility = View.GONE }, 2000)
    }
    fun finishAnimationProfileToDo(photoToDo : TextView,easyToDo : TextView,bioToDo : TextView, childrenToDo : TextView, travelToDo : TextView,heightToDo : TextView, petToDo : TextView, musicToDo : TextView, foodToDo : TextView, politicalToDo : TextView, educationToDo : TextView, languageToDo : TextView, employmentToDo : TextView, incomeToDo : TextView, viewsToDo : TextView, drinkToDo : TextView, drugsToDo : TextView, smokeToDo : TextView, raceToDo : TextView, religionToDo : TextView){
        if (photoToDo.visibility == View.VISIBLE){photoToDo.visibility = View.INVISIBLE}
        if (easyToDo.visibility == View.VISIBLE){easyToDo.visibility = View.INVISIBLE}
        if (bioToDo.visibility == View.VISIBLE){bioToDo.visibility = View.INVISIBLE}
        if (childrenToDo.visibility == View.VISIBLE){childrenToDo.visibility = View.INVISIBLE}
        if (travelToDo.visibility == View.VISIBLE){travelToDo.visibility = View.INVISIBLE}
        if (heightToDo.visibility == View.VISIBLE){heightToDo.visibility = View.INVISIBLE}
        if (petToDo.visibility == View.VISIBLE){petToDo.visibility = View.INVISIBLE}
        if (musicToDo.visibility == View.VISIBLE){musicToDo.visibility = View.INVISIBLE}
        if (foodToDo.visibility == View.VISIBLE){foodToDo.visibility = View.INVISIBLE}
        if (politicalToDo.visibility == View.VISIBLE){politicalToDo.visibility = View.INVISIBLE}
        if (educationToDo.visibility == View.VISIBLE){educationToDo.visibility = View.INVISIBLE}
        if (languageToDo.visibility == View.VISIBLE){languageToDo.visibility = View.INVISIBLE}
        if (employmentToDo.visibility == View.VISIBLE){employmentToDo.visibility = View.INVISIBLE}
        if (incomeToDo.visibility == View.VISIBLE){incomeToDo.visibility = View.INVISIBLE}
        if (viewsToDo.visibility == View.VISIBLE){viewsToDo.visibility = View.INVISIBLE}
        if (drinkToDo.visibility == View.VISIBLE){drinkToDo.visibility = View.INVISIBLE}
        if (drugsToDo.visibility == View.VISIBLE){drugsToDo.visibility = View.INVISIBLE}
        if (smokeToDo.visibility == View.VISIBLE){smokeToDo.visibility = View.INVISIBLE}
        if (raceToDo.visibility == View.VISIBLE){raceToDo.visibility = View.INVISIBLE}
        if (religionToDo.visibility == View.VISIBLE){religionToDo.visibility = View.INVISIBLE}



    }
    fun finishAnimationProfileBodyButton(context: Context, headline: TextView, home: RelativeLayout, profile: RelativeLayout, match: RelativeLayout, message: RelativeLayout, headerBackground: RelativeLayout, bodyBackground: RelativeLayout, footerBackground: LinearLayout, delay: Int, homeB : LinearLayout, holidayB : LinearLayout, viewB : LinearLayout, photoB : LinearLayout, easyB : LinearLayout, relationshipB : LinearLayout, bioB : LinearLayout,drinkB : LinearLayout, smokeB : LinearLayout, drugsB : LinearLayout, childrenB : LinearLayout, travelB : LinearLayout, heightB : LinearLayout, petB : LinearLayout, musicB : LinearLayout, foodB : LinearLayout, politicalB : LinearLayout, educationB : LinearLayout, languageB : LinearLayout, employmentB : LinearLayout, incomeB : LinearLayout, viewsB : LinearLayout, selectedB : LinearLayout, raceB : LinearLayout, religionB : LinearLayout){
        val finishAnimation = AnimationUtils.loadAnimation(context, R.anim.exit)
        headline.startAnimation(finishAnimation)
        home.startAnimation(finishAnimation);profile.startAnimation(finishAnimation)
        match.startAnimation(finishAnimation);message.startAnimation(finishAnimation)
        //body.startAnimation(finishAnimation)
        if (selectedB != homeB){homeB.startAnimation(finishAnimation)}
        if (selectedB != holidayB){holidayB.startAnimation(finishAnimation)}
        if (selectedB != viewB){viewB.startAnimation(finishAnimation)}
        if (selectedB != photoB){photoB.startAnimation(finishAnimation)}
        if (selectedB != easyB){easyB.startAnimation(finishAnimation)}
        if (selectedB != relationshipB){relationshipB.startAnimation(finishAnimation)}
        if (selectedB != bioB){bioB.startAnimation(finishAnimation)}
        if (selectedB != drinkB){drinkB.startAnimation(finishAnimation)}
        if (selectedB != smokeB){smokeB.startAnimation(finishAnimation)}
        if (selectedB != drugsB){drugsB.startAnimation(finishAnimation)}
        if (selectedB != childrenB){childrenB.startAnimation(finishAnimation)}
        if (selectedB != travelB){travelB.startAnimation(finishAnimation)}
        if (selectedB != heightB){heightB.startAnimation(finishAnimation)}
        if (selectedB != petB){petB.startAnimation(finishAnimation)}
        if (selectedB != musicB){musicB.startAnimation(finishAnimation)}
        if (selectedB != foodB){foodB.startAnimation(finishAnimation)}
        if (selectedB != politicalB){politicalB.startAnimation(finishAnimation)}
        if (selectedB != educationB){educationB.startAnimation(finishAnimation)}
        if (selectedB != languageB){languageB.startAnimation(finishAnimation)}
        if (selectedB != employmentB){employmentB.startAnimation(finishAnimation)}
        if (selectedB != incomeB){incomeB.startAnimation(finishAnimation)}
        if (selectedB != viewsB){viewsB.startAnimation(finishAnimation)}
        if (selectedB != raceB){raceB.startAnimation(finishAnimation)}
        if (selectedB != religionB){religionB.startAnimation(finishAnimation)}
        val headerTransition = headerBackground.background as TransitionDrawable
        val bodyTransition = bodyBackground.background as TransitionDrawable
        val footerTransition = footerBackground.background as TransitionDrawable
        headerTransition.reverseTransition(delay/2)
        bodyTransition.reverseTransition(delay/2)
        footerTransition.reverseTransition(delay/2)
        Handler(Looper.getMainLooper()).postDelayed({headline.visibility = View.GONE;home.visibility = View.GONE;profile.visibility = View.GONE;match.visibility = View.GONE;message.visibility = View.GONE;homeB.visibility = View.GONE;holidayB.visibility = View.GONE;viewB.visibility = View.GONE;photoB.visibility = View.GONE;easyB.visibility = View.GONE;relationshipB.visibility = View.GONE;bioB.visibility = View.GONE;drinkB.visibility = View.GONE;smokeB.visibility = View.GONE;drugsB.visibility = View.GONE;childrenB.visibility = View.GONE;travelB.visibility = View.GONE;heightB.visibility = View.GONE;petB.visibility = View.GONE;musicB.visibility = View.GONE;foodB.visibility = View.GONE;politicalB.visibility = View.GONE;educationB.visibility = View.GONE;languageB.visibility = View.GONE;employmentB.visibility = View.GONE;incomeB.visibility = View.GONE}, 2000)

    }
    fun finishAnimationProfileBodyButtonSelected(context: Context, container : RelativeLayout){
        val finishAnimation = AnimationUtils.loadAnimation(context, R.anim.start)
        container.startAnimation(finishAnimation)
        Handler(Looper.getMainLooper()).postDelayed({container.visibility = View.GONE }, 2000)
    }
    fun finishAnimationSwipePreferencesBodyButton(context: Context, headline: TextView, home: RelativeLayout, profile: RelativeLayout, match: RelativeLayout, message: RelativeLayout, headerBackground: RelativeLayout, bodyBackground: RelativeLayout, footerBackground: LinearLayout, delay: Int, homeB : LinearLayout, holidayB : LinearLayout, viewB : LinearLayout, photoB : LinearLayout, easyB : LinearLayout, relationshipB : LinearLayout, bioB : LinearLayout, drinkB : LinearLayout, smokeB : LinearLayout, drugsB : LinearLayout, childrenB : LinearLayout, travelB : LinearLayout, heightB : LinearLayout, petB : LinearLayout, musicB : LinearLayout, foodB : LinearLayout, politicalB : LinearLayout, educationB : LinearLayout, languageB : LinearLayout, employmentB : LinearLayout, incomeB : LinearLayout, selectedB : LinearLayout,statsBox : RelativeLayout){
        val finishAnimation = AnimationUtils.loadAnimation(context, R.anim.exit)
        headline.startAnimation(finishAnimation)
        home.startAnimation(finishAnimation);profile.startAnimation(finishAnimation)
        match.startAnimation(finishAnimation);message.startAnimation(finishAnimation)
        if (selectedB != homeB){homeB.startAnimation(finishAnimation)}
        if (selectedB != holidayB){holidayB.startAnimation(finishAnimation)}
        if (selectedB != viewB){viewB.startAnimation(finishAnimation)}
        if (selectedB != photoB){photoB.startAnimation(finishAnimation)}
        if (selectedB != easyB){easyB.startAnimation(finishAnimation)}
        if (selectedB != relationshipB){relationshipB.startAnimation(finishAnimation)}
        if (selectedB != bioB){bioB.startAnimation(finishAnimation)}
        if (selectedB != drinkB){drinkB.startAnimation(finishAnimation)}
        if (selectedB != smokeB){smokeB.startAnimation(finishAnimation)}
        if (selectedB != drugsB){drugsB.startAnimation(finishAnimation)}
        if (selectedB != childrenB){childrenB.startAnimation(finishAnimation)}
        if (selectedB != travelB){travelB.startAnimation(finishAnimation)}
        if (selectedB != heightB){heightB.startAnimation(finishAnimation)}
        if (selectedB != petB){petB.startAnimation(finishAnimation)}
        if (selectedB != musicB){musicB.startAnimation(finishAnimation)}
        if (selectedB != foodB){foodB.startAnimation(finishAnimation)}
        if (selectedB != politicalB){politicalB.startAnimation(finishAnimation)}
        if (selectedB != educationB){educationB.startAnimation(finishAnimation)}
        if (selectedB != languageB){languageB.startAnimation(finishAnimation)}
        if (selectedB != employmentB){employmentB.startAnimation(finishAnimation)}
        if (selectedB != incomeB){incomeB.startAnimation(finishAnimation)}
        statsBox.startAnimation(finishAnimation)
        val headerTransition = headerBackground.background as TransitionDrawable
        val bodyTransition = bodyBackground.background as TransitionDrawable
        val footerTransition = footerBackground.background as TransitionDrawable
        headerTransition.reverseTransition(delay)
        bodyTransition.reverseTransition(delay)
        footerTransition.reverseTransition(delay)
        Handler(Looper.getMainLooper()).postDelayed({headline.visibility = View.GONE;home.visibility = View.GONE;profile.visibility = View.GONE;match.visibility = View.GONE;message.visibility = View.GONE;statsBox.visibility = View.GONE;homeB.visibility = View.GONE;holidayB.visibility = View.GONE;viewB.visibility = View.GONE;photoB.visibility = View.GONE;easyB.visibility = View.GONE;relationshipB.visibility = View.GONE;bioB.visibility = View.GONE;drinkB.visibility = View.GONE;smokeB.visibility = View.GONE;drugsB.visibility = View.GONE;childrenB.visibility = View.GONE;travelB.visibility = View.GONE;heightB.visibility = View.GONE;petB.visibility = View.GONE;musicB.visibility = View.GONE;foodB.visibility = View.GONE;politicalB.visibility = View.GONE;educationB.visibility = View.GONE;languageB.visibility = View.GONE;employmentB.visibility = View.GONE;incomeB.visibility = View.GONE}, 2000)
    }
    fun finishAnimationSwipePreferencesButtonSelected(context: Context, container : RelativeLayout){
        val finishAnimation = AnimationUtils.loadAnimation(context, R.anim.start)
        container.startAnimation(finishAnimation)
        Handler(Looper.getMainLooper()).postDelayed({container.visibility = View.GONE }, 2000)}
    fun finishAnimationLoading(context : Activity, headline : RelativeLayout, body : LinearLayout, footer : RelativeLayout, loading : ProgressBar, loadingContainer : RelativeLayout, title : TextView, bodyText : TextView, progressBar : ProgressBar, progressIcon : ImageView, hint : TextView){
        val headerTransition = headline.background as TransitionDrawable
        val bodyTransition = body.background as TransitionDrawable
        val loadingBarContainerTransition = loadingContainer.background as TransitionDrawable
        val loadingBarTransition = loading.background as TransitionDrawable
        val footerTransition = footer.background as TransitionDrawable
        headerTransition.reverseTransition(2000)
        bodyTransition.reverseTransition(2000)
        loadingBarContainerTransition.reverseTransition(2000)
        loadingBarTransition.reverseTransition(2000)
        footerTransition.reverseTransition(2000)
        val animation = AnimationUtils.loadAnimation(context, R.anim.fade_out)
        title.startAnimation(animation)
        bodyText.startAnimation(animation)
        progressBar.startAnimation(animation)
        progressIcon.startAnimation(animation)
        hint.startAnimation(animation)
        Handler(Looper.getMainLooper()).postDelayed({title.visibility = View.GONE;bodyText.visibility = View.GONE;progressBar.visibility = View.GONE;progressIcon.visibility = View.GONE;hint.visibility = View.GONE }, 2000)

    }

}