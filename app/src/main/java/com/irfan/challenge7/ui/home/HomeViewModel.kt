package com.irfan.challenge7.ui.home

import androidx.lifecycle.ViewModel
import com.irfan.challenge7.domain.usecase.GetImagesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    getImagesUseCase: GetImagesUseCase
) : ViewModel() {

    val getImages = getImagesUseCase.invoke()
}