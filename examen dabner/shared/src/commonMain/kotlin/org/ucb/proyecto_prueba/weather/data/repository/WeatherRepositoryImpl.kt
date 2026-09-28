package org.ucb.proyecto_prueba.weather.data.repository

import org.ucb.proyecto_prueba.weather.data.datasource.WeatherRemoteDatasource
import org.ucb.proyecto_prueba.weather.domain.model.WeatherModel
import org.ucb.proyecto_prueba.weather.domain.repository.WeatherRepository
import org.ucb.proyecto_prueba.weather.data.mapper.toModel

class WeatherRepositoryImpl(
    val remote: WeatherRemoteDatasource
): WeatherRepository {
    override suspend fun getWeather(): Result<WeatherModel> {
        return try {
            val response = remote.getWeather()
            Result.success(response.toModel())
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}