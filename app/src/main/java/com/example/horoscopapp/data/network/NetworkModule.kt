package com.example.horoscopapp.data.network

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)   //The scope and that everyone can install it.
object NetworkModule {

    @Provides
    fun provideRetrofit():Retrofit{

    }
}