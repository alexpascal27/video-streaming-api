package com.alpascal.api.shoppingapi.records

data class Product(
    val id: String,
    val name: String,
    val price: Int
) {
    companion object {
        private val products = listOf(
            Product("1", "Product 1", 100),
            Product("2", "Product 2", 200),
            Product("3", "Product 3", 300),
            Product("4", "Product 4", 400),
            Product("5", "Product 5", 500),
            Product("6", "Product 6", 600),
            Product("7", "Product 7", 700),
            Product("8", "Product 8", 800),
            Product("9", "Product 9", 900),
            Product("10", "Product 10", 1000)
        );
        @JvmStatic
        fun getById(id: String): Product
            = products.find { it.id == id } ?: Product("null", "null", 0)

        fun getAll(): List<Product>
                = products
    }
}