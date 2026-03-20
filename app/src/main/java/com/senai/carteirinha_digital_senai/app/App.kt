package com.senai.carteirinha_digital_senai.app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.compose.CarteirinhaDigitalSenaiTheme
import com.senai.carteirinha_digital_senai.core.designsystem.navigation.AppNavHost

@Composable
fun App() {
    CarteirinhaDigitalSenaiTheme {
        val navController = rememberNavController()
        AppNavHost(
            navController = navController
        )
    }
}