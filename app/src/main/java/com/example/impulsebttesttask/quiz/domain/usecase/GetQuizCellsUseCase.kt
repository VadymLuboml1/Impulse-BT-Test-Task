package com.example.impulsebttesttask.quiz.domain.usecase

import com.example.impulsebttesttask.quiz.domain.model.QuizCellDomainModel
import com.example.impulsebttesttask.quiz.utils.matrix.QuizMatrix
import javax.inject.Inject

class GetQuizCellsUseCase @Inject constructor(
    private val fillMatrixByGhosts: FillMatrixByGhostsUseCase,
    private val calculateMatrixSize: CalculateMatrixSizeUseCase,
    private val calculateGhostsAmount: CalculateGhostsAmountUseCase,
) {

    suspend operator fun invoke(level: Int): QuizMatrix<QuizCellDomainModel> {
        val ghostAmount = calculateGhostsAmount(level)
        val matrixSize = calculateMatrixSize(level)

        return fillMatrixByGhosts(ghostAmount, matrixSize)
    }
}
