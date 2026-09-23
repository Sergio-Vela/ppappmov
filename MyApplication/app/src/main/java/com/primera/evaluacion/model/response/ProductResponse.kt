package com.primera.evaluacion.model.response

import com.primera.evaluacion.model.response.ProductData

data class ProductResponse(
    val id: String,
    val name: String,
    val data: ProductData?
)
