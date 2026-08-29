package com.example.projectthursday27kotlin.Navegation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArtTrack
import androidx.compose.material.icons.filled.Bookmarks
import androidx.compose.material.icons.filled.LocalFireDepartment
import androidx.compose.material.icons.filled.Movie
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen (
    val route: String,
    val label: String,
    val icon: ImageVector,
) {
    data object Movies : Screen (
        route = "movies",
        label =" Movies",
        icon = Icons.Default.Movie
    )

    data object Trendings : Screen (
        route = "trendings",
        label = "Trendings",
        icon = Icons.Default.LocalFireDepartment
    )

    data object Favorites : Screen (
        route = "favorites",
        label = "Favorites",
        icon = Icons.Default.Bookmarks
    )

    data object Profile : Screen (
        route = "profile",
        label = "Profile",
        icon = Icons.Default.Person
    )
}