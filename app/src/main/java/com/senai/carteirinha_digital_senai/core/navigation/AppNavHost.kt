package com.senai.carteirinha_digital_senai.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.senai.carteirinha_digital_senai.feature.auth.presentation.LoginScreen
import com.senai.carteirinha_digital_senai.feature.carteirinha.presentation.CarteirinhaScreen

@Composable
fun AppNavHost(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Routes.Carteirinha.route
    ) {
       composable(Routes.Login.route) {
           LoginScreen()
       }
        composable(Routes.Carteirinha.route) {
            CarteirinhaScreen()
        }
    }
}