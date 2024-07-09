package com.example.horoscopapp.ui.detail

import androidx.lifecycle.ViewModel
import com.example.horoscopapp.domain.model.usecase.GetPredictionUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class HoroscopeDetailViewModel @Inject constructor(private val getPredictionUseCase: GetPredictionUseCase): ViewModel() {

    private var _state = MutableStateFlow<HoroscopeDetailState>(HoroscopeDetailState.Loading) // Start State
    val state : StateFlow<HoroscopeDetailState> = _state


    fun example(){
        getPredictionUseCase() // we call the function from GetPredictionUseCase.kt
    }
}