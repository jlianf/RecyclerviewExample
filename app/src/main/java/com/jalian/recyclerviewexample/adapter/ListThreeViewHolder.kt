package com.jalian.recyclerviewexample.adapter

import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.jalian.recyclerviewexample.Cat
import com.jalian.recyclerviewexample.databinding.ItemListThreeBinding

class ListThreeViewHolder(private val binding: ItemListThreeBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item : Cat, position : Int, onItemClickListener : ((Int, Cat) -> Unit)?){
        Glide.with(binding.root.context)
            .load(item.url)
            .into(binding.itemImgCat)

        binding.root.setOnClickListener {
            onItemClickListener?.invoke(position, item)
        }
    }
}