package com.example.gmasalskikh.imageviewer.view.imageScroller

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.gmasalskikh.imageviewer.R
import com.example.gmasalskikh.imageviewer.data.Item
import com.example.gmasalskikh.imageviewer.di.DIContext
import com.example.gmasalskikh.imageviewer.view.imageViewer.ImageViewerActivity
import kotlinx.android.synthetic.main.item_image_scroller.view.*
import kotlinx.android.synthetic.main.recycler_view_image_scroller.view.*
import org.koin.android.ext.android.inject
import java.util.ArrayList

class ImageScrollerFragment : Fragment(), BaseImageScroller.View {


    override val presenter: BaseImageScroller.Presenter by inject { mapOf(DIContext.IMAGE_SCROLLER.name to this) }

    private val adapter = Adapter()
    private var itemList: List<Item> = ArrayList()

    override fun showLoading() {
        TODO("not implemented")
    }

    override fun hideLoading() {
        TODO("not implemented")
    }

    override fun showError(err: String) {
        Toast.makeText(activity, err, Toast.LENGTH_SHORT).show()
    }

    override fun setListItem(items: List<Item>) {
        itemList = items
    }

    override fun updateUI() {
        adapter.notifyDataSetChanged()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.recycler_view_image_scroller, container, false)
        view.recycler_view_image_scroller_container.layoutManager = GridLayoutManager(activity, 2)
        view.recycler_view_image_scroller_container.adapter = adapter
        presenter.init()
        return view
    }

    private inner class Adapter : RecyclerView.Adapter<ImageScrollerFragment.Holder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
            return Holder(LayoutInflater.from(parent.context).inflate(R.layout.item_image_scroller, parent, false))
        }

        override fun getItemCount(): Int {
            return itemList.size
        }

        override fun onBindViewHolder(holder: Holder, position: Int) {
            holder.bind(itemList[position])
        }
    }

    private inner class Holder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(item: Item) {
            itemView.item_text.text = item.toString()
            itemView.setOnClickListener {
                presenter.clickToItem(item)
                startActivity(Intent(activity, ImageViewerActivity::class.java))
            }
        }
    }

    override fun onStop() {
        presenter.stop()
        super.onStop()
    }
}