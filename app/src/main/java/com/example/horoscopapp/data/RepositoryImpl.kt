package com.example.horoscopapp.data

import com.example.horoscopapp.data.network.HoroscopeApiService
import com.example.horoscopapp.domain.model.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService): Repository{
    // RepositoryImpl extends Repository
    // Here, it will handle everything and send it to the Repository
    // This way, we abstract the layers, and each layer has its own responsibility
    override suspend fun getPrediction(sign: String) {
        //

    }


}