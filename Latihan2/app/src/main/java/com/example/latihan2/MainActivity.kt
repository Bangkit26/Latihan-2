package com.example.yourapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.latihan2.R
import com.example.latihan2.R.*

class MainActivity : AppCompatActivity() {

    private lateinit var textViewContent: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
        textViewContent = findViewById(id.menu_home)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            id.menu_home -> {
                textViewContent.text = "Ini adalah halaman Home."
                true
            }
            id.menu_profile -> {
                textViewContent.text = "Ini adalah halaman Profil."
                true
            }
            id.menu_about -> {
                textViewContent.text = "Ini adalah halaman Tentang Aplikasi."
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
