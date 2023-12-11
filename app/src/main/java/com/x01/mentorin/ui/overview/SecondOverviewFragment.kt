package com.x01.mentorin.ui.overview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.x01.mentorin.R
import com.x01.mentorin.databinding.FragmentFirstOverviewBinding
import com.x01.mentorin.databinding.FragmentSecondOverviewBinding
import com.x01.mentorin.playAnimation

class SecondOverviewFragment : Fragment() {
    private lateinit var binding: FragmentSecondOverviewBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondOverviewBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        playAnimation(binding.secondOverviewIcon3d)

    }
}