package com.example.gmasalskikh.imageviewer.view.imageScroller

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import com.example.gmasalskikh.imageviewer.R
import com.example.gmasalskikh.imageviewer.data.Item
import com.example.gmasalskikh.imageviewer.di.IMAGE_SCROLLER
import com.example.gmasalskikh.imageviewer.view.imageViewer.ImageViewerActivity
import com.squareup.picasso.Picasso
import org.koin.android.ext.android.inject
import java.util.ArrayList

class ImageScrollerFragment : Fragment(), BaseImageScroller.View {

    override val presenter: BaseImageScroller.Presenter by inject { mapOf(IMAGE_SCROLLER to this) }
    private val picasso: Picasso by inject()
    private val adapterRV = Adapter()
    private var itemList: List<Item> = ArrayList()

    override fun showError(err: String) {
        Toast.makeText(activity, err, Toast.LENGTH_LONG).show()
    }

    override fun setListItem(items: List<Item>) {
        itemList = items
    }

    override fun updateUI() {
        adapterRV.notifyDataSetChanged()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        presenter.init()
        return inflater.inflate(R.layout.recycler_view_image_scroller, container, false).apply {
            findViewById<RecyclerView>(R.id.recycler_view_image_scroller_container).apply {
                layoutManager = GridLayoutManager(activity, 2)
                adapter = adapterRV
            }
        }
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

    private inner class Holder(val view: View) : RecyclerView.ViewHolder(view) {
        fun bind(item: Item) {
            picasso.load(item.urlOfLittleSizeImg)
                    .placeholder(R.drawable.ic_photo)
                    .error(R.drawable.ic_very_dissatisfied)
                    .into(view.findViewById<ImageView>(R.id.itemImageView))
            view.findViewById<ImageView>(R.id.itemImageView).setOnClickListener {
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