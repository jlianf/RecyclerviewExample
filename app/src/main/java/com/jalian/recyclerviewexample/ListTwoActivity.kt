package com.jalian.recyclerviewexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jalian.recyclerviewexample.databinding.ActivityTwoBinding

class ListTwoActivity : AppCompatActivity() {
    private val binding : ActivityTwoBinding by lazy{
        ActivityTwoBinding.inflate(layoutInflater)
    }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


    }
}