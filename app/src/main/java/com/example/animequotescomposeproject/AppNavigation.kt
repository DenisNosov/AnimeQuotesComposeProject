package com.example.animequotescomposeproject

import androidx.compose.animation.*

internal sealed class Screen(val route: String) {
    object AnimeList : Screen("anime_list")
    object SearchByPerson : Screen("search_by_person")
    object RandomQuote : Screen("random_quote")
}

private sealed class LeafScreen(
    private val route: String
) {
    fun createRoute(root: Screen) = "${root.route}/$route"

    object AnimeList : LeafScreen("anime_list")
    object SearchByPerson : LeafScreen("search_by_person")
    object RandomQuote : LeafScreen("random_quote")

    object QuotesByAnime : LeafScreen("quotes_by_anime/{animeTitle}") {
        fun createRoute(root: Screen, animeTitle: String) =
            "${root.route}/quotes_by_anime/$animeTitle"
    }

    object QuotesByPerson : LeafScreen("quotes_by_person/{personName}") {
        fun createRoute(root: Screen, personName: String) =
            "${root.route}/quotes_by_person/$personName"
    }
}

@ExperimentalAnimationApi
private fun AnimatedContentScope<*>.defaultPopEnterTransition(): EnterTransition {
    return fadeIn() + slideIntoContainer(AnimatedContentScope.SlideDirection.End)
}

@ExperimentalAnimationApi
private fun AnimatedContentScope<*>.defaultPopExitTransition(): ExitTransition {
    return fadeOut() + slideOutOfContainer(AnimatedContentScope.SlideDirection.End)
}

