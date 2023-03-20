package com.jalian.recyclerviewexample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jalian.recyclerviewexample.R
import com.jalian.recyclerviewexample.User
import com.jalian.recyclerviewexample.databinding.ItemListTwoBinding

class ListTwoAdapter : RecyclerView.Adapter<LIstTwoViewHolder>() {
    private val items : MutableList<User> = mutableListOf()

    fun addItem(newItems : List<User>){
        items.addAll(newItems)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LIstTwoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_two, parent, false)
        val binding = ItemListTwoBinding.bind(view)
        return LIstTwoViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: LIstTwoViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }
}