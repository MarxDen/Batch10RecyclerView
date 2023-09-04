package com.example.batch10recyclerview.data

import com.example.batch10recyclerview.R
import com.example.batch10recyclerview.data.model.Joke

class DataSource {

    fun loadJokes(): List<Joke>{
        return listOf(
            Joke(R.string.joke1),
            Joke(R.string.joke2),
            Joke(R.string.joke3),
            Joke(R.string.joke4),
            Joke(R.string.joke5),
            Joke(R.string.joke6),
            Joke(R.string.joke7),
            Joke(R.string.joke8),
            Joke(R.string.joke9)
        )
    }
}