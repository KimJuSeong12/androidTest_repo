package com.example.androidfirst

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.androidfirst.databinding.ActivitySub2Binding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivitySub2Binding
    var flag: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySub2Binding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnClick.setOnClickListener {
            Toast.makeText(applicationContext, "김주성님 반갑습니다.", Toast.LENGTH_SHORT).show()
            if (flag == true) {
                binding.tvClassName.text = "안드로이드웹앱3기"
                flag = false
            } else {
                binding.tvClassName.text = "안웹앱3기"
                flag = true
            }
        }
    }
}