package app.shopping.a11y.ui.components

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.SizeTransform
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.animation.with
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ProductionQuantityLimits
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.shopping.a11y.ui.theme.A11yShoppingAppTheme

@ExperimentalAnimationApi
@Composable
fun QuantitySelection(
    quantity: Int,
    maxQuantity: Int,
    removeContentDescription: String?,
    addContentDescription: String?,
    onRemoveClicked: () -> Unit,
    onAddClicked: () -> Unit,
    modifier: Modifier = Modifier,
    buttonColors: ButtonColors = ButtonDefaults.buttonColors(
        backgroundColor = MaterialTheme.colors.primary,
        contentColor = MaterialTheme.colors.onPrimary
    ),
    buttonShape: Shape = CircleShape,
    textStyle: TextStyle = MaterialTheme.typography.body2
) {
    val emptyQuantity = quantity == 0
    val addIcon = when {
        emptyQuantity -> Icons.Default.ShoppingCart
        quantity == maxQuantity -> Icons.Default.ProductionQuantityLimits
        else -> Icons.Default.Add
    }
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        AnimatedVisibility(visible = !emptyQuantity) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                QuantityIconButton(
                    imageVector = Icons.Default.Remove,
                    contentDescription = removeContentDescription,
                    onClick = onRemoveClicked,
                    colors = buttonColors,
                    shape = buttonShape,
                    enabled = quantity > 0
                )
                QuantityText(
                    quantity = quantity,
                    style = textStyle
                )
            }
        }
        QuantityIconButton(
            imageVector = addIcon,
            contentDescription = addContentDescription,
            onClick = onAddClicked,
            colors = buttonColors,
            shape = buttonShape,
            enabled = quantity < maxQuantity
        )
    }
}

@ExperimentalAnimationApi
@Composable
internal fun QuantityIconButton(
    imageVector: ImageVector,
    contentDescription: String?,
    onClick: () -> Unit,
    colors: ButtonColors,
    shape: Shape,
    enabled: Boolean,
    modifier: Modifier = Modifier
) {
    IconButton(
        onClick = onClick,
        enabled = enabled,
        modifier = modifier
            .background(
                color = colors.backgroundColor(enabled = enabled).value,
                shape = shape
            )
    ) {
        AnimatedContent(
            targetState = imageVector,
        ) { targetImageVector ->
            Icon(
                imageVector = targetImageVector,
                contentDescription = contentDescription,
                tint = colors.contentColor(enabled = enabled).value
            )
        }
    }
}

@ExperimentalAnimationApi
@Composable
internal fun QuantityText(
    quantity: Int,
    style: TextStyle,
    modifier: Modifier = Modifier
) {
    AnimatedContent(
        targetState = quantity,
        transitionSpec = {
            if (targetState > initialState) {
                slideInVertically { height -> height } + fadeIn() with
                        slideOutVertically { height -> -height } + fadeOut()
            } else {
                slideInVertically { height -> -height } + fadeIn() with
                        slideOutVertically { height -> height } + fadeOut()
            }.using(
                SizeTransform(clip = false)
            )
        },
        modifier = modifier
    ) { targetQuantity ->
        Text(
            text = "$targetQuantity",
            style = style,
            maxLines = 1,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(width = 32.dp)
        )
    }
}

@ExperimentalAnimationApi
@Preview
@Composable
fun QuantitySelectionPreview() {
    var quantityState by remember { mutableStateOf(0) }
    A11yShoppingAppTheme {
        QuantitySelection(
            quantity = quantityState,
            maxQuantity = 5,
            removeContentDescription = null,
            addContentDescription = null,
            onAddClicked = {
                quantityState++
            },
            onRemoveClicked = {
                quantityState--
            }
        )
    }
}