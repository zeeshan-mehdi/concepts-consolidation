package com.app.conceptsconsolidation.di

import com.app.conceptsconsolidation.MainActivity
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {
    fun inject(mainActivity: MainActivity)
}