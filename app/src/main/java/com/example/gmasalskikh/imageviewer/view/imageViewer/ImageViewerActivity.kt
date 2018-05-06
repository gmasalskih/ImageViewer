package com.example.gmasalskikh.imageviewer.view.imageViewer

import android.os.Bundle
import com.example.gmasalskikh.imageviewer.R
import com.example.gmasalskikh.imageviewer.di.IMAGE_VIEWER
import com.example.gmasalskikh.imageviewer.view.BaseActivity
import org.koin.android.ext.android.inject

class ImageViewerActivity : BaseActivity() {

    override val context = IMAGE_VIEWER
    private val imageViewerFragment: ImageViewerFragment by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_viewer)
        setFragment(R.id.image_viewer_container, imageViewerFragment)
    }
}