package com.x01.mentorin.ui.register

import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.x01.mentorin.R
import com.x01.mentorin.databinding.ActivityRegisterBinding
import com.x01.mentorin.ui.overview.OverviewActivity


class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if(savedInstanceState != null) return
            val fragmentManager = supportFragmentManager
            fragmentManager
                .beginTransaction()
                .add(R.id.register_frame_container, TypeRegisterFragment(), TypeRegisterFragment::class.java.simpleName)
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