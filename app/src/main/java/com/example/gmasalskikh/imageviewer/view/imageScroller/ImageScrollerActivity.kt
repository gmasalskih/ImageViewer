package com.example.gmasalskikh.imageviewer.view.imageScroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.gmasalskikh.imageviewer.R

class ImageScrollerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_scroller)

        if (supportFragmentManager.findFragmentById(R.id.image_scroller_container) == null){
            supportFragmentManager
                    .beginTransaction()
                    .add(R.id.image_scroller_container, ImageScrollerFragment())
                    .commit()

        }

    }
}
