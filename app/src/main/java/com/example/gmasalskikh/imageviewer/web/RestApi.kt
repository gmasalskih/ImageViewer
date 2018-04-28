package com.example.gmasalskikh.imageviewer.web

import Util.Const.BASE_URL
import Util.WebHelper.Api
import android.util.Log
import io.reactivex.schedulers.Schedulers
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


object RestApi {

    private const val TIMEOUT: Long = 30

    private val okHttpClient = OkHttpClient.Builder()
            .addInterceptor {
                Log.d("URL", it.request().url().toString())
                it.proceed(it.request().newBuilder().build())
            }.readTimeout(TIMEOUT, TimeUnit.SECONDS)
            .build()

    private val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
            .build()
    val webApi = retrofit.create(Api::class.java)
}