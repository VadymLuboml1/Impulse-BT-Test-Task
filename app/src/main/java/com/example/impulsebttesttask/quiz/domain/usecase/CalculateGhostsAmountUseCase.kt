package com.example.impulsebttesttask.quiz.domain.usecase

import javax.inject.Inject

class CalculateGhostsAmountUseCase @Inject constructor() {

    operator fun invoke(level: Int): Int = level + GHOSTS_TO_LEVEL_APPEND

    private companion object {
        const val GHOSTS_TO_LEVEL_APPEND = 3
    }
}
