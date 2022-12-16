package com.example.registrationform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class Registration : AppCompatActivity() {

    lateinit var textView1: TextView
    lateinit var email:EditText
    lateinit var password:EditText
    lateinit var repassword:EditText
    lateinit var fname:EditText
    lateinit var lname:EditText
    lateinit var male:RadioButton
    lateinit var female:RadioButton
    lateinit var select:EditText
    lateinit var checkBox: CheckBox
    lateinit var btnsave:AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        textView1 = findViewById(R.id.txtview1)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
        repassword = findViewById(R.id.repassword)
        fname = findViewById(R.id.fname)
        lname = findViewById(R.id.lname)
        male = findViewById(R.id.male)
        female = findViewById(R.id.female)
        select = findViewById(R.id.select)
        checkBox = findViewById(R.id.checkBox)
        btnsave = findViewById(R.id.btnsave)

    }
    override fun onStart() {
        super.onStart()

        btnsave.setOnClickListener {
            var email: String = email.text.toString()
            var password: String = password.text.toString()
            var repassword: String = repassword.text.toString()
            var fname: String = fname.text.toString()
            var lname: String = lname.text.toString()
            var intent: Intent = Intent(this, LoginActivity::class.java)
            intent.putExtra("email", email)
            intent.putExtra("password", password)
            intent.putExtra("repassword", repassword)
            intent.putExtra("fname", fname)
            intent.putExtra("lname", lname)

            startActivity(intent)
        }
    }
}