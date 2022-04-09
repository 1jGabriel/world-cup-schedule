package br.com.worldcupschedule

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.worldcupschedule.ui.theme.WorldCupScheduleTheme
import br.com.worldcupschedule.data.Countries
import br.com.worldcupschedule.ui.composables.Countries
import br.com.worldcupschedule.ui.composables.Match

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WorldCupScheduleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column {
                        Match(squadA = Countries.getCountries()[0], squadB = Countries.getCountries()[1])
                        Spacer(modifier = Modifier.size(14.dp))
                        Match(squadA = Countries.getCountries()[2], squadB = Countries.getCountries()[3])
                        Spacer(modifier = Modifier.size(14.dp))
                        Match(squadA = Countries.getCountries()[4], squadB = Countries.getCountries()[5])
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WorldCupScheduleTheme {
        Countries()
    }
}

