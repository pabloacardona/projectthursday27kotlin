package com.example.projectthursday27kotlin.Navegation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArtTrack
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
    data object Profile : Screen (
        route = "profile",
        label = "Profile",
        icon = Icons.Default.Person
    )

    data object Recomendations : Screen (
        route = "recomendations",
        label = "Recomendations",
        icon = Icons.Default.ArtTrack
    )

}