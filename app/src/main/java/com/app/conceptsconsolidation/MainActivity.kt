package com.app.conceptsconsolidation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.app.conceptsconsolidation.viewmodels.MainViewModel
import com.app.conceptsconsolidation.viewmodels.MainViewModelFactory
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel:MainViewModel

    @Inject
    lateinit var mainViewModelFactory: MainViewModelFactory

    private val products: TextView
    get()= findViewById(R.id.products)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as ConceptsConsolidationApplication).applicationComponent.inject(this)


        mainViewModel = ViewModelProvider(this,mainViewModelFactory).get(MainViewModel::class.java)


        mainViewModel.productLiveData.observe(this,{
            products.text = it.joinToString { it-> it.title + "\n\n"}
        })





    }
}