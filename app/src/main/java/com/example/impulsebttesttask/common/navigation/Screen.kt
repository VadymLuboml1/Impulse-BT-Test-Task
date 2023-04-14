package com.example.impulsebttesttask.common.navigation

sealed class Screen(val routeId: String) {
    object Splash : Screen(ScreenRouteIs.SPLASH)
    object Start : Screen(ScreenRouteIs.START)

    data class Quiz(val level: Int) : Screen(routeId) {
        companion object : ScreenRouteIdOwner {
            override val routeId: String = ScreenRouteIs.Quiz

            const val LEVEL_ARG: String = "level"
        }
    }
}

private object ScreenRouteIs {
    const val SPLASH = "splash_screen_id"
    const val START = "start_screen_id"
    const val Quiz = "quiz_screen_id"
}
