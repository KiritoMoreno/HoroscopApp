package com.example.horoscopapp.ui.horoscope.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.horoscopapp.databinding.ItemHoroscopeBinding
import com.example.horoscopapp.domain.model.HoroscopeInfo

class HoroscopeViewHolder(view: View) : RecyclerView.ViewHolder(view){

    private val binding = ItemHoroscopeBinding.bind(view)

    // It will have two references img and name
    fun render(horoscopeInfo: HoroscopeInfo, onItemSelected: (HoroscopeInfo) -> Unit){
        val context = binding.tvTitle.context
        binding.ivHoroscope.setImageResource(horoscopeInfo.img)
        binding.tvTitle.text = context.getString(horoscopeInfo.name)

        binding.itemHoroscopeParent.setOnClickListener { onItemSelected(horoscopeInfo) }
    }
}