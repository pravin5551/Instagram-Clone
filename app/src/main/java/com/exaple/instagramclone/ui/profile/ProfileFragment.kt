package com.exaple.instagramclone.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager.widget.ViewPager
import com.exaple.instagramclone.R
import com.google.android.material.tabs.TabLayout

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    var tabLayout: TabLayout? = null
    var viewPager: ViewPager? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
     
    }


//    private lateinit var profileViewModel: ProfileViewModel
//
//    override fun onCreateView(
//            inflater: LayoutInflater,
//            container: ViewGroup?,
//            savedInstanceState: Bundle?
//    ): View? {
//        profileViewModel =
//                ViewModelProvider(this).get(ProfileViewModel::class.java)
//        val root = inflater.inflate(R.layout.fragment_profile, container, false)
//        val textView: TextView = root.findViewById(R.id.text_dashboard)
//        profileViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
//        return root
//    }
}