package com.app.conceptsconsolidation.retrofit

import com.app.conceptsconsolidation.models.Product
import retrofit2.Response
import retrofit2.http.GET

interface FakerAPI {

    @GET("/products")
    suspend fun getProducts():Response<List<Product>>

}