package com.jalian.recyclerviewexample.adapter

import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.jalian.recyclerviewexample.databinding.ItemListOneBinding

class ListOneViewHolder(private val binding: ItemListOneBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bin(item : String){
        binding.itemTvName.text = item
    }
}