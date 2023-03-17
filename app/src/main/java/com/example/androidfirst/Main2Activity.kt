package com.example.androidfirst

import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.androidfirst.databinding.ActivityMain2Binding

class Main2Activity : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action) {
            MotionEvent.ACTION_DOWN -> {
                Toast.makeText(applicationContext, "터치를 클릭했습니다", Toast.LENGTH_SHORT).show()
                Log.d(
                    "Main2Activity",
                    "터치 클릭했습니다. x= ${event?.x}, rawx= ${event?.rawX}" + "y= ${event?.y}, rawy= ${event?.rawY}"
                    )
            }
            MotionEvent.ACTION_UP -> {
                Toast.makeText(applicationContext, "터치를 클릭해제했습니다", Toast.LENGTH_SHORT).show()
                Log.d("Main2Activity", "터치를 클릭해제했습니다.")

            }

        }
        return super.onTouchEvent(event)
    }
}