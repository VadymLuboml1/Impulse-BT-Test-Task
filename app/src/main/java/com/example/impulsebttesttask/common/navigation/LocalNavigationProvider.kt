package com.example.impulsebttesttask.common.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.navigation.NavHostController

val LocalNavigationProvider = staticCompositionLocalOf<NavHostController> {
    error("CompositionLocal LocalNavigationProvider not present")
}


@Composable
fun ContinueInLocalNavigationProviderScope(
    navHostController: NavHostController,
    next: @Composable (NavHostController) -> Unit
) {
    CompositionLocalProvider(LocalNavigationProvider provides navHostController) {
        next(navHostController)
    }
}
