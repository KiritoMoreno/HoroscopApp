package com.example.horoscopapp.data.network
import com.example.horoscopapp.data.network.response.PredictionResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface HoroscopeApiService {

    @GET("/{sing}")
    suspend fun getHoroscope(@Path("sign") sign: String): PredictionResponse

}