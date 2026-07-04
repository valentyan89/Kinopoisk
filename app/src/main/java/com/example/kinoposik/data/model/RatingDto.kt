package com.example.kinoposik.data.model

import kotlinx.serialization.Serializable

@Serializable
data class RatingDto(
    val kp: Float,
    val imdb: Float? = null,
    val tmdb: Float? = null,
    val filmCritics: Float? = null,
    val russianFilmCritics: Float? = null,
    val await: Float? = null
)
