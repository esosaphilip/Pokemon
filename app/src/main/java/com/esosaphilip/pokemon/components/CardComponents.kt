package com.esosaphilip.pokemon.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.esosaphilip.pokemon.data.Pokemon

@Composable
fun PokemonCardItem(pokemon: Pokemon) {
    Card(
        modifier = Modifier
            .height(120.dp)
            .width(100.dp)
            .padding(5.dp),
        shape = CardDefaults.elevatedShape,
        elevation = CardDefaults.cardElevation(
            defaultElevation = 8.dp
        )

    ){
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
           ImagePokemon(pokemonImageUrl = pokemon.imageUrl  ,
               modifier = Modifier
               .size(80.dp)
               .padding(4.dp) )
           PokemonName(name = pokemon.name )
        }
    }
}