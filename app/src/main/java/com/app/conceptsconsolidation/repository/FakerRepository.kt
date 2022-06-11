package com.app.conceptsconsolidation.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.app.conceptsconsolidation.models.Product
import com.app.conceptsconsolidation.retrofit.FakerAPI
import javax.inject.Inject

class FakerRepository @Inject constructor(private val fakerAPI: FakerAPI) {

    private var _products =  MutableLiveData<List<Product>>()


    val products : LiveData<List<Product>> get()= _products


    suspend fun getProducts(){
        val response = fakerAPI.getProducts();

        if(response.isSuccessful && response.body()!=null){
            _products.postValue(response.body())
        }

    }
}