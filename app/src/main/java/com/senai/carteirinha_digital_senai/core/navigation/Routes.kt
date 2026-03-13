package com.senai.carteirinha_digital_senai.core.navigation

sealed class Routes(val route: String) {
    data object Login : Routes("login")
    data object Carteirinha : Routes("carteirinha")
}