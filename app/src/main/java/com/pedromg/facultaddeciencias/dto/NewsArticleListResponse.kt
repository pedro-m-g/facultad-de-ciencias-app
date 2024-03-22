package com.pedromg.facultaddeciencias.dto

import android.os.Build
import androidx.annotation.RequiresApi
import com.pedromg.facultaddeciencias.models.NewsArticle
import java.time.Instant

data class NewsArticleListResponse(
    val limit: Int,
    val offset: Int,
    val data: List<NewsArticleDto>
)

data class NewsArticleDto(
    val id: String,
    val title: String,
    val excerpt: String,
    val body: String,
    val createdAt: Long,
    val updatedAt: Long,
    val deletedAt: Long
)

@RequiresApi(Build.VERSION_CODES.O)
fun mapNewsArticleList(response: NewsArticleListResponse): List<NewsArticle> {
    return response.data.map { mapNewsArticle(it) }
}

@RequiresApi(Build.VERSION_CODES.O)
fun mapNewsArticle(response: NewsArticleDto): NewsArticle {
    return NewsArticle(
        response.id,
        response.title,
        response.excerpt,
        response.body,
        Instant.ofEpochMilli(response.createdAt),
        Instant.ofEpochMilli(response.updatedAt),
        if (response.deletedAt == 0L) null else Instant.ofEpochMilli(response.deletedAt)
    )
}
