@file:Suppress("unused")

package app.lonelyheartsclub.amore

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.lonelyheartsclub.amore.databinding.ActivityProfileMenuBinding


class ActivityProfileMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;supportActionBar?.hide()
        val binding  = ActivityProfileMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //header font
        binding.headline.typeface = Fun.setFont(this, "headline")
        //body font
        binding.homeButtonText.typeface = Fun.setFont(this, "body")
        binding.holidayButtonText.typeface = Fun.setFont(this, "body")
        binding.viewButtonText.typeface = Fun.setFont(this, "body")
        binding.photoButtonText.typeface = Fun.setFont(this, "body")
        binding.easyButtonText.typeface = Fun.setFont(this, "body")
        binding.relationshipButtonText.typeface = Fun.setFont(this, "body")
        binding.bioButtonText.typeface = Fun.setFont(this, "body")
        binding.drinkButtonText.typeface = Fun.setFont(this, "body")
        binding.smokeButtonText.typeface = Fun.setFont(this, "body")
        binding.drugsButtonText.typeface = Fun.setFont(this, "body")
        binding.childrenButtonText.typeface = Fun.setFont(this, "body")
        binding.travelButtonText.typeface = Fun.setFont(this, "body")
        binding.heightButtonText.typeface = Fun.setFont(this, "body")
        binding.petButtonText.typeface = Fun.setFont(this, "body")
        binding.musicButtonText.typeface = Fun.setFont(this, "body")
        binding.foodButtonText.typeface = Fun.setFont(this, "body")
        binding.politicalButtonText.typeface = Fun.setFont(this, "body")
        binding.educationButtonText.typeface = Fun.setFont(this, "body")
        binding.languageButtonText.typeface = Fun.setFont(this, "body")
        binding.employmentButtonText.typeface = Fun.setFont(this, "body")
        binding.incomeButtonText.typeface = Fun.setFont(this, "body")
        binding.viewsButtonText.typeface = Fun.setFont(this, "body")
        binding.raceButtonText.typeface = Fun.setFont(this, "body")
        binding.religionButtonText.typeface = Fun.setFont(this, "body")
        binding.photoToDo.typeface = Fun.setFont(this, "body")
        binding.easyToDo.typeface = Fun.setFont(this, "body")
        binding.bioToDo.typeface = Fun.setFont(this, "body")
        binding.childrenToDo.typeface = Fun.setFont(this, "body")
        binding.travelToDo.typeface = Fun.setFont(this, "body")
        binding.heightToDo.typeface = Fun.setFont(this, "body")
        binding.petToDo.typeface = Fun.setFont(this, "body")
        binding.musicToDo.typeface = Fun.setFont(this, "body")
        binding.foodToDo.typeface = Fun.setFont(this, "body")
        binding.politicalToDo.typeface = Fun.setFont(this, "body")
        binding.educationToDo.typeface = Fun.setFont(this, "body")
        binding.languageToDo.typeface = Fun.setFont(this, "body")
        binding.employmentToDo.typeface = Fun.setFont(this, "body")
        binding.incomeToDo.typeface = Fun.setFont(this, "body")
        binding.viewsToDo.typeface = Fun.setFont(this, "body")
        binding.drinkToDo.typeface = Fun.setFont(this, "body")
        binding.smokeToDo.typeface = Fun.setFont(this, "body")
        binding.drugsToDo.typeface = Fun.setFont(this, "body")
        binding.raceToDo.typeface = Fun.setFont(this, "body")
        binding.religionToDo.typeface = Fun.setFont(this, "body")
        //footer font
        binding.homeText.typeface = Fun.setFont(this, "body")
        binding.profileText.typeface = Fun.setFont(this, "body")
        binding.swipeText.typeface = Fun.setFont(this, "body")
        binding.messageText.typeface = Fun.setFont(this, "body")
        //init button focus & to do views
        Fun.setFocusProfileMenu(this,
                                binding.photoButtonBackground, binding.photoButtonIcon, binding.photoButtonText,
                                binding.easyButtonBackground, binding.easyButtonIcon, binding.easyButtonText,
                                binding.bioButtonBackground, binding.bioButtonIcon, binding.bioButtonText,
                                binding.childrenButtonBackground, binding.childrenButtonIcon, binding.childrenButtonText,
                                binding.travelButtonBackground, binding.travelButtonIcon, binding.travelButtonText,
                                binding.heightButtonBackground, binding.heightButtonIcon, binding.heightButtonText,
                                binding.petButtonBackground, binding.petButtonIcon, binding.petButtonText,
                                binding.musicButtonBackground, binding.musicButtonIcon, binding.musicButtonText,
                                binding.foodButtonBackground, binding.foodButtonIcon, binding.foodButtonText,
                                binding.politicalButtonBackground, binding.politicalButtonIcon, binding.politicalButtonText,
                                binding.educationButtonBackground, binding.educationButtonIcon, binding.educationButtonText,
                                binding.languageButtonBackground, binding.languageButtonIcon, binding.languageButtonText,
                                binding.employmentButtonBackground, binding.employmentButtonIcon, binding.employmentButtonText,
                                binding.incomeButtonBackground, binding.incomeButtonIcon, binding.incomeButtonText,
                                binding.viewsButtonBackground, binding.viewsButtonIcon, binding.viewsButtonText,
                                binding.drinkButtonBackground, binding.drinkButtonIcon, binding.drinkButtonText,
                                binding.smokeButtonBackground, binding.smokeButtonIcon, binding.smokeButtonText,
                                binding.drugsButtonBackground, binding.drugsButtonIcon, binding.drugsButtonText,
                                binding.raceButtonBackground, binding.raceButtonIcon, binding.raceButtonText,
                                binding.religionButtonBackground, binding.religionButtonIcon, binding.religionButtonText,
                                binding.relationshipButtonBackground, binding.relationshipButtonIcon, binding.relationshipButtonText,
                                binding.photoToDo, binding.easyToDo, binding.bioToDo,
                                binding.childrenToDo, binding.travelToDo, binding.heightToDo,
                                binding.petToDo, binding.musicToDo, binding.foodToDo,
                                binding.politicalToDo, binding.educationToDo, binding.languageToDo,
                                binding.employmentToDo, binding.incomeToDo, binding.viewsToDo,
                                binding.drinkToDo, binding.drugsToDo, binding.smokeToDo, binding.raceToDo, binding.religionToDo)
        //init footer widget & progress
        Fun.calculateProfileWidgetAndProgress()
        Fun.setWidgetAndProgress(Helper.homeWidget, Helper.homeProgress, binding.homeWidget, binding.homeWidgetText, binding.homeProgressBar)
        Fun.setWidgetAndProgress(Helper.profileWidget, Helper.profileProgress, binding.profileWidget, binding.profileWidgetText, binding.profileProgressBar)
        Fun.setWidgetAndProgress(Helper.swipeWidget, Helper.swipeProgress, binding.swipeWidget, binding.swipeWidgetText, binding.swipeProgressBar)
        Fun.setWidgetAndProgress(Helper.messageWidget, Helper.messageProgress, binding.messageWidget, binding.messageWidgetText, binding.messageProgressBar)
        //init animation
        Fun.startAnimation(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.menuContainer, binding.headlineContainer,binding.bodyContainer,binding.footerContainer)
        //set body buttons
        binding.homeButton.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                            binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                            binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.homeButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileHome::class.java));finish()}, 1600) }
        binding.holidayButton.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.holidayButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileHoliday::class.java));finish()}, 1600) }
        binding.viewButton.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.viewButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileView::class.java));finish()}, 1600) }
        binding.photoButton.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.photoButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfilePhotoQuestion::class.java));finish()}, 1600) }
        binding.photoToDo.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.photoButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfilePhotoQuestion::class.java));finish()}, 1600) }
        binding.easyButton.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.easyButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileEasy::class.java));finish()}, 1600) }
        binding.easyToDo.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.easyButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileEasy::class.java));finish()}, 1600) }
        binding.relationshipButton.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.relationshipButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileRelationship::class.java));finish()}, 1600) }
        binding.relationshipToDo.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.relationshipButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileRelationship::class.java));finish()}, 1600) }
        binding.bioButton.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.bioButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileBiograpy::class.java));finish()}, 1600) }
        binding.bioToDo.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.bioButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileBiograpy::class.java));finish()}, 1600) }
        binding.drinkButton.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.drinkButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileDrink::class.java));finish()}, 1600) }
        binding.drinkToDo.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.drinkButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileDrink::class.java));finish()}, 1600) }
        binding.smokeButton.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.smokeButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileSmoke::class.java));finish()}, 1600) }
        binding.smokeToDo.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.smokeButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileSmoke::class.java));finish()}, 1600) }
        binding.drugsButton.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.drugsButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileDrug::class.java));finish()}, 1600) }
        binding.drugsToDo.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.drugsButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileDrug::class.java));finish()}, 1600) }
        binding.childrenButton.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.childrenButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileChildren::class.java));finish()}, 1600) }
        binding.childrenToDo.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.childrenButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileChildren::class.java));finish()}, 1600) }
        binding.travelButton.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.travelButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileTravel::class.java));finish()}, 1600) }
        binding.travelToDo.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.travelButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileTravel::class.java));finish()}, 1600) }
        binding.heightButton.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.heightButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileHeight::class.java));finish()}, 1600) }
        binding.heightToDo.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.heightButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileHeight::class.java));finish()}, 1600) }
        binding.petButton.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.petButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfilePet::class.java));finish()}, 1600) }
        binding.petToDo.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.petButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfilePet::class.java));finish()}, 1600) }
        binding.musicButton.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.musicButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileMusic::class.java));finish()}, 1600) }
        binding.musicToDo.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.musicButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileMusic::class.java));finish()}, 1600) }
        binding.foodButton.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.foodButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileFood::class.java));finish()}, 1600) }
        binding.foodToDo.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.foodButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileFood::class.java));finish()}, 1600) }
        binding.politicalButton.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.politicalButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfilePolitical::class.java));finish()}, 1600) }
        binding.politicalToDo.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.politicalButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfilePolitical::class.java));finish()}, 1600) }
        binding.educationButton.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.educationButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileEducation::class.java));finish()}, 1600) }
        binding.educationToDo.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.educationButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileEducation::class.java));finish()}, 1600) }
        binding.languageButton.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.languageButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileLanguageFirst::class.java));finish()}, 1600) }
        binding.languageToDo.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.languageButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileLanguageFirst::class.java));finish()}, 1600) }
        binding.employmentButton.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.employmentButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileEmployment::class.java));finish()}, 1600) }
        binding.employmentToDo.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.employmentButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileEmployment::class.java));finish()}, 1600) }
        binding.incomeButton.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.incomeButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileIncome::class.java));finish()}, 1600) }
        binding.incomeToDo.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.incomeButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileIncome::class.java));finish()}, 1600) }
        binding.raceButton.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.viewsButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileRace::class.java));finish()}, 1600) }
        binding.raceToDo.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.viewsButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileRace::class.java));finish()}, 1600) }
        binding.viewsButton.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.viewsButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileViews::class.java));finish()}, 1600) }
        binding.viewsToDo.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.viewsButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileViews::class.java));finish()}, 1600) }
        binding.religionButton.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.viewsButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileReligion::class.java));finish()}, 1600) }
        binding.religionToDo.setOnClickListener{
            Fun.finishAnimationProfileToDo(binding.photoToDo,binding.easyToDo,binding.bioToDo, binding.childrenToDo,binding.travelToDo,binding.heightToDo,
                                           binding.petToDo,binding.musicToDo,binding.foodToDo, binding.politicalToDo,binding.educationToDo,binding.languageToDo,
                                           binding.employmentToDo,binding.incomeToDo,binding.viewsToDo, binding.drinkToDo,binding.drugsToDo,binding.smokeToDo,binding.raceToDo,binding.religionToDo)
            Fun.finishAnimationProfileBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer, binding.bodyContainer, binding.footerContainer, 2000,
                                                        binding.homeButton, binding.holidayButton, binding.viewButton, binding.photoButton, binding.easyButton, binding.relationshipButton, binding.bioButton, binding.drinkButton,
                                                        binding.smokeButton, binding.drugsButton, binding.childrenButton, binding.travelButton, binding.heightButton, binding.petButton, binding.musicButton, binding.foodButton,
                                                        binding.politicalButton, binding.educationButton, binding.languageButton, binding.employmentButton, binding.incomeButton, binding.viewsButton,
                                                        binding.viewsButton, binding.raceButton, binding.religionButton);binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileReligion::class.java));finish()}, 1600) }
        //set footer buttons
        binding.homeIconContainer.setOnClickListener{
            Fun.saveToServerInfo()
            Fun.finishAnimation(this, binding.headline, binding.profileIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.menuContainer, binding.headlineContainer,binding.bodyContainer,binding.footerContainer, 2000)
            binding.headline.postDelayed({startActivity(Intent(this, ActivityHomeMenu::class.java));finish()}, 1600) }
        binding.swipeIconContainer.setOnClickListener{
            Fun.saveToServerInfo()
            Fun.finishAnimation(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.homeIconContainer, binding.messageIconContainer, binding.menuContainer, binding.headlineContainer,binding.bodyContainer,binding.footerContainer, 2000)
            binding.headline.postDelayed({startActivity(Intent(this, ActivitySwipeMain::class.java));finish()}, 1600) }
        binding.messageIconContainer.setOnClickListener{
            Fun.saveToServerInfo()
            Fun.finishAnimation(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.homeIconContainer, binding.menuContainer, binding.headlineContainer,binding.bodyContainer,binding.footerContainer, 2000)
            binding.headline.postDelayed({startActivity(Intent(this, ActivityMessageChecking::class.java));finish()}, 1600) }
    }
    override fun onDestroy() {
        super.onDestroy()
        Fun.saveToServerInfo()
    }
}