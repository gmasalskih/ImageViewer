package com.example.gmasalskikh.imageviewer.data.local

import com.example.gmasalskikh.imageviewer.data.DAO
import com.example.gmasalskikh.imageviewer.data.Item
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers

object LocalDAO : DAO {
    override fun getItems(): Observable<Item> {
        return Observable.fromIterable(list)
                .subscribeOn(Schedulers.io())
                .map {
                    Item(it.toString(), "https://4b4d7c93-2589-4633-9d37-d2a10711e9eb.mock.pstmn.io/$it")
                }
    }
}