package com.example.repositories.person

import com.example.model.network.QuoteResponse
import com.example.network.api.IApiService
import javax.inject.Inject

class QuotesByPersonRepository @Inject constructor(
    private val apiService: IApiService
) : IQuotesByPersonRepository {

    override suspend fun getQuotesByPerson(personName: String): List<QuoteResponse> {
        return apiService.getQuotesByCharacter(personName)
    }
}