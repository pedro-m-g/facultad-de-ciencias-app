package com.pedromg.facultaddeciencias

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavBackStackEntry
import com.pedromg.facultaddeciencias.ui.views.NewsView

sealed class Screen(
    val route: String,
    val title: String,
    val icon: ImageVector,
    val content: @Composable (navBackStackEntry: NavBackStackEntry) -> Unit
) {
    object NewsScreen : Screen(
        route = "news_screen",
        title = "Noticias",
        icon = Icons.Default.Home,
        content = {
            NewsView()
        }
    )
}
