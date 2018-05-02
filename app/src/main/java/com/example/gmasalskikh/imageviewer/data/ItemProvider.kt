package com.example.gmasalskikh.imageviewer.data

interface ItemProvider {

    var lastItem: Item

    fun getItem(position: Int): Item
    fun countItems(): Int
}