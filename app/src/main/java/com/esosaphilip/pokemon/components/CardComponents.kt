package com.esosaphilip.pokemon.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.esosaphilip.pokemon.data.Pokemon

@Composable
fun PokemonCardItem(pokemon: Pokemon) {
    Card(
        modifier = Modifier
            .height(60.dp)
            .width(50.dp)
            .padding(5.dp),
        shape = CardDefaults.elevatedShape,
        elevation = CardDefaults.cardElevation(
            defaultElevation = 30.dp
        )

    ){
        Column {
           ImagePokemon(pokemon = , modifier = )
           PokemonName(pokemon = ) 
        }
    }
}