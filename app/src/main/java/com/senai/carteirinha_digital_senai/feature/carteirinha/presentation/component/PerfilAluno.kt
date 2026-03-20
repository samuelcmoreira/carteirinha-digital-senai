package com.senai.carteirinha_digital_senai.feature.carteirinha.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.senai.carteirinha_digital_senai.R

@Composable
fun PerfilAluno(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(
            space = 10.dp,
            alignment = Alignment.CenterVertically
        )
    ) {
        Image(
            painter = painterResource(R.drawable.foto_perfil),
            contentDescription = "foto_perfil",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth(.6f)
                .clip(CircleShape)
                .border(2.dp, MaterialTheme.colorScheme.primary, CircleShape)
                .aspectRatio(1f)
        )
        InfoAluno(
            labelText = "Nome",
            valueText = "Samuel",
            modifier = Modifier.fillMaxWidth(),
        )
        InfoAluno(
            labelText = "Curso",
            valueText = "Técnico em Desenvolvimento de Sistemas",
            fontWeight = FontWeight.Normal,
            fontSize = 20.sp,
            modifier = Modifier.fillMaxWidth(),
        )
    }
}