package com.example.repositories.anime_list

import com.example.model.network.QuoteResponse

interface IAnimeListRepository {

    suspend fun getAnimeList(): List<String>

    suspend fun getQuotesByAnime(animeTitle: String): List<QuoteResponse>

}