package com.example.gmasalskikh.imageviewer.data.web.yandex.fotki.top.pojo

import com.google.gson.annotations.SerializedName

data class Img(

	@field:SerializedName("XXS")
	val xXS: XXS? = null,

	@field:SerializedName("XXXS")
	val xXXS: XXXS? = null,

	@field:SerializedName("S")
	val S: S? = null,

	@field:SerializedName("XL")
	val xL: XL? = null,

	@field:SerializedName("orig")
	val orig: Orig? = null,

	@field:SerializedName("XS")
	val xS: XS? = null,

	@field:SerializedName("L")
	val L: L? = null,

	@field:SerializedName("M")
	val M: M? = null,

	@field:SerializedName("XXXL")
	val xXXL: XXXL? = null,

	@field:SerializedName("XXL")
	val xXL: XXL? = null
)