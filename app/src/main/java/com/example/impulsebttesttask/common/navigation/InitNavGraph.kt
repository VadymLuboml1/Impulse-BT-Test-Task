package com.example.impulsebttesttask.common.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.*
import com.example.impulsebttesttask.quiz.QuizScreen
import com.example.impulsebttesttask.splash.SplashScreen
import com.google.accompanist.navigation.animation.composable
import com.example.impulsebttesttask.start.StartScreen
import com.google.accompanist.navigation.animation.AnimatedNavHost

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun InitNavGraph(navController: NavHostController) =
    AnimatedNavHost(
        navController = navController,
        startDestination = Screen.Splash.routeId
    ) {
        declareNavRoutes()
    }

@OptIn(ExperimentalAnimationApi::class)
private fun NavGraphBuilder.declareNavRoutes() {
    composable(
        route = Screen.Splash.routeId,
    ) {
        SplashScreen()
    }
    composable(
        route = Screen.Start.routeId,
    ) {
        StartScreen()
    }
    composable(
        route = Screen.Quiz.routeId.decorateWithArgument(
            Screen.Quiz.LEVEL_ARG,
            Screen.Quiz.LEVEL_DEFAULT_ARG_VALUE
        ),
        arguments = listOf(
            navArgument(name = Screen.Quiz.LEVEL_ARG) {
                type = NavType.IntType
                defaultValue = Screen.Quiz.LEVEL_DEFAULT_ARG_VALUE
            }
        )
    ) {

        val level = requireNotNull(it.arguments?.getInt(Screen.Quiz.LEVEL_ARG))

        QuizScreen(level = level)
    }
}
