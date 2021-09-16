package com.example.common.compose.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ClickableTextListItem(
    text: String,
    listener: (String) -> Unit
) {
    Text(
        text = text,
        fontSize = 20.sp,
        color = Color.Black,
        modifier = Modifier.fillMaxWidth()
            .clickable { listener.invoke(text) }
            .padding(16.dp)
    )
}