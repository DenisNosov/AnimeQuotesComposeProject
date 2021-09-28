package com.example.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object ApiServiceFactory {

    private const val DEFAULT_TIMEOUT_IN_SECONDS = 20L

    fun createOkHttpClient(): OkHttpClient =
        with(OkHttpClient.Builder()) {
            connectTimeout(DEFAULT_TIMEOUT_IN_SECONDS, TimeUnit.SECONDS)
            readTimeout(DEFAULT_TIMEOUT_IN_SECONDS, TimeUnit.SECONDS)
            writeTimeout(DEFAULT_TIMEOUT_IN_SECONDS, TimeUnit.SECONDS)
            if (BuildConfig.DEBUG) {
                addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
            }
            build()
        }

    fun createRetrofit(baseUrl: String, client: OkHttpClient): Retrofit =
        with(Retrofit.Builder()) {
            baseUrl(baseUrl)
            client(client)
            addConverterFactory(GsonConverterFactory.create())
            build()
        }

}