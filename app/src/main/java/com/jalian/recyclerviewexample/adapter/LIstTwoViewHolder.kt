package com.jalian.recyclerviewexample.adapter

import androidx.recyclerview.widget.RecyclerView
import com.jalian.recyclerviewexample.User
import com.jalian.recyclerviewexample.databinding.ItemListTwoBinding

class LIstTwoViewHolder(private val binding : ItemListTwoBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item : User){
        binding.itemTvName.text = item.name
        binding.itemTvAge.text = "Umur : ${item.age}"
    }
}