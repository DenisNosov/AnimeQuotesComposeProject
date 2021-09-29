package com.example.random_quote

import com.example.model.Quote

data class RandomQuoteViewState(
    val loading: Boolean = true,
    val quote: Quote? = null
) {
    companion object {
        val Empty = RandomQuoteViewState()
    }
}