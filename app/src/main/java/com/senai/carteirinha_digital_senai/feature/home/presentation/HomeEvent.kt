package com.senai.carteirinha_digital_senai.feature.home.presentation

sealed interface HomeEvent {
    data object OnCarteirinhaClick : HomeEvent
    data object OnUnidadesCurricularesClick : HomeEvent
    data object OnLogoutClick : HomeEvent
}