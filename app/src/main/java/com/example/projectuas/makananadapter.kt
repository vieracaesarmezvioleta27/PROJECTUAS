package com.example.projectuas

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class makananadapter (private val context: Context, private val namakota: List<makanan>, val listener: (makanan)-> Unit)
    : RecyclerView.Adapter<makananadapter.namakotaViewHolder>(){
    class namakotaViewHolder (view: View): RecyclerView.ViewHolder(view) {

        val imgmakanan = view.findViewById<ImageView>(R.id.img_item_photo)
        val namemakanan = view.findViewById<TextView>(R.id.tv_item_name)
        val descmakanan = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(namakota: makanan, listener: (makanan) ->Unit) {
            imgmakanan.setImageResource(namakota.imgmakanan)
            namemakanan.text = namakota.namemakanan
            descmakanan.text = namakota.descmakanan
            itemView.setOnClickListener {
                listener(namakota)}
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): namakotaViewHolder {
        return namakotaViewHolder(
            LayoutInflater.from(context).inflate(R.layout.list_makanan, parent, false)
        )
    }

    override fun onBindViewHolder(holder: namakotaViewHolder, position: Int) {
        holder.bindView(namakota[position], listener)
    }

    override fun getItemCount(): Int = namakota.size
    }
