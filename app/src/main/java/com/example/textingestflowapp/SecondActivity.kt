package com.example.textingestflowapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle: Bundle?=intent.extras

        val message = bundle!!.getString("data is")

        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()

        if (message != null) {
            messageDisplayedInNextActivity.text= message
        }
    }
}