package com.uddeshya.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.NumberFormatException

class NewActivity : AppCompatActivity() {

    lateinit var etMobileNumber : EditText
    lateinit var etPassword : EditText
    lateinit var btnLogin:Button
    lateinit var txtForgotPassword :TextView
    lateinit var txtRegister :TextView
    var validMobileNumber = "123456789"
    var validPassward = "passward"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        title="Log In"

        etMobileNumber = findViewById(R.id.etMobileNumber)
        etPassword = findViewById(R.id.etPassward)
        btnLogin = findViewById(R.id.btnLogin)
        txtForgotPassword = findViewById(R.id.txtForgotPassword)
        txtRegister = findViewById(R.id.txtRegister)

        btnLogin.setOnClickListener {

            val mobileNumber = etMobileNumber.text.toString()
            val passward = etPassword.text.toString()

            if((mobileNumber==validMobileNumber) &&(validPassward == passward))
            {
                val intent= Intent(this@NewActivity ,  MainActivity ::class .java)
                startActivity(intent)
            }
            else
            {
                Toast.makeText(this@NewActivity , "Crenditial not correct", Toast.LENGTH_LONG ).show()
            }

        }
    }
}