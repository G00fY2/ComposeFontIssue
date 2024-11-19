package com.example.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight

// Set of Material typography styles to start with
val Typography = Typography(
    displayLarge = TextStyle(fontFamily = MyFontFamily.geist),
    displayMedium = TextStyle(fontFamily = MyFontFamily.geist),
    displaySmall = TextStyle(fontFamily = MyFontFamily.geist),
    headlineLarge = TextStyle(fontFamily = MyFontFamily.geist),
    headlineMedium = TextStyle(fontFamily = MyFontFamily.geist),
    headlineSmall = TextStyle(fontFamily = MyFontFamily.geist),
    titleLarge = TextStyle(fontFamily = MyFontFamily.geist),
    titleMedium = TextStyle(fontFamily = MyFontFamily.geist),
    titleSmall = TextStyle(fontFamily = MyFontFamily.geist),
    bodyLarge = TextStyle(fontFamily = MyFontFamily.geist),
    bodyMedium = TextStyle(fontFamily = MyFontFamily.geist),
    bodySmall = TextStyle(fontFamily = MyFontFamily.geist),
    labelLarge = TextStyle(fontFamily = MyFontFamily.geist),
    labelMedium = TextStyle(fontFamily = MyFontFamily.geist),
    labelSmall = TextStyle(fontFamily = MyFontFamily.geist),
)

@Immutable
object MyFontFamily {
    val geist = FontFamily(
        Font(R.font.geist_mono_regular, FontWeight.Medium),
        Font(R.font.geist_mono_regular, FontWeight.Bold),
        Font(R.font.geist_mono_regular, FontWeight.ExtraBold),
    )
}