package com.example.impulsebttesttask.common.navigation.route

import androidx.navigation.NavController

fun NavController.navigate(screen: Screen) {
    navigate(screen.routeId)
}
