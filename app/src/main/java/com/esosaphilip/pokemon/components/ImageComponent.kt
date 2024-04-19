package com.esosaphilip.pokemon.components

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import coil.compose.AsyncImage
import coil.request.ImageRequest
import coil.size.Scale
import com.esosaphilip.pokemon.R
import com.esosaphilip.pokemon.data.Pokemon

@Composable
fun HeadImage(painter: Painter) {
    Image(painter = painterResource(R.drawable.mycropped), contentDescription = null)
}

@Composable
fun ImagePokemon(
   pokemon: List<Pokemon>,
   modifier: Modifier
) {
 AsyncImage(
     model =  ImageRequest.Builder(LocalContext.current)
         .scale(Scale.FILL).crossfade(true)
         .data(pokemon)
         .build(),
     contentDescription = "Image",
     contentScale = ContentScale.Crop,
     placeholder = painterResource(id = R.drawable.placeholderimage),
     error = painterResource(id = R.drawable.errorimage),
     modifier = modifier
 )
}