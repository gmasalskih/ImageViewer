package com.example.gmasalskikh.imageviewer.di

import com.example.gmasalskikh.imageviewer.data.DAO
import com.example.gmasalskikh.imageviewer.data.ItemProvider
import com.example.gmasalskikh.imageviewer.data.local.LocalDAO
import com.example.gmasalskikh.imageviewer.data.web.yandex.fotki.top.YandexDAO
import org.koin.dsl.module.applicationContext

val app_module = applicationContext {
    bean { ItemProvider as ItemProvider }
    bean ("Test") { LocalDAO as DAO }
    bean ("YandexDAO") { YandexDAO as DAO }
}

enum class DIContext{
    IMAGE_SCROLLER,
    IMAGE_VIEWER
}

