package com.example.sinau

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.view.LayoutInflater
import com.example.sinau.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    
    private lateinit var binding: ActivityMainBinding
    private lateinit var message: String
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        binding.activityMainButtonLogin.setOnClickListener{
            println("Button dipentet")
            val intentToSecondActivity = Intent(this, SecondActivity::class.java)
            startActivity(intentToSecondActivity)
        }
    }
}