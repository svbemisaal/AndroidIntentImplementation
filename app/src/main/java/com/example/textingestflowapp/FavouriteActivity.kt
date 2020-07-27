package com.example.textingestflowapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
//import kotlinx.android.synthetic.main.activity_favorite.*
import kotlinx.android.synthetic.main.activity_favourite.*

class FavouriteActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favourite)

        val layoutManager=LinearLayoutManager(this)
        layoutManager.orientation=LinearLayoutManager.VERTICAL

        recyclerView.layoutManager=layoutManager

        val adapter=AndroidAdapter(this,Items.favourite)

         recyclerView.adapter=adapter




    }
}