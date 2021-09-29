package com.example.animequotescomposeproject.di

import com.example.repositories.anime_list.AnimeListRepository
import com.example.repositories.anime_list.IAnimeListRepository
import com.example.repositories.person.IQuotesByPersonRepository
import com.example.repositories.person.QuotesByPersonRepository
import com.example.repositories.random_quote.IRandomQuoteRepository
import com.example.repositories.random_quote.RandomQuoteRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
interface RepositoryBindsModule {

    @Binds
    fun bindAnimeListRepository(repository: AnimeListRepository): IAnimeListRepository

    @Binds
    fun bindQuotesByPersonRepository(repository: QuotesByPersonRepository): IQuotesByPersonRepository

    @Binds
    fun bindRandomQuoteRepository(repository: RandomQuoteRepository): IRandomQuoteRepository

}