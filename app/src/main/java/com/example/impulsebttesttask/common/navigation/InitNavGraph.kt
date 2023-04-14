package com.example.impulsebttesttask.common.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.impulsebttesttask.quiz.QuizScreen
import com.example.impulsebttesttask.splash.SplashScreen
import com.example.impulsebttesttask.start.StartScreen

@Composable
fun InitNavGraph(navController: NavHostController) =
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.routeId
    ) {
        declareNavRoutes()
    }

private fun NavGraphBuilder.declareNavRoutes() {
    composable(route = Screen.Splash.routeId) {
        SplashScreen()
    }
    composable(route = Screen.Start.routeId) {
        StartScreen()
    }
    composable(
        route = Screen.Quiz.routeId.decorateWithArgument(Screen.Quiz.LEVEL_ARG),
        arguments = listOf(navArgument(name = Screen.Quiz.LEVEL_ARG) { type = NavType.IntType })
    ) {
        val level = requireNotNull(it.arguments?.getInt(Screen.Quiz.LEVEL_ARG))
        QuizScreen(level = level)
    }
}
