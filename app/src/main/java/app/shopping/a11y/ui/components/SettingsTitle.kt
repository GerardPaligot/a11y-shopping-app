package app.shopping.a11y.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.shopping.a11y.ui.theme.A11yShoppingAppTheme

@Composable
fun SettingsTitle(
    title: String,
    modifier: Modifier = Modifier,
    color: Color = MaterialTheme.colors.onBackground.copy(alpha = .7f),
    style: TextStyle = MaterialTheme.typography.overline,
) {

    Box(
        modifier = modifier.height(40.dp),
        contentAlignment = Alignment.BottomStart
    ) {
        Text(
            text = title.toUpperCase(Locale.current),
            color = color,
            style = style,
            modifier = Modifier
                .padding(start = 72.dp, bottom = 8.dp)
        )
    }
}

@Preview
@Composable
fun SettingsTitlePreview() {
    A11yShoppingAppTheme {
        SettingsTitle(title = "Interaction controls")
    }
}
