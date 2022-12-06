package app.shopping.a11yok.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = red300,
    onPrimary = black,
    secondary = yellow400,
    onSecondary = white,
    background = grey900,
    onBackground = white,
    surface = grey800,
    onSurface = white
)

private val LightColorPalette = lightColors(
    primary = red400,
    onPrimary = white,
    secondary = yellow400,
    onSecondary = black,
    background = grey50,
    onBackground = black,
    surface = white,
    onSurface = black
)

@Composable
fun A11yShoppingAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}