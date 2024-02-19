package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.fragments.AudioBook
import com.example.myapplication.fragments.ReadBook
import com.example.myapplication.model.ModelBook
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    lateinit var btnNav : BottomNavigationView
    lateinit var btnAudio :Button
    lateinit var btnRead :Button
    lateinit var myView : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnNav = findViewById(R.id.bottomNavigationView) as BottomNavigationView
        btnAudio = findViewById(R.id.Audio_book)
        btnRead = findViewById(R.id.Ebook)
        myView = findViewById(R.id.View_Bokk)
        val gridLayoutManager = GridLayoutManager(application,2)
        myView.layoutManager = gridLayoutManager
        var list = ArrayList<ModelBook>()
        list.add(ModelBook("Palestine",R.drawable.download))
        list.add(ModelBook("Morroco",R.drawable.download))
        list.add(ModelBook("Alegmant",R.drawable.download))
        list.add(ModelBook("Egypt",R.drawable.download))
        list.add(ModelBook("Alegmant",R.drawable.download))
        list.add(ModelBook("Egypt",R.drawable.download))
        val customAdapter = CustomAdapter(list)
        myView.adapter = customAdapter
        btnNav.setOnItemSelectedListener{
            checkIteminBottomm(it.itemId)
        }
        btnAudio.setOnClickListener {
            startActivity(Intent(application,Aidio_Read_Book::class.java))
            }
        btnRead.setOnClickListener {
            startActivity(Intent(application,Aidio_Read_Book::class.java))
        }

    }
    fun checkIteminBottomm(butonBottom:Int ): Boolean {
        var isActive = when(butonBottom){
            R.id.add_book -> {
                startActivity(Intent(application,AddBook::class.java))
                true}
            R.id.setting_book -> {
                Toast.makeText(application,"Setting",Toast.LENGTH_LONG).show()
                true
            }
            else -> false
        }
        return isActive
    }



}