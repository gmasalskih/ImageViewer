package com.example.gmasalskikh.imageviewer.view.imageViewer

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import com.example.gmasalskikh.imageviewer.R
import com.example.gmasalskikh.imageviewer.di.IMAGE_VIEWER
import com.squareup.picasso.Picasso
import org.koin.android.ext.android.inject

class ImageViewerFragment: Fragment(), BaseImageViewer.View {

    override val presenter: BaseImageViewer.Presenter by inject { mapOf(IMAGE_VIEWER to this) }

    override fun showError(err: String) {
        Toast.makeText(activity, err, Toast.LENGTH_SHORT).show()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view =  inflater.inflate(R.layout.fragment_image_viewer, container, false)
        Picasso.get()
                .load(presenter.getLastItem().urlOfBigSizeImg)
                .placeholder(R.drawable.ic_photo)
                .error(R.drawable.ic_very_dissatisfied)
                .into(view.findViewById<ImageView>(R.id.imageViewer))
        return view
    }
}