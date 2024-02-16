package com.pedromg.facultaddeciencias.dto

import com.pedromg.facultaddeciencias.models.NewsArticle

data class NewsArticleListResponse(
    val limit: Int,
    val offset: Int,
    val data: List<NewsArticle>
)