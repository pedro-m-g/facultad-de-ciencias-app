package com.pedromg.facultaddeciencias.ui.views

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.pedromg.facultaddeciencias.models.NewsArticle
import com.pedromg.facultaddeciencias.services.RestTemplate
import kotlinx.coroutines.launch
import java.lang.Exception
import java.lang.IllegalArgumentException

class NewsViewModel: ViewModel() {

    private val mewsClient = RestTemplate.newsClient
    val news: MutableState<List<NewsArticle>> = mutableStateOf(emptyList())

    fun fetchNews() {
        viewModelScope.launch {
            try {
                val response = mewsClient.getNews().data
                if (response.isNotEmpty()) {
                    news.value = response
                }
            } catch (e: Exception) {
                Log.e("NewsViewModel", e.toString())
            }
        }
    }

    class NewsViewModelFactory : ViewModelProvider.Factory {

        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(NewsViewModel::class.java)) {
                return NewsViewModel() as T
            }
            throw IllegalArgumentException("Unknown ViewModel class")
        }

    }
}