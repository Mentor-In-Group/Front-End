package com.x01.mentorin.ui.overview

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.x01.mentorin.databinding.FragmentThirdOverviewBinding
import com.x01.mentorin.playAnimation
import com.x01.mentorin.ui.login.LoginActivity
import com.x01.mentorin.ui.register.RegisterActivity


class ThirdOverviewFragment : Fragment() {
    lateinit var binding: FragmentThirdOverviewBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentThirdOverviewBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.thirdOverviewBtnRegister.setOnClickListener{
            val intent = Intent(requireActivity(), RegisterActivity::class.java)
            startActivity(intent)
        }
        binding.thirdOverviewBtnLogin.setOnClickListener{
            val intent = Intent(requireActivity(), LoginActivity::class.java)
            startActivity(intent)
        }

        playAnimation(binding.thirdOverviewIcon3d)
    }
}