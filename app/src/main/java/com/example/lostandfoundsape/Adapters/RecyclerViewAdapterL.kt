package com.example.lostandfoundsape.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lostandfoundsape.ItemHolders.FoundFragmentItem
import com.example.lostandfoundsape.ItemHolders.LostFragmentItems
import com.example.lostandfoundsape.R

class RecyclerViewAdapterL(private val itemList: List<LostFragmentItems>): RecyclerView.Adapter<RecyclerViewAdapterL.itemViewHolder>() {

    inner class itemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imageView = itemView.findViewById<ImageView>(R.id.lost_img1)
        val textView1 = itemView.findViewById<TextView>(R.id.lost_tv1)
        val textView2 = itemView.findViewById<TextView>(R.id.lost_tv2)
        val textView3 = itemView.findViewById<TextView>(R.id.lost_tv3)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.lost_item_layout,
            parent, false)
        return itemViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: itemViewHolder, position: Int) {
        val currentItem = itemList[position]
        holder.imageView.setImageResource(currentItem.imageResource)
        holder.textView1.text = currentItem.text1
        holder.textView2.text = currentItem.text2
        holder.textView3.text = currentItem.text3
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}