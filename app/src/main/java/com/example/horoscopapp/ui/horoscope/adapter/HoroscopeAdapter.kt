package com.example.horoscopapp.ui.horoscope.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.horoscopapp.R
import com.example.horoscopapp.domain.model.HoroscopeInfo

class HoroscopeAdapter (
    // The first time that we going to used we will not have the data. I will initialized with the emptyList
    private var horoscopeList: List<HoroscopeInfo> = emptyList(), private val onItemSelected:(HoroscopeInfo) -> Unit) : RecyclerView.Adapter<HoroscopeViewHolder>() {

    fun updateList(list: List<HoroscopeInfo>) {
        horoscopeList = list
        notifyDataSetChanged()   // We used this because we don't have anything and we will change everything one time
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HoroscopeViewHolder {
        return HoroscopeViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_horoscope, parent, false )
        )
    }

    override fun getItemCount(): Int = horoscopeList.size

    override fun onBindViewHolder(holder: HoroscopeViewHolder, position: Int) {
        holder.render(horoscopeList[position], onItemSelected)
    }


}