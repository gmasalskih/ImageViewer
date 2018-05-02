package com.example.gmasalskikh.imageviewer.data


object EntityItemProvider : ItemProvider {

    override lateinit var lastItem: Item

    private val listItems: List<Item> = (1..100).toList()
            .map {
                EntityItem(it)
            }.toList()

    override fun getItem(index: Int): Item {
        return listItems[index]
    }

    override fun countItems(): Int {
        return listItems.count()
    }
}