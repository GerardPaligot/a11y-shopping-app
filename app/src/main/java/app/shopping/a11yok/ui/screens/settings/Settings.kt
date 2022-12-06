package app.shopping.a11yok.ui.screens.settings

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import app.shopping.a11yok.BuildConfig
import app.shopping.a11yok.ui.components.SettingsItem
import app.shopping.a11yok.ui.components.SettingsItemChecked
import app.shopping.a11yok.ui.components.SettingsTitle
import app.shopping.a11yok.ui.theme.A11yShoppingAppTheme

@ExperimentalFoundationApi
@Composable
fun Settings(
    isInDarkTheme: Boolean,
    modifier: Modifier = Modifier,
    onBackClicked: () -> Unit,
    onDarkThemeClicked: () -> Unit
) {
    Scaffold(
        modifier = modifier,
        backgroundColor = MaterialTheme.colors.background,
        contentColor = MaterialTheme.colors.onBackground,
        topBar = {
            TopAppBar(
                title = { Text(text = "Settings") },
                backgroundColor = MaterialTheme.colors.surface,
                contentColor = MaterialTheme.colors.onSurface,
                navigationIcon = {
                    IconButton(onClick = onBackClicked) {
                        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null)
                    }
                }
            )
        }
    ) {
        LazyColumn(contentPadding = it) {
            stickyHeader {
                SettingsTitle(title = "Appearance")
            }
            item {
                SettingsItemChecked(
                    title = "Dark theme",
                    subtitle = "Switch between light and dark theme",
                    checked = isInDarkTheme,
                    modifier = Modifier.clickable { onDarkThemeClicked() }
                )
            }
            stickyHeader {
                SettingsTitle(title = "About")
            }
            item {
                SettingsItem(title = "Version ${BuildConfig.VERSION_NAME}")
            }
        }
    }
}

@ExperimentalFoundationApi
@Preview
@Composable
fun SettingsPreview() {
    val checked = remember { mutableStateOf(false) }
    A11yShoppingAppTheme {
        Settings(
            isInDarkTheme = checked.value,
            onBackClicked = { /*TODO*/ },
            onDarkThemeClicked = { checked.value = !checked.value }
        )
    }
}

