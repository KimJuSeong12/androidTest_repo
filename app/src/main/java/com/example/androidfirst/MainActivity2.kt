package com.example.androidfirst

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.ImageDecoder
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.view.MenuItem
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.FileProvider
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidfirst.databinding.*
import com.google.android.material.navigation.NavigationView
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class MainActivity2 : AppCompatActivity()/*, NavigationView.OnNavigationItemSelectedListener*/ {
    lateinit var binding: Hongdroid11Binding


    override fun onCreate(savedInstanceState: Bundle?) { // 액티비티의 실행 시작 지점
        super.onCreate(savedInstanceState)
        binding = Hongdroid11Binding.inflate(layoutInflater)
        setContentView(binding.root)

        setFrag(0)

    }

    private fun setFrag(fragNum:Int) {
        val ft = supportFragmentManager.beginTransaction()
        when(fragNum){
            0 -> {
                ft.replace(R.id.main_frame, Fragment1()).commit()
            }
            2 -> {
                ft.replace(R.id.main_frame, Fragment2()).commit()
            }
            2 -> {
                ft.replace(R.id.main_frame, Fragment3()).commit()
            }
        }
    }


}










//홍드로이드 10 (안됨)
//        val profileList = arrayListOf(
//            Profiles(R.drawable.man, "김주성", 24, "안드로이드 앱 개발자"),
//            Profiles(R.drawable.man, "김주성1", 24, "안드로이드 앱 개발자1"),
//            Profiles(R.drawable.man, "김주성2", 25, "안드로이드 앱 개발자2"),
//            Profiles(R.drawable.man, "김주성3", 26, "안드로이드 앱 개발자3"),
//            Profiles(R.drawable.man, "김주성4", 27, "안드로이드 앱 개발자4"),
//            Profiles(R.drawable.man, "김주성5", 28, "안드로이드 앱 개발자5"),
//            Profiles(R.drawable.man, "김주성6", 29, "안드로이드 앱 개발자6"),
//            Profiles(R.drawable.man, "김주성7", 30, "안드로이드 앱 개발자7"),
//            Profiles(R.drawable.man, "김주성8", 31, "안드로이드 앱 개발자8"),
//            Profiles(R.drawable.man, "김주성9", 32, "안드로이드 앱 개발자9"),
//            Profiles(R.drawable.man, "김주성10", 33, "안드로이드 앱 개발자10"),
//            Profiles(R.drawable.man, "김주성11", 34, "안드로이드 앱 개발자11"),
//        )
//
//        binding.rvProfile.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
//        binding.rvProfile.setHasFixedSize(true)
//
//        binding.rvProfile.adapter = ProfileAdapter(profileList)





//홍드로이드9
//    val REQUEST_IMAGE_CAPTURE = 1 // 카메라 사진 촬영 요청코드
//    lateinit var curPhotoPath : String //문자열 형태의 사진 경로 값 (초기 값을 null로 시작하고 싶을 때)


//        //홍드로이드 9
//        //onCreate 함수 안에 있어야 함
//        setPermission() // 권한을 체크하는 메소드 수행.
//
//        binding.btnCamera.setOnClickListener {
//            takeCapture() // 기본 카메라 앱을 실행하여 사진 촬영.
//        }


//---------------------------------------------------------------------------------------------------
// 홍드로이드 9
//카메라 촬영
//    private fun takeCapture() {
//        // 기본 카메라 앱 실행
//        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also {takePictureIntent ->
//            takePictureIntent.resolveActivity(packageManager)?.also {
//                val photoFile: File? = try {
//                    createImageFile()
//                } catch (ex: IOException) {
//                    null
//                }
//                photoFile?.also {
//                    val photoURI: Uri = FileProvider.getUriForFile(this,"com.example.androidfirst.fileprovider",it)
//                    takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT,photoURI)
//                    startActivityForResult(takePictureIntent,REQUEST_IMAGE_CAPTURE)
//                }
//            }
//        }
//    }
//    //이미지 파일 생성
//    private fun createImageFile(): File {
//        val timestamp: String = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
//        val storageDir: File? = getExternalFilesDir(Environment.DIRECTORY_PICTURES)
//        return File.createTempFile("JPEG_${timestamp}_","jpg",storageDir)
//            .apply { curPhotoPath = absolutePath }
//    }
//
//    //홍드로이드 9
//    //테드 퍼미션 설정 (build.gradle 에 있는 implementation 'gun@912.ted.tedpermission:2.2.3' 에 설정) (x)
//    // 위에 퍼미션이 안되서 (implementation 'io.github.ParkSangGwon:tedpermission:2.3.0') 로 바꿈
//    private fun setPermission() {
//        val permission = object : PermissionListener {
//            override fun onPermissionGranted() { // 설정해놓은 위험권한들이 허용 되었을 경우 이 곳을 수행함.
//                Toast.makeText(this@MainActivity2, "권한이 허용 되었습니다." , Toast.LENGTH_SHORT).show()
//            }
//
//            override fun onPermissionDenied(deniedPermissions: MutableList<String>?) { // 설정해놓은 위험권한 들 중 거부를 한 경우 이곳을 수행함.
//                Toast.makeText(this@MainActivity2, "권한이 거부 되었습니다." , Toast.LENGTH_SHORT).show()
//            }
//
//        }
//
//        TedPermission.with(this)
//            .setPermissionListener(permission)
//            .setRationaleMessage("카메라를 앱을 사용하시려면 권한을 허용해주세요.")
//            .setDeniedMessage("권한을 거부하셨습니다. [앱 설정] -> [권한] 항목에서 허용해주세요.")
//            .setPermissions(android.Manifest.permission.WRITE_EXTERNAL_STORAGE, android.Manifest.permission.CAMERA)
//            .check()
//    }
//
//    // startActivityForResult를 통해서 기본 카메라 앱으로 부터  받아온 사진 결과값
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//
//        // 이미지를 성공적으로 가져왔다면..
//        if(requestCode == REQUEST_IMAGE_CAPTURE && resultCode == Activity.RESULT_OK){
//            val bitmap: Bitmap
//            val file = File(curPhotoPath)
//            if (Build.VERSION.SDK_INT < 28){ // 안드로이드 9.0 (Pie) 버젼보다 낮을 경우
//                bitmap = MediaStore.Images.Media.getBitmap(contentResolver, Uri.fromFile(file))
//                binding.ivProfile2.setImageBitmap(bitmap)
//            } else { // 안드로이드 9.0 (Pie) 버젼보다 높을 경우
//                val decode = ImageDecoder.createSource(this.contentResolver,Uri.fromFile(file))
//                bitmap = ImageDecoder.decodeBitmap(decode)
//                binding.ivProfile2.setImageBitmap(bitmap)
//            }
//            savePhoto(bitmap)
//        }


