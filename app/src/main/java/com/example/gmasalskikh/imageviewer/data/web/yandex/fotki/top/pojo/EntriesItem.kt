package com.example.gmasalskikh.imageviewer.data.web.yandex.fotki.top.pojo

import com.google.gson.annotations.SerializedName

data class EntriesItem(

	@field:SerializedName("img")
	val img: Img? = null,

	@field:SerializedName("access")
	val access: String? = null,

	@field:SerializedName("edited")
	val edited: String? = null,

	@field:SerializedName("created")
	val created: String? = null,

	@field:SerializedName("hideOriginal")
	val hideOriginal: Boolean? = null,

	@field:SerializedName("author")
	val author: String? = null,

	@field:SerializedName("published")
	val published: String? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("disableComments")
	val disableComments: Boolean? = null,

	@field:SerializedName("tags")
	val tags: Tags? = null,

	@field:SerializedName("xxx")
	val xxx: Boolean? = null,

	@field:SerializedName("links")
	val links: Links? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("updated")
	val updated: String? = null,

	@field:SerializedName("authors")
	val authors: List<AuthorsItem?>? = null
)