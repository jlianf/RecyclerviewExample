package com.jalian.recyclerviewexample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jalian.recyclerviewexample.Cat
import com.jalian.recyclerviewexample.R
import com.jalian.recyclerviewexample.databinding.ItemListThreeBinding

class ListThreeAdapter : RecyclerView.Adapter<ListThreeViewHolder>() {
    private val items : MutableList<Cat> = mutableListOf()
    private var onItemClickListener : ((Int, Cat) -> Unit)? = null

    fun addItems(newItem : List<Cat>){
        items.addAll(newItem)
        notifyDataSetChanged()
    }

    fun onItemClick(itemClick : (Int, Cat) -> Unit ){
        onItemClickListener = itemClick
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListThreeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_three, parent, false)

        val binding = ItemListThreeBinding.bind(view)

        return ListThreeViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ListThreeViewHolder, position: Int) {
       val item = items[position]
        holder.bind(item, position, onItemClickListener)
    }


}