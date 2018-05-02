package com.example.gmasalskikh.imageviewer.view.imageScroller

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.gmasalskikh.imageviewer.R
import com.example.gmasalskikh.imageviewer.view.BaseActivity
import org.koin.android.ext.android.inject
import org.koin.android.ext.android.releaseContext

class ImageScrollerActivity : BaseActivity() {

    private val imageScrollerFragment: ImageScrollerFragment by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_scroller)
        setFragment(R.id.image_scroller_container, imageScrollerFragment)
    }

}
