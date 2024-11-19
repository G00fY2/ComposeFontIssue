package com.example.featurex

import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.SemanticsProperties.Text
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import com.example.theme.ComposeFontTestTheme
import org.assertj.core.api.Assertions.assertThat
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(instrumentedPackages = ["androidx.loader.content"])
internal class FooTest {
    @get:Rule
    val rule = createComposeRule()

    @Test
    fun `Crashes with could not load font`() {
        with(rule) {
            setContent {
                ComposeFontTestTheme {
                    Text(
                        text = "Foo",
                        modifier = Modifier.testTag("my_test"),
                    )
                }
            }

            onNodeWithTag("my_test").fetchSemanticsNode().run {
                assertThat(config[Text].first().text).isEqualTo("Foo")
            }
        }
    }
}