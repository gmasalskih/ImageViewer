package com.example.gmasalskikh.imageviewer.view.imageScroller

import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import com.example.gmasalskikh.imageviewer.R
import com.example.gmasalskikh.imageviewer.data.ItemProvider
import kotlinx.android.synthetic.main.item_image_scroller.view.*
import org.koin.android.ext.android.inject

class ImageScrollerFragment : BaseImageScrollerFragment() {

    private val spanCount = 2

    override val itemProvider: ItemProvider by inject()
    override val layoutItem: Int = R.layout.item_image_scroller
    override val layoutManager: RecyclerView.LayoutManager = GridLayoutManager(activity, spanCount)
    override fun bind(position: Int, itemView: View) {
        itemView.item_text.text = itemProvider.getItem(position).toString()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}