package com.example.gmasalskikh.imageviewer.view.imageViewer

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.gmasalskikh.imageviewer.R
import org.koin.android.ext.android.inject

class ImageViewerFragment: Fragment() {

    private val presenter: BaseImageViewerPresenter by inject()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view =  inflater.inflate(R.layout.fragment_image_viewer, container, false)
        view.findViewById<TextView>(R.id.text_view).text = presenter.getItem().toString()
        return view
    }
}