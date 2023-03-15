package com.example.androidfirst

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidfirst.databinding.ActivitySub3Binding

class SubActivity2 : AppCompatActivity() {
    lateinit var binding: ActivitySub3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySub3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnName.text = "문자열"
    }
}