package com.example.gmasalskikh.imageviewer.data

import io.reactivex.Observable
import org.koin.standalone.inject

object ItemProvider : Model {

    private val dao: DAO by inject("YandexDAO")

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