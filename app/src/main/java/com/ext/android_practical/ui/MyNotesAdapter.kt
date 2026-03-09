package com.ext.android_practical.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ext.android_practical.R
import com.ext.android_practical.model.headings

class MyNotesAdapter(private val Headings: List<headings>) :
    RecyclerView.Adapter<MyNotesAdapter.UserViewHolder>() {

    class UserViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val heading: TextView = view.findViewById(R.id.headings)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_mynotes, parent, false)

        return UserViewHolder(view)
    }

    override fun getItemCount() = Headings.size

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {

        val heading = Headings[position]

        holder.heading.text = heading.headings
    }
}

// In Adapter We Have to add Onclick So if user clicks on any notes it would open in editor Screen but due to time constraint i could not add this functionality
// Just We have to pass listener also in adapter Parameter so when user clcks on any note we can get its position and detail
// We will also pass background color randomly everytime user creates a new note
// Also when user deletes any note then we will remove it from adapter and also delete it from database