package org.ucb.proyecto_prueba.weather.data.mapper

import org.ucb.proyecto_prueba.weather.data.dto.WeatherResponseDto
import org.ucb.proyecto_prueba.weather.domain.model.WeatherModel

fun WeatherResponseDto.toModel() = WeatherModel(
    latitude = latitude ?: 0.0,
    longitude = longitude ?: 0.0,
    temperature = weather?.temperature ?: 0.0,
    windspeed = weather?.windspeed ?: 0.0,
    winddirection = weather?.winddirection ?: 0.0,
    weathercode = weather?.weathercode ?: 0,
    time = weather?.time ?: "Sin datos"
)