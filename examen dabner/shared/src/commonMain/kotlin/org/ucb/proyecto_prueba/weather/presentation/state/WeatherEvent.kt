package org.ucb.proyecto_prueba.weather.presentation.state

sealed interface WeatherEvent {
    data class OnShowDetail(val id: String) : WeatherEvent
}