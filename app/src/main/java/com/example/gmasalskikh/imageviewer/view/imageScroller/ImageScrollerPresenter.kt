package com.example.gmasalskikh.imageviewer.view.imageScroller

import com.example.gmasalskikh.imageviewer.data.Item
import com.example.gmasalskikh.imageviewer.data.ItemProvider
import io.reactivex.android.schedulers.AndroidSchedulers
import org.koin.standalone.inject

class ImageScrollerPresenter(override val view: BaseImageScroller.View) : BaseImageScroller.Presenter {


    private val provider: ItemProvider by inject()

    override fun init() {
        provider.getItemList()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    view.setListItem(it)
                },{

                },{
                    view.updateUI()
                })
    }

    override fun clickToItem(item: Item) {
        provider.lastItem = item
    }

    override fun stop() {
    }




}