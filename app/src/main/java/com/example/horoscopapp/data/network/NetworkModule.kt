package com.example.horoscopapp.data.network

import com.example.horoscopapp.BuildConfig.BASE_URL
import com.example.horoscopapp.data.RepositoryImpl
import com.example.horoscopapp.data.core.interceptors.AuthInterceptor
import com.example.horoscopapp.domain.model.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)   //The scope and that everyone can install it.
object NetworkModule {

    @Provides
    @Singleton  //It allows us to have a single instance of a class, which can only be created once.
    fun provideRetrofit(okHttpClient: OkHttpClient):Retrofit{
        //Here, we need to configure this to return a Retrofit object and once that's done, we can inject Retrofit everywhere.
        return Retrofit
            .Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    @Provides
    @Singleton
    fun providesOKHttpClient(authInterceptor: AuthInterceptor):OkHttpClient{
        val interceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
        return OkHttpClient
            .Builder()
            .addInterceptor(interceptor)
            .addInterceptor(authInterceptor)
            .build()
    }

    // Link this object with horoscopeApiService.kt
    @Provides
    fun provideHoroscopeApiService(retrofit: Retrofit):HoroscopeApiService{
        return retrofit.create(HoroscopeApiService::class.java)
    }

    // When someone calls this repository, it returns the apiService.
    @Provides
    fun provideRepository(apiService: HoroscopeApiService):Repository{
        return RepositoryImpl(apiService)
    }
}