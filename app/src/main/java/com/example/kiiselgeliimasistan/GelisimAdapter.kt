package com.example.kiiselgeliimasistan

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class GelisimAdapter(
    private val context: Context,
    private val gelisimVerileri: List<GelisimVerisi>
) :
    RecyclerView.Adapter<GelisimAdapter.GelisimViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GelisimViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_gelisim, parent, false)
        return GelisimViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: GelisimViewHolder, position: Int) {
        val gelisimVerisi = gelisimVerileri[position]
        holder.imageView.setImageResource(gelisimVerisi.resimId)
        holder.adTextView.text = gelisimVerisi.ad
        holder.aciklamaTextView.text = gelisimVerisi.altBaslik
        holder.itemView.setOnClickListener {
            val intent = Intent(context, Detail::class.java).apply {
                putExtra("resimId", gelisimVerisi.resimId)
                putExtra("ad", gelisimVerisi.setsayisi)

            }
            context.startActivity(intent)
        }
    }



    override fun getItemCount(): Int {
        return gelisimVerileri.size
    }

    class GelisimViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val adTextView: TextView = itemView.findViewById(R.id.tvAd)
        val aciklamaTextView: TextView = itemView.findViewById(R.id.tvAltBaslik)
    }
}
