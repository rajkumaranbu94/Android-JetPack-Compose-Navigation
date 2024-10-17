package com.fudu.composenavigationpoc.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.fudu.composenavigationpoc.ui.screen.HomeScreen

@Composable
fun RootNav() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = ScreenRoutes.AuthNav.routes
    ) {
        AuthNav(navController)

        composable(ScreenRoutes.HomeNav.routes) {
            val navHostController = rememberNavController()
            HomeNav(navController = navHostController,
                logout = {
                    navController.navigate(ScreenRoutes.AuthNav.routes) {
                        popUpTo(0){}
                    }
            })
            /*HomeScreen(
                logout = {
                    navController.navigate(ScreenRoutes.AuthNav.routes) {
                        popUpTo(0) {}
                    }
                }
            )*/
        }
    }
}