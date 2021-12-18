package com.example.timenotice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottombar.setOnClickListener{
            finishAffinity()
        }

        val timeTitle = SimpleDateFormat("a")

        if (timeTitle.equals("AM")){
            amPm.text = "오전"
        } else{
            amPm.text = "오후"
        }

    }


}