package com.example.gmasalskikh.imageviewer.di

import com.example.gmasalskikh.imageviewer.view.imageViewer.BaseImageViewer
import com.example.gmasalskikh.imageviewer.view.imageViewer.ImageViewerFragment
import com.example.gmasalskikh.imageviewer.view.imageViewer.ImageViewerPresenter
import org.koin.dsl.module.applicationContext

val image_viewer_module = applicationContext {
    context(DIContext.IMAGE_VIEWER.name) {
        bean { ImageViewerPresenter(it[DIContext.IMAGE_VIEWER.name]) as BaseImageViewer.Presenter }
        factory { ImageViewerFragment() }
    }
}
