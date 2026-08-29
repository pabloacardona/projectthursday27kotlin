package com.example.projectthursday27kotlin.Navegation

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.compose.ui.Modifier
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun MoviesButtonBar (
    navController: NavHostController,
) {
    val navBackStackEntry =
        navController.currentBackStackEntryAsState()

    val currentRoute = navBackStackEntry.value?.destination?.route // navBackStackEntry puede tener un valor null

    val screens = listOf(
        Screen.Trendings,
        Screen.Movies,
        Screen.Favorites,
        Screen.Profile
    )

    NavigationBar {
        screens.forEach { screen ->
            NavigationBarItem(
                selected = currentRoute == screen.route,
                onClick = {
                    navController.navigate(screen.route)
                },
                icon = {
                    Icon(
                        imageVector = screen.icon,
                        contentDescription = "",
                    )
                },
                label = {
                    Text(screen.label)
                }
            )
        }

    }

}
