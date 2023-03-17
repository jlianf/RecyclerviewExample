package com.jalian.recyclerviewexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.jalian.recyclerviewexample.adapter.ListOneAdapter
import com.jalian.recyclerviewexample.databinding.ActivityOneBinding

class ListOneActivity : AppCompatActivity() {
    private val binding : ActivityOneBinding by lazy {
        ActivityOneBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val listAdapter = ListOneAdapter()
        listAdapter.items = Data.listName

        val listLayoutManager = LinearLayoutManager(this)
        binding.rvOne.layoutManager = listLayoutManager

        binding.rvOne.adapter = listAdapter
    }
}