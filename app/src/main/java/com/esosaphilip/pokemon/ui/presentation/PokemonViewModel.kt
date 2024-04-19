package com.esosaphilip.pokemon.ui.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.esosaphilip.pokemon.data.Pokemon
import com.esosaphilip.pokemon.domain.PokemonRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class PokemonViewModel (private val  repository: PokemonRepository) : ViewModel() {

    private val _pokes = MutableStateFlow<List<Pokemon>>(emptyList())
    val pokes: StateFlow<List<Pokemon>> = _pokes

    init {
        catchPokemon()
    }

    private fun catchPokemon() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val caughtPokemon = repository.getPokemons()
                _pokes.emit(caughtPokemon)
            } catch (e: Exception) {
                e.printStackTrace()
            }


        }
    }

}