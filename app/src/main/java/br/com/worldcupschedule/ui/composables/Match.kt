package br.com.worldcupschedule.ui.composables

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.worldcupschedule.model.Country

@Composable
fun Match(squadA: Country, squadB: Country) {
    Row(modifier = Modifier.fillMaxWidth()) {
        Flag(flagUrl = squadA.flagUrl)
        Spacer(Modifier.size(8.dp))
        Text(text = squadA.name)
        Spacer(Modifier.size(40.dp))
        Text(text = squadB.name)
        Spacer(Modifier.size(8.dp))
        Flag(flagUrl = squadB.flagUrl)
    }
}