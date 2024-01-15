package com.alpascal.api.shoppingapi.controllers

import com.alpascal.api.shoppingapi.records.Product
import com.alpascal.api.shoppingapi.records.ProductSearchResults
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class ProductController {
    @QueryMapping
    fun productById(@Argument id: String): Product {
        return Product.getById(id)
    }

    @QueryMapping
    fun productSearch()
            = ProductSearchResults.productSearch()
}