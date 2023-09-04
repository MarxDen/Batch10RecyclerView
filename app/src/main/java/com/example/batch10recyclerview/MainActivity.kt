package com.example.batch10recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.batch10recyclerview.adapter.JokeAdapter
import com.example.batch10recyclerview.data.DataSource
import com.example.batch10recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val jokes = DataSource().loadJokes()

        val recView = binding.rvJokes

        recView.adapter = JokeAdapter(this, jokes)
        recView.setHasFixedSize(true)
    }
}