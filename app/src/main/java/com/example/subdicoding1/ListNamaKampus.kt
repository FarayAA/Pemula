package com.example.subdicoding1

import android.content.Intent
import android.support.v7.view.menu.ActionMenuItemView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListNamaKampus(
        private val listkampus: ArrayList<Kampus>,
        private val mainActivity: MainActivity
) : RecyclerView.Adapter<ListNamaKampus.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup , viewType: Int): ListViewHolder {
        val itemRow = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_kampus, viewGroup, false)
        return ListViewHolder(itemRow)
    }

    override fun getItemCount(): Int {
        return listkampus.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (nama, dari, foto) = listkampus[position]

        Glide.with(holder.itemView.context)
            .load(foto)
            .apply(RequestOptions().override(55,55))
            .into(holder.foto)

        holder.nama.text = nama
        holder.dari.text = dari
        holder.itemView.setOnClickListener{
            val intent = Intent(mainActivity,Detail::class.java)
            intent.putExtra("nama", nama)
            intent.putExtra("dari", dari)
            intent.putExtra("foto", foto)
            mainActivity.startActivity(intent)
        }
    }


    inner class ListViewHolder(itemView: View) :  RecyclerView.ViewHolder(itemView){
        var nama: TextView = itemView.findViewById(R.id.tv_nama)
        var dari: TextView = itemView.findViewById(R.id.tv_dari)
        var foto: ImageView = itemView.findViewById(R.id.img_foto)
    }
}