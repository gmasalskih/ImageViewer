package com.example.gmasalskikh.imageviewer.view.imageViewer

import com.example.gmasalskikh.imageviewer.data.Item
import org.koin.standalone.KoinComponent

interface BaseImageViewer {
    interface Presenter : KoinComponent {
        val view: BaseImageViewer.View
        fun getLastItem(): Item
        fun stop()
    }

    interface View {
        val presenter: BaseImageViewer.Presenter
        fun showLoading()
        fun hideLoading()
        fun showError(err: String)
    }
}