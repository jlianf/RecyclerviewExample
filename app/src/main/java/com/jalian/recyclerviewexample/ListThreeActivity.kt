package com.jalian.recyclerviewexample

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import com.jalian.recyclerviewexample.adapter.ListThreeAdapter
import com.jalian.recyclerviewexample.databinding.ActivityThreeBinding

class ListThreeActivity : AppCompatActivity() {
    private val binding : ActivityThreeBinding by lazy {
        ActivityThreeBinding.inflate(layoutInflater)
    }

    private val listAdapter = ListThreeAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.rvThree.layoutManager = GridLayoutManager(this, 2)
        binding.rvThree.adapter = listAdapter

        val newItems = Data.listCat
        listAdapter.addItems(newItems)

        listAdapter.onItemClick{ position, item ->
            Toast.makeText(this, "Ini item ke : $position", Toast.LENGTH_SHORT).show()
        }
    }
}