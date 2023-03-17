package com.example.androidfirst

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.androidfirst.databinding.*

class SubActivity2 : AppCompatActivity() {
    lateinit var binding: ActivitySub3Binding
    var flag: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySub3Binding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding21.btnSelect1.setOnClickListener {
//            if(flag == true) {
//                binding21.screenOne.visibility = View.VISIBLE
//                binding21.screenTwo.visibility = View.INVISIBLE
//                flag == false
//            } else {
//                binding21.screenOne.visibility = View.INVISIBLE
//                binding21.screenTwo.visibility = View.VISIBLE
//                flag == true
//            }
//        }
//        //FrameLayout -> LinearLayout 1번화면
//        binding21.imgPicture1.setOnClickListener {
//            Toast.makeText(this,"1번화면입니다",Toast.LENGTH_SHORT).show()
//        }
//        //FrameLayout -> LinearLayout 2번화면
//        binding21.imgPicture2.setOnClickListener {
//            Toast.makeText(this,"2번화면입니다",Toast.LENGTH_SHORT).show()
//        }


//        binding20.chkVisible.isChecked = false
//        binding20.chkVisible.text = "visible"
//        binding20.chkVisible.setOnClickListener {
//            //암호를 보여줄 것
//            if (binding20.chkVisible.isChecked == true) {
//                binding20.edtPassword2.inputType = InputType.TYPE_CLASS_TEXT
//                binding20.chkVisible.text = "invisible"
//            } else {
//                //암호를 숨기기
//                binding20.edtPassword2.inputType =
//                    InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
//                binding20.chkVisible.text = "visible"
//            }
//        }

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