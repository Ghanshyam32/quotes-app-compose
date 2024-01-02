package com.ghanshyam.quotesapp.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.ghanshyam.quotesapp.DataManager
import com.ghanshyam.quotesapp.models.Quote

@Composable
fun QuoteDetail(quote: Quote) {

    BackHandler {
        DataManager.switchPages(null)
    }

    Box(

        modifier = Modifier
            .fillMaxSize(1f)
            .background(
                Brush.sweepGradient(
                    colors = listOf(
                        Color.White,
                        Color.Gray
                    )
                )
            ),
        contentAlignment = Alignment.Center,
        content = {
            Card(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 10.dp
                ),
                modifier = Modifier.padding(32.dp)
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(16.dp, 24.dp)
                ) {
                    Image(
                        imageVector = Icons.Filled.FormatQuote,
                        contentDescription = "Quote",
                        modifier = Modifier
                            .size(80.dp)
                            .rotate(180F)
                    )
                    Text(
                        text = quote.quote,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 8.dp)
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = quote.author,
                        fontWeight = FontWeight.Thin,
                        modifier = Modifier.padding(top = 4.dp)
                    )
                }
            }
        }
    )

}