package app.lonelyheartsclub.amore

import android.Manifest
import android.content.Intent
import android.content.pm.ActivityInfo
import android.content.pm.PackageManager
import android.location.Geocoder
import android.location.Location
import android.os.Bundle
import android.os.Looper
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import app.lonelyheartsclub.amore.databinding.ActivityProfileHomeBinding
import com.google.android.gms.location.*
import java.util.*
import java.util.concurrent.TimeUnit


class ActivityProfileHome : AppCompatActivity() {
    val TAG = "Main"
    private val permission = 101
    // FusedLocationProviderClient - Main class for receiving location updates.
    private lateinit var fusedLocationProviderClient: FusedLocationProviderClient
    // LocationRequest - Requirements for the location updates, i.e., how often you should receive updates, the priority, etc.
    private lateinit var locationRequest: LocationRequest
    // LocationCallback - Called when FusedLocationProviderClient has a new Location
    private lateinit var locationCallback: LocationCallback
    // This will store current location info
    private var currentLocation: Location? = null
    //get location name-- from lat & long (check permissions)
    fun calculateLocationName() : String{
        val address = Geocoder(this@ActivityProfileHome , Locale.getDefault()).getFromLocation(Info.lat!!, Info.long!!, 1)
        //TODO CATCH grpc failed FROM ABOVE LINE SUGGESTED  await internet.CheckConnection()
        return when {
            address[0].countryName != null && address[0].locality != null -> { address[0].locality!! + ", " + address[0].countryName!! }
            address[0].countryName != null && address[0].subAdminArea != null -> { address[0].subAdminArea!! + ", " + address[0].countryName!! }
            address[0].countryName != null && address[0].adminArea != null -> { address[0].adminArea!! + ", " + address[0].countryName!! }
            address[0].countryName != null -> { address[0].countryName!! }
            address[0].locality != null -> { address[0].locality!! }
            address[0].subAdminArea != null -> { address[0].subAdminArea!! }
            address[0].adminArea != null -> { address[0].adminArea!! }
            else -> {
                "TrES-2b"
            }
        }}
    //calculate-- location group from lat & long
    fun calculateLocationGroup(): String {
        var editedLatitude = "%.2f".format(Info.lat) //should return ("53.33")
        var editedLongitude = "%.2f".format(Info.long) //should return ("-2.69")
        //Add missing 0 if needed:
        if(editedLatitude.length == 5) {editedLatitude = "00$editedLatitude"}
        if(editedLatitude.length == 6) {editedLatitude = "0$editedLatitude"} //should return("0053.33")
        if(editedLongitude.length == 5) {editedLongitude = "00$editedLongitude"}
        if(editedLongitude.length == 6) {editedLongitude = "0$editedLongitude"} //should return("00-2.69")
        //Set Lat & Long Category:
        if (editedLatitude.takeLast(1).toInt() < 20) {
            editedLatitude.substring(0, 4) + "0"
            //set as 00
        }
        else if (editedLatitude.takeLast(1).toInt() in 20..39) {
            editedLatitude.substring(0, 4) + "2"
            //set as 20 //should return("0053.2")
        }
        else if (editedLatitude.takeLast(1).toInt() in 40..59) {
            editedLatitude.substring(0, 4) + "4"
            //set as 40
        }
        else if (editedLatitude.takeLast(1).toInt() in 60..79) {
            editedLatitude.substring(0, 4) + "6"
            //set as 60
        }
        else {
            editedLatitude.substring(0, 4) + "8"
            //set as 80
        }
        if (editedLongitude.takeLast(1).toInt() < 20) {
            editedLongitude.substring(0, 4) + "0"
            //set as 00
        }
        else if (editedLongitude.takeLast(1).toInt() in 20..39) {
            editedLongitude.substring(0, 4) + "2"
            //set as 20 //should return("0053.2")
        }
        else if (editedLongitude.takeLast(1).toInt() in 40..59) {
            editedLongitude.substring(0, 4) + "4"
            //set as 40
        }
        else if (editedLongitude.takeLast(1).toInt() in 60..79) {
            editedLongitude.substring(0, 4) + "6"
            //set as 60
        }
        else {
            editedLongitude.substring(0, 4) + "8"
            //set as 80
        }
        return Info.country + Info.gender.toString() + editedLatitude + editedLongitude

    }
    //check permissions
    private fun isLocationPermissionGranted(): Boolean {
        return if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION), permission)
            false
        } else {
            true
        }
    }

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;supportActionBar?.hide()
        val binding = ActivityProfileHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //init fonts
        binding.title.typeface = Fun.setFont(this, "headline")
        binding.bodyText.typeface = Fun.setFont(this, "headline")
        binding.tips.typeface = Fun.setFont(this, "headline")
        //init Gps
        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this)
        //Initialize locationRequest
        locationRequest = LocationRequest().apply {
                // Sets the desired interval for active location updates. This interval is inexact.
                interval =
                    TimeUnit.SECONDS.toMillis(60)
                // Sets the fastest rate for active location updates. This interval is exact, and your application will never receive updates more frequently than this value
                fastestInterval = TimeUnit.SECONDS.toMillis(1)
                // Sets the maximum time when batched location updates are delivered. Updates may be delivered sooner than this interval
                maxWaitTime = TimeUnit.MINUTES.toMillis(1)
                priority = LocationRequest.PRIORITY_HIGH_ACCURACY
            }
        //Initialize locationCallback.
        locationCallback = object : LocationCallback() {
                override fun onLocationResult(locationResult : LocationResult) {
                    super.onLocationResult(locationResult)
                    locationResult.lastLocation?.let {
                        currentLocation = it
                        Info.lat = currentLocation !!.latitude
                        Info.long = currentLocation !!.longitude
                        Log.d(TAG, "Info.lat = ${Info.lat}")
                        Log.d(TAG, "Info.long = ${Info.long}")
                        // use latitude and longitude as per your need
                        Info.locationGroup = calculateLocationGroup()
                        Info.countryName = calculateLocationName()
                        Log.d(TAG, "Info.locationGroup = ${Info.locationGroup}")
                        Log.d(TAG, "Info.countryName = ${Info.countryName}")
                        stopLocationUpdates()
                    }
                }
            } }

    override fun onStart() {
        super.onStart()
        val binding  = ActivityProfileHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Fun.startAnimationLoading(this@ActivityProfileHome,binding.headlineContainer,binding.bodyContainer,binding.footerContainer,binding.loadingBar,binding.loadingContainer, binding.title,binding.bodyText , binding.loadingBar, binding.loadingIcon, binding.tips)
        startLocationUpdates()}

    fun startLocationUpdates() {
        Log.d(TAG,"startLocationUpdates()")
        //Now that you initialized everything, you need to let the FusedLocationProviderClient know that you want to receive updates. So Subscribe to location changes.
        fusedLocationProviderClient.requestLocationUpdates(locationRequest, locationCallback, Looper.myLooper())}

    fun stopLocationUpdates() {
        Log.d(TAG,"stopLocationUpdates()")
        val binding  = ActivityProfileHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //When the app no longer needs access to location information, it’s important to unsubscribe from location updates.
        val removeTask =
            fusedLocationProviderClient.removeLocationUpdates(locationCallback)
        removeTask.addOnCompleteListener { task ->
            if (task.isSuccessful) {
                if(Info.bio == null) {Fun.finishAnimationLoading(this@ActivityProfileHome,binding.headlineContainer,binding.bodyContainer,binding.footerContainer,binding.loadingBar,binding.loadingContainer, binding.title,binding.bodyText , binding.loadingBar, binding.loadingIcon, binding.tips)
                    binding.headlineContainer.postDelayed({startActivity(Intent(this@ActivityProfileHome, ActivityProfilePictureFace::class.java));finish()}, 1600)}
                else {Fun.finishAnimationLoading(this@ActivityProfileHome,binding.headlineContainer,binding.bodyContainer,binding.footerContainer,binding.loadingBar,binding.loadingContainer, binding.title,binding.bodyText , binding.loadingBar, binding.loadingIcon, binding.tips)
                    binding.headlineContainer.postDelayed({startActivity(Intent(this@ActivityProfileHome, ActivityProfileMenu::class.java));finish()}, 1600)}
            }
            else {
                Log.d(TAG, "Failed to remove Location Callback.")
            }
        }
    }

}