package com.example.registrationform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class LoginActivity : AppCompatActivity() {

    lateinit var txtview: TextView
    lateinit var user: EditText
    lateinit var pass: EditText
    lateinit var checkBox: CheckBox
    lateinit var btnsign: AppCompatButton
    lateinit var txtview2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        txtview = findViewById(R.id.txtview)
        user = findViewById(R.id.user)
        pass = findViewById(R.id.pass)
        checkBox = findViewById(R.id.checkBox)
        btnsign = findViewById(R.id.btnsign)
        txtview2 = findViewById(R.id.txtView2)
    }

    override fun onStart() {
        super.onStart()

        btnsign.setOnClickListener {
            var user: String = user.text.toString()
            var password: String = pass.text.toString()
            var intent: Intent = Intent(this, SaveActivity::class.java)
            intent.putExtra("username", user)
            intent.putExtra("password", password)

            startActivity(intent)
        }
        txtview2.setOnClickListener {

            var intent: Intent = Intent(this, Registration::class.java)


            startActivity(intent)
        }
    }
}
