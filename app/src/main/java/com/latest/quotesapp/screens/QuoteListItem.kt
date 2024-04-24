package com.latest.quotesapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.latest.quotesapp.R
import com.latest.quotesapp.model.Quote
import kotlin.text.Typography.quote

@Composable
fun QuoteListItem(
    modifier: Modifier = Modifier, quote: Quote,
    onClick : () -> Unit
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .clickable {
                onClick()
            }
            .padding(10.dp)
            .background(Color.White),
        shape = RoundedCornerShape(5.dp)
    ) {

        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {

            Row(
                modifier = Modifier.fillMaxWidth()
            ) {

                Box(
                    modifier = modifier
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
                Spacer(modifier = Modifier.width(10.dp))

                Column {

                    Text(
                        text = quote.text,
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
                        text = quote.author,
                        fontWeight = FontWeight.Light,
                        fontFamily = FontFamily.Monospace,
                        fontSize = 10.sp
                    )

                }

            }
        }
    }

}

@Preview(showBackground = true)
@Composable
private fun QuoteItemPreview() {
    QuoteListItem(
        quote = Quote(
            text = "This is a quote and it's written by its author.", author = "Author Authorson"
        ), onClick = {}
    )
}