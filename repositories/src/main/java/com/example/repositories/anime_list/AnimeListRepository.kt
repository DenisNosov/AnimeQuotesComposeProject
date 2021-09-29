package com.example.repositories.anime_list

import com.example.model.network.QuoteResponse
import com.example.network.api.IApiService
import javax.inject.Inject

class AnimeListRepository @Inject constructor(
    private val apiService: IApiService
) : IAnimeListRepository {

    override suspend fun getAnimeList(): List<String> {
        return apiService.getAllAvailableAnime()
    }

    override suspend fun getQuotesByAnime(animeTitle: String): List<QuoteResponse> {
        return apiService.getQuotesByAnime(animeTitle)
    }

}