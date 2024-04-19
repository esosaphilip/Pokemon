package com.esosaphilip.pokemon.domain

import com.esosaphilip.pokemon.data.Pokemon

class Repository (private val apiClient: ApiService) {

     suspend fun  getPokemons(): List<Pokemon> {
         return apiClient.getPokemons()
     }
 }