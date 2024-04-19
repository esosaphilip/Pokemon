package com.esosaphilip.pokemon.domain

import com.esosaphilip.pokemon.data.Pokemon


interface Repository {
    suspend fun getPokemons(): List<Pokemon>
}


class PokemonRepository (private val apiClient: ApiService): Repository {

     override suspend fun  getPokemons(): List<Pokemon> {
         return apiClient.getPokemons()
     }
 }