package com.example.textingestflowapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_favourite.*
//import kotlinx.android.synthetic.main.activity_favorite.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button:Button=findViewById(R.id.openNextApp)

        button.setOnClickListener(View.OnClickListener() {

                intent = Intent(Intent.ACTION_MAIN)

                val manage = packageManager

                intent = manage.getLaunchIntentForPackage("com.example.myfirstapp")
                intent.addCategory(Intent.CATEGORY_LAUNCHER)

                startActivity(intent)


        })


        moveToNext.setOnClickListener {
            Log.i("Main Activity ","The button has been clicked");

            //Flashes message on the activity layout//
            Toast.makeText(  this,"The Button has been clicked by Shubham",Toast.LENGTH_SHORT).show();
        }

        sendMessageToNextButton.setOnClickListener {

            val message:String =enterUserMessage.text.toString();
            Toast.makeText(  this,message,Toast.LENGTH_SHORT).show();


            val intent=Intent (this,SecondActivity::class.java)
            intent.putExtra("data is",message)
            startActivity(intent)
        }


        shareToOtherApps.setOnClickListener {

            val message:String=enterUserMessage.text.toString()

            val intent =Intent()
            intent.action=Intent.ACTION_SEND

            intent.putExtra(Intent.EXTRA_TEXT,message)

            intent.type="text/plain"

            startActivity(Intent.createChooser(intent,"Share with the app :"))

        }


        recyclerViewbutton.setOnClickListener {

            val intent =Intent(this,FavouriteActivity::class.java)

            startActivity(intent)
        }





    }



}