package com.google.composefonttest

import androidx.compose.material3.Text
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
class FooTest {
    @get:Rule val rule = createComposeRule()

    @Test
    @GraphicsMode(GraphicsMode.Mode.NATIVE)
    fun `Crashes with could not load font`() {
        rule.setContent {
            Text(
                text = "Foo",
                style = TextStyle(
                    fontFamily = FontFamily(
                        Font(R.font.geist_mono_regular),
                    ),
                )
            )
        }
    }
}