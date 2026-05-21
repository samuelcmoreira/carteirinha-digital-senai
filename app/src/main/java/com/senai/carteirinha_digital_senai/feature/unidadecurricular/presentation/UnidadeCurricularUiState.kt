package com.senai.carteirinha_digital_senai.feature.unidadecurricular.presentation

import com.senai.carteirinha_digital_senai.feature.unidadecurricular.domain.model.UnidadeCurricular

data class UnidadeCurricularUiState(
    val isLoading: Boolean = false,
    val unidadesCurriculares: List<UnidadeCurricular> = emptyList(),
    val errorMessage: String? = null
)
