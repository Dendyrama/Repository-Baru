package com.appserba.appserba0671.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.appserba.appserba0671.R
import com.appserba.appserba0671.databinding.ActivityMainBinding
import com.appserba.appserba0671.ui.auth.AppSerba0671Auth
import com.appserba.appserba0671.ui.auth.AuthActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.ButtonLogout.setOnClickListener {
            AppSerba0671Auth.logout(this){
                startActivity(Intent(this, AuthActivity::class.java))
                finish()
            }
        }
    }
}