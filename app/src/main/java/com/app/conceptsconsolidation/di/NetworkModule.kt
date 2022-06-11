package com.app.conceptsconsolidation.di

import com.app.conceptsconsolidation.retrofit.FakerAPI
import com.app.conceptsconsolidation.utility.Constants
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {

    @Provides
    @Singleton
    fun providesRetrofit():Retrofit{
        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun providesFakerAPI(
        retrofit: Retrofit
    ):FakerAPI{
        return retrofit.create(FakerAPI::class.java)
    }



}