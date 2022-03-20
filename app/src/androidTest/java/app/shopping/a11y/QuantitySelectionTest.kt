package app.shopping.a11y

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.hasStateDescription
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.test.ext.junit.runners.AndroidJUnit4
import app.shopping.a11y.ui.components.QuantitySelection
import app.shopping.a11y.ui.theme.A11yShoppingAppTheme
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@ExperimentalAnimationApi
@RunWith(AndroidJUnit4::class)
class QuantitySelectionTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun displayOnlyAddButton() {
        composeTestRule.setContent {
            A11yShoppingAppTheme {
                QuantitySelection(
                    quantity = 0,
                    maxQuantity = 5,
                    onRemoveClicked = { /*TODO*/ },
                    onAddClicked = { /*TODO*/ }
                )
            }
        }

        composeTestRule.onNodeWithContentDescription("Add")
            .assertIsDisplayed()
        composeTestRule.onNodeWithContentDescription("Remove")
            .assertDoesNotExist()
        composeTestRule.onNodeWithContentDescription("0")
            .assertDoesNotExist()
    }

    @Test
    fun displayRemoveQuantityAndAddButtons() {
        composeTestRule.setContent {
            A11yShoppingAppTheme {
                QuantitySelection(
                    quantity = 1,
                    maxQuantity = 5,
                    onRemoveClicked = { /*TODO*/ },
                    onAddClicked = { /*TODO*/ }
                )
            }
        }

        composeTestRule.onNodeWithContentDescription("Add")
            .assertIsDisplayed()
        composeTestRule.onNodeWithContentDescription("Remove")
            .assertIsDisplayed()
        composeTestRule.onNodeWithText("1")
            .assertIsDisplayed()
    }

    @Test
    fun cantAddQuantityIfMaxReached() {
        composeTestRule.setContent {
            A11yShoppingAppTheme {
                QuantitySelection(
                    quantity = 2,
                    maxQuantity = 2,
                    onRemoveClicked = { /*TODO*/ },
                    onAddClicked = { /*TODO*/ }
                )
            }
        }

        composeTestRule.onNode(hasStateDescription("2 - Maximum reached"))
            .assertIsDisplayed()
    }

    @Test
    fun changeQuantitiesWithButtons() {
        val myCounter = mutableStateOf(0)
        composeTestRule.setContent {
            A11yShoppingAppTheme {
                QuantitySelection(
                    quantity = myCounter.value,
                    maxQuantity = 5,
                    onRemoveClicked = { myCounter.value = myCounter.value - 1 },
                    onAddClicked = { myCounter.value = myCounter.value + 1 }
                )
            }
        }

        composeTestRule.onNodeWithText("0")
            .assertDoesNotExist()
        composeTestRule.onNodeWithContentDescription("Add")
            .performClick()
            .performClick()

        assertTrue(myCounter.value == 2)

        composeTestRule.onNodeWithText("2")
            .assertIsDisplayed()
        composeTestRule.onNodeWithContentDescription("Remove")
            .performClick()

        assertTrue(myCounter.value == 1)

        composeTestRule.onNodeWithText("1")
            .assertIsDisplayed()
    }
}