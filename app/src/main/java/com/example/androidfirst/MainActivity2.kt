package com.example.androidfirst

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.example.androidfirst.databinding.*
import com.google.android.material.navigation.NavigationView

class MainActivity2 : AppCompatActivity() ,NavigationView.OnNavigationItemSelectedListener {
    lateinit var binding: Hongdroid6Binding
    var flag: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) { // 액티비티의 실행 시작 지점
        super.onCreate(savedInstanceState)
        binding = Hongdroid6Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnNavi.setOnClickListener{
            binding.layoutDrawer.openDrawer(GravityCompat.START) //START = left, END = right
        }
        binding.naviView.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean { // 네비게이션 메뉴 아이템 클릭 시 수행
        when(item.itemId){
            R.id.access -> Toast.makeText(applicationContext, "접근성", Toast.LENGTH_SHORT).show()
            R.id.Email -> Toast.makeText(applicationContext, "이메일", Toast.LENGTH_SHORT).show()
            R.id.message -> Toast.makeText(applicationContext, "메세지", Toast.LENGTH_SHORT).show()
        }
        binding.layoutDrawer.closeDrawers() // 네비게이션 뷰 닫기
        return false
    }
}







//홍드로이드5
//    var UserList = arrayListOf<User>(
//        User(R.drawable.ic_launcher_foreground, "김주성", "24", "안녕하세요"),
//        User(R.drawable.ic_launcher_foreground, "자바", "21", "반갑습니다"),
//        User(R.drawable.ic_launcher_foreground, "자바스크립트", "25", "안녕히가세요"),
//        User(R.drawable.ic_launcher_foreground, "코틀린", "26", "밥 먹었어요?"),
//        User(R.drawable.ic_launcher_foreground, "스위프트", "27", "안녕"),
//        User(R.drawable.ic_launcher_foreground, "안드로이드", "28", "ㅎㅇ"),
//        User(R.drawable.ic_launcher_foreground, "리액트 네이티브", "29", "ㅂㅇ")
//    )
//홍드로이드5
//        val Adapter = UserAdapter(this,UserList)
//        binding.listView.adapter = Adapter
//
//        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
//            val selectItem = parent.getItemAtPosition(position) as User
//            Toast.makeText(this,selectItem.name, Toast.LENGTH_SHORT).show()
//        }

//        val item = arrayOf("사과","배","딸기","키위","김주성")
//        // context란 한 액티비티의 모든 정보를 담고 있는 것.
//        binding.listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, item)





        //홍드로이드4
//        binding.btnToast.setOnClickListener {
//            binding.ivProfile.setImageResource(R.drawable.man) // 이미지 뷰에 새로운 이미지 등록
//            Toast.makeText(this@MainActivity2,"버튼이 클릭 되었습니다.", Toast.LENGTH_SHORT).show()
//        }




        //홍드로이드3
//        binding.btnA.setOnClickListener {
//            val intent = Intent(this, SubHondroid1::class.java) //다음 화면으로 이동하기 위한 인텐트 객체 생성
//            intent.putExtra("msg",binding.tvSendMsg.text.toString()) // HelloWorld라는 텍스트 값을 담은 뒤 msg라는 키로 잠궜다.
//            startActivity(intent) //intent에 저장되어 있는 액티비티 쪽으로 이동한다.
//            finish() // 자기 자신 액티비티를 파괴한다.
//        }
        //홍드로이드2
//        binding.btnText.setOnClickListener {
//            var resultText = binding.etId.text.toString()
//            binding.tvResult.setText(resultText)
//        }



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
