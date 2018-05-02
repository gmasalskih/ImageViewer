package com.example.gmasalskikh.imageviewer.view.imageScroller

import com.example.gmasalskikh.imageviewer.data.Item
import com.example.gmasalskikh.imageviewer.data.ItemProvider
import org.koin.standalone.inject

class ImageScrollerPresenter:BaseImageScrollerPresenter {

    private val itemProvider:ItemProvider by inject()

    override fun setLastItem(item: Item) {
        itemProvider.lastItem = item
    }

}