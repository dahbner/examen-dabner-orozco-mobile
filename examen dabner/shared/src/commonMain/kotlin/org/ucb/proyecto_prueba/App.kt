package org.ucb.proyecto_prueba

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinApplication
import org.ucb.proyecto_prueba.di.dataModule
import org.ucb.proyecto_prueba.di.domainModule
import org.ucb.proyecto_prueba.di.presentationModule
import org.ucb.proyecto_prueba.weather.presentation.screen.WeatherScreen

@Composable
@Preview
fun App() {
    MaterialTheme {
        KoinApplication(application = {
            modules(
                dataModule,
                domainModule,
                presentationModule
            )
        }) {
            WeatherScreen()
        }
    }
}