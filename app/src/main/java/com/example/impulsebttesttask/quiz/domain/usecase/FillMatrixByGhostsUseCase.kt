package com.example.impulsebttesttask.quiz.domain.usecase

import com.example.impulsebttesttask.quiz.domain.model.QuizCellDomainModel
import com.example.impulsebttesttask.quiz.utils.matrix.QuizMatrix
import com.example.impulsebttesttask.quiz.utils.matrix.QuizMatrixSize
import com.example.impulsebttesttask.quiz.utils.matrix.quizMatrixOf
import javax.inject.Inject
import kotlin.random.Random

class FillMatrixByGhostsUseCase @Inject constructor() {

    operator fun invoke(
        ghostsAmount: Int,
        matrixSize: QuizMatrixSize
    ): QuizMatrix<QuizCellDomainModel> {

        val ghostCoordinates = generateRandomGhostsCoordinates(ghostsAmount, matrixSize)

        return quizMatrixOf(
            matrixSize = matrixSize
        ) { rowIndex, columnIndex ->

            val isGhostNested = ghostCoordinates.contains(rowIndex to columnIndex)

            QuizCellDomainModel(isGhostNested)
        }
    }

    private fun generateRandomGhostsCoordinates(
        ghostsAmount: Int,
        matrixSize: QuizMatrixSize
    ): List<Pair<Int, Int>> =
        buildList<Pair<Int, Int>> {
            while (this.size < ghostsAmount) {
                val newRowIndex = Random.nextInt(matrixSize.rowsSize)
                val newColumnIndex = Random.nextInt(matrixSize.columnsSize)

                val newCoordinates = newRowIndex to newColumnIndex

                if (!contains(newCoordinates)) {
                    add(newCoordinates)
                }
            }
        }
}
