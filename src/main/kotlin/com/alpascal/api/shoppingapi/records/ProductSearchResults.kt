package com.alpascal.api.shoppingapi.records

data class ProductSearchResults(
    val productSearchCriteria: ProductSearchCriteria,
    val productSearchListings: List<Product>
) {
   companion object {
        @JvmStatic
        fun productSearch(contextInput: ContextInput, criteriaInput: ProductSearchCriteria): ProductSearchResults {
            // TODO 1: Add conversion logic using currency
            // TODO 2: Change how much of products we return per platform (e.g. less for phone)
            return ProductSearchResults(criteriaInput, Product.getAll())
        }
   }
}

data class ContextInput(
    val currency: String,
    val device: String
)

data class ProductSearchCriteria(
    val booleans: List<BooleanValue>,
    val counts: List<CountValue>,
    val ranges: List<RangeValue>,
    val selections: List<SelectionValue>
)

data class BooleanValue(
    val id: String,
    val value: Boolean
)

data class CountValue(
    val id: String,
    val value: Int
)

data class RangeValue(
    val id: String,
    val min: Int,
    val max: Int
)

data class SelectionValue(
    val id: String,
    val value: String
)

