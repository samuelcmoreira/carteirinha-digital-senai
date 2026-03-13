package com.senai.carteirinha_digital_senai.app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.compose.CarteirinhaDigitalSenaiTheme
import com.senai.carteirinha_digital_senai.core.navigation.AppNavHost

@Composable
fun App() {
    CarteirinhaDigitalSenaiTheme {

        val navController = rememberNavController()
//        val loginViewModel : LoginViewModel = hiltViewModel()
        AppNavHost(
            navController = navController
        )
    }
}