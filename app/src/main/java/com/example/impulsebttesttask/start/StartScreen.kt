package com.example.impulsebttesttask.start

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.impulsebttesttask.R
import com.example.impulsebttesttask.common.compose.background.MainBackgroundContainer
import com.example.impulsebttesttask.common.compose.elements.gab.GabType
import com.example.impulsebttesttask.common.compose.elements.gab.GameActionButton
import com.example.impulsebttesttask.common.navigation.LocalNavigationProvider
import com.example.impulsebttesttask.common.navigation.route.Screen

@Composable
fun StartScreen() {
    MainBackgroundContainer {

        val navController = LocalNavigationProvider.current

        GameActionButton(
            text = R.string.start_screen_button,
            modifier = Modifier.align(Alignment.Center),
            type = GabType.SHORT,
        ) { navController.navigate(Screen.Quiz.decorateRouteWithParam()) }
    }
}
