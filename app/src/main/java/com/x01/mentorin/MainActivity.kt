package com.x01.mentorin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.x01.mentorin.ui.home.HomeActivity
import com.x01.mentorin.ui.overview.OverviewActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler(Looper.getMainLooper()).postDelayed({
            val homeIntent = Intent(this, HomeActivity::class.java)
            val overviewIntent = Intent(this, OverviewActivity::class.java)

            startActivity(overviewIntent)
            finish()
        }, SPLASH_DURATION)

    }

    companion object{
        const val SPLASH_DURATION = 3000L
    }

}