package com.testpark141

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    val TAG: String = "로그"

    // 액티비티가 생성되었을때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // xml 뷰 파일을 연결시켜줌.
        setContentView(R.layout.activity_main)
        /*login_btn.setOnClickListener(View.OnClickListener {
            onLoginButtonClicked()
        })*/
        login_btn.setOnClickListener {
            onLoginButtonClicked()
        }
    }
    fun onLoginButtonClicked(){
        Log.d(TAG, "MainActivity - onLoginButtonClicked() called")

        val intent = Intent(this, SecondActivity::class.java)

        startActivity(intent)
    }

}
