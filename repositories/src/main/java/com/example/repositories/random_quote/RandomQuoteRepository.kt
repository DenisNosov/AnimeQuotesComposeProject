package com.example.repositories.random_quote

import com.example.model.network.QuoteResponse
import com.example.network.api.IApiService
import javax.inject.Inject

class RandomQuoteRepository @Inject constructor(
    private val apiService: IApiService
) : IRandomQuoteRepository {

    override suspend fun getRandomQuote(): QuoteResponse {
        return apiService.getRandomQuote()
    }
}