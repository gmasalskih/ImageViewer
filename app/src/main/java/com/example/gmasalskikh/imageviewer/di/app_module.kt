package com.example.gmasalskikh.imageviewer.di

import com.example.gmasalskikh.imageviewer.data.DAO
import com.example.gmasalskikh.imageviewer.data.ItemProvider
import com.example.gmasalskikh.imageviewer.data.web.yandex.fotki.top.YandexDAO
import com.squareup.picasso.Picasso
import org.koin.dsl.module.applicationContext

const val YANDEX_DAO = "YANDEX_DAO"

val app_module = applicationContext {
    bean { ItemProvider }
    bean(YANDEX_DAO) { YandexDAO as DAO }
    bean { Picasso.get() }
}



