package com.example.kinoposik.domain.model

data class Rating(
    val kp: Float,
    val imdb: Float? = null,
    val tmdb: Float? = null,
    val filmCritics: Float? = null,
    val russianFilmCritics: Float? = null,
    val await: Float? = null
)
