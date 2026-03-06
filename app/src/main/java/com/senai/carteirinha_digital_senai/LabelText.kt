package com.senai.carteirinha_digital_senai

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.CarteirinhaDigitalSenaiTheme


@Composable
fun LabelText(
    label: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = label,
        textAlign = TextAlign.Right,
        style = MaterialTheme.typography.bodyLarge,
        fontFamily = MaterialTheme.typography.bodyLarge.fontFamily,
        modifier = modifier,
        color = MaterialTheme.colorScheme.onSurface
    )
}

@Preview
@Composable
fun LabelTextClaroPreview() {
    CarteirinhaDigitalSenaiTheme(
        darkTheme = false
    ) {
        LabelText(
            label = "Nome"
        )
    }
}