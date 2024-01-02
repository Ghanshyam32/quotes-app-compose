package com.ghanshyam.quotesapp.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.foundation.lazy.items
import com.ghanshyam.quotesapp.models.Quote

@Composable
fun QuoteList(data: Array<Quote>, onClick: (quote: Quote) -> Unit) {
    LazyColumn(content = {
        items(data) {

            QuoteListItem(quote = it, onClick)
        }
    })
}