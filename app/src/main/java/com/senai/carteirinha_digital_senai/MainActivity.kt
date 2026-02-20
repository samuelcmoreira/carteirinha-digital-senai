package com.senai.carteirinha_digital_senai

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.compose.CarteirinhaDigitalSenaiTheme
import com.rafaelcosta.myapplication.QrCode

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CarteirinhaDigitalSenaiTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    CarteirinhaDeEstudante(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

//diz que a função vai construir algo na tela (retirando o erro de "Column")
@Composable
fun CarteirinhaDeEstudante(modifier: Modifier = Modifier){ //nome: tipo, padrao
    Surface(
        modifier = modifier
            .fillMaxSize()
            .padding(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column (
            modifier = Modifier.padding(24.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                painter = painterResource(R.drawable.senai_logo_1),
                contentDescription = "logo_senai",
                modifier = Modifier.size(200.dp),
                contentScale = ContentScale.Fit
            )
            Image(
                painter = painterResource(R.drawable.foto_perfil),
                contentDescription = "foto_perfil",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(150.dp)
                    .clip(CircleShape)
                    .border(2.dp, MaterialTheme.colorScheme.primary, CircleShape)
            )
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Row {
                    Text(
                        text = "Nome: ",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.primary
                    )
                    Text(
                        text = "Samuel",
                        modifier = Modifier.padding(start = 8.dp),
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.primary
                    )
                }
                Row {
                    Text(
                        text = "Curso: ",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.primary
                    )
                    Text(
                        text = "Desenvolvimento de Sistemas",
                        modifier = Modifier.padding(start = 8.dp),
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.primary
                    )
                }
            }

            QrCode(
                conteudo = "vem pro x1 pedrinho"
            )
        }
    }
}