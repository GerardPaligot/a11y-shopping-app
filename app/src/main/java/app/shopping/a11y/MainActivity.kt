package app.shopping.a11y

import android.content.Context
import android.os.Bundle
import android.view.accessibility.AccessibilityManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import app.shopping.a11y.ui.screens.list.ProductListVM
import app.shopping.a11y.ui.screens.settings.Settings
import app.shopping.a11y.ui.theme.A11yShoppingAppTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@ExperimentalFoundationApi
@ExperimentalAnimationApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val accessibilityManager = this.getSystemService(Context.ACCESSIBILITY_SERVICE) as AccessibilityManager
        setContent {
            val isInDarkTheme = remember { mutableStateOf(false) }
            A11yShoppingAppTheme(darkTheme = isInDarkTheme.value) {
                val systemUiController = rememberSystemUiController()
                val useDarkIcons = MaterialTheme.colors.isLight
                val navBarColor = MaterialTheme.colors.surface
                SideEffect {
                    systemUiController.setSystemBarsColor(
                        color = navBarColor,
                        darkIcons = useDarkIcons
                    )
                    systemUiController.setNavigationBarColor(
                        color = navBarColor,
                        darkIcons = useDarkIcons
                    )
                }
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "products") {
                    composable(route = "products") {
                        ProductListVM(
                            isAccessibilityEnabled = accessibilityManager.isEnabled && accessibilityManager.isTouchExplorationEnabled,
                            onSettingsClicked = {
                                navController.navigate("settings")
                            }
                        )
                    }
                    composable(route = "settings") {
                        Settings(
                            isInDarkTheme = isInDarkTheme.value,
                            onBackClicked = {
                                navController.popBackStack()
                            },
                            onDarkThemeClicked = {
                                isInDarkTheme.value = !isInDarkTheme.value
                            }
                        )
                    }
                }
            }
        }
    }
}
