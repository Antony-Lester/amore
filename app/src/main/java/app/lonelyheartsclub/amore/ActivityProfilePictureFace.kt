package app.lonelyheartsclub.amore

import android.Manifest
import android.content.Intent
import android.content.pm.ActivityInfo
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Matrix
import android.os.Bundle
import android.util.Log
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.FileProvider
import app.lonelyheartsclub.amore.databinding.ActivityProfilePictureFaceBinding
import com.google.mlkit.vision.common.InputImage
import com.google.mlkit.vision.face.FaceDetection
import com.google.mlkit.vision.face.FaceDetectorOptions
import com.google.mlkit.vision.segmentation.Segmentation
import com.google.mlkit.vision.segmentation.selfie.SelfieSegmenterOptions
import java.io.File
import java.io.IOException
import java.nio.IntBuffer
import java.util.*

class ActivityProfilePictureFace : AppCompatActivity() {
    private val permission = 101
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;supportActionBar?.hide()
        val binding = ActivityProfilePictureFaceBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val faceOptions = FaceDetectorOptions.Builder().setPerformanceMode(FaceDetectorOptions.PERFORMANCE_MODE_ACCURATE)
            .setLandmarkMode(FaceDetectorOptions.LANDMARK_MODE_NONE).setContourMode(FaceDetectorOptions.CONTOUR_MODE_NONE).setClassificationMode(FaceDetectorOptions.CLASSIFICATION_MODE_ALL) //Smiling//eyes open ect
            .setMinFaceSize(0.8f)
            .enableTracking().build()
        val getFaceImage = registerForActivityResult(ActivityResultContracts.TakePicture()) {
            // face detector from uri
            try {
                val image : InputImage = InputImage.fromFilePath(this, Helper.fileuri !!)
                // setup face detector
                val detector = FaceDetection.getClient(faceOptions)
                detector.process(image).addOnSuccessListener { faces ->
                    Helper.retake = null
                    if (faces.count() > 1) {
                        Helper.retake = "M"
                        Fun.finishAnimationLoading(this@ActivityProfilePictureFace,binding.headlineContainer,binding.bodyContainer,binding.footerContainer,binding.loadingBar,binding.loadingContainer, binding.title,binding.bodyText , binding.loadingBar, binding.loadingIcon, binding.tips)
                        binding.headlineContainer.postDelayed({startActivity(Intent(this@ActivityProfilePictureFace, ActivityProfilePictureFaceRetake::class.java));finish()}, 1600)}
                    else if (faces == null) {
                        Helper.retake = "N"
                        Fun.finishAnimationLoading(this@ActivityProfilePictureFace,binding.headlineContainer,binding.bodyContainer,binding.footerContainer,binding.loadingBar,binding.loadingContainer, binding.title,binding.bodyText , binding.loadingBar, binding.loadingIcon, binding.tips)
                        binding.headlineContainer.postDelayed({startActivity(Intent(this@ActivityProfilePictureFace, ActivityProfilePictureFaceRetake::class.java));finish()}, 1600)}
                    else {val face = faces[0]
                        if (face.smilingProbability == null || face.leftEyeOpenProbability == null || face.rightEyeOpenProbability == null || face.trackingId == null) {
                            Helper.retake = "SE"
                            Fun.finishAnimationLoading(this@ActivityProfilePictureFace,binding.headlineContainer,binding.bodyContainer,binding.footerContainer,binding.loadingBar,binding.loadingContainer, binding.title,binding.bodyText , binding.loadingBar, binding.loadingIcon, binding.tips)
                            binding.headlineContainer.postDelayed({startActivity(Intent(this@ActivityProfilePictureFace, ActivityProfilePictureFaceRetake::class.java));finish()}, 1600)}
                        else if (face.smilingProbability !! < 0.80f) {
                            Helper.retake = "S"
                            Fun.finishAnimationLoading(this@ActivityProfilePictureFace,binding.headlineContainer,binding.bodyContainer,binding.footerContainer,binding.loadingBar,binding.loadingContainer, binding.title,binding.bodyText , binding.loadingBar, binding.loadingIcon, binding.tips)
                            binding.headlineContainer.postDelayed({startActivity(Intent(this@ActivityProfilePictureFace, ActivityProfilePictureFaceRetake::class.java));finish()}, 1600)}
                        else if (face.leftEyeOpenProbability !! < 0.80f || face.rightEyeOpenProbability !! < 0.80f) {
                            Helper.retake = "E"
                            Fun.finishAnimationLoading(this@ActivityProfilePictureFace,binding.headlineContainer,binding.bodyContainer,binding.footerContainer,binding.loadingBar,binding.loadingContainer, binding.title,binding.bodyText , binding.loadingBar, binding.loadingIcon, binding.tips)
                            binding.headlineContainer.postDelayed({startActivity(Intent(this@ActivityProfilePictureFace, ActivityProfilePictureFaceRetake::class.java));finish()}, 1600)}
                        else {
                            Helper.retake = "OK"
                            val optionsSelfieSegment = SelfieSegmenterOptions.Builder().setDetectorMode(SelfieSegmenterOptions.SINGLE_IMAGE_MODE).build()
                            val segment = Segmentation.getClient(optionsSelfieSegment)
                            segment.process(image).addOnSuccessListener { results ->
                                val mask = results.buffer
                                mask.rewind()
                                val maskWidth = results.width
                                val maskHeight = results.height
                                val originalImage = image.byteBuffer
                                originalImage?.rewind()
                                val result = IntArray(maskWidth * maskHeight)
                                for (i in 0 until maskWidth * maskHeight) {
                                    val backgroundLikelihood = 1 - mask.float
                                    if (backgroundLikelihood > 0.7) {result[i] = Color.argb(255, 0, 177, 64)}
                                    else {result[i] = Color.argb(0, 0, 0, 0) }}
                                val nearlyFinalImage = Bitmap.createBitmap(maskWidth, maskHeight, Bitmap.Config.ARGB_8888)
                                val resultCanvas = Canvas(nearlyFinalImage)
                                val maskResult : Bitmap = Bitmap.createBitmap(maskWidth, maskHeight, Bitmap.Config.ARGB_8888)
                                maskResult.copyPixelsFromBuffer(IntBuffer.wrap(result))
                                val maskResultForeground : Bitmap = maskResult
                                val originalImageResult : Bitmap? = image.bitmapInternal
                                val originalImageBackground : Bitmap? = originalImageResult
                                resultCanvas.drawBitmap(originalImageBackground !!, Matrix(), null)
                                resultCanvas.drawBitmap(maskResultForeground, Matrix(), null)
                                val pixelsArray = IntArray(maskWidth * maskHeight)
                                val oldColor = -12537600
                                val newColor = Color.argb(0, 0, 0, 0)
                                nearlyFinalImage.getPixels(pixelsArray, 0, maskWidth, 0, 0, maskWidth, maskHeight)
                                for (y in pixelsArray.indices) {if (pixelsArray[y] == oldColor) {pixelsArray[y] = newColor}}
                                nearlyFinalImage.setPixels(pixelsArray, 0, maskWidth, 0, 0, maskWidth, maskHeight)
                            Info.face_id = face.trackingId
                            Fun.finishAnimationLoading(this@ActivityProfilePictureFace,binding.headlineContainer,binding.bodyContainer,binding.footerContainer,binding.loadingBar,binding.loadingContainer, binding.title,binding.bodyText , binding.loadingBar, binding.loadingIcon, binding.tips)
                            binding.headlineContainer.postDelayed({startActivity(Intent(this@ActivityProfilePictureFace, ActivityProfilePictureFaceApprove::class.java));finish()}, 1600)}
                        }
                    }
                }
            } catch (e : IOException) {e.printStackTrace()}
        }
        fun isCameraPermissionGranted(): Boolean {
            return if (ActivityCompat.checkSelfPermission(
                    this,
                    Manifest.permission.CAMERA
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this,
                    arrayOf(Manifest.permission.CAMERA),
                    permission
                )
                false
            } else {
                true
            }
        }
        fun openFaceCamera() {
            Helper.file = File.createTempFile("photo", ".webp", filesDir)
            Helper.filepath = Helper.file !!.path
            Helper.fileuri = FileProvider.getUriForFile(Objects.requireNonNull(applicationContext), "app.lonelyheartsclub.amore.android.fileprovider", Helper.file !!)//androidx.core.content.FileProvider //was .provider////".FileProvider"
            Log.d("MAIN", "Helper.file uri:${Helper.fileuri}")
            getFaceImage.launch(Helper.fileuri)}
        if (isCameraPermissionGranted()) {openFaceCamera()} else {Log.d("Main", "isCameraPermissionGranted() = False")}
    }
}
