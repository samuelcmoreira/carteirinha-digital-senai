package com.senai.carteirinha_digital_senai.feature.unidadecurricular.data.repository

import com.senai.carteirinha_digital_senai.feature.unidadecurricular.domain.model.UnidadeCurricular
import kotlinx.coroutines.delay

class FakeUnidadeCurricularRepository : UnidadeCurricularRepository {
    override suspend fun buscarUnidadesCurriculares(): Result<List<UnidadeCurricular>> {
        delay(1800)

        return Result.success(
            listOf(
                UnidadeCurricular("1", "Programação Mobile", "Pedrinho Gameplays, Victor Mordachini", 8.5, 9.0, 8.75, 2),
                UnidadeCurricular("2", "Desenvolvimento Web", "Nicols", 7.0, 8.0, 7.5, 4),
                UnidadeCurricular("3", "Banco de Dados", "Seimuel Lines", 9.0, 8.5, 8.75, 0),
                UnidadeCurricular("4", "Teste de Software", "Victor", 8.0, 8.0, 8.0, 1),
                UnidadeCurricular("5", "Arquitetura de Software", "Mordachini", 9.5, 9.0, 9.25, 0),
                UnidadeCurricular("6", "Internet das Coisas", "Lucas Felfo. Victor Mordachini", 7.5, 8.5, 8.0, 3),
                UnidadeCurricular("7", "Projetos Integradores", "Themoteo", 10.0, 9.5, 9.75, 0),
                UnidadeCurricular("8", "Computação em Nuvem", "Victor Lines, Samuel Lines", 8.0, 7.5, 7.75, 2)
            )
        )
    }
}