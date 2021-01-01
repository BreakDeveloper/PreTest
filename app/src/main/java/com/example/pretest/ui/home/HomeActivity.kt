package com.example.pretest.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pretest.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
        with(binding) {

        }
    }
}