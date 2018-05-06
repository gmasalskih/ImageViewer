package com.example.gmasalskikh.imageviewer.view.imageViewer

import com.example.gmasalskikh.imageviewer.data.Item
import org.koin.standalone.KoinComponent

interface BaseImageViewer {
    interface Presenter : KoinComponent {
        val view: BaseImageViewer.View
        fun getLastItem(): Item
    }

    interface View {
        val presenter: BaseImageViewer.Presenter
        fun showError(err: String)
    }
}