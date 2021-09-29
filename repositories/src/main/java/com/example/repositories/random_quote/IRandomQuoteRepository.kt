package com.example.repositories.random_quote

import com.example.model.network.QuoteResponse

interface IRandomQuoteRepository {

    suspend fun getRandomQuote(): QuoteResponse

}