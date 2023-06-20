package com.becky.billsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.becky.billsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLogin.setOnClickListener {
            val intent=Intent(this,LogInActivity::class.java
            )
            startActivity(intent)
        }
        validateForm()
        clearErrors()
    }

    fun validateForm() {
        val userName = binding.etUserName.text.toString()
        val phoneNumber = binding.etPhoneNumber.text.toString()
        val email = binding.etEmail.text.toString()
        val password = binding.etPassword.text.toString()

        var error = false

        if (userName.isBlank()) {
            binding.tilUsername.error = "Username is required"
            error = true

        }

        if (phoneNumber.isBlank()) {
            binding.tilPhoneNumber.error = " PhoneNumber is required"
            error = true

        }

        if (email.isBlank()) {
            binding.tilEmail.error = "Email   is required"
            error = true

        }

        if (password.isBlank()) {
            binding.tilPassword.error = " email is required"
            error = true


        }

        if (!error) {
            val intent = Intent(this, LogInActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "$userName $phoneNumber $email ", Toast.LENGTH_LONG).show()
            finish()
        }
    }
    fun clearErrors() {
        binding.tilUsername.error = null
        binding.tilPassword.error = null
        binding.tilPhoneNumber.error = null
        binding.tilEmail.error = null
    }
}







