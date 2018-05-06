package com.example.gmasalskikh.imageviewer.di

import com.example.gmasalskikh.imageviewer.constant.BASE_URL
import com.example.gmasalskikh.imageviewer.data.web.helper.YandexJsonInterceptor
import com.example.gmasalskikh.imageviewer.data.web.helper.createOkHttpClient
import com.example.gmasalskikh.imageviewer.data.web.helper.createWebService
import com.example.gmasalskikh.imageviewer.data.web.yandex.fotki.top.api.YandexApi
import okhttp3.Interceptor
import org.koin.dsl.module.applicationContext

const val YANDEX_JSON_INTERCEPTOR = "YANDEX_JSON_INTERCEPTOR"
const val YANDEX_OK_HTTP_CLIENT = "YANDEX_OK_HTTP_CLIENT"

val rest_module = applicationContext {
    bean(YANDEX_OK_HTTP_CLIENT) { createOkHttpClient(get(YANDEX_JSON_INTERCEPTOR)) }
    bean(YANDEX_JSON_INTERCEPTOR) { YandexJsonInterceptor as Interceptor }
    bean { createWebService<YandexApi>(get(YANDEX_OK_HTTP_CLIENT), BASE_URL) }
}

