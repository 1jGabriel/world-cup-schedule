package br.com.worldcupschedule.ui.composables

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable

@Composable
fun Countries() {
    LazyColumn {
        items(items = br.com.worldcupschedule.data.Countries.getCountries()) { country ->
            Flag(flagUrl = country.flagUrl)
        }
    }
}