package com.esosaphilip.pokemon.domain

import com.esosaphilip.pokemon.constant.utils.BASE_URL
import com.esosaphilip.pokemon.data.Pokemon
import io.ktor.client.HttpClient
import io.ktor.client.engine.android.Android
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json


class ApiService {

    private val httpClient = HttpClient(Android){
        install(ContentNegotiation){
          json(Json {
              ignoreUnknownKeys = true
          })
        }
    }

    suspend fun getPokemons(): List<Pokemon> {
        val response = httpClient.get(BASE_URL).bodyAsText()

        return Json.decodeFromString(response)
    }

}
