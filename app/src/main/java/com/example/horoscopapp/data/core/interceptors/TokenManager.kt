package com.example.horoscopapp.data.core.interceptors

import javax.inject.Inject

class TokenManager @Inject constructor(){
    fun getToken(): String = "HELLO"
}