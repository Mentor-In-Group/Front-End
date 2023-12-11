package com.x01.mentorin.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.x01.mentorin.R
import com.x01.mentorin.databinding.ActivityHomeBinding
import com.x01.mentorin.databinding.FragmentHomeBinding
import com.x01.mentorin.listMentor

class HomeFragment() : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvRecomendation.layoutManager = GridLayoutManager(requireActivity(), 2)
        val adapter = MentorAdapter(listMentor, requireActivity())
        binding.rvRecomendation.adapter = adapter
    }
}