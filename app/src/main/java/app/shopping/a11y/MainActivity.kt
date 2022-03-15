package app.shopping.a11y

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import app.shopping.a11y.ui.screens.list.ProductListVM
import app.shopping.a11y.ui.theme.A11yShoppingAppTheme

@ExperimentalAnimationApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            A11yShoppingAppTheme {
                ProductListVM()
            }
        }
    }
}
