package com.senai.carteirinha_digital_senai.core.designsystem.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.senai.carteirinha_digital_senai.feature.auth.presentation.screen.LoginScreen
import com.senai.carteirinha_digital_senai.feature.carteirinha.presentation.screen.CarteirinhaScreen
import com.senai.carteirinha_digital_senai.feature.home.presentation.screen.HomeScreen

@Composable
fun AppNavHost(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Routes.Login.route
    ) {
       composable(Routes.Login.route) {
           LoginScreen(
               modifier = Modifier
                   .fillMaxSize()
                   .padding(16.dp),
               navController = navController
           )
       }

        composable(route = Routes.Home.route) {
            HomeScreen(
                onCarteirinhaClick = {
                    navController.navigate(Routes.Carteirinha.route)
                },
                onUnidadesCurricularesClick = {
                    navController.navigate(Routes.UnidadesCurriculares.route)
                },
                onLogoutClick = {
                    navController.navigate(Routes.Login.route) {
                        popUpTo(Routes.Home.route) { inclusive = true }
                    }
                }
            )
        }

        composable(Routes.Carteirinha.route) {
            CarteirinhaScreen(
                modifier = Modifier
                    .fillMaxSize()
            )
        }
    }
}