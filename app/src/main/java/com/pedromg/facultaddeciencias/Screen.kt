package com.pedromg.facultaddeciencias

sealed class Screen(val route: String) {
    object NewsScreen : Screen(
        route = "news_screen"
    )
}
