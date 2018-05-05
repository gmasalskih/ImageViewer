package com.example.gmasalskikh.imageviewer.data.web.yandex.fotki.top.pojo

import com.google.gson.annotations.SerializedName

data class Links(

	@field:SerializedName("edit")
	val edit: String? = null,

	@field:SerializedName("album")
	val album: String? = null,

	@field:SerializedName("editMedia")
	val editMedia: String? = null,

	@field:SerializedName("self")
	val self: String? = null,

	@field:SerializedName("alternate")
	val alternate: String? = null
)