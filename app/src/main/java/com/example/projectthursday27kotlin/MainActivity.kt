package com.example.projectthursday27kotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.projectthursday27kotlin.Navegation.MoviesButtonBar
import com.example.projectthursday27kotlin.Navegation.MoviesNavHost
import com.example.projectthursday27kotlin.ui.theme.ProjectThursday27KotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProjectThursday27KotlinTheme {
                MoviesApp()
            }
        }
    }
}

@Composable
fun MoviesApp() {
    val navController = rememberNavController()
    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        bottomBar = {
            MoviesButtonBar(
                navController = navController,
            )
        }
    ) { innerPadding ->
        MoviesNavHost(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            navController = navController,
        )
    }
}