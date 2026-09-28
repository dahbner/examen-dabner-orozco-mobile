package org.ucb.proyecto_prueba.weather.data.service

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.ucb.proyecto_prueba.weather.data.datasource.WeatherRemoteDatasource
import org.ucb.proyecto_prueba.weather.data.dto.WeatherResponseDto

class WeatherService : WeatherRemoteDatasource {
    private val client = HttpClient {
        install(ContentNegotiation) {
            json(
                Json {
                    prettyPrint = true
                    isLenient = true
                    ignoreUnknownKeys = true
                }
            )
        }
    }

    override suspend fun getWeather(): WeatherResponseDto {
        val response = client.get("https://api.open-meteo.com/v1/forecast?latitude=40.71&longitude=-74.01&current_weather=true")
        try {
            val body = response.body<WeatherResponseDto>()
            return body
        } catch (e: Exception) {
            throw e
        }
    }
}