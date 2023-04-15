package com.example.impulsebttesttask.quiz.domain.usecase

import com.example.impulsebttesttask.quiz.utils.matrix.QuizMatrixSize
import com.example.impulsebttesttask.quiz.utils.matrix.x
import javax.inject.Inject

class CalculateMatrixSizeUseCase @Inject constructor() {

    operator fun invoke(level: Int): QuizMatrixSize {
        return when (level) {
            GetNextLevelUseCase.START_LEVEL -> DEFAULT_SIZE
            else -> calculateQuizMatrixSizeAccordingToLevel(level)
        }
    }

    private fun calculateQuizMatrixSizeAccordingToLevel(level: Int): QuizMatrixSize {
        return DEFAULT_SIZE
        //TODO do calculating
    }

    private companion object {
        val DEFAULT_SIZE = 4 x 4
    }

}
