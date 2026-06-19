package com.senai.carteirinha_digital_senai.feature.home.presentation

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class HomeViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(HomeUiState())
    val uiState: StateFlow<HomeUiState> = _uiState.asStateFlow()

    init {
        _uiState.update { currentState ->
            currentState.copy(
                nomeAluno = "Samuel",
                subtitulo = "Aprendiz Técnico em Desenvolvimento de Sistemas"
            )
        }
    }

    fun onEvent(event: HomeEvent) {
    }
}