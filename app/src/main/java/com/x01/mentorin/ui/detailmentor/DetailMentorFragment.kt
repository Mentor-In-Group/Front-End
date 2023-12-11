package com.x01.mentorin.ui.detailmentor

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.x01.mentorin.R
import com.x01.mentorin.databinding.FragmentDetailMentorBinding
import com.x01.mentorin.databinding.FragmentHomeBinding
import com.x01.mentorin.listMentor
import com.x01.mentorin.ui.home.Mentor

class DetailMentorFragment : Fragment() {
    private lateinit var binding: FragmentDetailMentorBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailMentorBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvEducation.layoutManager = LinearLayoutManager(requireActivity())
        val educationAdapter = EducationAdapter(listMentor[0].education)
        binding.rvEducation.adapter = educationAdapter

        binding.rvExperience.layoutManager = LinearLayoutManager(requireActivity())
        val experienceAdapter = ExperienceAdapter(listMentor[0].experience)
        binding.rvExperience.adapter = experienceAdapter


    }
}