package com.example.impulsebttesttask.common.navigation

import androidx.navigation.NavController

fun NavController.navigate(screen: Screen) {
    navigate(screen.routeId)
}
