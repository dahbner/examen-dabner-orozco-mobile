package org.ucb.proyecto_prueba.weather.presentation.state

import org.ucb.proyecto_prueba.weather.domain.model.WeatherModel

data class WeatherUiState(
    val isLoading: Boolean = false,
    val weather: WeatherModel? = null,
    val error: String? = null
)