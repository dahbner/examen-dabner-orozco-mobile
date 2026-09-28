package org.ucb.proyecto_prueba.weather.domain.model

data class WeatherModel(
    val temperature: Double,
    val windspeed: Double,
    val winddirection: Double,
    val weathercode: Int,
    val time: String,
    val latitude: Double,
    val longitude: Double
)