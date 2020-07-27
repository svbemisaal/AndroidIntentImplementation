package com.example.textingestflowapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_favourite_move_to_next.view.*
import kotlinx.android.synthetic.main.list_view.view.*

class  AndroidAdapter(private val context:Context, private val favourite: List<Favourite>) : RecyclerView.Adapter<AndroidAdapter.MyViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val view=LayoutInflater.from(context).inflate(R.layout.list_view,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {

        return favourite.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val favourites=favourite[position]

        holder.setData(favourites,position)

    }

    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)
    {

        var currfavourite:Favourite?=null
        var currposition:Int=0;


        init{

// move top next page with the favourite activity


            itemView.button2.setOnClickListener {
                val intent = Intent(context,favouriteMoveToNext::class.java)

                intent.putExtra("data is","The favourite activity is "+ currfavourite!!.name )
                context.startActivity(intent)
            }


            itemView.setOnClickListener {
                Toast.makeText(context,"the favourite activity of shubham  is"+currfavourite,Toast.LENGTH_SHORT).show()
            }



            itemView.imgShare.setOnClickListener {

                val intent = Intent()


                intent.action=Intent.ACTION_SEND

                intent.putExtra(Intent.EXTRA_TEXT,  "The activity is"+currfavourite!!.name )

                intent.type="text/plain"

                context.startActivity(Intent.createChooser(intent,"Share the favourites  with the other apps :"))
            }
        }
        fun setData(favourites: Favourite?,position: Int)
        {
             itemView.txvTitle.text=favourites!!.name

            this.currfavourite=favourites
            this.currposition=position

        }
    }

}