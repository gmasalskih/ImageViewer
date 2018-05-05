package com.example.gmasalskikh.imageviewer.view.imageViewer

import com.example.gmasalskikh.imageviewer.data.Item
import org.koin.standalone.KoinComponent

interface BaseImageViewerPresenter : KoinComponent {
    fun getItem(): Item
}