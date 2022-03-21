package app.shopping.a11y.ui.screens.list

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.res.stringResource
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
    isAccessibilityEnabled: Boolean,
    modifier: Modifier = Modifier,
    onSettingsClicked: () -> Unit
) {
    val viewModel = viewModel<ProductListViewModel>()
    val products = viewModel.uiState.collectAsState()
    ProductList(
        isAccessibilityEnabled = isAccessibilityEnabled,
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
    isAccessibilityEnabled: Boolean,
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
                    if (isAccessibilityEnabled) {
                        IconButton(onClick = onShoppingCartClicked) {
                            Icon(
                                imageVector = Icons.Default.ShoppingCart, 
                                contentDescription = stringResource(id = R.string.a11y_open_basket)
                            )
                        }
                    }
                    IconButton(onClick = onSettingsClicked) {
                        Icon(
                            imageVector = Icons.Default.Settings,
                            contentDescription = stringResource(id = R.string.a11y_open_settings)
                        )
                    }
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
            isAccessibilityEnabled = true,
            products = ProductUi.fakes,
            onSettingsClicked = { /*TODO*/ },
            onShoppingCartClicked = { /*TODO*/ },
            onRemoveQuantityClicked = { /*TODO*/ },
            onAddQuantityClicked = { /*TODO*/ }
        )
    }
}
