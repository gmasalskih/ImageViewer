package com.example.gmasalskikh.imageviewer.data

import com.example.gmasalskikh.imageviewer.di.YANDEX_DAO
import io.reactivex.Observable
import org.koin.standalone.inject

object ItemProvider : Model {

    private val dao: DAO by inject(YANDEX_DAO)

    override lateinit var lastItem: Item

    override fun getItemList(): Observable<List<Item>> {
        return dao.getItems()
                .toList()
                .toObservable()
                .flatMap {
                    Observable.just(it)
                }
    }
}