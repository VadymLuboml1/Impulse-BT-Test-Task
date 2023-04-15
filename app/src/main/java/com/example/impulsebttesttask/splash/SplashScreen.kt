package com.example.impulsebttesttask.splash

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.Image
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import com.example.impulsebttesttask.common.navigation.route.navigate
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.impulsebttesttask.R
import com.example.impulsebttesttask.common.compose.background.MainBackgroundContainer
import com.example.impulsebttesttask.common.navigation.LocalNavigationProvider
import com.example.impulsebttesttask.common.navigation.route.Screen
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flowOf

@Composable
fun SplashScreen() {
    MainBackgroundContainer {

        val navController = LocalNavigationProvider.current

        val startAnimation by flowOf(false).collectAsState(initial = true)

        LaunchedEffect(key1 = startAnimation) {
            /**
             * Waiting for end of animation
             * Fixed in compose 1.5.1
             * */
            if (!startAnimation) {
                delay(fadeOutAnimationDelay + fadeOutAnimationDuration.toLong())

                navController.navigate(Screen.Start)
            }
        }

        AnimatedVisibility(
            visible = startAnimation,
            exit = fadeOut(
                animationSpec = tween(
                    durationMillis = fadeOutAnimationDuration,
                    delayMillis = fadeOutAnimationDelay,
                    easing = LinearOutSlowInEasing
                ),
            ),
            modifier = Modifier.align(Alignment.Center),
        ) {

            Image(
                painter = painterResource(R.drawable.ic_splash),
                contentDescription = null,
            )
        }
    }
}

private const val fadeOutAnimationDuration = 1000
private const val fadeOutAnimationDelay = 2000
