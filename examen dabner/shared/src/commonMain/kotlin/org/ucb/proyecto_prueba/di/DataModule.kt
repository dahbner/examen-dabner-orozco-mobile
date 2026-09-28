package org.ucb.proyecto_prueba.di

import org.koin.dsl.module
import org.ucb.proyecto_prueba.weather.data.datasource.WeatherRemoteDatasource
import org.ucb.proyecto_prueba.weather.data.repository.WeatherRepositoryImpl
import org.ucb.proyecto_prueba.weather.data.service.WeatherService
import org.ucb.proyecto_prueba.weather.domain.repository.WeatherRepository

val dataModule = module {
    single<WeatherRemoteDatasource> { WeatherService() }
    single<WeatherRepository> { WeatherRepositoryImpl(get()) }
}