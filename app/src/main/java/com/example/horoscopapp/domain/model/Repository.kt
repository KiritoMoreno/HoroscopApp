package com.example.horoscopapp.domain.model

interface Repository {
    suspend fun getPrediction(sign: String)
}