package org.ucb.proyecto_prueba.weather.domain.usecase

import org.ucb.proyecto_prueba.weather.domain.model.WeatherModel
import org.ucb.proyecto_prueba.weather.domain.repository.WeatherRepository

class GetWeatherUseCase(
    private val repository: WeatherRepository
) {
    suspend operator fun invoke(): Result<WeatherModel> {
        return repository.getWeather()
    }
}