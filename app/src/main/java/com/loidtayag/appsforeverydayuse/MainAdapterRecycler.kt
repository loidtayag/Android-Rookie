package com.loidtayag.appsforeverydayuse

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainAdapterRecycler(private var items: ArrayList<MainModelRecycler>) : RecyclerView.Adapter<MainAdapterRecycler.ViewHolder>(){
    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        var image: ImageView = view.findViewById(R.id.image_recycler_main)
        var text: TextView = view.findViewById(R.id.text_recycler_main)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycler_main, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.image.setImageResource(items[position].image)
        holder.text.text = items[position].name
    }

    override fun getItemCount(): Int = items.size
}