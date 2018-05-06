package com.example.gmasalskikh.imageviewer.data

import io.reactivex.Observable
import org.koin.standalone.KoinComponent

interface Model:KoinComponent {
    var lastItem: Item
    fun getItemList():Observable<List<Item>>
}