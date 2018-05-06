package com.example.gmasalskikh.imageviewer.view.imageScroller

import com.example.gmasalskikh.imageviewer.data.Item
import org.koin.standalone.KoinComponent

interface BaseImageScroller {
    interface Presenter : KoinComponent {
        val view: BaseImageScroller.View
        fun init()
        fun clickToItem(item: Item)
        fun stop()
    }

    interface View {
        val presenter: BaseImageScroller.Presenter
        fun showError(err: String)
        fun setListItem(items: List<Item>)
        fun updateUI()
    }
}