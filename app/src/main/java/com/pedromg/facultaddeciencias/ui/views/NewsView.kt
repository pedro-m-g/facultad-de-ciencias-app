package com.pedromg.facultaddeciencias.ui.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.pedromg.facultaddeciencias.R
import com.pedromg.facultaddeciencias.Screen
import com.pedromg.facultaddeciencias.models.NewsArticle

@Composable
fun NewsView(navController: NavHostController) {
    val newsArticles = listOf(
        NewsArticle(
            id = "1",
            title = "Artículo #1",
            content = "Contenido del artículo #1",
            excerpt = "Resumen del artículo #1"
        ),
        NewsArticle(
            id = "2",
            title = "Artículo #2",
            content = "Contenido del artículo #2",
            excerpt = "Resumen del artículo #2"
        ),
        NewsArticle(
            id = "3",
            title = "Artículo #3",
            content = "Contenido del artículo #3",
            excerpt = "Resumen del artículo #3"
        ),
        NewsArticle(
            id = "4",
            title = "Artículo #4",
            content = "Contenido del artículo #4",
            excerpt = "Resumen del artículo #4"
        ),
        NewsArticle(
            id = "5",
            title = "Artículo #5",
            content = "Contenido del artículo #5",
            excerpt = "Resumen del artículo #5"
        )
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column {
            Column(
                modifier = Modifier
                    .padding(bottom = 16.dp)
                    .background(Color(0xFF2E7D32))
            ) {
                Image(
                    painter = painterResource(R.drawable.news_bg),
                    contentDescription = null,
                    contentScale = ContentScale.FillWidth,
                    modifier = Modifier
                        .height(200.dp)
                )
                Column(
                    modifier = Modifier
                        .padding(8.dp)
                ) {
                    Text(
                        text = "Noticias",
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }
            }
            LazyColumn {
                newsArticles.forEach { newsArticle ->
                    item {
                        NewsCard(
                            newsArticle = newsArticle,
                            modifier = Modifier
                                .padding(bottom = 8.dp),
                            onClick = {
                                navController.navigate(
                                    Screen.NewsArticleScreen
                                        .withParams(newsArticle.id)
                                )
                            }
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun NewsCard(
    modifier: Modifier = Modifier,
    newsArticle: NewsArticle,
    onClick: () -> Unit
) {
    Row(
        modifier = modifier
            .background(Color.White)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .weight(1f)
                .padding(4.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.uabc_logo),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(100.dp)
            )
        }
        Column(
            modifier = Modifier
                .weight(3f)
                .padding(4.dp)
        ) {
            Text(
                text = newsArticle.title,
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(bottom = 8.dp)
            )
            Text(
                text = newsArticle.excerpt
            )
            Button(
                onClick = onClick
            ) {
                Text(text = "Leer más")
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun NewsCardPreview() {
    NewsCard(
        newsArticle = NewsArticle(
            id = "1",
            title = "Nuevo descubrimiento de exoplaneta",
            content = "Contenido super interesante de 'Nuevo descubrimiento de exoplaneta'",
            excerpt = "Resumen del artículo super interesante"
        ),
        onClick = { }
    )
}
