package org.ucb.proyecto_prueba.weather.presentation.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.koin.compose.viewmodel.koinViewModel
import org.ucb.proyecto_prueba.weather.presentation.composable.CardWeather
import org.ucb.proyecto_prueba.weather.presentation.viewmodel.WeatherViewModel

@Composable
fun WeatherScreen(viewModel: WeatherViewModel = koinViewModel()) {
    val state = viewModel.state.collectAsState()

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        if(state.value.isLoading) {
            CircularProgressIndicator()
        } else {
            state.value.weather?.let { weatherData ->
                CardWeather(model = weatherData)
            }
        }
    }
}