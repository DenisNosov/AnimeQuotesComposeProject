package com.example.animequotescomposeproject.di

import com.example.network.ApiServiceFactory
import com.example.network.api.IApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object NetworkModule {

    @Singleton
    @Provides
    fun provideOkHttpClient(): OkHttpClient {
        return ApiServiceFactory.createOkHttpClient()
    }

    @Singleton
    @Provides
    fun provideRetrofit(
        @BaseUrl baseUrl: String,
        client: OkHttpClient
    ): Retrofit {
        return ApiServiceFactory.createRetrofit(baseUrl, client)
    }

    @Singleton
    @Provides
    fun provideApiService(retrofit: Retrofit): IApiService {
        return retrofit.create(IApiService::class.java)
    }

}