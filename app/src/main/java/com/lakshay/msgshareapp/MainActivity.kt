package com.lakshay.msgshareapp

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_amount.text = intent.getStringExtra("transaction_amount")
        btn_go_back.setOnClickListener {
            setResult(Activity.RESULT_OK)
            finish()
        }
    }
}

