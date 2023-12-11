package com.x01.mentorin.ui.overview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.x01.mentorin.databinding.ActivityOverviewBinding


class OverviewActivity : AppCompatActivity() {
    private lateinit var binding:ActivityOverviewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOverviewBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val sectionsPagerAdapter = SectionsPagerAdapter(this)
        val viewPager: ViewPager2 = binding.overviewViewpager
        viewPager.adapter = sectionsPagerAdapter

        val tabs: TabLayout = binding.tabs

        TabLayoutMediator(tabs, viewPager) {_, _ -> }.attach()
        this.supportActionBar?.elevation = 0f
    }

    companion object
}