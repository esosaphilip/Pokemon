package com.esosaphilip.pokemon.data

data class PokemonImage(
    val count: Int,
    val next: String,
    val previous: Any,
    val pokemons: List<Pokemon>
)