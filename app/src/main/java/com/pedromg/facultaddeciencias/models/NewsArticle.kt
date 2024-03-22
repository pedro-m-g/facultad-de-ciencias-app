package com.pedromg.facultaddeciencias.models

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.Instant

data class NewsArticle(
    val id: String,
    val title: String,
    val excerpt: String,
    val body: String,
    val createdAt: Instant,
    val updatedAt: Instant,
    val deletedAt: Instant?
)

@RequiresApi(Build.VERSION_CODES.O)
fun createEmptyArticle(): NewsArticle {
    return NewsArticle("", "", "", "", Instant.now(), Instant.now(), null)
}
