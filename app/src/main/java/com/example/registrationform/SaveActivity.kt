package com.example.registrationform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SaveActivity : AppCompatActivity(){

    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_save)

        textView = findViewById(R.id.textView)


        var intent = getIntent()
        var user:String = intent.getStringExtra("username").toString()
        var password: String = intent.getStringExtra("password").toString()

        textView.setText("hello $user!")


    }
}