package com.example.domain.usecase.person

import com.example.domain.usecase.base.UseCase
import com.example.domain.usecase.base.UseCaseWithParams
import com.example.mappers.QuoteMapper
import com.example.model.Quote
import com.example.repositories.person.IQuotesByPersonRepository
import javax.inject.Inject

class GetQuoteByPersonUseCase @Inject constructor(
    private val repository: IQuotesByPersonRepository,
    private val mapper: QuoteMapper
) : UseCaseWithParams<String, List<Quote>>() {

    override suspend fun invoke(params: String): List<Quote> {
        return repository.getQuotesByPerson(params).map(mapper::map)
    }

}