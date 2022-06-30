package com.irfan.challenge7.domain.model

data class UnsplashImage(
    val id: String,
    val urls: Urls,
    val likes: Int,
    val user: User
)
