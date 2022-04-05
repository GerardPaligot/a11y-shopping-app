package app.shopping.a11y.ui.screens.list

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Divider
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import app.shopping.a11y.R
import app.shopping.a11y.data.ProductUi
import app.shopping.a11y.ui.components.ProductItem
import app.shopping.a11y.ui.theme.A11yShoppingAppTheme

@ExperimentalAnimationApi
@Composable
fun ProductListVM(
    modifier: Modifier = Modifier,
    onSettingsClicked: () -> Unit
) {
    val viewModel = viewModel<ProductListViewModel>()
    val products = viewModel.uiState.collectAsState()
    ProductList(
        products = products.value.products,
        modifier = modifier,
        onSettingsClicked = onSettingsClicked,
        onShoppingCartClicked = {},
        onRemoveQuantityClicked = {
            viewModel.removeQuantity(it)
        },
        onAddQuantityClicked = {
            viewModel.addQuantity(it)
        }
    )
}

@ExperimentalAnimationApi
@Composable
fun ProductList(
    products: List<ProductUi>,
    modifier: Modifier = Modifier,
    onSettingsClicked: () -> Unit,
    onShoppingCartClicked: () -> Unit,
    onRemoveQuantityClicked: (productId: String) -> Unit,
    onAddQuantityClicked: (productId: String) -> Unit
) {
    Scaffold(
        modifier = modifier,
        backgroundColor = MaterialTheme.colors.background,
        contentColor = MaterialTheme.colors.onBackground,
        topBar = {
            TopAppBar(
                title = { Text(text = "Céréales") },
                backgroundColor = MaterialTheme.colors.surface,
                contentColor = MaterialTheme.colors.onSurface,
                actions = {
                    IconButton(onClick = onSettingsClicked) {
                        Icon(imageVector = Icons.Default.Settings, contentDescription = null)
                    }
                },
                navigationIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.store),
                        contentDescription = "App Logo",
                        tint = Color.Unspecified,
                        modifier = Modifier.size(48.dp)
                    )
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = onShoppingCartClicked,
                backgroundColor = MaterialTheme.colors.secondary,
                contentColor = MaterialTheme.colors.onSecondary
            ) {
                Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = null)
            }
        }
    ) {
        LazyColumn(contentPadding = it) {
            itemsIndexed(items = products) { index, product ->
                ProductItem(
                    product = product,
                    onRemoveQuantityClicked = onRemoveQuantityClicked,
                    onAddQuantityClicked = onAddQuantityClicked,
                    modifier = Modifier.padding(horizontal = 8.dp)
                )
                if (index < products.lastIndex) {
                    Divider(
                        color = MaterialTheme.colors.onBackground.copy(alpha = .3f),
                        thickness = 0.5.dp,
                        modifier = Modifier.padding(vertical = 8.dp)
                    )
                }
            }
        }
    }
}

@ExperimentalAnimationApi
@Preview
@Composable
fun ProductListPreview() {
    A11yShoppingAppTheme {
        ProductList(
            products = ProductUi.fakes,
            onSettingsClicked = { /*TODO*/ },
            onShoppingCartClicked = { /*TODO*/ },
            onRemoveQuantityClicked = { /*TODO*/ },
            onAddQuantityClicked = { /*TODO*/ }
        )
    }
}
