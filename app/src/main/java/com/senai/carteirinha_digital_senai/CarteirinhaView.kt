package com.senai.carteirinha_digital_senai

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rafaelcosta.myapplication.QrCode

@Composable
fun CarteirinhaView(modifier: Modifier = Modifier){
    Surface(
        modifier = modifier
            .fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Box() {
            Image(
                painterResource(R.drawable.barata),
                contentDescription = "background",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(R.drawable.senai_logo_1),
                    contentDescription = "logo_senai",
                    modifier = Modifier
                        .width(200.dp)
                        .weight(1f),
                    contentScale = ContentScale.Fit
                )
                Image(
                    painter = painterResource(R.drawable.foto_perfil),
                    contentDescription = "foto_perfil",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
//                        .size(150.dp)
                        .aspectRatio(1f)
                        .clip(CircleShape)
                        .border(2.dp, MaterialTheme.colorScheme.primary, CircleShape)
                        .weight(1.5f)
                )
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(0.9f)
                            .weight(0.2f),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        LabelText(
                            label = "Nome: ",
                            modifier = Modifier.weight(1f)
                        )
                        ValueText(
                            value = "Samuel",
                            modifier = Modifier.weight(4f)
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(.9f)
                            .weight(.6f),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        LabelText(
                            label = "Curso: ",
                            modifier = Modifier.weight(1f)
                        )
                        ValueText(
                            value = "Desenvolvimento de Sistemas",
                            fontWeight = FontWeight.Normal,
                            fontSize = 20.sp,
                            modifier = Modifier.weight(4f)
                        )
                    }
                }

                QrCode(
                    conteudo = "vem pro x1 pedrinho",
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }
}