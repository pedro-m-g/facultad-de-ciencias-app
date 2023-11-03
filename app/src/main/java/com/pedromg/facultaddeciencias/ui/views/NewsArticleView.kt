package com.pedromg.facultaddeciencias.ui.views

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry

@Composable
fun NewsArticleView(mavBackStackEntry: NavBackStackEntry) {
    val articleId = mavBackStackEntry.arguments?.getString("articleId")
    Text(text = "Artículo de noticias #$articleId")
}
