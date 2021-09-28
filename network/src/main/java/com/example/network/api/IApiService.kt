package com.example.network.api

import com.example.model.network.QuoteResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface IApiService {

    @GET("random")
    suspend fun getRandomQuote(): QuoteResponse

    @GET("quotes/anime?title={title}")
    suspend fun getQuotesByAnime(
        @Path("title") animeTitle: String
    ): List<QuoteResponse>

    @GET("quotes/character?name={character_name}")
    suspend fun getQuotesByCharacter(
        @Path("character_name") characterName: String
    ): List<QuoteResponse>

    @GET("available/anime")
    suspend fun getAllAvailableAnime(): List<String>

}