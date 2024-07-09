package com.example.horoscopapp.domain.model

import com.example.horoscopapp.data.network.response.PredictionResponse

interface Repository {
    suspend fun getPrediction(sign: String): PredictionModel?
}