package com.example.gmasalskikh.imageviewer.data

import io.reactivex.Observable
import org.koin.standalone.KoinComponent

interface DAO : KoinComponent {

    fun getItems(): Observable<Item>

}