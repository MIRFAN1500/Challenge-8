package com.irfan.challenge7.data.source.local.entity.unsplash

import androidx.room.Embedded

data class UserEntity(
    @Embedded
    val userLinks: UserLinksEntity,
    val username: String
)
