package com.example.horoscopapp.data

import android.util.Log
import com.example.horoscopapp.data.network.HoroscopeApiService
import com.example.horoscopapp.data.network.response.PredictionResponse
import com.example.horoscopapp.domain.model.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService): Repository{
    // RepositoryImpl extends Repository
    // Here, it will handle everything and send it to the Repository
    // This way, we abstract the layers, and each layer has its own responsibility
    override suspend fun getPrediction(sign: String) : PredictionResponse? {
        // Request or run the service
        kotlin.runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it }
            .onFailure { Log.i("Moreno", "Error ${it.message}") }
        return null
    }


}