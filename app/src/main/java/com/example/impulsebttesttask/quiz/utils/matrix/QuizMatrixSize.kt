package com.example.impulsebttesttask.quiz.utils.matrix

data class QuizMatrixSize(
    val columnsSize: Int,
    val rowsSize: Int,
)

infix fun Int.x(rowsSize: Int) = QuizMatrixSize(this, rowsSize)
