package com.example.horoscopapp.ui.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.horoscopapp.domain.model.HoroscopeModel
import com.example.horoscopapp.domain.model.usecase.GetPredictionUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class HoroscopeDetailViewModel @Inject constructor(private val getPredictionUseCase: GetPredictionUseCase): ViewModel() {

    private var _state = MutableStateFlow<HoroscopeDetailState>(HoroscopeDetailState.Loading) // Start State
    val state : StateFlow<HoroscopeDetailState> = _state

    lateinit var horoscope: HoroscopeModel

    fun getHoroscope(sign: HoroscopeModel){
        horoscope = sign
        viewModelScope.launch{
            // Main thread ->
            _state.value = HoroscopeDetailState.Loading
            // Second thread -> for operations that are slow or take long time, we use a special dispatcher or special thread.
            val result = withContext(Dispatchers.IO) { getPredictionUseCase(sign.name)} //we call the function from GetPredictionUseCase.kt
            // Main thread ->
            if (result!=null){
                _state.value = HoroscopeDetailState.Success(result.horoscope, result.sign, horoscope)
            }else{
                _state.value = HoroscopeDetailState.Error("An error has occurred, please try again later")
            }

        }
    }
}