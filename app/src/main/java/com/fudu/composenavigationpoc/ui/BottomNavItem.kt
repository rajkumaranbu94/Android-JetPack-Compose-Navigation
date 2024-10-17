package com.fudu.composenavigationpoc.ui

import com.fudu.composenavigationpoc.R
import com.fudu.composenavigationpoc.ui.navigation.ScreenRoutes

sealed class BottomNavItem(
    val title: String,
    val route: String,
    val icon : Int
) {
    data object HomeItem: BottomNavItem(
        title = "Screen A",
        route = ScreenRoutes.ScreenA.routes,
        icon = R.drawable.ic_launcher_foreground
    )
    data object ProfileItem: BottomNavItem(
        title = "Profile",
        route = ScreenRoutes.LogoutScreen.routes,
        icon = R.drawable.ic_launcher_foreground
    )
}