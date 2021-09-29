package com.example.random_quote

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.common.compose.rememberFlowWithLifecycle

@Composable
fun RandomQuoteUi() {
    RandomQuoteUi(
        viewModel = hiltViewModel()
    )
}

@Composable
internal fun RandomQuoteUi(
    viewModel: RandomQuoteViewModel
) {
    val viewState by rememberFlowWithLifecycle(viewModel.state)
        .collectAsState(initial = RandomQuoteViewState.Empty)
}