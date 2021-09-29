package com.example.domain.usecase.random_quote

import com.example.domain.usecase.base.UseCase
import com.example.mappers.QuoteMapper
import com.example.model.Quote
import com.example.repositories.random_quote.IRandomQuoteRepository
import javax.inject.Inject

class GetRandomQuoteUseCase @Inject constructor(
    private val repository: IRandomQuoteRepository,
    private val mapper: QuoteMapper
) : UseCase<Quote>() {

    override suspend fun invoke(): Quote {
        return mapper.map(repository.getRandomQuote())
    }
}