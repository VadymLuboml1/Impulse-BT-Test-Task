package com.example.impulsebttesttask.quiz.data

import com.example.impulsebttesttask.quiz.domain.model.QuizCellDomainModel
import com.example.impulsebttesttask.quiz.domain.repository.QuizCellsRepository
import com.example.impulsebttesttask.quiz.utils.matrix.QuizMatrix
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class QuizCellsRepositoryImpl @Inject constructor() : QuizCellsRepository {

    override suspend fun cells(level: Int): QuizMatrix<QuizCellDomainModel> {
        TODO("Not yet implemented")
    }


}
