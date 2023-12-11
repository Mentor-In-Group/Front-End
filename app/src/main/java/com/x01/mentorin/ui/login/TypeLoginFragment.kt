package com.x01.mentorin.ui.login

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.x01.mentorin.R
import com.x01.mentorin.databinding.FragmentTypeLoginBinding
import com.x01.mentorin.databinding.FragmentTypeRegisterBinding
import com.x01.mentorin.ui.register.FormRegisterFragment
import com.x01.mentorin.ui.register.RegisterActivity

class TypeLoginFragment : Fragment() {
    lateinit var binding: FragmentTypeLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTypeLoginBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fragmentManager = parentFragmentManager


        binding.btnLoginByEmail.setOnClickListener{
            fragmentManager
                .beginTransaction()
                .replace(R.id.login_frame_container, FormLoginFragment(), FormLoginFragment::class.java.simpleName)
                .addToBackStack(null)
                .commit()
        }

        binding.loginTvRegsiter.setOnClickListener{
            requireActivity().finish()

            val intent = Intent(requireActivity(), RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}