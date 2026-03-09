package com.ext.android_practical.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ext.android_practical.R
class SearchFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    // Here in Serach Fragment just we have to add code for filter

//    fun FilterNotes(query : String)
//    {
//        val list = NotesList.filter {
//            it.title.contains(query)
//        }
//        adapter.updateList(list)
//
//    }
    // Just We Have to Add this code which searches For Title and matcching names and show it
}