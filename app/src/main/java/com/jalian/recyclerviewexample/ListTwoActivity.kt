package com.jalian.recyclerviewexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.jalian.recyclerviewexample.adapter.ListTwoAdapter
import com.jalian.recyclerviewexample.databinding.ActivityTwoBinding

class ListTwoActivity : AppCompatActivity() {
    private val binding : ActivityTwoBinding by lazy{
        ActivityTwoBinding.inflate(layoutInflater)
    }
    private val listAdapter = ListTwoAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.rvTwo.layoutManager = LinearLayoutManager(this)
        binding.rvTwo.adapter = listAdapter

        val newItem = Data.listNameAge
        listAdapter.addItem(newItem)
    }
}