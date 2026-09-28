package org.ucb.proyecto_prueba.di

import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module
import org.ucb.proyecto_prueba.weather.presentation.viewmodel.WeatherViewModel

val presentationModule = module {
    viewModelOf(::WeatherViewModel)
}