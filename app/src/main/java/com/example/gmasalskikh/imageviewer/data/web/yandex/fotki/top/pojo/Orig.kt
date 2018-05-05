package com.example.gmasalskikh.imageviewer.data.web.yandex.fotki.top.pojo

import com.google.gson.annotations.SerializedName

data class Orig(

	@field:SerializedName("bytesize")
	val bytesize: Int? = null,

	@field:SerializedName("width")
	val width: Int? = null,

	@field:SerializedName("href")
	val href: String? = null,

	@field:SerializedName("height")
	val height: Int? = null
)