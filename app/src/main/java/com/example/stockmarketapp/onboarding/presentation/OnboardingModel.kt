package com.example.stockmarketapp.onboarding.presentation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class OnboardingModel(
    @DrawableRes val imageRes: Int,
    @StringRes val titleRes: Int,
    @StringRes val descriptionRes: Int
){
    val onBoardPages = listOf("Placeholder")

}