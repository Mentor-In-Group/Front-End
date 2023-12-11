package com.x01.mentorin.ui.register

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.x01.mentorin.R
import com.x01.mentorin.databinding.FragmentTypeRegisterBinding
import com.x01.mentorin.ui.login.LoginActivity
import com.x01.mentorin.ui.overview.OverviewActivity

class TypeRegisterFragment : Fragment() {
    lateinit var binding: FragmentTypeRegisterBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTypeRegisterBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fragmentManager = parentFragmentManager


        binding.btnRegisterByEmail.setOnClickListener{
            fragmentManager
                .beginTransaction()
                .replace(R.id.register_frame_container, FormRegisterFragment(), FormRegisterFragment::class.java.simpleName)
                .addToBackStack(null)
                .commit()
        }

        binding.registerTvLogin.setOnClickListener{
            requireActivity().finish()
            val intent = Intent(requireActivity(), LoginActivity::class.java)
            startActivity(intent)
        }
    }


}