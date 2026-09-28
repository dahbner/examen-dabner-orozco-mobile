package org.ucb.proyecto_prueba.weather.data.datasource

import org.ucb.proyecto_prueba.weather.data.dto.WeatherResponseDto

interface WeatherRemoteDatasource {
    suspend fun getWeather(): WeatherResponseDto
}