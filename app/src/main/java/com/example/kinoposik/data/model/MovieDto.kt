package com.example.kinoposik.data.model

import kotlinx.serialization.Serializable

@Serializable
data class MovieDto(
    val id: Int,
    val name: String? = null,
    val alternativeName: String? = null,
    val year: Int? = null,
    val description: String? = null,
    val shortDescription: String? = null,
    val poster: PosterDto? = null,
    val rating: RatingDto? = null,
    val genres: List<GenreDto>? = null,
    val countries: List<CountryDto>? = null,
    val isSeries: Boolean? = false
)