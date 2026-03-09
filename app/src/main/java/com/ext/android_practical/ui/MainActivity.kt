package com.ext.android_practical.ui

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ext.android_practical.R
import com.ext.android_practical.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.info.setOnClickListener {
            startActivity(Intent(this, MyNotesActivity::class.java))
        }
        binding.search.setOnClickListener {
            startActivity(Intent(this, SearchFragment::class.java))
            //Here We Have to open Search fragment
        }
    }
}

//This Is the Home screen This Screen will be showed First TO the user
//First There will be only an image showing no notes and when user starts adding notes we will show his made notes on Home Screen