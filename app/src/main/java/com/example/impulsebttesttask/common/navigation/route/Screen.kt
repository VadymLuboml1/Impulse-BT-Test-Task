package com.example.impulsebttesttask.common.navigation.route

import com.example.impulsebttesttask.quiz.domain.usecase.GetNextLevelUseCase

sealed class Screen(val routeId: String) {
    object Splash : Screen(ScreenRouteIs.SPLASH)
    object Start : Screen(ScreenRouteIs.START)

    object Quiz : Screen(ScreenRouteIs.QUIZ) {
        const val LEVEL_ARG: String = "level"
        const val LEVEL_DEFAULT_ARG_VALUE: Int = GetNextLevelUseCase.START_LEVEL

        fun decorateRouteWithParam(level: Int = LEVEL_DEFAULT_ARG_VALUE): String =
            decorateWithArgument(argName = LEVEL_ARG, argValue = level)
    }
}

private object ScreenRouteIs {
    const val SPLASH = "splash_screen_id"
    const val START = "start_screen_id"
    const val QUIZ = "quiz_screen_id"
}
