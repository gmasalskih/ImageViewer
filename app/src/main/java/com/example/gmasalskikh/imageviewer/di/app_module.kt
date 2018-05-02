package com.example.gmasalskikh.imageviewer.di

import com.example.gmasalskikh.imageviewer.data.EntityItemProvider
import com.example.gmasalskikh.imageviewer.data.ItemProvider
import org.koin.dsl.module.applicationContext

val app_module = applicationContext {
    bean { EntityItemProvider as ItemProvider }
}

