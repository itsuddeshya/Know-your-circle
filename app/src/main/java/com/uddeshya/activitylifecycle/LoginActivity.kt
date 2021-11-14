package com.uddeshya.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    lateinit var etMobileNumber : EditText
    lateinit var etPassword : EditText
    lateinit var btnLogin:Button
    lateinit var txtForgotPassword :TextView
    lateinit var txtRegister :TextView
    var validMobileNumber = "123456789"
    var validPassward = arrayOf("uddeshya","atul","tribhuwan","prayukti","aniket","prashant")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_Login)

        title = "Log In"

        etMobileNumber = findViewById(R.id.etMobileNumber)
        etPassword = findViewById(R.id.etPassward)
        btnLogin = findViewById(R.id.btnLogin)
        txtForgotPassword = findViewById(R.id.txtForgotPassword)
        txtRegister = findViewById(R.id.txtRegister)

        btnLogin.setOnClickListener {

            val mobileNumber = etMobileNumber.text.toString()
            val passward = etPassword.text.toString()
            var user = "name"
            val intent = Intent(this@LoginActivity, MainActivity::class.java)

            if (mobileNumber == validMobileNumber) {

                if (passward == validPassward[0]) {
                    user = "uddeshya"
                    intent.putExtra("Name",user)
                    startActivity(intent)
                } else if (passward == validPassward[1]) {
                    user = "atul"
                    intent.putExtra("Name",user)
                    startActivity(intent)
                } else if (passward == validPassward[2]) {
                    user = "tribhuwan"
                    intent.putExtra("Name",user)
                    startActivity(intent)
                } else if (passward == validPassward[3]) {
                    user = "prayukti"
                    intent.putExtra("Name",user)
                    startActivity(intent)
                } else if (passward == validPassward[4]) {
                    user = "aniket"
                    intent.putExtra("Name",user)
                    startActivity(intent)
                } else if (passward == validPassward[5]) {
                    user = "prashant"
                    intent.putExtra("Name",user)
                    startActivity(intent)
                } else {
                    Toast.makeText(this@LoginActivity, "Crenditial not correct", Toast.LENGTH_LONG)
                        .show()
                }

            }
        }
    }

    override fun onPause() {
        super.onPause()
        finish()
    }
}