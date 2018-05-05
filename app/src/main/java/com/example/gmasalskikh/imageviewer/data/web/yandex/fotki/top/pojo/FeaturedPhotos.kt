package com.example.gmasalskikh.imageviewer.data.web.yandex.fotki.top.pojo

import com.google.gson.annotations.SerializedName

data class FeaturedPhotos(

        @field:SerializedName("entries")
	val entries: List<EntriesItem?>? = null,

        @field:SerializedName("links")
	val links: Links? = null,

        @field:SerializedName("id")
	val id: String? = null,

        @field:SerializedName("title")
	val title: String? = null,

        @field:SerializedName("updated")
	val updated: String? = null
)