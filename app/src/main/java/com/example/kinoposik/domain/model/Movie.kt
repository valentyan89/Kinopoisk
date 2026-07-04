package com.example.kinoposik.domain.model

import com.example.kinoposik.data.model.CountryDto
import com.example.kinoposik.data.model.GenreDto
import com.example.kinoposik.data.model.PosterDto
import com.example.kinoposik.data.model.RatingDto

data class Movie(
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
