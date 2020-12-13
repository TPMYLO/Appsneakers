package com.appsneakers.app.ui.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.appsneakers.app.data.model.AuthUser
import com.appsneakers.app.databinding.ActivityAuthBinding
import com.appsneakers.app.ui.home.MainActivity
import com.appsneakers.app.R

class AuthActivity : AppCompatActivity() {
    lateinit var binding: com.appsneakers.app.databinding.ActivityAuthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_auth)
    }

    fun onSuccess(user: AuthUser?) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}