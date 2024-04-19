package com.esosaphilip.pokemon.data

import kotlinx.serialization.Serializable


@Serializable
data class Pokemon(
    val name: String,
    val imageUrl: String
)