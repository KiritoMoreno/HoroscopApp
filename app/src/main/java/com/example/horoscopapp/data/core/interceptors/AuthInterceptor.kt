package com.example.horoscopapp.data.core.interceptors

import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class AuthInterceptor@Inject constructor(private val tokeManager: TokenManager):Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()   //Here I have the original request that will reach the server.
            .newBuilder() //Here recreate with something new that I am going to give it to the newBuilder. IMPORTANT:  without modifying the real and original information.
            .header("Autorization", tokeManager.getToken())
            .build()
        return chain.proceed(request)

    }

}