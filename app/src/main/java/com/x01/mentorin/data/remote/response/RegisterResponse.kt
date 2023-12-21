package com.x01.mentorin.data.remote.response

import com.google.gson.annotations.SerializedName

data class RegisterResponse(

	@field:SerializedName("data")
	val data: Data? = null,

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("errors")
	val errors: Any? = null
)

data class Data(

	@field:SerializedName("study")
	val study: String? = null,

	@field:SerializedName("role")
	val role: String? = null,

	@field:SerializedName("expireTime")
	val expireTime: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("userId")
	val userId: String? = null,

	@field:SerializedName("email")
	val email: String? = null
)
