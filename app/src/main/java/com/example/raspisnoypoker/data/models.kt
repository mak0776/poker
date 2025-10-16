package com.example.raspisnoypoker.data

import kotlinx.serialization.Serializable

@Serializable
data class Card(val suit: String = "", val rank: Int = 0)

@Serializable
data class Player(
    val uid: String = "",
    val name: String = "",
    var hand: List<Card> = listOf(),
    var order: Int? = null,
    var tricksTaken: Int = 0,
    var score: Int = 0
)
