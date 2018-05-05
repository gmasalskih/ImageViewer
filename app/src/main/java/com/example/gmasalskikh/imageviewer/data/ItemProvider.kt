package com.example.gmasalskikh.imageviewer.data

import io.reactivex.android.schedulers.AndroidSchedulers
import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

object ItemProvider : KoinComponent {

    lateinit var lastItem: Item

    private val listItem = ArrayList<Item>()

    val dao: DAO by inject("YandexDAO")

    init {
        dao.getItems()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    listItem.add(it)
                }
    }

    fun getItem(index: Int): Item {
        return listItem[index]
    }

    fun countItems(): Int {
        return listItem.size
    }

}