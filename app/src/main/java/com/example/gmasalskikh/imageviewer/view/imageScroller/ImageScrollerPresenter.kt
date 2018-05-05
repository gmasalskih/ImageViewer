package com.example.gmasalskikh.imageviewer.view.imageScroller

import android.support.v4.app.Fragment
import android.widget.Adapter
import com.example.gmasalskikh.imageviewer.data.Item
import com.example.gmasalskikh.imageviewer.data.ItemProvider
import org.koin.standalone.inject

class ImageScrollerPresenter : BaseImageScrollerPresenter {

    private val provider: ItemProvider by inject()

    override fun getItemProvider(): ItemProvider {
        return provider
    }

    override fun setLastItem(item: Item) {
        provider.lastItem = item
    }

}