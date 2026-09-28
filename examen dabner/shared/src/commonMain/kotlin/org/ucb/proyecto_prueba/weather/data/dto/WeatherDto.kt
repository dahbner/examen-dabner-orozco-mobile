package org.ucb.proyecto_prueba.weather.data.dto

import kotlinx.serialization.Serializable

@Serializable
data class WeatherDto(
    val temperature: Double? = null,
    val windspeed: Double? = null,
    val winddirection: Double? = null,
    val weathercode: Int? = null,
    val time: String? = null
)