package com.esosaphilip.pokemon.components

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import coil.compose.AsyncImage
import coil.request.ImageRequest
import coil.size.Scale
import com.esosaphilip.pokemon.R

@Composable
fun HeadImage(painter: Painter) {
    Image(painter = painter, contentDescription = null)
}

@Composable
fun ImagePokemon(
   pokemonImageUrl: String,
) {
 AsyncImage(
     model =  ImageRequest.Builder(LocalContext.current)
         .scale(Scale.FILL).crossfade(true)
         .data(pokemonImageUrl)
         .build(),
     contentDescription = "Image",
     contentScale = ContentScale.Crop,
     placeholder = painterResource(id = R.drawable.placeholderimage),
     error = painterResource(id = R.drawable.errorimage),
 )
}