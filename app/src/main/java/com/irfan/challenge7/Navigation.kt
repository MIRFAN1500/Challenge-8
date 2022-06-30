package com.irfan.challenge7

sealed class Screen(val route: String) {
    object Home: Screen("home")
    object Search: Screen("search")
    object Favorite: Screen("favorite")
    object PhotoDetail: Screen("photo_detail")
    object Login: Screen("login")
    object SignUp: Screen("sign_up")
}

const val PHOTO_DETAIL_KEY_ID_KEY = "photoId"