package com.esosaphilip.pokemon.ui.presentation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.esosaphilip.pokemon.R
import com.esosaphilip.pokemon.components.HeadImage
import com.esosaphilip.pokemon.components.PokemonCardItem


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CarouselScreen (pokemonViewModel: PokemonViewModel) {

    val pokemonList by pokemonViewModel.pokes.collectAsState()

    val pagerState = rememberPagerState (
        initialPage = 0,
        initialPageOffsetFraction = 0f,
        pageCount = { pokemonList.size }
    )

    HeadImage(painter = painterResource(R.drawable.mycropped))
    Spacer(modifier = Modifier.padding(15.dp))
    HorizontalPager(
        state = pagerState,
        modifier = Modifier.fillMaxSize()
    ) { page ->

        PokemonCardItem(pokemon = pokemonList[page])
    }
}
