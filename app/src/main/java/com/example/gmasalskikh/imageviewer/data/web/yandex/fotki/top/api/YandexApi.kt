package com.example.gmasalskikh.imageviewer.data.web.yandex.fotki.top.api

import com.example.gmasalskikh.imageviewer.data.web.yandex.fotki.top.pojo.FeaturedPhotos
import io.reactivex.Observable
import retrofit2.http.GET


interface YandexApi {

    @GET("top/")
    fun getYandexFotkiTop(): Observable<FeaturedPhotos>
}