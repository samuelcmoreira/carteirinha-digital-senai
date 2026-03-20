package com.senai.carteirinha_digital_senai.feature.carteirinha.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.senai.carteirinha_digital_senai.R

@Composable
fun BackgroundCarteirinha(
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(R.drawable.barata),
        contentDescription = "background",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .alpha(0.7f)
    )
}