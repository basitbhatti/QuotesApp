package com.latest.quotesapp.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.latest.quotesapp.DataManager
import com.latest.quotesapp.model.Quote

@Composable
fun QuoteListScreen(
    modifier: Modifier = Modifier, navController: NavHostController, data: Array<Quote>
) {

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

        if (DataManager.isDataLoaded.value) {
            LazyColumn {
                items(data) {
                    QuoteListItem(modifier = Modifier, navController = navController, quote = it)
                }
            }
        } else {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Text(text = "Loading...")
            }
        }


    }
}