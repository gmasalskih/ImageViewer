package com.example.gmasalskikh.imageviewer.di

import com.example.gmasalskikh.imageviewer.view.imageViewer.BaseImageViewerPresenter
import com.example.gmasalskikh.imageviewer.view.imageViewer.ImageViewerActivity
import com.example.gmasalskikh.imageviewer.view.imageViewer.ImageViewerFragment
import com.example.gmasalskikh.imageviewer.view.imageViewer.ImageViewerPresenter
import org.koin.dsl.module.applicationContext

val image_viewer_module = applicationContext {
    context(DIContext.IMAGE_VIEWER.name) {
        bean { ImageViewerPresenter() as BaseImageViewerPresenter }
        factory { ImageViewerFragment() }
    }
}
