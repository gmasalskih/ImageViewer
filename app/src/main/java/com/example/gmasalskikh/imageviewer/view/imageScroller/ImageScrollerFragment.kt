package com.example.gmasalskikh.imageviewer.view.imageScroller

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gmasalskikh.imageviewer.R
import com.example.gmasalskikh.imageviewer.data.db
import kotlinx.android.synthetic.main.item_image_scroller.view.*
import kotlinx.android.synthetic.main.recycler_view_image_scroller.view.*


class ImageScrollerFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.recycler_view_image_scroller, container, false)
        view.recycler_view_image_scroller_container.layoutManager = GridLayoutManager(activity, 2)
        view.recycler_view_image_scroller_container.adapter = Adapter()


        return view
    }

    private inner class Adapter : RecyclerView.Adapter<Holder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
            return Holder(LayoutInflater.from(activity), parent)
        }


        override fun onBindViewHolder(holder: Holder, position: Int) {
            holder.bind(position)
        }

        override fun getItemCount(): Int {
            return db.size
        }

    }

    private inner class Holder(inflater: LayoutInflater, parent: ViewGroup)
        : RecyclerView.ViewHolder(inflater.inflate(R.layout.item_image_scroller, parent, false)) {

        fun bind(position: Int) {
            itemView.item_text.text = db[position].toString()
        }

    }

}