package com.example.random_quote

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.usecase.random_quote.GetRandomQuoteUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.launch
import javax.inject.Inject

class RandomQuoteViewModel @Inject constructor(
    private val getRandomQuoteUseCase: GetRandomQuoteUseCase
) : ViewModel() {

    private val _state: MutableStateFlow<RandomQuoteViewState> = MutableStateFlow(RandomQuoteViewState.Empty)
    val state: StateFlow<RandomQuoteViewState> = _state

    init {
        loadRandomQuote()
    }

    private fun loadRandomQuote() {
        viewModelScope.launch {
            val quote = getRandomQuoteUseCase()

            _state.value = _state.value.copy(
                loading = false,
                quote = quote
            )
        }
    }

}