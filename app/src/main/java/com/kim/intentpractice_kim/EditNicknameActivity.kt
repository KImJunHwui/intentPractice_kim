package com.kim.intentpractice_kim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nickname.*

class EditNicknameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)

        okBtn.setOnClickListener {


//  입력한 닉네임 -> 변수로 지정
            val inputNewNickname = newNicknameEdt.text.toString()

//            입력한 닉네임을 가지고 복귀해야 한다

//            입력 닉네임을 담아주기 위한 용도로만 사용하는 Intent

            val resultIntent = Intent()
        resultIntent.putExtra("nickname", inputNewNickname)
            setResult(RESULT_OK,resultIntent)
            finish()




        }
    }
}