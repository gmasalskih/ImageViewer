package com.example.gmasalskikh.imageviewer.di

import com.example.gmasalskikh.imageviewer.data.web.helper.YandexJsonInterceptor
import com.example.gmasalskikh.imageviewer.data.web.helper.createOkHttpClient
import com.example.gmasalskikh.imageviewer.data.web.helper.createWebService
import com.example.gmasalskikh.imageviewer.data.web.yandex.fotki.top.api.YandexApi
import okhttp3.Interceptor
import org.koin.dsl.module.applicationContext

val rest_module = applicationContext {
    bean ("Yandex"){ createOkHttpClient(get("YandexJsonInterceptor")) }
    bean ("YandexJsonInterceptor"){ YandexJsonInterceptor as Interceptor }
    bean { createWebService<YandexApi>( get("Yandex"),"http://api-fotki.yandex.ru/api/") }
}

