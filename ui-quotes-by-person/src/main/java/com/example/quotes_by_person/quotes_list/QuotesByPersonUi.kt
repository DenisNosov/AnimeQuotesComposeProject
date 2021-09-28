package com.example.quotes_by_person

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.common.compose.ui.ClickableTextListItem
import com.example.common.compose.ui.TextListItem


@Composable
fun QuoteItem(
    text: String
) {
    TextListItem(text)
}

@Composable
fun QuotesList() {
    LazyColumn(
        modifier = Modifier
            .wrapContentWidth()
            .fillMaxHeight()
    ) {
//        items(
//            items
//        ) {
//
//        }
    }
}