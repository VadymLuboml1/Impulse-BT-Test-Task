package com.example.impulsebttesttask.host

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import com.example.impulsebttesttask.common.compose.ContinueInLocalNavigationProviderScope
import com.example.impulsebttesttask.common.navigation.InitNavGraph
import com.example.impulsebttesttask.common.theme.ImpulseBTTestTaskTheme
import com.google.accompanist.navigation.animation.rememberAnimatedNavController

@OptIn(ExperimentalAnimationApi::class)
class HostActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImpulseBTTestTaskTheme {
                ContinueInLocalNavigationProviderScope(navHostController = rememberAnimatedNavController()) {
                    InitNavGraph(it)
                }
            }
        }
    }
}