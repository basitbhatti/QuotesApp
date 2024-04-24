package com.latest.quotesapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.latest.quotesapp.R
import com.latest.quotesapp.model.Quote

@Composable
fun QuoteDetailScreen(modifier: Modifier = Modifier, quote: Quote) {

    Box(
        modifier = modifier
            .fillMaxSize(1f)
            .background(
                Brush.sweepGradient(
                    listOf(
                        Color.White, Color.Gray
                    )
                )
            ), contentAlignment = Alignment.Center
    ) {

        Card(
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
            modifier = modifier
                .padding(32.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(5.dp),
        ) {

            Column(
                verticalArrangement = Arrangement.Center, modifier = modifier.padding(25.dp)
            ) {

                Box(
                    modifier = modifier
                        .padding(top = 25.dp)
                        .size(40.dp)
                        .background(Color.Black),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.quote),
                        modifier = modifier.size(20.dp),
                        tint = Color.White,
                        contentDescription = null
                    )
                }

                Text(
                    text = quote.text,
                    modifier = modifier.padding(top = 10.dp),
                    color = Color.Black,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = FontFamily.Serif
                )

                Box(
                    modifier = Modifier
                        .width(100.dp)
                        .height(5.dp)
                        .padding(vertical = 5.dp)
                        .background(
                            Color(0xFFEEEEE)
                        )
                )

                Text(
                    modifier = modifier.padding(bottom = 25.dp),
                    text = quote.author,
                    fontWeight = FontWeight.Light,
                    fontFamily = FontFamily.Monospace,
                    fontSize = 10.sp
                )


            }

        }


    }

}

@Preview
@Composable
private fun DetailPrev() {
    QuoteDetailScreen(
        quote = Quote(
            "This is a quote written by its author", author = "Author Autherson"
        )
    )
}