@file:Suppress("MemberVisibilityCanBePrivate")

package app.lonelyheartsclub.amore

import com.google.firebase.auth.FirebaseAuth
import java.util.*

object Info {
    var uid : String = FirebaseAuth.getInstance().currentUser?.uid.toString().trim()
    var languageOneOverride : String? = null
    var languageOne : String? = if (languageOneOverride != null)languageOneOverride else Locale.getDefault().language //"en"
    var languageOneName : String? = Locale.getDefault().displayLanguage
    //profile
    var photoFace : Boolean = false
    var photoBody : Boolean = false
    var easy : String? = null  //For Fun = a, Something In-Between = b, Marriage = c
    var bio : String? = null
    var children : String? = null //Don't Have & Don't Want = a, Don't Have & Want Some = b, They Have Left Home & Don't Want More = c, They Have Left Home & Want More = d, Have & Don't Want More = e, Have & Want More = f
    var travel : String? = null //no passport = a, have a passport = b, frequent flyer =c,
    var height : Int? = null //int in cm
    var bmi : String? = null // small -- a b c d e --large
    var pet : String? = null //dog = a, cat = b, bird = c, fish = d, other = e, none = f
    var music : String? = null //Pop = a, Rock = b, Disco = c, Techno = d, R&B = e, don't like music = f
    var food : String? = null // Eats Everything = a, Mostly Meat = b, Mostly Fish = c, Vegetarian = d, Vegan = e
    var political : String? = null // Not Political = a, Conservative = b, Labour = c, Liberal = d, Independent = e, moderate = f
    var education : String? = null //University = a, College = b, School = c, None = d,
    var languageTwo : String? = null
    var languageThree : String? = null
    var languageFour : String? = null
    var languageFive : String? = null
    var employment : String? = null //Company Director = a, Retired = b, Employed = c, Self-Employed = d, Disability Benefits= e, Unemployed = f,
    var income : String? = null // lower a -- e higher
    var views : String? = null
    var drink : String? = null //No/TeaTotal = a, Socially = b, Yes = c, Dependent = d
    var smoke : String? = null //No = a, vape = b, yes socially = c, yes = d, yes heavy = e
    var drugs : String? = null //No Thanks = a, Socially/Soft = b, Heavy = c, Dependent = d
    var religion : String? = null //Christian = a,Muslim = b, Atheist = c  Jewish = d, Buddhist = e, Other = f
    var race : String? = null //white = a, asian = b, arab = c, black = d, mixed = e, other = f,
    var relationship : String? = null //single = a, open relationship = b, cheating = c, separated = d, widowed = e, divorced = f
    var gender : String? = null //female=a, male=b, other=c
    var orientation : String? = null //females=a, males=b, both=c, anyone=d,
    var reputationScore : Int = 5000 // lower 0-10000 higher
    //signup
    var country : String? = null //lower case -to-do
    var dayOfBirth : Int? = null
    var monthOfBirth : Int? = null
    var yearOfBirth : Int? = null
    //picture
    var face_id : Int? = null
    //location
    var lat : Double? = null//Double (53.3276953)
    var long : Double? = null//Double (-2.6933446)
    var countryName : String? = null
    var locationGroup : String? = null

    var gps : String? = null //added to get app running
    var sexCompatible :MutableList<String?>? = mutableListOf() //added to get app running
}