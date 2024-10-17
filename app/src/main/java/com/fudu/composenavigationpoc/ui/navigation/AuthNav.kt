package com.fudu.composenavigationpoc.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.fudu.composenavigationpoc.ui.screen.LoginScreen
import com.fudu.composenavigationpoc.ui.screen.StartScreen

fun NavGraphBuilder.AuthNav(
    navController: NavHostController
) {
    navigation(
        startDestination = ScreenRoutes.StartScreen.routes,
        route = ScreenRoutes.AuthNav.routes
    ) {
        composable(route = ScreenRoutes.StartScreen.routes) {
            StartScreen(navController = navController)
        }
        composable(route = ScreenRoutes.LoginScreen.routes) {
            LoginScreen(navController = navController)
        }
    }
}