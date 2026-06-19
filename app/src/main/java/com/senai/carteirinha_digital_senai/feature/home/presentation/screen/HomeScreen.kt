package com.senai.carteirinha_digital_senai.feature.home.presentation.screen

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.senai.carteirinha_digital_senai.core.designsystem.component.AppDrawerItem
import com.senai.carteirinha_digital_senai.core.designsystem.component.AppScaffold
import com.senai.carteirinha_digital_senai.feature.home.presentation.HomeEvent
import com.senai.carteirinha_digital_senai.feature.home.presentation.HomeViewModel

@Composable
fun HomeScreen(
    onCarteirinhaClick: () -> Unit,
    onUnidadesCurricularesClick: () -> Unit,
    onLogoutClick: () -> Unit,
    viewModel: HomeViewModel = viewModel()
) {
    val uiState by viewModel.uiState.collectAsState()

    val drawerItems = listOf(
        AppDrawerItem(
            label = "Início",
            icon = Icons.Default.Home,
            selected = true,
            onClick = {}
        ),
        AppDrawerItem(
            label = "Carteirinha",
            icon = Icons.Default.Person,
            selected = false,
            onClick = onCarteirinhaClick
        ),
        AppDrawerItem(
            label = "Unidades Curriculares",
            icon = Icons.Default.List,
            selected = false,
            onClick = onUnidadesCurricularesClick
        )
    )

    AppScaffold(
        title = "SENAI",
        subtitle = "Carteirinha Digital",
        usuarioNome = uiState.nomeAluno,
        usuarioDescricao = uiState.subtitulo,
        drawerItems = drawerItems,
        onLogoutClick = onLogoutClick
    ) { paddingValues ->
        HomeContent(
            uiState = uiState,
            onEvent = { event ->
                when (event) {
                    HomeEvent.OnCarteirinhaClick -> onCarteirinhaClick()
                    HomeEvent.OnUnidadesCurricularesClick -> onUnidadesCurricularesClick()
                    HomeEvent.OnLogoutClick -> onLogoutClick()
                }
                viewModel.onEvent(event)
            },
            paddingValues = paddingValues
        )
    }
}