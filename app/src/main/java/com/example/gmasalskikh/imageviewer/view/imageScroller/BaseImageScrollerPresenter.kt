package com.example.gmasalskikh.imageviewer.view.imageScroller

import com.example.gmasalskikh.imageviewer.data.Item
import com.example.gmasalskikh.imageviewer.data.ItemProvider
import org.koin.standalone.KoinComponent

interface BaseImageScrollerPresenter: KoinComponent {

    fun setLastItem(item: Item)
    fun getItemProvider(): ItemProvider

}