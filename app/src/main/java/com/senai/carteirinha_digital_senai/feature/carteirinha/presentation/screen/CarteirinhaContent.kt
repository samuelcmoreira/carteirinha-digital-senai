package com.senai.carteirinha_digital_senai.feature.carteirinha.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.CarteirinhaDigitalSenaiTheme
import com.rafaelcosta.myapplication.QrCode
import com.senai.carteirinha_digital_senai.R
import com.senai.carteirinha_digital_senai.feature.carteirinha.presentation.component.BackgroundCarteirinha
import com.senai.carteirinha_digital_senai.feature.carteirinha.presentation.component.LogoSenai
import com.senai.carteirinha_digital_senai.feature.carteirinha.presentation.component.PerfilAluno

@Composable
fun CarteirinhaContent(
    qrCodeContent: String = "vem pro x1 pedrinho",
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        BackgroundCarteirinha(
            modifier = Modifier.fillMaxSize()
        )

        Column(
            modifier = Modifier
                .safeDrawingPadding()
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ) {
            LogoSenai(
                modifier = Modifier.fillMaxWidth(0.6f)
            )

            PerfilAluno(
                modifier = Modifier.fillMaxWidth(0.9f)
            )

            QrCode(
                conteudo = qrCodeContent,
                modifier = Modifier.fillMaxWidth(0.6f)
            )
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun CarteirinhaContentPreviewClaro() {
    CarteirinhaDigitalSenaiTheme(darkTheme = false) {
        CarteirinhaContent()
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun CarteirinhaContentPreviewEscuro() {
    CarteirinhaDigitalSenaiTheme(darkTheme = true) {
        CarteirinhaContent()
    }
}