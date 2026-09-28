package org.ucb.proyecto_prueba.weather.domain.repository

import org.ucb.proyecto_prueba.weather.domain.model.WeatherModel

interface WeatherRepository {
    suspend fun getWeather(): Result<WeatherModel>
}