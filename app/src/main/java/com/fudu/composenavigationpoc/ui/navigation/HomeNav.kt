package com.fudu.composenavigationpoc.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.fudu.composenavigationpoc.ui.screen.Logout
import com.fudu.composenavigationpoc.ui.screen.ScreenA

@Composable
fun HomeNav(
    navController: NavHostController,
    logout: () -> Unit
) {
    NavHost(
        navController = navController,
        route = ScreenRoutes.HomeNav.routes,
        startDestination = ScreenRoutes.ScreenA.routes
    ) {
        composable(route = ScreenRoutes.ScreenA.routes) {
            ScreenA(navController = navController)
        }
        composable(route = ScreenRoutes.LogoutScreen.routes) {
            Logout(navController = navController, logout)
        }
    }
}