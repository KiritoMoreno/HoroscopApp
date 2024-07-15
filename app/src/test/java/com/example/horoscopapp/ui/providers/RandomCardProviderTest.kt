package com.example.horoscopapp.ui.providers

import org.junit.Assert.*
import org.junit.Test

class RandomCardProviderTest{
    @Test
    fun `get RandomCard shoul return a random card`(){
        //Given ->
        val randomCard = RandomCardProvider()
        //When->
        val card = randomCard.getLucky()
        //Then->
        assertNotNull(card)

    }



}