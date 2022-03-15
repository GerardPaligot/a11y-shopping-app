package app.shopping.a11y

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.primarySurface
import androidx.compose.runtime.SideEffect
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import app.shopping.a11y.ui.screens.list.ProductListVM
import app.shopping.a11y.ui.theme.A11yShoppingAppTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@ExperimentalAnimationApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            A11yShoppingAppTheme {
                val systemUiController = rememberSystemUiController()
                val useDarkIcons = MaterialTheme.colors.isLight
                val navBarColor = MaterialTheme.colors.surface
                SideEffect {
                    systemUiController.setSystemBarsColor(color = navBarColor, darkIcons = useDarkIcons)
                    systemUiController.setNavigationBarColor(color = navBarColor, darkIcons = useDarkIcons)
                }
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "products") {
                    composable(route = "products") {
                        ProductListVM()
                    }
                }
            }
        }
    }
}
