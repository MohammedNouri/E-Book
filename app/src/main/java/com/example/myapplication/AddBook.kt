package com.example.myapplication

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.content.ContextCompat

class AddBook : AppCompatActivity() {
    lateinit var pickImage: Button
    lateinit var selectedImage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_book)
        pickImage = findViewById(R.id.update_img)
        selectedImage = findViewById(R.id.book_img)
        pickImage.setOnClickListener {
            val pickImg = Intent(Intent.ACTION_PICK,MediaStore.Images.Media.INTERNAL_CONTENT_URI)
            changeImage.launch(pickImg) }
    }
    private val changeImage = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ){
        if (it.resultCode == Activity.RESULT_OK){
            val data = it.data
            val imgUri = data?.data
            selectedImage.setImageURI(imgUri)
        }
    }
    private fun checkGalleryPermission(): Boolean {
        // Vérifier la permission pour lire le stockage externe
        return ContextCompat.checkSelfPermission(applicationContext,Manifest.permission.READ_EXTERNAL_STORAGE)== PackageManager.PERMISSION_GRANTED
    }
}