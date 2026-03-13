package com.senai.carteirinha_digital_senai.feature.auth.presentation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.CarteirinhaDigitalSenaiTheme


@Composable
fun LoginScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(
            space = 16.dp,
            alignment = Alignment.CenterVertically
        )
    ) {
        TextField(
            value = "",
            onValueChange = {},
            label = {
                Text(text = "Login")
            }
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = {
                Text(text = "Senha")
            }
        )
        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth(.6f),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primary
            ),
            border = BorderStroke(
                width = 1.dp,
                color = MaterialTheme.colorScheme.primary
            )
        ) {
            Text("Entrar")
        }
        OutlinedButton(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth(.6f),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.secondary
            ),
            border = BorderStroke(
                width = 1.dp,
                color = MaterialTheme.colorScheme.primary
            )
        ) {
            Text("Cadastrar")
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PreviewLoginClaro() {
    CarteirinhaDigitalSenaiTheme(darkTheme = false) {
        LoginScreen(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize()
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PreviewLoginEscuro() {
    CarteirinhaDigitalSenaiTheme(darkTheme = true) {
        LoginScreen(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize()
        )
    }
}