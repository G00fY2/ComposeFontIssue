package com.example.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun ComposeFontTestTheme(content: @Composable () -> Unit) {

    MaterialTheme(
        typography = Typography,
        content = content
    )
}