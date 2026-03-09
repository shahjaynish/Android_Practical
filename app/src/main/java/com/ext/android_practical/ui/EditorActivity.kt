package com.ext.android_practical.ui

import android.app.Dialog
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ext.android_practical.R
import com.ext.android_practical.databinding.ActivityEditorBinding

class EditorActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEditorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityEditorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.back.setOnClickListener {
            finish()
        }
        binding.save.setOnClickListener {
            showSaveDialog()
            // When USer Clicks Save Show Him Dialog Box That if he wants to save the notes or not and if yes store it and sow title in list and if not Discard the note
        }
    }
    private fun showSaveDialog(){
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.dialog_save)
        dialog.show()
        dialog.findViewById<TextView>(R.id.discard).setOnClickListener {
            dialog.dismiss()
        }
        dialog.findViewById<TextView>(R.id.save).setOnClickListener {
            var title = binding.noteTitle.text.toString()
            var content = binding.noteContent.text.toString()
            dialog.dismiss()
            //Before Dismissing the dialog we have to save Title of Note and its Content in Database and show it in List
        }
    }
}


// Show This Screen To The User when User want to create