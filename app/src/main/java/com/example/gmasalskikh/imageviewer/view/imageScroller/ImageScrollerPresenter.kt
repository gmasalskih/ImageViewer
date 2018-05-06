package com.example.gmasalskikh.imageviewer.view.imageScroller

import com.example.gmasalskikh.imageviewer.data.Item
import com.example.gmasalskikh.imageviewer.data.ItemProvider
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import org.koin.standalone.inject

class ImageScrollerPresenter(override val view: BaseImageScroller.View) : BaseImageScroller.Presenter {

    private val provider: ItemProvider by inject()
    private val compositeDisposable = CompositeDisposable()

    override fun init() {
        val subscription = provider.getItemList()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    view.setListItem(it)
                }, {
                    view.showError(it.message.toString())
                }, {
                    view.updateUI()
                })
        compositeDisposable.add(subscription)
    }

    override fun clickToItem(item: Item) {
        provider.lastItem = item
    }

    override fun stop() {
        compositeDisposable.clear()
    }
}