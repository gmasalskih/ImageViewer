package com.example.gmasalskikh.imageviewer.data.web.yandex.fotki.top

import com.example.gmasalskikh.imageviewer.data.DAO
import com.example.gmasalskikh.imageviewer.data.Item
import com.example.gmasalskikh.imageviewer.data.web.yandex.fotki.top.api.YandexApi
import io.reactivex.Observable
import org.koin.standalone.inject

object YandexDAO : DAO {

    private val api: YandexApi by inject()

    override fun getItems(): Observable<Item> {
        return api.getYandexFotkiTop()
                .flatMap {
                    Observable.fromIterable(it.entries)
                }.map {
                    Item(it.title.toString(), it.img!!.M!!.href.toString(), it.img!!.xXXL!!.href.toString())
                }
    }
}