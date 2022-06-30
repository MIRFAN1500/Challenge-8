package com.irfan.challenge7.data.source.remote.response

data class UnsplashImageResponse(
    val id: String,
    val urls: UrlsResponse,
    val likes: Int,
    val user: UserResponse
)
