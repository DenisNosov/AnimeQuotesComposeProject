package com.example.quotes_by_person.quotes_list

import androidx.compose.runtime.Immutable

@Immutable
internal data class QuotesByPersonListViewState(
    val quotesList: List<String> = emptyList(),
    val loading: Boolean = false
) {
    companion object {
        val Empty = QuotesByPersonListViewState()
    }
}