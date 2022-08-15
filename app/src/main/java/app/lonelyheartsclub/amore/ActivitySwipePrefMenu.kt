package app.lonelyheartsclub.amore

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.lonelyheartsclub.amore.databinding.ActivitySwipePrefMenuBinding

class ActivitySwipePrefMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;supportActionBar?.hide()
        val binding  = ActivitySwipePrefMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //header font
        binding.headline.typeface = Fun.setFont(this, "headline")
        //stats font
        binding.statsHeadline.typeface = Fun.setFont(this, "headline")
        binding.stats.typeface = Fun.setFont(this, "headline")
        binding.reset.typeface = Fun.setFont(this, "body")
        //body font
        binding.reputationScoreButtonText.typeface = Fun.setFont(this, "body")
        binding.ageButtonText.typeface = Fun.setFont(this, "body")
        binding.bmiButtonText.typeface = Fun.setFont(this, "body")
        binding.easyButtonText.typeface = Fun.setFont(this, "body")
        binding.relationshipButtonText.typeface = Fun.setFont(this, "body")
        binding.drinkButtonText.typeface = Fun.setFont(this, "body")
        binding.smokeButtonText.typeface = Fun.setFont(this, "body")
        binding.drugsButtonText.typeface = Fun.setFont(this, "body")
        binding.childrenButtonText.typeface = Fun.setFont(this, "body")
        binding.travelButtonText.typeface = Fun.setFont(this, "body")
        binding.heightButtonText.typeface = Fun.setFont(this, "body")
        binding.petButtonText.typeface = Fun.setFont(this, "body")
        binding.foodButtonText.typeface = Fun.setFont(this, "body")
        binding.politicalButtonText.typeface = Fun.setFont(this, "body")
        binding.educationButtonText.typeface = Fun.setFont(this, "body")
        binding.languageButtonText.typeface = Fun.setFont(this, "body")
        binding.employmentButtonText.typeface = Fun.setFont(this, "body")
        binding.incomeButtonText.typeface = Fun.setFont(this, "body")
        binding.viewsButtonText.typeface = Fun.setFont(this, "body")
        binding.raceButtonText.typeface = Fun.setFont(this, "body")
        binding.religionButtonText.typeface = Fun.setFont(this, "body")
        //footer font
        binding.homeText.typeface = Fun.setFont(this, "body")
        binding.profileText.typeface = Fun.setFont(this, "body")
        binding.swipeText.typeface = Fun.setFont(this, "body")
        binding.messageText.typeface = Fun.setFont(this, "body")
        //init footer widget & progress
        Fun.calculateProfileWidgetAndProgress()
        Fun.calculateSwipeWidgetAndProgress()
        Fun.setWidgetAndProgress(Helper.homeWidget, Helper.homeProgress, binding.homeWidget, binding.homeWidgetText, binding.homeProgressBar)
        Fun.setWidgetAndProgress(Helper.profileWidget, Helper.profileProgress, binding.profileWidget, binding.profileWidgetText, binding.profileProgressBar)
        Fun.setWidgetAndProgress(Helper.swipeWidget, Helper.swipeProgress, binding.swipeWidget, binding.swipeWidgetText, binding.swipeProgressBar)
        Fun.setWidgetAndProgress(Helper.messageWidget, Helper.messageProgress, binding.messageWidget, binding.messageWidgetText, binding.messageProgressBar)
        //init body on button click
        binding.reset.setOnClickListener{
            Pref.income = null
            Pref.reputationScore = 0
            Pref.minAge = null
            Pref.maxAge = null
            Pref.minHeight = null
            Pref.maxHeight = null
            Pref.bmi = null
            Pref.easy = null
            Pref.travel = null
            Pref.drugs = null
            Pref.drink = null
            Pref.education = null
            Pref.smoke = null
            Pref.food = null
            Pref.relationship = null
            Pref.children = null
            Pref.pet = null
            Pref.political = null
            Pref.religion = null
            Pref.employment = null
            Pref.language = null
            Pref.race = null
            Pref.views = null
            Fun.setFocusSwipePreferencesMenu(
                    this,
                    binding.incomeButtonBackground,
                    binding.incomeButtonIcon,
                    binding.incomeButtonText,
                    binding.heightButtonBackground,
                    binding.heightButtonIcon,
                    binding.heightButtonText,
                    binding.ageButtonBackground,
                    binding.ageButtonIcon,
                    binding.ageButtonText,
                    binding.bmiButtonBackground,
                    binding.bmiButtonIcon,
                    binding.bmiButtonText,
                    binding.easyButtonBackground,
                    binding.easyButtonIcon,
                    binding.easyButtonText,
                    binding.travelButtonBackground,
                    binding.travelButtonIcon,
                    binding.travelButtonText,
                    binding.drugsButtonBackground,
                    binding.drugsButtonIcon,
                    binding.drugsButtonText,
                    binding.drinkButtonBackground,
                    binding.drinkButtonIcon,
                    binding.drinkButtonText,
                    binding.educationButtonBackground,
                    binding.educationButtonIcon,
                    binding.educationButtonText,
                    binding.smokeButtonBackground,
                    binding.smokeButtonIcon,
                    binding.smokeButtonText,
                    binding.foodButtonBackground,
                    binding.foodButtonIcon,
                    binding.foodButtonText,
                    binding.relationshipButtonBackground,
                    binding.relationshipButtonIcon,
                    binding.relationshipButtonText,
                    binding.childrenButtonBackground,
                    binding.childrenButtonIcon,
                    binding.childrenButtonText,
                    binding.petButtonBackground,
                    binding.petButtonIcon,
                    binding.petButtonText,
                    binding.politicalButtonBackground,
                    binding.politicalButtonIcon,
                    binding.politicalButtonText,
                    binding.religionButtonBackground,
                    binding.religionButtonIcon,
                    binding.religionButtonText,
                    binding.employmentButtonBackground,
                    binding.employmentButtonIcon,
                    binding.employmentButtonText,
                    binding.languageButtonBackground,
                    binding.languageButtonIcon,
                    binding.languageButtonText,
                    binding.raceButtonBackground,
                    binding.raceButtonIcon,
                    binding.raceButtonText,
                    binding.viewsButtonBackground,
                    binding.viewsButtonIcon,
                    binding.viewsButtonText,
                    binding.stats,
                    binding.reputationScoreButtonBackground,
                    binding.reputationScoreButtonIcon,
                    binding.reputationScoreButtonText,)
        }
        //
        binding.reputationScoreButton.setOnClickListener{
            Fun.finishAnimationSwipePreferencesBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer,binding.bodyContainer,binding.footerContainer, 2000, binding.reputationScoreButton, binding.ageButton, binding.easyButton, binding.relationshipButton, binding.bmiButton, binding.childrenButton, binding.heightButton, binding.drinkButton, binding.smokeButton, binding.drugsButton, binding.religionButton, binding.raceButton, binding.languageButton, binding.petButton, binding.educationButton, binding.incomeButton, binding.employmentButton, binding.politicalButton, binding.travelButton, binding.viewsButton, binding.foodButton, binding.reputationScoreButton, binding.row0)
            binding.headline.postDelayed({startActivity(Intent(this, ActivitySwipePrefRating::class.java));finish()}, 1600)
        }
        binding.ageButton.setOnClickListener{
            Fun.finishAnimationSwipePreferencesBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer,binding.bodyContainer,binding.footerContainer, 2000, binding.reputationScoreButton, binding.ageButton, binding.easyButton, binding.relationshipButton, binding.bmiButton, binding.childrenButton, binding.heightButton, binding.drinkButton, binding.smokeButton, binding.drugsButton, binding.religionButton, binding.raceButton, binding.languageButton, binding.petButton, binding.educationButton, binding.incomeButton, binding.employmentButton, binding.politicalButton, binding.travelButton, binding.viewsButton, binding.foodButton, binding.easyButton, binding.row0)
            binding.headline.postDelayed({startActivity(Intent(this, ActivitySwipePrefAge::class.java));finish()}, 1600)
        }
        binding.easyButton.setOnClickListener{
            Fun.finishAnimationSwipePreferencesBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer,binding.bodyContainer,binding.footerContainer, 2000, binding.reputationScoreButton, binding.ageButton, binding.easyButton, binding.relationshipButton, binding.bmiButton, binding.childrenButton, binding.heightButton, binding.drinkButton, binding.smokeButton, binding.drugsButton, binding.religionButton, binding.raceButton, binding.languageButton, binding.petButton, binding.educationButton, binding.incomeButton, binding.employmentButton, binding.politicalButton, binding.travelButton, binding.viewsButton, binding.foodButton, binding.easyButton, binding.row0)
            binding.headline.postDelayed({startActivity(Intent(this, ActivitySwipePrefIntentions::class.java));finish()}, 1600)
        }
        binding.relationshipButton.setOnClickListener{
            Fun.finishAnimationSwipePreferencesBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer,binding.bodyContainer,binding.footerContainer, 2000, binding.reputationScoreButton, binding.ageButton, binding.easyButton, binding.relationshipButton, binding.bmiButton, binding.childrenButton, binding.heightButton, binding.drinkButton, binding.smokeButton, binding.drugsButton, binding.religionButton, binding.raceButton, binding.languageButton, binding.petButton, binding.educationButton, binding.incomeButton, binding.employmentButton, binding.politicalButton, binding.travelButton, binding.viewsButton, binding.foodButton, binding.relationshipButton, binding.row0)
            binding.headline.postDelayed({startActivity(Intent(this, ActivitySwipePrefRelationship::class.java));finish()}, 1600)
        }
        //
        binding.bmiButton.setOnClickListener{
            Fun.finishAnimationSwipePreferencesBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer,binding.bodyContainer,binding.footerContainer, 2000, binding.reputationScoreButton, binding.ageButton, binding.easyButton, binding.relationshipButton, binding.bmiButton, binding.childrenButton, binding.heightButton, binding.drinkButton, binding.smokeButton, binding.drugsButton, binding.religionButton, binding.raceButton, binding.languageButton, binding.petButton, binding.educationButton, binding.incomeButton, binding.employmentButton, binding.politicalButton, binding.travelButton, binding.viewsButton, binding.foodButton, binding.bmiButton, binding.row0)
            binding.headline.postDelayed({startActivity(Intent(this, ActivitySwipePrefBuild::class.java));finish()}, 1600)
        }
        binding.childrenButton.setOnClickListener{
            Fun.finishAnimationSwipePreferencesBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer,binding.bodyContainer,binding.footerContainer, 2000, binding.reputationScoreButton, binding.ageButton, binding.easyButton, binding.relationshipButton, binding.bmiButton, binding.childrenButton, binding.heightButton, binding.drinkButton, binding.smokeButton, binding.drugsButton, binding.religionButton, binding.raceButton, binding.languageButton, binding.petButton, binding.educationButton, binding.incomeButton, binding.employmentButton, binding.politicalButton, binding.travelButton, binding.viewsButton, binding.foodButton, binding.childrenButton, binding.row0)
            binding.headline.postDelayed({startActivity(Intent(this, ActivitySwipePrefChildren::class.java));finish()}, 1600)
        }
        binding.heightButton.setOnClickListener{
            Fun.finishAnimationSwipePreferencesBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer,binding.bodyContainer,binding.footerContainer, 2000, binding.reputationScoreButton, binding.ageButton, binding.easyButton, binding.relationshipButton, binding.bmiButton, binding.childrenButton, binding.heightButton, binding.drinkButton, binding.smokeButton, binding.drugsButton, binding.religionButton, binding.raceButton, binding.languageButton, binding.petButton, binding.educationButton, binding.incomeButton, binding.employmentButton, binding.politicalButton, binding.travelButton, binding.viewsButton, binding.foodButton, binding.heightButton, binding.row0)
            binding.headline.postDelayed({startActivity(Intent(this, ActivitySwipePrefHeight::class.java));finish()}, 1600)
        }
        //
        binding.drinkButton.setOnClickListener{
            Fun.finishAnimationSwipePreferencesBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer,binding.bodyContainer,binding.footerContainer, 2000, binding.reputationScoreButton, binding.ageButton, binding.easyButton, binding.relationshipButton, binding.bmiButton, binding.childrenButton, binding.heightButton, binding.drinkButton, binding.smokeButton, binding.drugsButton, binding.religionButton, binding.raceButton, binding.languageButton, binding.petButton, binding.educationButton, binding.incomeButton, binding.employmentButton, binding.politicalButton, binding.travelButton, binding.viewsButton, binding.foodButton, binding.drinkButton, binding.row0)
            binding.headline.postDelayed({startActivity(Intent(this, ActivitySwipePrefDrink::class.java));finish()}, 1600)
        }
        binding.smokeButton.setOnClickListener{
            Fun.finishAnimationSwipePreferencesBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer,binding.bodyContainer,binding.footerContainer, 2000, binding.reputationScoreButton, binding.ageButton, binding.easyButton, binding.relationshipButton, binding.bmiButton, binding.childrenButton, binding.heightButton, binding.drinkButton, binding.smokeButton, binding.drugsButton, binding.religionButton, binding.raceButton, binding.languageButton, binding.petButton, binding.educationButton, binding.incomeButton, binding.employmentButton, binding.politicalButton, binding.travelButton, binding.viewsButton, binding.foodButton, binding.smokeButton, binding.row0)
            binding.headline.postDelayed({startActivity(Intent(this, ActivitySwipePrefSmoke::class.java));finish()}, 1600)
        }
        binding.drugsButton.setOnClickListener{
            Fun.finishAnimationSwipePreferencesBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer,binding.bodyContainer,binding.footerContainer, 2000, binding.reputationScoreButton, binding.ageButton, binding.easyButton, binding.relationshipButton, binding.bmiButton, binding.childrenButton, binding.heightButton, binding.drinkButton, binding.smokeButton, binding.drugsButton, binding.religionButton, binding.raceButton, binding.languageButton, binding.petButton, binding.educationButton, binding.incomeButton, binding.employmentButton, binding.politicalButton, binding.travelButton, binding.viewsButton, binding.foodButton, binding.drugsButton, binding.row0)
            binding.headline.postDelayed({startActivity(Intent(this, ActivitySwipePrefDrug::class.java));finish()}, 1600)
        }
        binding.religionButton.setOnClickListener{
            Fun.finishAnimationSwipePreferencesBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer,binding.bodyContainer,binding.footerContainer, 2000, binding.reputationScoreButton, binding.ageButton, binding.easyButton, binding.relationshipButton, binding.bmiButton, binding.childrenButton, binding.heightButton, binding.drinkButton, binding.smokeButton, binding.drugsButton, binding.religionButton, binding.raceButton, binding.languageButton, binding.petButton, binding.educationButton, binding.incomeButton, binding.employmentButton, binding.politicalButton, binding.travelButton, binding.viewsButton, binding.foodButton, binding.religionButton, binding.row0)
            binding.headline.postDelayed({startActivity(Intent(this, ActivitySwipePrefReligion::class.java));finish()}, 1600)
        }
        //
        binding.raceButton.setOnClickListener{
            Fun.finishAnimationSwipePreferencesBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer,binding.bodyContainer,binding.footerContainer, 2000, binding.reputationScoreButton, binding.ageButton, binding.easyButton, binding.relationshipButton, binding.bmiButton, binding.childrenButton, binding.heightButton, binding.drinkButton, binding.smokeButton, binding.drugsButton, binding.religionButton, binding.raceButton, binding.languageButton, binding.petButton, binding.educationButton, binding.incomeButton, binding.employmentButton, binding.politicalButton, binding.travelButton, binding.viewsButton, binding.foodButton, binding.raceButton, binding.row0)
            binding.headline.postDelayed({startActivity(Intent(this, ActivitySwipePrefRace::class.java));finish()}, 1600)
        }
        binding.languageButton.setOnClickListener{
            Fun.finishAnimationSwipePreferencesBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer,binding.bodyContainer,binding.footerContainer, 2000, binding.reputationScoreButton, binding.ageButton, binding.easyButton, binding.relationshipButton, binding.bmiButton, binding.childrenButton, binding.heightButton, binding.drinkButton, binding.smokeButton, binding.drugsButton, binding.religionButton, binding.raceButton, binding.languageButton, binding.petButton, binding.educationButton, binding.incomeButton, binding.employmentButton, binding.politicalButton, binding.travelButton, binding.viewsButton, binding.foodButton, binding.languageButton, binding.row0)
            binding.headline.postDelayed({startActivity(Intent(this, ActivitySwipePrefLanguage::class.java));finish()}, 1600)
        }
        binding.petButton.setOnClickListener{
            Fun.finishAnimationSwipePreferencesBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer,binding.bodyContainer,binding.footerContainer, 2000, binding.reputationScoreButton, binding.ageButton, binding.easyButton, binding.relationshipButton, binding.bmiButton, binding.childrenButton, binding.heightButton, binding.drinkButton, binding.smokeButton, binding.drugsButton, binding.religionButton, binding.raceButton, binding.languageButton, binding.petButton, binding.educationButton, binding.incomeButton, binding.employmentButton, binding.politicalButton, binding.travelButton, binding.viewsButton, binding.foodButton, binding.petButton, binding.row0)
            binding.headline.postDelayed({startActivity(Intent(this, ActivitySwipePrefPet::class.java));finish()}, 1600)
        }
        //
        binding.educationButton.setOnClickListener{
            Fun.finishAnimationSwipePreferencesBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer,binding.bodyContainer,binding.footerContainer, 2000, binding.reputationScoreButton, binding.ageButton, binding.easyButton, binding.relationshipButton, binding.bmiButton, binding.childrenButton, binding.heightButton, binding.drinkButton, binding.smokeButton, binding.drugsButton, binding.religionButton, binding.raceButton, binding.languageButton, binding.petButton, binding.educationButton, binding.incomeButton, binding.employmentButton, binding.politicalButton, binding.travelButton, binding.viewsButton, binding.foodButton, binding.educationButton, binding.row0)
            binding.headline.postDelayed({startActivity(Intent(this, ActivitySwipePrefEducation::class.java));finish()}, 1600)
        }
        binding.incomeButton.setOnClickListener{
            Fun.finishAnimationSwipePreferencesBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer,binding.bodyContainer,binding.footerContainer, 2000, binding.reputationScoreButton, binding.ageButton, binding.easyButton, binding.relationshipButton, binding.bmiButton, binding.childrenButton, binding.heightButton, binding.drinkButton, binding.smokeButton, binding.drugsButton, binding.religionButton, binding.raceButton, binding.languageButton, binding.petButton, binding.educationButton, binding.incomeButton, binding.employmentButton, binding.politicalButton, binding.travelButton, binding.viewsButton, binding.foodButton, binding.incomeButton, binding.row0)
            binding.headline.postDelayed({startActivity(Intent(this, ActivitySwipePrefIncome::class.java));finish()}, 1600)
        }
        binding.employmentButton.setOnClickListener{
            Fun.finishAnimationSwipePreferencesBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer,binding.bodyContainer,binding.footerContainer, 2000, binding.reputationScoreButton, binding.ageButton, binding.easyButton, binding.relationshipButton, binding.bmiButton, binding.childrenButton, binding.heightButton, binding.drinkButton, binding.smokeButton, binding.drugsButton, binding.religionButton, binding.raceButton, binding.languageButton, binding.petButton, binding.educationButton, binding.incomeButton, binding.employmentButton, binding.politicalButton, binding.travelButton, binding.viewsButton, binding.foodButton, binding.employmentButton, binding.row0)
            binding.headline.postDelayed({startActivity(Intent(this, ActivitySwipePrefEmployment::class.java));finish()}, 1600)
        }
        binding.politicalButton.setOnClickListener{
            Fun.finishAnimationSwipePreferencesBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer,binding.bodyContainer,binding.footerContainer, 2000, binding.reputationScoreButton, binding.ageButton, binding.easyButton, binding.relationshipButton, binding.bmiButton, binding.childrenButton, binding.heightButton, binding.drinkButton, binding.smokeButton, binding.drugsButton, binding.religionButton, binding.raceButton, binding.languageButton, binding.petButton, binding.educationButton, binding.incomeButton, binding.employmentButton, binding.politicalButton, binding.travelButton, binding.viewsButton, binding.foodButton, binding.politicalButton, binding.row0)
            binding.headline.postDelayed({startActivity(Intent(this, ActivitySwipePrefPolitical::class.java));finish()}, 1600)
        }
        //
        binding.travelButton.setOnClickListener{
            Fun.finishAnimationSwipePreferencesBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer,binding.bodyContainer,binding.footerContainer, 2000, binding.reputationScoreButton, binding.ageButton, binding.easyButton, binding.relationshipButton, binding.bmiButton, binding.childrenButton, binding.heightButton, binding.drinkButton, binding.smokeButton, binding.drugsButton, binding.religionButton, binding.raceButton, binding.languageButton, binding.petButton, binding.educationButton, binding.incomeButton, binding.employmentButton, binding.politicalButton, binding.travelButton, binding.viewsButton, binding.foodButton, binding.travelButton, binding.row0)
            binding.headline.postDelayed({startActivity(Intent(this, ActivitySwipePrefTravel::class.java));finish()}, 1600)
        }
        binding.viewsButton.setOnClickListener{
            Fun.finishAnimationSwipePreferencesBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer,binding.bodyContainer,binding.footerContainer, 2000, binding.reputationScoreButton, binding.ageButton, binding.easyButton, binding.relationshipButton, binding.bmiButton, binding.childrenButton, binding.heightButton, binding.drinkButton, binding.smokeButton, binding.drugsButton, binding.religionButton, binding.raceButton, binding.languageButton, binding.petButton, binding.educationButton, binding.incomeButton, binding.employmentButton, binding.politicalButton, binding.travelButton, binding.viewsButton, binding.foodButton, binding.viewsButton, binding.row0)
            binding.headline.postDelayed({startActivity(Intent(this, ActivitySwipePrefViews::class.java));finish()}, 1600)
        }
        binding.foodButton.setOnClickListener{
            Fun.finishAnimationSwipePreferencesBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer,binding.bodyContainer,binding.footerContainer, 2000, binding.reputationScoreButton, binding.ageButton, binding.easyButton, binding.relationshipButton, binding.bmiButton, binding.childrenButton, binding.heightButton, binding.drinkButton, binding.smokeButton, binding.drugsButton, binding.religionButton, binding.raceButton, binding.languageButton, binding.petButton, binding.educationButton, binding.incomeButton, binding.employmentButton, binding.politicalButton, binding.travelButton, binding.viewsButton, binding.foodButton, binding.foodButton, binding.row0)
            binding.headline.postDelayed({startActivity(Intent(this, ActivitySwipePrefFood::class.java));finish()}, 1600)
        }
        //init footer on button click
        binding.homeIconContainer.setOnClickListener{
            Fun.finishAnimationSwipePreferencesBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer,binding.bodyContainer,binding.footerContainer, 3000, binding.reputationScoreButton, binding.ageButton, binding.easyButton, binding.relationshipButton, binding.bmiButton, binding.childrenButton, binding.heightButton, binding.drinkButton, binding.smokeButton, binding.drugsButton, binding.religionButton, binding.raceButton, binding.languageButton, binding.petButton, binding.educationButton, binding.incomeButton, binding.employmentButton, binding.politicalButton, binding.travelButton, binding.viewsButton, binding.foodButton, binding.foodButton, binding.row0)
            binding.headline.postDelayed({startActivity(Intent(this, ActivityHomeMenu::class.java));finish()}, 1600)
        }
        binding.profileIconContainer.setOnClickListener{
            Fun.finishAnimationSwipePreferencesBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer,binding.bodyContainer,binding.footerContainer, 3000, binding.reputationScoreButton, binding.ageButton, binding.easyButton, binding.relationshipButton, binding.bmiButton, binding.childrenButton, binding.heightButton, binding.drinkButton, binding.smokeButton, binding.drugsButton, binding.religionButton, binding.raceButton, binding.languageButton, binding.petButton, binding.educationButton, binding.incomeButton, binding.employmentButton, binding.politicalButton, binding.travelButton, binding.viewsButton, binding.foodButton, binding.foodButton, binding.row0)
            binding.headline.postDelayed({startActivity(Intent(this, ActivityProfileMenu::class.java));finish()}, 1600)
        }
        binding.swipeIconContainer.setOnClickListener{
            Fun.finishAnimationSwipePreferencesBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer,binding.bodyContainer,binding.footerContainer, 3000, binding.reputationScoreButton, binding.ageButton, binding.easyButton, binding.relationshipButton, binding.bmiButton, binding.childrenButton, binding.heightButton, binding.drinkButton, binding.smokeButton, binding.drugsButton, binding.religionButton, binding.raceButton, binding.languageButton, binding.petButton, binding.educationButton, binding.incomeButton, binding.employmentButton, binding.politicalButton, binding.travelButton, binding.viewsButton, binding.foodButton, binding.foodButton, binding.row0)
            binding.headline.postDelayed({startActivity(Intent(this, ActivitySwipeLoading::class.java));finish()}, 1600)
        }
        binding.messageIconContainer.setOnClickListener{
            Fun.finishAnimationSwipePreferencesBodyButton(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.headlineContainer,binding.bodyContainer,binding.footerContainer, 3000, binding.reputationScoreButton, binding.ageButton, binding.easyButton, binding.relationshipButton, binding.bmiButton, binding.childrenButton, binding.heightButton, binding.drinkButton, binding.smokeButton, binding.drugsButton, binding.religionButton, binding.raceButton, binding.languageButton, binding.petButton, binding.educationButton, binding.incomeButton, binding.employmentButton, binding.politicalButton, binding.travelButton, binding.viewsButton, binding.foodButton, binding.foodButton, binding.row0)
            binding.headline.postDelayed({startActivity(Intent(this, ActivityMessageChecking::class.java));finish()}, 1600)
        }
        //init start animation
        Fun.setFocusSwipePreferencesMenu(this, binding.incomeButtonBackground, binding.incomeButtonIcon, binding.incomeButtonText, binding.heightButtonBackground, binding.heightButtonIcon, binding.heightButtonText, binding.ageButtonBackground, binding.ageButtonIcon, binding.ageButtonText, binding.bmiButtonBackground, binding.bmiButtonIcon, binding.bmiButtonText, binding.easyButtonBackground, binding.easyButtonIcon, binding.easyButtonText, binding.travelButtonBackground, binding.travelButtonIcon, binding.travelButtonText, binding.drugsButtonBackground, binding.drugsButtonIcon, binding.drugsButtonText, binding.drinkButtonBackground, binding.drinkButtonIcon, binding.drinkButtonText, binding.educationButtonBackground, binding.educationButtonIcon, binding.educationButtonText, binding.smokeButtonBackground, binding.smokeButtonIcon, binding.smokeButtonText, binding.foodButtonBackground, binding.foodButtonIcon, binding.foodButtonText, binding.relationshipButtonBackground, binding.relationshipButtonIcon, binding.relationshipButtonText, binding.childrenButtonBackground, binding.childrenButtonIcon, binding.childrenButtonText, binding.petButtonBackground, binding.petButtonIcon, binding.petButtonText, binding.politicalButtonBackground, binding.politicalButtonIcon, binding.politicalButtonText, binding.religionButtonBackground, binding.religionButtonIcon, binding.religionButtonText, binding.employmentButtonBackground, binding.employmentButtonIcon, binding.employmentButtonText, binding.languageButtonBackground, binding.languageButtonIcon, binding.languageButtonText, binding.raceButtonBackground, binding.raceButtonIcon, binding.raceButtonText, binding.viewsButtonBackground, binding.viewsButtonIcon, binding.viewsButtonText, binding.stats,binding.reputationScoreButtonBackground,
                                         binding.reputationScoreButtonIcon,
                                         binding.reputationScoreButtonText,)
        Fun.startAnimationSwipePreferencesMenu(this, binding.headline, binding.homeIconContainer, binding.profileIconContainer, binding.swipeIconContainer, binding.messageIconContainer, binding.menuContainer, binding.headlineContainer,binding.bodyContainer,binding.footerContainer, binding.row0)


    }
}