package com.pedromg.facultaddeciencias.models

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
