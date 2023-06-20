package com.becky.billsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.becky.billsapp.databinding.ActivityLogInBinding
import com.becky.billsapp.databinding.ActivityMainBinding

class LogInActivity : AppCompatActivity() {
    lateinit var binding: ActivityLogInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogInBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnBack.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java
            )
            startActivity(intent)
            clearErrors()
        }
    }
    fun clearErrors() {
        binding.tilGreetings.error = null

    }
}



