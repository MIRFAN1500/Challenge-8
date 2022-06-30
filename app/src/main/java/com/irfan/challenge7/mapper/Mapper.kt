package com.irfan.challenge7.mapper

import com.irfan.challenge7.data.source.local.entity.unsplash.UnsplashImageEntity
import com.irfan.challenge7.data.source.local.entity.unsplash.UrlsEntity
import com.irfan.challenge7.data.source.local.entity.unsplash.UserEntity
import com.irfan.challenge7.data.source.local.entity.unsplash.UserLinksEntity
import com.irfan.challenge7.data.source.remote.response.UnsplashImageResponse
import com.irfan.challenge7.data.source.remote.response.photodetail.UnsplashImageDetailResponse
import com.irfan.challenge7.domain.model.UnsplashImage
import com.irfan.challenge7.domain.model.Urls
import com.irfan.challenge7.domain.model.User
import com.irfan.challenge7.domain.model.UserLinks
import com.irfan.challenge7.domain.model.photodetail.Exif
import com.irfan.challenge7.domain.model.photodetail.UnsplashImageDetail

object Mapper {

    fun List<UnsplashImageResponse>.mapUnsplashImageResponsesToEntity(): List<UnsplashImageEntity> {
        val imageList = ArrayList<UnsplashImageEntity>()
        this.map {
            val urls = UrlsEntity(
                it.urls.regular
            )
            val userLinks = UserLinksEntity(
                it.user.username
            )
            val user = UserEntity(
                userLinks,
                it.user.username
            )
            val image = UnsplashImageEntity(
                it.id,
                urls,
                it.likes,
                user
            )
            imageList.add(image)
        }
        return imageList
    }

    fun List<UnsplashImageResponse>.mapUnsplashImageResponsesToDomain(): List<UnsplashImage> {
        val imageList = ArrayList<UnsplashImage>()
        this.map {
            val urls = Urls(
                it.urls.regular
            )
            val userLinks = UserLinks(
                it.user.username
            )
            val user = User(
                userLinks,
                it.user.username
            )
            val image = UnsplashImage(
                it.id,
                urls,
                it.likes,
                user
            )
            imageList.add(image)
        }
        return imageList
    }

    fun UnsplashImageEntity.mapUnsplashImageEntityToDomain(): UnsplashImage {
            val urls = Urls(
                this.urls.regular
            )
            val userLinks = UserLinks(
                this.user.username
            )
            val user = User(
                userLinks,
                this.user.username
            )
            return UnsplashImage(
                this.id,
                urls,
                this.likes,
                user
            )
    }

    fun UnsplashImageDetailResponse.mapUnsplashImageDetailResponseToDomain(): UnsplashImageDetail {
        val urls = Urls(
            this.urls.regular
        )
        val userLinks = UserLinks(
            this.user.username
        )
        val user = User(
            userLinks,
            this.user.username
        )
        val exif = Exif(
            this.exif.make,
            this.exif.model,
            this.exif.name,
        )
        return UnsplashImageDetail(
            this.id,
            this.description,
            urls,
            user,
            exif
        )
    }
}