package com.example.impulsebttesttask.host

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.impulsebttesttask.common.compose.ContinueInLocalNavigationProviderScope
import com.example.impulsebttesttask.common.navigation.InitNavGraph
import com.example.impulsebttesttask.common.theme.ImpulseBTTestTaskTheme

class HostActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImpulseBTTestTaskTheme {
                ContinueInLocalNavigationProviderScope(navHostController = rememberNavController()) {
                    InitNavGraph(it)
                }
            }
        }
    }
}