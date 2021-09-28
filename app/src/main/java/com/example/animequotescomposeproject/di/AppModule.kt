package com.example.animequotescomposeproject.di

import com.example.animequotescomposeproject.BuildConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @BaseUrl
    fun provideBaseUrl(): String {
        return "https://animechan.vercel.app/api/"
    }

}