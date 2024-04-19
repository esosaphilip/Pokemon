package com.esosaphilip.pokemon.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.esosaphilip.pokemon.data.Pokemon

@Composable
fun PokemonName(pokemon: Pokemon) {
    Text(text = pokemon.name, contentDescription = null)
}