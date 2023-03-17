package com.jalian.recyclerviewexample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jalian.recyclerviewexample.R
import com.jalian.recyclerviewexample.databinding.ItemListOneBinding

class ListOneAdapter : RecyclerView.Adapter<ListOneViewHolder>() {
    var items : List<String> = emptyList()

    //untuk membuat view 1 per 1 dari list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListOneViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_one, parent, false)
        val binding = ItemListOneBinding.bind(view)

        return ListOneViewHolder(binding)
    }

    //ketika view terbuat
    override fun onBindViewHolder(holder: ListOneViewHolder, position: Int) {
        val item = items[position]
        holder.bin(item)
    }

    //menghitung jumlah list
    override fun getItemCount(): Int {
        return items.size
    }

}