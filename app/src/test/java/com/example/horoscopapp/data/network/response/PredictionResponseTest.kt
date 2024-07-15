package com.example.horoscopapp.data.network.response

import io.kotlintest.shouldBe
import org.junit.Assert.*
import org.junit.Test

class PredictionResponseTest{

    @Test
    fun `the toDomain method should return a correct predictionModel`(){
        // We divided the test in three parts.

        //Given
        val horoscopeResponse = PredictionResponse("date","prediction","virgo")

        //When
        val predictionModel = horoscopeResponse.toDomain()

        //Then
        predictionModel.sign shouldBe  horoscopeResponse.sign
        predictionModel.horoscope shouldBe  horoscopeResponse.horoscope

    }

}