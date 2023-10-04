package com.pedromg.facultaddeciencias

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pedromg.facultaddeciencias.ui.views.NewsView

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.NewsScreen.route) {
        composable(route = Screen.NewsScreen.route) {
            NewsView()
        }
    }
}