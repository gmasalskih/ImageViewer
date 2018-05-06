package com.example.gmasalskikh.imageviewer

import android.app.Application
import com.example.gmasalskikh.imageviewer.di.modules
import org.koin.android.ext.android.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin(this, modules)
    }
}