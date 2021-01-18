package com.joggingapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class BaseApplication : Application() {

    // Setup Logging with Timber library
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}