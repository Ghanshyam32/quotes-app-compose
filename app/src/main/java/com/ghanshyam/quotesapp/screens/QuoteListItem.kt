package com.ghanshyam.quotesapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.ghanshyam.quotesapp.models.Quote

@Composable
fun QuoteListItem(quote: Quote, onClick: (quote: Quote) -> Unit) {
    Card(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        ), modifier = Modifier
            .padding(8.dp)
            .clickable { onClick(quote) }
    ) {
        Row(Modifier.padding(16.dp)) {
            Image(
                imageVector = Icons.Filled.FormatQuote,
                colorFilter = ColorFilter.tint(Color.White),
                alignment = Alignment.TopStart,
                contentDescription = "",
                modifier = Modifier
                    .background(Color.Black)
                    .size(40.dp)
            )
            Spacer(modifier = Modifier.padding(10.dp))
            Column(
                modifier = Modifier
                    .weight(1f),
                verticalArrangement = Arrangement.Center
            ) {
                if (quote.quote != null) {
                    Text(
                        text = quote.quote,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 8.dp)
                    )
                }
                Box(
                    modifier = Modifier
                        .background(Color.Gray)
                        .fillMaxWidth(.4f)
                        .height(1.dp)
                )
                if (quote.author != null) {
                    Text(
                        text = quote.author,
                        fontWeight = FontWeight.Thin,
                        modifier = Modifier.padding(top = 4.dp)
                    )
                }
            }
        }
    }
}

