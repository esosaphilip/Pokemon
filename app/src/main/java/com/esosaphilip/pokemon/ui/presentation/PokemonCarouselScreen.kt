package com.esosaphilip.pokemon.ui.presentation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.runtime.Composable

data class CarouselItem(
    @DrawableRes val imageResId: Int,
    @StringRes val name: Int
)
@Composable
fun CarouselScreen () {

}
