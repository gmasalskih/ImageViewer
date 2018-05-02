package com.example.gmasalskikh.imageviewer.di

import com.example.gmasalskikh.imageviewer.view.imageScroller.BaseImageScrollerPresenter
import com.example.gmasalskikh.imageviewer.view.imageScroller.ImageScrollerActivity
import com.example.gmasalskikh.imageviewer.view.imageScroller.ImageScrollerFragment
import com.example.gmasalskikh.imageviewer.view.imageScroller.ImageScrollerPresenter
import org.koin.dsl.module.applicationContext


val image_scroller_module = applicationContext {
    context(ImageScrollerActivity::class.java.simpleName) {
        factory { ImageScrollerFragment() }
        bean { ImageScrollerPresenter() as BaseImageScrollerPresenter }
    }
}