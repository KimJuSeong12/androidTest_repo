package com.example.androidfirst

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintProperties.WRAP_CONTENT
import androidx.core.content.ContextCompat

class SubActivity : AppCompatActivity() {
    var flag: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 화면을 코드로 만들어서 보여주기
        val tvMessage = TextView(this)
        tvMessage.text = "경 100%취업 축"
//        tvMessage.setTextColor(Color.RED)
        tvMessage.setTextColor(Color.parseColor("##0000"))

        val imgPicture = ImageView(this)
        imgPicture.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.success))
        val tvMessage2 = TextView(this)
        tvMessage2.text = "안드리이드 웹앱3기"
        tvMessage2.setTextColor(0xFF6E41)
        tvMessage2.textSize = 30.0f

        val btnClick = Button(this)
        btnClick.text = "클릭해주세요"
        btnClick.setOnClickListener {
            Toast.makeText(applicationContext, "김주성님 반갑습니다.", Toast.LENGTH_SHORT).show()
            if (flag == true) {
                tvMessage2.text = "안드로이드웹앱3기"
                flag = false
            } else {
                tvMessage2.text = "안웹앱3기"
                flag = true
            }
        }
        val liLayout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setBackgroundColor(Color.parseColor("#FFF000"))
            addView(tvMessage,WRAP_CONTENT, WRAP_CONTENT)
            addView(imgPicture,WRAP_CONTENT, WRAP_CONTENT)
            addView(tvMessage2,WRAP_CONTENT, WRAP_CONTENT)
            addView(btnClick,WRAP_CONTENT, WRAP_CONTENT)
        }
        setContentView(liLayout)
    }
}