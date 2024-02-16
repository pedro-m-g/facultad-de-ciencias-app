package com.pedromg.facultaddeciencias.services

import com.pedromg.facultaddeciencias.dto.NewsArticleListResponse
import retrofit2.http.GET

interface NewsClient {

    @GET("news")
    suspend fun getNews(): NewsArticleListResponse

}