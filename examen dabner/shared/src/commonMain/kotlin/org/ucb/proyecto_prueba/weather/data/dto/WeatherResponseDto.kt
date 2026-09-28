package org.ucb.proyecto_prueba.weather.data.dto

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

@Serializable
data class WeatherResponseDto(
    val latitude: Double? = null,
    val longitude: Double? = null,
    @SerialName("current_weather") val weather: WeatherDto? = null
)