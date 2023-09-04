package com.example.batch10recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.batch10recyclerview.data.model.Joke
import com.example.batch10recyclerview.databinding.JokeItemBinding

class JokeAdapter(private val context : Context,private val dataSet : List<Joke>) : RecyclerView.Adapter<JokeAdapter.JokeViewHolder>() {

    inner class JokeViewHolder(val binding: JokeItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JokeViewHolder {
        val binding = JokeItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return JokeViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onBindViewHolder(holder: JokeViewHolder, position: Int) {
        val item = dataSet[position]
        holder.binding.tvJokeText.text = context.resources.getString(item.stringResource)
    }
}