package com.x01.mentorin.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import androidx.fragment.app.FragmentManager
import com.x01.mentorin.R
import com.x01.mentorin.databinding.ActivityLoginBinding
import com.x01.mentorin.databinding.ActivityRegisterBinding
import com.x01.mentorin.ui.register.TypeRegisterFragment

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if(savedInstanceState != null) return
        val fragmentManager = supportFragmentManager
        fragmentManager
            .beginTransaction()
            .add(binding.loginFrameContainer.id, TypeLoginFragment(), TypeLoginFragment::class.java.simpleName)
            .addToBackStack(null)
            .commit()
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK) {

            finish()

        }
        return true
    }
}