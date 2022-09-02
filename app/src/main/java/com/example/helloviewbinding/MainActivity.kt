package com.example.helloviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helloviewbinding.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnCurrent.setOnClickListener {
            binding.textResult.text = Date().toString()
        }
    }
}