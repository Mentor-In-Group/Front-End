package com.x01.mentorin.ui.register

import android.R
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.fragment.app.Fragment
import com.x01.mentorin.databinding.FragmentFormRegisterBinding
import com.x01.mentorin.emailValidation
import com.x01.mentorin.jobValidation
import com.x01.mentorin.nameValidation
import com.x01.mentorin.passwordValidation
import com.x01.mentorin.ui.login.LoginActivity


class FormRegisterFragment : Fragment() {
    lateinit var binding: FragmentFormRegisterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFormRegisterBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val daftarPilihan = arrayOf("Assistant", "Associate", "Administrative Assistant", "Account Manager", "Assistant Manger", "Administrative Clerk", "Administrative Aide", "Administration Asistant")
        val autoCompleteTextView: AutoCompleteTextView = binding.registerJobText

        val adapter = ArrayAdapter(requireActivity(), R.layout.simple_dropdown_item_1line, daftarPilihan)
        autoCompleteTextView.setAdapter(adapter)


        autoCompleteTextView.setOnTouchListener { v, event ->
            // Menampilkan dropdown hanya di bawah AutoCompleteTextView
            autoCompleteTextView.showDropDown()
            autoCompleteTextView.dropDownVerticalOffset = 0
            autoCompleteTextView.gravity = Gravity.BOTTOM
            false
        }

        binding.registerTvLogin.setOnClickListener{
            requireActivity().finish()
            val intent = Intent(requireActivity(), LoginActivity::class.java)
            startActivity(intent)
        }

        binding.btnRegister.setOnClickListener{
            val name = binding.registerNameEdtText.text.toString().trim()
            val job = binding.registerJobText.text.toString().trim()
            val email = binding.registerEtEmail.text.toString().trim()
            val password = binding.registerEtPassword.text.toString().trim()

            val nameValid = nameValidation(name)
            val jobValid = jobValidation(job)
            val emailValid = emailValidation(email)
            val passValid = passwordValidation(password)

            clearError()

            if(!nameValid)
                binding.registerEdtName.error =
                    getString(com.x01.mentorin.R.string.name_can_t_be_empty)

            if(!jobValid)
                binding.registerEdtJob.error = getString(com.x01.mentorin.R.string.job_can_be_empty)

            if(!emailValid)
                binding.registerTilEmail.error =
                    getString(com.x01.mentorin.R.string.email_is_not_valid)

            if(!passValid)
                binding.registertilPassword.error =
                    getString(com.x01.mentorin.R.string.minimum_password_8_character)


            if(!(nameValid && jobValid && emailValid && passValid)) return@setOnClickListener
                Log.d("success", "horee")

        }
    }

    fun clearError(){
        binding.registerEdtName.error = ""
        binding.registerTilEmail.error = ""
        binding.registertilPassword.error = ""
    }
}