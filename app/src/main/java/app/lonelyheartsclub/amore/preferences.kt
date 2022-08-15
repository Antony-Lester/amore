@file:Suppress("RemoveEmptyClassBody")

package app.lonelyheartsclub.amore

object Pref {
    var income : MutableList<String>? = null // lowest a -- e Highest
    var reputationScore : Int = 0 // lower 0-10000 higher
    var minAge : Int? = null //18-100
    var maxAge : Int? = null //18-100
    var minHeight : Int? = null //cm
    var maxHeight : Int? = null //cm
    //tick box styles
    var bmi : MutableList<String>? = null // small -- a b c d e --large
    var easy : MutableList<String>? = null // a = easy, b = middle, c = marriage
    var travel : MutableList<String>? = null //no passport = a, have a passport = b, frequent flyer =c,
    var drugs : MutableList<String>? = null //No Thanks = a, Socially/Soft = b, Heavy = c, Dependent = d
    var drink : MutableList<String>? = null   //No/TeaTotal = a, Socially = b, Yes = c, Dependent = d
    var education : MutableList<String>? = null   //University = a, College = b, School = c, None = d,
    var smoke : MutableList<String>? = null   //No = a, vape = b, yes socially = c, yes = d, yes heavy = e
    var food : MutableList<String>? = null // Eats Everything = a, Mostly Meat = b, Mostly Fish = c, Vegetarian = d, Vegan = e
    var relationship : MutableList<String>? = null //single = a, open relationship = b, cheating = c, separated = d, widowed = e, divorced = f
    var children : MutableList<String>? = null //Don't Have & Don't Want = a, Don't Have & Want Some = b, They Have Left Home & Don't Want More = c, They Have Left Home & Want More = d, Have & Don't Want More = e, Have & Want More = f
    var pet : MutableList<String>? = null //dog = a, cat = b, bird = c, fish = d, other = e, none = f
    var political : MutableList<String>? = null // Not Political = a, Conservative = b, Labour = c, Liberal = d, Independent = e, moderate = f
    var religion : MutableList<String>? = null //Christian = a,Muslim = b, Atheist = c  Jewish = d, Buddhist = e, Other = f
    var employment : MutableList<String>? = null //Company Director = a, Retired = b, Employed = c, Self-Employed = d, Disability Benefits= e, Unemployed = f,
    var language : MutableList<String>? = null //"en" ect..
    var race : MutableList<String>? = null
    var views : MutableList<String>? = null
    //Location
    var locationGroups : MutableList<String>? = null


}