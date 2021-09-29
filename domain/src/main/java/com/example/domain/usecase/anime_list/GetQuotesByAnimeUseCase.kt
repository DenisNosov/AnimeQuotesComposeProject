package com.example.domain.usecase.anime_list

import com.example.domain.usecase.base.UseCaseWithParams
import com.example.mappers.QuoteMapper
import com.example.model.Quote
import com.example.repositories.anime_list.IAnimeListRepository
import javax.inject.Inject

class GetQuotesByAnimeUseCase @Inject constructor(
    private val repository: IAnimeListRepository,
    private val mapper: QuoteMapper
) : UseCaseWithParams<String, List<Quote>>() {

    override suspend fun invoke(params: String): List<Quote> {
        return repository.getQuotesByAnime(params).map(mapper::map)
    }
}