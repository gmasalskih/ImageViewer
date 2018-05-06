package com.example.gmasalskikh.imageviewer.di

import com.example.gmasalskikh.imageviewer.view.imageScroller.BaseImageScroller
import com.example.gmasalskikh.imageviewer.view.imageScroller.ImageScrollerFragment
import com.example.gmasalskikh.imageviewer.view.imageScroller.ImageScrollerPresenter
import org.koin.dsl.module.applicationContext

const val IMAGE_SCROLLER = "IMAGE_SCROLLER"

val image_scroller_module = applicationContext {
    context(IMAGE_SCROLLER) {
        factory { ImageScrollerFragment() }
        bean { ImageScrollerPresenter(it[IMAGE_SCROLLER]) as BaseImageScroller.Presenter }
    }
}