package com.exaple.instagramclone.ui.activity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.exaple.instagramclone.R

class ActivityFragment : Fragment(R.layout.fragment_activity) {

//    private lateinit var activityViewModel: ActivityViewModel
//
//    override fun onCreateView(
//            inflater: LayoutInflater,
//            container: ViewGroup?,
//            savedInstanceState: Bundle?
//    ): View? {
//        activityViewModel =
//                ViewModelProvider(this).get(ActivityViewModel::class.java)
//        val root = inflater.inflate(R.layout.fragment_activity, container, false)
//        val textView: TextView = root.findViewById(R.id.text_notifications)
//        activityViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
//        return root
//    }
}