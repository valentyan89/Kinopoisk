package com.example.kinoposik.data.model

import kotlinx.serialization.Serializable

@Serializable
data class PosterDto(
    val url: String? = null,
    val previewUrl: String? = null
)
