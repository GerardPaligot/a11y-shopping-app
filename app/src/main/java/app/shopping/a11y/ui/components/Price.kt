package app.shopping.a11y.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.shopping.a11y.R
import app.shopping.a11y.ui.theme.A11yShoppingAppTheme

@Composable
fun Price(
    price: String,
    modifier: Modifier = Modifier,
    priceStrikeout: String? = null,
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.Bottom
    ) {
        PriceText(price = price)
        if (priceStrikeout != null) {
            PriceText(
                price = priceStrikeout,
                textDecoration = TextDecoration.LineThrough,
                dozenStyle = MaterialTheme.typography.h5.copy(fontWeight = FontWeight.Bold),
                decimalStyle = MaterialTheme.typography.overline.copy(fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(bottom = 3.dp)
            )
        }
    }
}

@Composable
internal fun PriceText(
    price: String,
    modifier: Modifier = Modifier,
    textDecoration: TextDecoration? = null,
    dozenStyle: TextStyle = MaterialTheme.typography.h4.copy(fontWeight = FontWeight.Bold),
    decimalStyle: TextStyle = MaterialTheme.typography.caption.copy(fontWeight = FontWeight.Bold),
    color: Color = MaterialTheme.colors.onBackground.copy(
        alpha = if (textDecoration == null) 1f else .7f
    )
) {
    val cdPrice = stringResource(id = R.string.a11y_price, price)
    val cdStrikeout = stringResource(id = R.string.a11y_price_strikeout, price)
    val (dozen, decimals) = price.split(",")
    Row(
        modifier = modifier.semantics {
            contentDescription = if(textDecoration == TextDecoration.LineThrough) {
                cdStrikeout
            } else {
                cdPrice
            }
        },
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = dozen,
            style = dozenStyle,
            color = color,
            textDecoration = textDecoration,
            modifier = Modifier.clearAndSetSemantics { }
        )
        Column {
            Text(
                text = decimals,
                style = decimalStyle,
                color = color,
                textDecoration = textDecoration,
                modifier = Modifier.clearAndSetSemantics { }
            )
            Text(
                text = "€",
                style = decimalStyle,
                color = color,
                modifier = Modifier.clearAndSetSemantics { }
            )
        }
    }
}

@Preview
@Composable
fun PricePreview() {
    A11yShoppingAppTheme {
        Column {
            Price(price = "9.99")
            Price(price = "9.99", priceStrikeout = "14.99")
        }
    }
}
