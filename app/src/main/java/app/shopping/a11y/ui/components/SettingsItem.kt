package app.shopping.a11y.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Switch
import androidx.compose.material.SwitchColors
import androidx.compose.material.SwitchDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.shopping.a11y.ui.theme.A11yShoppingAppTheme

@Composable
fun SettingsItemChecked(
    title: String,
    checked: Boolean,
    modifier: Modifier = Modifier,
    subtitle: String? = null,
    textColor: Color = MaterialTheme.colors.onBackground,
    switchColors: SwitchColors = SwitchDefaults.colors(
        checkedThumbColor = MaterialTheme.colors.primary
    ),
    titleStyle: TextStyle = MaterialTheme.typography.body1,
    subtitleStyle: TextStyle = MaterialTheme.typography.body2
) {
    SettingsItem(
        title = title,
        modifier = modifier,
        subtitle = subtitle,
        color = textColor,
        titleStyle = titleStyle,
        subtitleStyle = subtitleStyle,
        end = {
            Switch(
                checked = checked,
                onCheckedChange = null,
                colors = switchColors,
                modifier = Modifier.padding(end = 24.dp),
            )
        }
    )
}

@Composable
fun SettingsItem(
    title: String,
    modifier: Modifier = Modifier,
    subtitle: String? = null,
    color: Color = MaterialTheme.colors.onBackground,
    titleStyle: TextStyle = MaterialTheme.typography.body1,
    subtitleStyle: TextStyle = MaterialTheme.typography.body2,
    end: (@Composable () -> Unit)? = null
) {
    Row(
        modifier = modifier.height(56.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier
                .padding(start = 72.dp)
                .weight(1f)
        ) {
            Text(text = title, style = titleStyle, color = color)
            subtitle?.let {
                Text(text = it, style = subtitleStyle, color = color.copy(alpha = .7f))
            }
        }
        end?.let {
            it()
        }
    }
}

@Preview
@Composable
fun SettingsItemPreview() {
    val checked = remember { mutableStateOf(false) }
    A11yShoppingAppTheme {
        Column {
            SettingsItemChecked(
                title = "Dark theme",
                subtitle = "Switch between light and dark theme",
                checked = checked.value,
                modifier = Modifier.clickable { checked.value = !checked.value }
            )
            SettingsItem(title = "Version 1.0.0")
        }
    }
}
