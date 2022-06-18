package com.example.weather.Adapter

import android.annotation.SuppressLint
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.ViewGroup


import androidx.recyclerview.widget.RecyclerView
import com.example.weather.R
import com.example.weather.databinding.ItemWeatherBinding

class AdapterWeather() : RecyclerView.Adapter<AdapterWeather.WeatherViewholder>() {
   private var selectedposition=0

    class WeatherViewholder(val binding: ItemWeatherBinding) :
        RecyclerView.ViewHolder(binding.root) {



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherViewholder {
        return WeatherViewholder(
            ItemWeatherBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    @SuppressLint("NotifyDataSetChanged", "ResourceAsColor")
    override fun onBindViewHolder(holder: WeatherViewholder, position: Int) {
        if (selectedposition==holder.adapterPosition){
        holder.binding.layout.background= ColorDrawable(R.color.recyclerclr)
        }else{
            holder.binding.layout.background=ColorDrawable(R.color.black)
        }

        holder.itemView.setOnClickListener {
            selectedposition=holder.adapterPosition
             notifyDataSetChanged()
        }

    }

    override fun getItemCount(): Int {
        return 10
    }



}


