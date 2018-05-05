package com.example.gmasalskikh.imageviewer.view.imageScroller

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gmasalskikh.imageviewer.R
import com.example.gmasalskikh.imageviewer.data.Item
import com.example.gmasalskikh.imageviewer.view.imageViewer.ImageViewerActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import kotlinx.android.synthetic.main.item_image_scroller.view.*
import kotlinx.android.synthetic.main.recycler_view_image_scroller.view.*
import org.koin.android.ext.android.inject

class ImageScrollerFragment : Fragment() {

    private val presenter: BaseImageScrollerPresenter by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.recycler_view_image_scroller, container, false)
        view.recycler_view_image_scroller_container.layoutManager = GridLayoutManager(activity, 2)
        view.recycler_view_image_scroller_container.adapter = Adapter()
        return view
    }

    private inner class Adapter : RecyclerView.Adapter<ImageScrollerFragment.Holder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
            return Holder(LayoutInflater.from(parent.context).inflate(R.layout.item_image_scroller, parent, false))
        }

        override fun getItemCount(): Int {
            presenter.getItemProvider().dao.getItems()
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe({

                    },{

                    },{
                        udate()
                    })
            return presenter.getItemProvider().countItems()
        }

        fun udate(){
            notifyDataSetChanged()
        }

        override fun onBindViewHolder(holder: Holder, position: Int) {
            holder.bind(presenter.getItemProvider().getItem(position))
        }
    }

    private inner class Holder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(item: Item) {
            itemView.item_text.text = item.toString()
            itemView.setOnClickListener {
                startActivity(Intent(activity, ImageViewerActivity::class.java))
                presenter.setLastItem(item)
            }
        }
    }
}