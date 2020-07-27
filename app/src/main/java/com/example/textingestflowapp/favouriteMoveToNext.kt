package com.example.textingestflowapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_favourite_move_to_next.*
import kotlinx.android.synthetic.main.activity_second.*

class favouriteMoveToNext : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favourite_move_to_next)


        val bundle: Bundle?=intent.extras

        val message = bundle!!.getString("data is")

        Toast.makeText(this,message, Toast.LENGTH_SHORT).show()

        if (message != null) {
            textView.text= message
        }
    }
}