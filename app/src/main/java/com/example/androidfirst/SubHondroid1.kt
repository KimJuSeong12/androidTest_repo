package com.example.androidfirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidfirst.databinding.ActivitySubHondroid1Binding

class SubHondroid1 : AppCompatActivity() {
    lateinit var Binding: ActivitySubHondroid1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Binding = ActivitySubHondroid1Binding.inflate(layoutInflater)
        setContentView(Binding.root)


        //홍드로이드 3 서브
        if (intent.hasExtra("mag")) {
            Binding.tvGetMsg.text = intent.getStringExtra("msg") // 서브 액티비티의 존재하는 텍스트뷰에다가 HelloWorld가 넘겨져 옴.
        }
    }
}