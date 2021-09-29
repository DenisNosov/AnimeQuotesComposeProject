package com.example.domain.usecase.anime_list

import com.example.domain.usecase.base.UseCase
import com.example.repositories.anime_list.IAnimeListRepository
import javax.inject.Inject

class GetAnimeListUseCase @Inject constructor(
    private val repository: IAnimeListRepository
) : UseCase<List<String>>() {

    override suspend fun invoke(): List<String> {
        return repository.getAnimeList()
    }
}