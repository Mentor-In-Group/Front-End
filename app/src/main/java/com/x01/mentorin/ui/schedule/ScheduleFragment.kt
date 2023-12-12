package com.x01.mentorin.ui.schedule

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.x01.mentorin.R
import com.x01.mentorin.databinding.FragmentScheduleBinding
import com.x01.mentorin.listMentor

class ScheduleFragment : Fragment() {
    private lateinit var binding: FragmentScheduleBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentScheduleBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvSchedule.layoutManager = LinearLayoutManager(requireActivity())
        val adapter = ScheduleAdapter(listMentor[0].schedule)
        binding.rvSchedule.adapter = adapter
    }
}