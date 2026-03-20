package com.senai.carteirinha_digital_senai.feature.carteirinha.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.senai.carteirinha_digital_senai.R

@Composable
fun LogoSenai(
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(R.drawable.senai_logo_1),
        contentDescription = "logo_senai",
        modifier = Modifier
            .width(200.dp),
        contentScale = ContentScale.Fit
    )
}