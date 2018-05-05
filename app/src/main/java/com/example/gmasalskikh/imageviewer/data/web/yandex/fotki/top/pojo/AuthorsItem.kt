package com.example.gmasalskikh.imageviewer.data.web.yandex.fotki.top.pojo

import com.google.gson.annotations.SerializedName

data class AuthorsItem(

	@field:SerializedName("uid")
	val uid: String? = null,

	@field:SerializedName("name")
	val name: String? = null
)