package com.example.horoscopapp.ui.horoscope

import com.example.horoscopapp.data.providers.HoroscopeProvider
import com.example.horoscopapp.motherobject.HoroscopeMotherObject.horoscopeInfoList
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class HoroscopeViewModelTest{

    @MockK
    lateinit var  horoscopeProvider : HoroscopeProvider

    private lateinit var viewModel: HoroscopeViewModel

    // Before run the test
    @Before
    fun setUp(){
        //To be avalible to use MockK we have to do this ->
        MockKAnnotations.init(this, relaxUnitFun = true)

    }

    @Test
    fun `when viewModel is created then horoscopes are loaded`(){
        //Given

        // we mockk the provider and we have to mock the answer
        every { horoscopeProvider.getHoroscopes() } returns horoscopeInfoList   // When somebody calls horoscope, it checks horoscopeInfoList
        viewModel = HoroscopeViewModel(horoscopeProvider)

        //When
        val horoscopes = viewModel.horoscope.value

        //Then
        assertTrue(horoscopes.isNotEmpty())
    }


}