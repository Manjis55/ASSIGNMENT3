package com.example.moviefirebaseapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.moviefirebaseapp.databinding.ActivityDashboardBinding

class DashboardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvWelcome.text = "Welcome to MovieBuddy!"
    }
}
