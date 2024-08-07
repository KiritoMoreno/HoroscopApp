package com.example.horoscopapp.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.navArgs
import com.example.horoscopapp.R
import com.example.horoscopapp.databinding.ActivityHoroscopeDetailBinding
import com.example.horoscopapp.domain.model.HoroscopeModel
import com.example.horoscopapp.domain.model.HoroscopeModel.*
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class HoroscopeDetailActivity : AppCompatActivity() {
    private lateinit var binding : ActivityHoroscopeDetailBinding
    private val horoscopeDetailViewModel : HoroscopeDetailViewModel by viewModels()
    private val args: HoroscopeDetailActivityArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHoroscopeDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUI()
        horoscopeDetailViewModel.getHoroscope(args.type) // loading the horoscope
        
    }

    private fun initUI() {
        initListeners()
        initUIState()
    }

    private fun initListeners() {
        binding.ivback.setOnClickListener { onBackPressed() }
    }

    private fun initUIState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED){
                horoscopeDetailViewModel.state.collect{
                    when(it){
                        HoroscopeDetailState.Loading -> loadingState()
                        is HoroscopeDetailState.Error -> errorState()
                        is HoroscopeDetailState.Success -> successState(it)
                    }
                }
            }
        }
    }
    private fun loadingState(){
        binding.progressBar.isVisible = true
    }
    private fun errorState(){
        binding.progressBar.isVisible = false

    }
    private fun successState(state: HoroscopeDetailState.Success) {
        binding.progressBar.isVisible = false
        binding.tvTitle.text = state.sign
        binding.tvBody.text = state.prediction

        val image  = when(state.horoscopeModel){
            Aries -> R.drawable.detail_aries
            Aquarius -> R.drawable.detail_aquarius
            Cancer -> R.drawable.detail_cancer
            Capricorn -> R.drawable.detail_capricorn
            Gemini -> R.drawable.detail_gemini
            Leo -> R.drawable.detail_leo
            Libra -> R.drawable.detail_libra
            Pisces -> R.drawable.detail_pisces
            Sagittarius -> R.drawable.detail_sagittarius
            Scorpio -> R.drawable.detail_scorpio
            Taurus -> R.drawable.detail_taurus
            Virgo -> R.drawable.detail_virgo
        }
        binding.ivDetail.setImageResource(image)
    }
}