package com.example.repositories.person

import com.example.model.network.QuoteResponse

interface IQuotesByPersonRepository {

    suspend fun getQuotesByPerson(personName: String): List<QuoteResponse>

}