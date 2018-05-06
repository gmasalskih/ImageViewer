package com.example.gmasalskikh.imageviewer.view.imageViewer

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import com.example.gmasalskikh.imageviewer.R
import com.example.gmasalskikh.imageviewer.di.DIContext
import com.squareup.picasso.Picasso
import org.koin.android.ext.android.inject

class ImageViewerFragment: Fragment(), BaseImageViewer.View {

    override val presenter: BaseImageViewer.Presenter by inject { mapOf(DIContext.IMAGE_VIEWER.name to this) }

    override fun showLoading() {
        TODO("not implemented")
    }

    override fun hideLoading() {
        TODO("not implemented")
    }

    override fun showError(err: String) {
        Toast.makeText(activity, err, Toast.LENGTH_SHORT).show()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view =  inflater.inflate(R.layout.fragment_image_viewer, container, false)
        val iv = view.findViewById<ImageView>(R.id.imageViewer)
        Picasso.get().load(presenter.getLastItem().urlMax).into(iv)
        return view
    }

    override fun onStop() {
        super.onStop()
        presenter.stop()
    }
}