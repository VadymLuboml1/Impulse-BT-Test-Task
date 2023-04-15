package com.example.impulsebttesttask.quiz.domain.repository

import com.example.impulsebttesttask.quiz.domain.model.QuizCellDomainModel
import com.example.impulsebttesttask.quiz.utils.QuizMatrix

interface QuizCellsRepository {
    suspend fun cells(level: Int): QuizMatrix<QuizCellDomainModel>
}