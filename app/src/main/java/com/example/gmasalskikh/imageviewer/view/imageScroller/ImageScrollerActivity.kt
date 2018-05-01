package com.example.gmasalskikh.imageviewer.view.imageScroller

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.gmasalskikh.imageviewer.R
import org.koin.android.ext.android.inject
import org.koin.android.ext.android.releaseContext

class ImageScrollerActivity : AppCompatActivity() {

    private val contextName = this.javaClass.simpleName
    private val presenter: BaseImageScrollerFragment by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_scroller)
        if (supportFragmentManager.findFragmentById(R.id.image_scroller_container) == null){
            supportFragmentManager
                    .beginTransaction()
                    .add(R.id.image_scroller_container, presenter)
                    .commit()

        }

    }

    @SuppressLint("MissingSuperCall")
    override fun onPause(){
        Log.d("aaa", contextName)
        releaseContext(contextName)
        super.onPause()
    }
}
