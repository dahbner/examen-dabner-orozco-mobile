package org.ucb.proyecto_prueba.di

import org.koin.dsl.module
import org.ucb.proyecto_prueba.weather.domain.usecase.GetWeatherUseCase

val domainModule = module {
    single { GetWeatherUseCase(get()) }
}