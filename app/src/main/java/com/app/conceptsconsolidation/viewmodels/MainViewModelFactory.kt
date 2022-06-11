package com.app.conceptsconsolidation.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.app.conceptsconsolidation.repository.FakerRepository
import javax.inject.Inject

class MainViewModelFactory @Inject constructor(private val repository: FakerRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }
}