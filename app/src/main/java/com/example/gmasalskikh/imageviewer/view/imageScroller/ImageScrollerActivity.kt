package com.example.gmasalskikh.imageviewer.view.imageScroller

import android.os.Bundle
import com.example.gmasalskikh.imageviewer.R
import com.example.gmasalskikh.imageviewer.di.IMAGE_SCROLLER
import com.example.gmasalskikh.imageviewer.view.BaseActivity
import org.koin.android.ext.android.inject

class ImageScrollerActivity : BaseActivity() {

    override val context = IMAGE_SCROLLER
    private val imageScrollerFragment: ImageScrollerFragment by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_scroller)
        setFragment(R.id.image_scroller_container, imageScrollerFragment)
    }
}