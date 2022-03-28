package app.shopping.a11y.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.StarBorder
import androidx.compose.material.icons.filled.StarHalf
import androidx.compose.material.icons.filled.StarRate
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.text
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import app.shopping.a11y.R
import app.shopping.a11y.ui.theme.A11yShoppingAppTheme
import kotlin.math.floor
import kotlin.math.roundToInt

@Composable
fun ReadOnlyRating(
    number: Float,
    nbComments: Int,
    modifier: Modifier = Modifier,
    maxValue: Int = 5,
    colors: RatingsColors = RatingsColors(
        starColor = MaterialTheme.colors.onBackground,
        noteColor = MaterialTheme.colors.onBackground.copy(alpha = .7f),
        commentsColor = MaterialTheme.colors.onBackground.copy(alpha = .7f)
    ),
    sizes: RatingsSizes = RatingsSizes(
        starSize = 16.dp,
        contentPadding = 0.dp,
        spaceBetween = 4.dp,
        textStyle = MaterialTheme.typography.caption
    ),
) {
    val cdProductRating = stringResource(id = R.string.a11y_product_rating)
    val cdProductComments = stringResource(id = R.string.a11y_product_comments)

    val rounded = number.rounded()
    Row(
        modifier = modifier
            .padding(sizes.contentPadding)
            .semantics(mergeDescendants = true) {},
        horizontalArrangement = Arrangement.spacedBy(sizes.spaceBetween),
        verticalAlignment = Alignment.CenterVertically
    ) {
        (0 until maxValue).forEach {
            Icon(
                imageVector = getStarIcon(it, number),
                contentDescription = null,
                tint = colors.starColor,
                modifier = Modifier
                    .size(size = sizes.starSize)
            )
        }
        Text(
            text = "$rounded/$maxValue",
            style = sizes.textStyle.copy(fontWeight = FontWeight.Bold),
            color = colors.noteColor,
            modifier = Modifier.semantics {
                text = AnnotatedString(cdProductRating.format(number, maxValue))
            }
        )
        Text(
            text = "($nbComments)",
            style = sizes.textStyle,
            color = colors.commentsColor,
            modifier = Modifier.semantics {
                text = AnnotatedString(cdProductComments.format(nbComments))
            }
        )
    }
}

@Preview
@Composable
fun ReadOnlyRating() {
    A11yShoppingAppTheme {
        ReadOnlyRating(
            number = 4.4f,
            nbComments = 42
        )
    }
}

@Stable
class RatingsColors(
    val starColor: Color,
    val noteColor: Color,
    val commentsColor: Color
)

@Stable
class RatingsSizes(
    val starSize: Dp,
    val contentPadding: Dp,
    val spaceBetween: Dp,
    val textStyle: TextStyle
)

fun Float.rounded(rounded: Float = 10.0f): Float = (this * rounded).roundToInt() / rounded
private const val HALF = 0.5f
fun getStarIcon(index: Int, number: Float): ImageVector {
    val floor = floor(number).toInt()
    return if (floor == index) {
        val decimal = number - index
        if (decimal < HALF) Icons.Default.StarHalf else Icons.Default.StarRate
    } else if (index < number) {
        Icons.Default.StarRate
    } else {
        Icons.Default.StarBorder
    }
}
