package com.example.gmasalskikh.imageviewer.di

import com.example.gmasalskikh.imageviewer.view.imageScroller.BaseImageScroller
import com.example.gmasalskikh.imageviewer.view.imageScroller.ImageScrollerFragment
import com.example.gmasalskikh.imageviewer.view.imageScroller.ImageScrollerPresenter
import org.koin.dsl.module.applicationContext


val image_scroller_module = applicationContext {
    context(DIContext.IMAGE_SCROLLER.name) {
        factory { ImageScrollerFragment() }
        bean { ImageScrollerPresenter(it[DIContext.IMAGE_SCROLLER.name]) as BaseImageScroller.Presenter }
    }
}