package com.ext.android_practical.ui

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ext.android_practical.R
import com.ext.android_practical.databinding.ActivityMyNotesBinding
import com.ext.android_practical.model.headings

class MyNotesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMyNotesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMyNotesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val headings = listOf(
            headings("Heading 1"),
            headings("Heading 2"),
            headings("Heading 3"),
            headings("Heading 4")
        )

        val recyclerView = binding.recyclerView
        recyclerView.adapter = MyNotesAdapter(headings)


        binding.addNote.setOnClickListener {
            startActivity(Intent(this, EditorActivity::class.java))
        }
    }
}

// Here We will Show all the titles of the notes that user made and when user clicks any particular title he can go in editor screen and edit that particular Note