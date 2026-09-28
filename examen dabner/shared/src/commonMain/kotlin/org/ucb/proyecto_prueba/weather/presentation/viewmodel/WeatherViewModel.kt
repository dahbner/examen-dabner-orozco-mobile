package org.ucb.proyecto_prueba.weather.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.ucb.proyecto_prueba.weather.domain.usecase.GetWeatherUseCase
import org.ucb.proyecto_prueba.weather.presentation.state.WeatherEffect
import org.ucb.proyecto_prueba.weather.presentation.state.WeatherEvent
import org.ucb.proyecto_prueba.weather.presentation.state.WeatherUiState

class WeatherViewModel(
    val usecase: GetWeatherUseCase
) : ViewModel() {

    private val _effect = MutableSharedFlow<WeatherEffect>()
    val effect = _effect.asSharedFlow()

    private val _state = MutableStateFlow(WeatherUiState())
    val state = _state.asStateFlow()

    init {
        load()
    }

    fun emitEvent(event: WeatherEvent) {
        when (event) {
            is WeatherEvent.OnShowDetail -> {
                emitEffect(WeatherEffect.NavigateToDetail)
            }
        }
    }

    private fun emitEffect(effect: WeatherEffect) {
        viewModelScope.launch {
            _effect.emit(effect)
        }
    }

    fun load() {
        _state.update {
            it.copy(isLoading = true)
        }
        viewModelScope.launch {
            val result = usecase.invoke()

            result.onSuccess { data ->
                _state.update {
                    it.copy(weather = data, isLoading = false)
                }
            }
        }
    }
}