//겔러리에 저장
//    private fun savePhoto(bitmap: Bitmap) {
//        val folderPath = Environment.getExternalStorageDirectory().absolutePath + "/pictures/" // 사진폴더로 저장하기 위 한 경로 선언
//        val timestamp: String = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
//        val fileName = "${timestamp}.jpeg"
//        val folder = File(folderPath)
//        if(!folder.isDirectory){ // 현재 해당 경로에 폴더가 존재하지 않는다면
//            folder.mkdirs() // make directory 줄임말로 해당 경로에 폴더 자동으로 새로 만들기
//        }
//        //실제적인 저장처리
//        val out = FileOutputStream(folderPath + fileName)
//        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, out)
//        Toast.makeText(this, "사진이 엘범에 저장되었습니다.", Toast.LENGTH_SHORT).show()
//    }
//-----------------------------------------------------------------------------------------------------------------------------


//홍드로이드 8
//        //홍드로이드 영상에선 안나오는 임포트 방법
//        val myWebView: WebView = findViewById(R.id.webView)
//        // -------------------------------------------------
//
//        myWebView.settings.javaScriptEnabled = true // 자바 스크립트 허용
//        //웹뷰에서 새 창이 뜨지 않도록 방지하는 구문
//        myWebView.webViewClient = WebViewClient()
//        myWebView.webChromeClient = WebChromeClient() //이 두 문장은 거의 필수적으로 쓰임
//        //-------------------------------------------------------
//        myWebView.loadUrl("http://www.naver.com") // 링크 주소를 Load 함


//홍드로이드 8
//    override fun onBackPressed() { // 백버튼 누를 시 수행할 로직 구현
//        if(binding.webView.canGoBack()){
//            //웹사이트에서 뒤로 갈 페이지가 존재 한다면
//             binding.webView.goBack() // 웹사이트 뒤로가기
//        }else{
//            super.onBackPressed() // 본래의 백버튼 기능 수행 (안드로이드)
//        }
//    }


//홍드로이드 7
//TODO: 저장된 데이터를 로드
//        loadData() // edit text 저장되어 있던 값을 setText

//홍드로이드 7
//    private fun loadData() {
//        val pref = getSharedPreferences("pref",0)
//        binding.etHello.setText(pref.getString("name",""))//1번째 인자에서는 저장할 당시의 키 값을 적어줌, 2번쨰는 키 값에 데이터가 존재하지 않을 경우 대체값을 적어준다
//    }
//
//    private fun saveData() {
//        val pref = getSharedPreferences("pref",0)
//        val edit = pref.edit() // 수정모드
//        edit.putString("name",binding.etHello.text.toString()) // 1번째 인자에는 키 값을 , 2번째 인자에는 실제 담아둘 값
//        edit.apply() //값을 저장 완료
//    }
//
//    override fun onDestroy() { // 액티비티가 종료되는 시점이 다가올 때 호출
//        super.onDestroy()
//        saveData() // edit text 값을 저장
//    }


//홍드로이드6
//        binding.btnNavi.setOnClickListener {
//            binding.layoutDrawer.openDrawer(GravityCompat.START) //START = left, END = right
//        }
//        binding.naviView.setNavigationItemSelectedListener(this)

//홍드로이드6
//    override fun onNavigationItemSelected(item: MenuItem): Boolean { // 네비게이션 메뉴 아이템 클릭 시 수행
//        when (item.itemId) {
//            R.id.access -> Toast.makeText(applicationContext, "접근성", Toast.LENGTH_SHORT).show()
//            R.id.Email -> Toast.makeText(applicationContext, "이메일", Toast.LENGTH_SHORT).show()
//            R.id.message -> Toast.makeText(applicationContext, "메세지", Toast.LENGTH_SHORT).show()
//        }
//        binding.layoutDrawer.closeDrawers() // 네비게이션 뷰 닫기
//        return false
//    }
//
//    override fun onBackPressed() {
//
//        if (binding.layoutDrawer.isDrawerOpen(GravityCompat.START)) {
//            binding.layoutDrawer.closeDrawers()
//        } else {
//
//            super.onBackPressed() // 일반 백버튼 기능 실행
//        }
//    }


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
