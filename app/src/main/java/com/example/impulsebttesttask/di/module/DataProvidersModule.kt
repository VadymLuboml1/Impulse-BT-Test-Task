package com.example.impulsebttesttask.di.module

import com.example.impulsebttesttask.quiz.data.QuizCellsRepositoryImpl
import com.example.impulsebttesttask.quiz.domain.repository.QuizCellsRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataProvidersModule {

    @Binds
    abstract fun quizCellRepository(impl: QuizCellsRepositoryImpl): QuizCellsRepository
}
