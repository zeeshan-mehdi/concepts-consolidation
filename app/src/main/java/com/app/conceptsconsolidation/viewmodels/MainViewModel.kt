package com.app.conceptsconsolidation.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.conceptsconsolidation.models.Product
import com.app.conceptsconsolidation.repository.FakerRepository
import kotlinx.coroutines.launch

class MainViewModel(private val repository: FakerRepository) : ViewModel() {
    lateinit var products : LiveData<List<Product>>

    val productLiveData: LiveData<List<Product>> get() = repository.products

    init {
        viewModelScope.launch {
            repository.getProducts()
        }

    }





}