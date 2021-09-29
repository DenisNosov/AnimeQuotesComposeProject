package com.example.mappers

import com.example.model.Quote
import com.example.model.network.QuoteResponse
import javax.inject.Inject

class QuoteMapper @Inject constructor() : Mapper<QuoteResponse, Quote> {

    override fun map(src: QuoteResponse): Quote {
        return with(src) {
            Quote(
                anime,
                character,
                quote
            )
        }
    }
}