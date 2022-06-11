package com.app.conceptsconsolidation

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import com.app.conceptsconsolidation.di.ApplicationComponent
import com.app.conceptsconsolidation.di.DaggerApplicationComponent

class ConceptsConsolidationApplication :Application() {

    lateinit var applicationComponent: ApplicationComponent


    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.builder().build()
    }
}