package com.example.horoscopapp.motherobject

import com.example.horoscopapp.data.network.response.PredictionResponse
import com.example.horoscopapp.domain.model.HoroscopeInfo
import com.example.horoscopapp.domain.model.HoroscopeInfo.*

object HoroscopeMotherObject {

    val anyResponse = PredictionResponse("date","prediction","virgo")

    val horoscopeInfoList = listOf(
        Aries,
        Taurus,
        Gemini,
        Cancer,
        Leo,
        Virgo,
        Libra,
        Scorpio,
        Sagittarius,
        Capricorn,
        Aquarius,
        Pisces
    )
}