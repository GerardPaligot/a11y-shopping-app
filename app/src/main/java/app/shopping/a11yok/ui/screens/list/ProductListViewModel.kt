package app.shopping.a11yok.ui.screens.list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import app.shopping.a11yok.data.ProductUi
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

data class ProductListState(
    val loading: Boolean,
    val products: List<ProductUi>
)

class ProductListViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(ProductListState(
        loading = true,
        products = ProductUi.fake
    ))
    val uiState: StateFlow<ProductListState> = _uiState

    init {
        viewModelScope.launch {
            delay(1000)
            _uiState.value = ProductListState(loading = false, products = ProductUi.fake)
        }
    }

    fun removeQuantity(productId: String) = viewModelScope.launch {
        val index = _uiState.value.products.indexOfFirst { product -> product.id == productId }
        val list = arrayListOf(*_uiState.value.products.toTypedArray())
        val item = _uiState.value.products[index]
        list[index] = item.copy(quantity = item.quantity - 1)
        _uiState.value = _uiState.value.copy(products =  list)
    }

    fun addQuantity(productId: String) = viewModelScope.launch {
        val index = _uiState.value.products.indexOfFirst { product -> product.id == productId }
        val list = arrayListOf(*_uiState.value.products.toTypedArray())
        val item = _uiState.value.products[index]
        list[index] = item.copy(quantity = item.quantity + 1)
        _uiState.value = _uiState.value.copy(products =  list)
    }
}