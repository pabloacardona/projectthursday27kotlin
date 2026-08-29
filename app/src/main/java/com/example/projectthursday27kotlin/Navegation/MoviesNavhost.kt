package com.example.projectthursday27kotlin.Navegation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.projectthursday27kotlin.Screen.FavoritesScreen
import com.example.projectthursday27kotlin.Screen.MovieScreen
import com.example.projectthursday27kotlin.Screen.ProfileScreen
import com.example.projectthursday27kotlin.Screen.TrendingsScreen

@Composable
fun MoviesNavHost (
    modifier: Modifier,
    navController: NavHostController,
) {
    NavHost(
        modifier = Modifier,
        navController = navController,
        startDestination = Screen.Movies.route
    ) {
        composable(Screen.Movies.route) {
            MovieScreen()
        }

        composable(Screen.Profile.route) {
            ProfileScreen()
        }

        composable(Screen.Trendings.route) {
            TrendingsScreen()
        }

        composable(Screen.Favorites.route) {
            FavoritesScreen()
        }
    }
}