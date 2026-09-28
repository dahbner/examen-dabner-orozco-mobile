package org.ucb.proyecto_prueba.weather.presentation.state

sealed interface WeatherEffect {
    data class ShowToast(val message: String) : WeatherEffect
    object NavigateToDetail : WeatherEffect
}