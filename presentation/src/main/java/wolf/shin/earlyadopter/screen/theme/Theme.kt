package wolf.shin.earlyadopter.screen.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import wolf.shin.earlyadopter.screen.theme.font.PretendardTypography

private val DarkColorPalette = darkColors(
    primary = Yellow500,
    primaryVariant = Yellow300,
    secondary = Primary500
)

private val LightColorPalette = lightColors(
    primary = Primary500,
    primaryVariant = Primary300,
    secondary = Yellow500
)

@Composable
fun AndroidEarlyAdopterTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = PretendardTypography,
        shapes = Shapes,
        content = content
    )
}