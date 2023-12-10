package com.dronios777.harrypotter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dronios777.harrypotter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}