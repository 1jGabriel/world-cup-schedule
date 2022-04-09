package br.com.worldcupschedule.ui.composables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import coil.compose.AsyncImage

@Composable
fun Flag(flagUrl: String) {
    Box(modifier = Modifier.wrapContentSize(align = Alignment.CenterStart)) {
        AsyncImage(
            model = flagUrl,
            contentDescription = null
        )
    }
}