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
    return response.data.map { NewsArticle(
        it.id,
        it.title,
        it.excerpt,
        it.body,
        Instant.ofEpochMilli(it.createdAt),
        Instant.ofEpochMilli(it.updatedAt),
        if (it.deletedAt == 0L) null else Instant.ofEpochMilli(it.deletedAt)
    ) }
}
