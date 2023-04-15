package com.example.impulsebttesttask.quiz.utils.matrix

import kotlin.collections.map as baseMap

typealias QuizMatrix <T> = List<List<T>>

fun <T> quizMatrixOf(
    matrixSize: QuizMatrixSize,
    fill: (rowIndex: Int, columnIndex: Int) -> T
): QuizMatrix<T> {

    /**
     * Child lambda to fill row
     * */
    val buildRowElements: (Int) -> List<T> = { i: Int ->
        buildList {
            for (j in 0..matrixSize.columnsSize) {
                add(
                    fill(i, j)
                )
            }
        }
    }

    return buildList {
        for (i in 0..matrixSize.rowsSize) {
            buildRowElements(i)
        }
    }

}

fun <T, R> QuizMatrix<T>.map(
    transform: (T) -> R,
): QuizMatrix<R> =
    baseMap { row ->
        row.baseMap {
            transform(it)
        }
    }

