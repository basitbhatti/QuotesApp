package com.latest.quotesapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.latest.quotesapp.model.Quote

@Composable
fun QuoteListScreen(modifier: Modifier = Modifier, data: Array<Quote>, onClick: () -> Unit) {
    Column {

        Text(
            text = "Quotes App",
            textAlign = TextAlign.Center,
            modifier = modifier
                .padding(8.dp, 24.dp)
                .fillMaxWidth(1f),
            style = MaterialTheme.typography.headlineMedium,
            fontFamily = FontFamily.Serif
        )

        LazyColumn {
            items(data) {
                QuoteListItem(modifier = Modifier, quote = it, onClick = { onClick() })
            }
        }

    }
}