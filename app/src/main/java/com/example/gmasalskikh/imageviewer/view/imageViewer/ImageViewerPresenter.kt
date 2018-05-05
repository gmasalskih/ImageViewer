package com.example.gmasalskikh.imageviewer.view.imageViewer

import com.example.gmasalskikh.imageviewer.data.Item
import com.example.gmasalskikh.imageviewer.data.ItemProvider
import org.koin.standalone.inject

class ImageViewerPresenter : BaseImageViewerPresenter {

    private val itemProvider: ItemProvider by inject()

    override fun getItem(): Item {
        return itemProvider.lastItem
    }
}