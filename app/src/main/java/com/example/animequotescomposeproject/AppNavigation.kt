package com.example.animequotescomposeproject

import androidx.compose.animation.*
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph

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

}

@ExperimentalAnimationApi
private fun AnimatedContentScope<*>.defaultEnterTransition(
    initial: NavBackStackEntry,
    target: NavBackStackEntry
): EnterTransition {
    val initialNavGraph = initial.destination.hostNavGraph
    val targetNavGraph = target.destination.hostNavGraph

    if (initialNavGraph.id != targetNavGraph.id) {
        return fadeIn()
    }

    return fadeIn() + slideIntoContainer(AnimatedContentScope.SlideDirection.Start)
}

@ExperimentalAnimationApi
private fun AnimatedContentScope<*>.defaultExitTransition(
    initial: NavBackStackEntry,
    target: NavBackStackEntry
): ExitTransition {
    val initialNavGraph = initial.destination.hostNavGraph
    val targetNavGraph = target.destination.hostNavGraph

    if (initialNavGraph.id != targetNavGraph.id) {
        return fadeOut()
    }

    return fadeOut() + slideOutOfContainer(AnimatedContentScope.SlideDirection.Start)
}

private val NavDestination.hostNavGraph: NavGraph
    get() = hierarchy.first { it is NavGraph } as NavGraph

@ExperimentalAnimationApi
private fun AnimatedContentScope<*>.defaultPopEnterTransition(): EnterTransition {
    return fadeIn() + slideIntoContainer(AnimatedContentScope.SlideDirection.End)
}

@ExperimentalAnimationApi
private fun AnimatedContentScope<*>.defaultPopExitTransition(): ExitTransition {
    return fadeOut() + slideOutOfContainer(AnimatedContentScope.SlideDirection.End)
}

