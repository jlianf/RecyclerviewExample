package com.jalian.recyclerviewexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jalian.recyclerviewexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding : ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnOne.setOnClickListener{
            val intent = Intent(this, ListOneActivity::class.java)
            startActivity(intent)
        }

        binding.btnTwo.setOnClickListener{
            val intent = Intent(this, ListTwoActivity::class.java)
            startActivity(intent)
        }

        binding.btnThree.setOnClickListener{
            val intent = Intent(this, ListThreeActivity::class.java)
            startActivity(intent)
        }
    }
}