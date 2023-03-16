package com.example.androidfirst

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidfirst.databinding.*

class SubActivity2 : AppCompatActivity() {
    lateinit var binding: ActivitySub3Binding
    lateinit var binding2: ActivitySub11Binding
    lateinit var binding3: ActivitySub13Binding
    lateinit var binding4: ActivitySub15Binding
    lateinit var binding5: ActivitySub16Binding
    lateinit var binding6: Subject1Binding
    lateinit var binding7: Subject2Binding
    lateinit var binding8: Subject3Binding
    lateinit var binding9: Subject4Binding
    lateinit var binding10: Subject5Binding
    var flag: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySub3Binding.inflate(layoutInflater)
        binding2 = ActivitySub11Binding.inflate(layoutInflater)
        binding3 = ActivitySub13Binding.inflate(layoutInflater)
        binding4 = ActivitySub15Binding.inflate(layoutInflater)
        binding5 = ActivitySub16Binding.inflate(layoutInflater)
        binding6 = Subject1Binding.inflate(layoutInflater)
        binding7 = Subject2Binding.inflate(layoutInflater)
        binding8 = Subject3Binding.inflate(layoutInflater)
        binding9 = Subject4Binding.inflate(layoutInflater)
        binding10 = Subject5Binding.inflate(layoutInflater)
        setContentView(binding10.root)

//            binding5.edtPassword.setOnLongClickListener {
//                binding5.edtPassword.inputType = InputType.TYPE_TEXT_VARIATION_NORMAL
//                Toast.makeText(applicationContext,binding5.edtPassword.text.toString(),Toast.LENGTH_SHORT).show()
//
//                return@setOnLongClickListener(true)
//            }
//        binding5.edtPassword.setOnClickListener{
//            binding5.edtPassword.inputType = InputType.TYPE_TEXT_VARIATION_PASSWORD
//        }

//        binding3.btnClick.setOnClickListener {
//            if (flag == true) {
//                binding3.btnTarget.visibility = View.VISIBLE
//                binding3.btnGone.visibility = View.VISIBLE
//                flag = false
//            } else {
//                binding3.btnTarget.visibility = View.INVISIBLE
//                binding3.btnGone.visibility = View.GONE
//                flag = true
//
//            }
//        }
    }
}