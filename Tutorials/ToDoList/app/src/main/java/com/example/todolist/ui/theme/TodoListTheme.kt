package com.example.todolist.ui.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.todolist.R
import androidx.compose.runtime.Composable

val PrimaryColor = Color(0xFF6200EE)
val SecondaryColor = Color(0xFF03DAC6)
val BackgroundColor = Color(0xFFFFFFFF)
val SurfaceColor = Color(0xFFFAFAFA)
val ErrorColor = Color(0xFFB00020)
val OnPrimaryColor = Color(0xFFFFFFFF)
val OnSecondaryColor = Color(0xFF000000)

val CustomFontFamily = FontFamily(
)

val AppTypography = Typography(
    displayLarge = androidx.compose.ui.text.TextStyle(
        fontFamily = CustomFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp
    ),
    bodyLarge = androidx.compose.ui.text.TextStyle(
        fontFamily = CustomFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    labelLarge = androidx.compose.ui.text.TextStyle(
        fontFamily = CustomFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    )
)

val AppShapes = Shapes(
    small = RoundedCornerShape(4.dp),
    medium = RoundedCornerShape(8.dp),
    large = RoundedCornerShape(16.dp)
)

@Composable
fun TodoListTheme(
    darkTheme: Boolean = false, // You can add logic to handle dark mode
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        MaterialTheme.colorScheme.copy(
            primary = PrimaryColor,
            secondary = SecondaryColor,
            background = BackgroundColor
        )
    } else {
        MaterialTheme.colorScheme.copy(
            primary = PrimaryColor,
            secondary = SecondaryColor,
            background = BackgroundColor
        )
    }

    MaterialTheme(
        colorScheme = colors,
        typography = AppTypography,
        shapes = AppShapes,
        content = content
    )
}