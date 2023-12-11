package com.x01.mentorin.ui.overview

import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class SectionsPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        var fragment: Fragment? = null

        when(position){
            0 ->{
                fragment = FirstOverviewFragment()
            }

            1 ->{
                fragment = SecondOverviewFragment()
            }

            2 ->{
                fragment = ThirdOverviewFragment()
            }
        }
        return fragment as Fragment
    }

}