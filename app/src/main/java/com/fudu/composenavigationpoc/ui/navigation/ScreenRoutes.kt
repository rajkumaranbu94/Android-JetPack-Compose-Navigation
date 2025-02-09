package com.fudu.composenavigationpoc.ui.navigation

sealed class ScreenRoutes(val routes: String) {
    //Screen routes
    data object StartScreen : ScreenRoutes("start_screen")
    data object LoginScreen : ScreenRoutes("login_screen")
    data object HomeScreen : ScreenRoutes("home_screen")
    data object ScreenA : ScreenRoutes("screen_a")
    data object ScreenB : ScreenRoutes("screen_b")
    data object LogoutScreen : ScreenRoutes("logout_screen")

    //Graph Routes
    data object AuthNav : ScreenRoutes("AUTH_NAV_GRAPH")
    data object HomeNav : ScreenRoutes("HOME_NAV_GRAPH")
}