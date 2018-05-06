package com.example.gmasalskikh.imageviewer.view.imageViewer

import com.example.gmasalskikh.imageviewer.data.Item
import com.example.gmasalskikh.imageviewer.data.ItemProvider
import org.koin.standalone.inject

class ImageViewerPresenter(override val view: BaseImageViewer.View) : BaseImageViewer.Presenter {

    private val itemProvider: ItemProvider by inject()

    override fun getLastItem(): Item {
        return itemProvider.lastItem
    }
}