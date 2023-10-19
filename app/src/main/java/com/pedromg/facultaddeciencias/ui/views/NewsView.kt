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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pedromg.facultaddeciencias.R
import com.pedromg.facultaddeciencias.models.NewsArticle

@Composable
fun NewsView() {
    val newsArticles = listOf(
        NewsArticle(
            title = "Nuevo descubrimiento de exoplaneta",
            content = "Contenido super interesante de 'Nuevo descubrimiento de exoplaneta'",
            excerpt = "Resumen del artículo super interesante"
        ),
        NewsArticle(
            title = "Nuevo descubrimiento de exoplaneta",
            content = "Contenido super interesante de 'Nuevo descubrimiento de exoplaneta'",
            excerpt = "Resumen del artículo super interesante"
        ),
        NewsArticle(
            title = "Nuevo descubrimiento de exoplaneta",
            content = "Contenido super interesante de 'Nuevo descubrimiento de exoplaneta'",
            excerpt = "Resumen del artículo super interesante"
        ),
        NewsArticle(
            title = "Nuevo descubrimiento de exoplaneta",
            content = "Contenido super interesante de 'Nuevo descubrimiento de exoplaneta'",
            excerpt = "Resumen del artículo super interesante"
        ),
        NewsArticle(
            title = "Nuevo descubrimiento de exoplaneta",
            content = "Contenido super interesante de 'Nuevo descubrimiento de exoplaneta'",
            excerpt = "Resumen del artículo super interesante"
        )
    )

    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
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
                fontSize = 28.sp
            )
            LazyColumn {
                newsArticles.forEach { newsArticle ->
                    item {
                        NewsCard(
                            newsArticle = newsArticle,
                            modifier = Modifier
                                .padding(bottom = 8.dp)
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
    newsArticle: NewsArticle
) {
    Row(
        modifier = modifier
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
                onClick = {

                }
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
            title = "Nuevo descubrimiento de exoplaneta",
            content = "Contenido super interesante de 'Nuevo descubrimiento de exoplaneta'",
            excerpt = "Resumen del artículo super interesante"
        )
    )
}
