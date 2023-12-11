package com.x01.mentorin.ui.login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.x01.mentorin.R
import com.x01.mentorin.databinding.FragmentFormLoginBinding
import com.x01.mentorin.databinding.FragmentTypeLoginBinding
import com.x01.mentorin.emailValidation
import com.x01.mentorin.passwordValidation
import com.x01.mentorin.ui.home.HomeActivity
import com.x01.mentorin.ui.register.RegisterActivity

class FormLoginFragment : Fragment() {
    lateinit var binding: FragmentFormLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFormLoginBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.loginTvRegister.setOnClickListener{
            requireActivity().finish()
            val intent = Intent(requireActivity(), RegisterActivity::class.java)
            startActivity(intent)
        }

        binding.btnLogin.setOnClickListener{
            val email = binding.loginEmailEdtText.text.toString().trim()
            val password = binding.loginlEdtPasswordText.text.toString().trim()

            val emailValid = emailValidation(email)
            val passValid = passwordValidation(password)

            clearError()

            if(!emailValid)
                binding.loginEdtEmail.error =
                    getString(R.string.email_is_not_valid)

            if(!passValid)
                binding.loginEdtPassword.error =
                    getString(R.string.minimum_password_8_character)


            if(!(emailValid && passValid)) return@setOnClickListener
            val intent = Intent(requireActivity(), HomeActivity::class.java)
            startActivity(intent)
        }
    }

    fun clearError(){
        binding.loginEdtEmail.error = ""
        binding.loginEdtPassword.error = ""
    }
}