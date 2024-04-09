package app.shopping.a11y.ui.components

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.shopping.a11y.R
import app.shopping.a11y.data.ProductUi
import app.shopping.a11y.ui.theme.A11yShoppingAppTheme
import coil.compose.AsyncImage

@ExperimentalAnimationApi
@Composable
fun ProductItem(
    product: ProductUi,
    modifier: Modifier = Modifier,
    onRemoveQuantityClicked: (productId: String) -> Unit,
    onAddQuantityClicked: (productId: String) -> Unit,
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        AsyncImage(
            model = product.url,
            contentDescription = "Product Image",
            placeholder = painterResource(id = R.drawable.placeholder),
            modifier = Modifier.size(80.dp),
        )
        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Text(text = product.name)
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.CenterEnd,
            ) {
                ReadOnlyRating(number = product.rating, nbComments = product.nbComments)
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
            ) {
                Price(price = product.price, priceStrikeout = product.priceStrikeout)
                Spacer(modifier = Modifier.weight(1f))
                QuantitySelection(
                    quantity = product.quantity,
                    maxQuantity = product.maxQuantity,
                    onRemoveClicked = { onRemoveQuantityClicked(product.id) },
                    onAddClicked = { onAddQuantityClicked(product.id) },
                )
            }
        }
    }
}

@ExperimentalAnimationApi
@Preview
@Composable
fun ProductItemPreview() {
    var product by remember { mutableStateOf(ProductUi.fake[0]) }
    A11yShoppingAppTheme {
        ProductItem(
            product = product,
            onAddQuantityClicked = {
                product = product.copy(quantity = product.quantity + 1)
            },
            onRemoveQuantityClicked = {
                product = product.copy(quantity = product.quantity - 1)
            },
        )
    }
}
