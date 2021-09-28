package com.example.model.network

import com.google.gson.annotations.SerializedName

data class QuoteResponse(
    @SerializedName("anime")
    val anime: String,
    @SerializedName("character")
    val character: String,
    @SerializedName("quote")
    val quote: String
)