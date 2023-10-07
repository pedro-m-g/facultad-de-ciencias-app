package com.pedromg.facultaddeciencias

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavBackStackEntry
import com.pedromg.facultaddeciencias.ui.views.CalendarView
import com.pedromg.facultaddeciencias.ui.views.CounselingView
import com.pedromg.facultaddeciencias.ui.views.JobOffersView
import com.pedromg.facultaddeciencias.ui.views.NewsView
import com.pedromg.facultaddeciencias.ui.views.ProceduresView
import com.pedromg.facultaddeciencias.ui.views.ProfessionalPracticeView
import com.pedromg.facultaddeciencias.ui.views.SocialServiceView
import com.pedromg.facultaddeciencias.ui.views.StudentsProjectsView
import com.pedromg.facultaddeciencias.ui.views.TeachersProjectsView

sealed class Screen(
    val route: String,
    val title: String,
    val icon: ImageVector,
    val content: @Composable (navBackStackEntry: NavBackStackEntry) -> Unit
) {

    object NewsScreen : Screen(
        route = "news_screen",
        title = "Noticias",
        icon = Icons.Default.Notifications,
        content = {
            NewsView()
        }
    )

    object CalendarScreen : Screen(
        route = "calendar_screen",
        title = "Calendario de Actividades",
        icon = Icons.Default.DateRange,
        content = {
            CalendarView()
        }
    )

    object CounselingScreen : Screen(
        route = "counseling_screen",
        title = "Asesorías",
        icon = Icons.Default.Person,
        content = {
            CounselingView()
        }
    )

    object ProceduresScreen : Screen(
        route = "procedures_screen",
        title = "Trámites escolares",
        icon = Icons.Default.Info,
        content = {
            ProceduresView()
        }
    )

    object SocialServiceScreen : Screen(
        route = "social_service_screen",
        title = "Programas de Servicio Social",
        icon = Icons.Default.Favorite,
        content = {
            SocialServiceView()
        }
    )

    object ProfessionalPracticeScreen : Screen(
        route = "professional_practice_screen",
        title = "Modalidades de Aprendizaje y Prácticas Profesionales",
        icon = Icons.Default.AccountBox,
        content = {
            ProfessionalPracticeView()
        }
    )

    object JobOffersScreen : Screen(
        route = "job_offers_screen",
        title = "Ofertas Laborales",
        icon = Icons.Default.Star,
        content = {
            JobOffersView()
        }
    )

    object TeachersProjectsScreen : Screen(
        route = "teachers_projects_screen",
        title = "Proyectos de Investigación",
        icon = Icons.Default.Build,
        content = {
            TeachersProjectsView()
        }
    )

    object StudentsProjectsScreen : Screen(
        route = "students_projects_screen",
        title = "Proyectos Cimarrones",
        icon = Icons.Default.Face,
        content = {
            StudentsProjectsView()
        }
    )

}
