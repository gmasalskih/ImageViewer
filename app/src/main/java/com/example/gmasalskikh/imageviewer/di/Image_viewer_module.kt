package com.example.gmasalskikh.imageviewer.di

import com.example.gmasalskikh.imageviewer.view.imageViewer.BaseImageViewer
import com.example.gmasalskikh.imageviewer.view.imageViewer.ImageViewerFragment
import com.example.gmasalskikh.imageviewer.view.imageViewer.ImageViewerPresenter
import org.koin.dsl.module.applicationContext

const val IMAGE_VIEWER = "IMAGE_VIEWER"

val image_viewer_module = applicationContext {
    context(IMAGE_VIEWER) {
        bean { ImageViewerPresenter(it[IMAGE_VIEWER]) as BaseImageViewer.Presenter }
        factory { ImageViewerFragment() }
    }
}
