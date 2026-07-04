package com.example.kinoposik.data.model

import kotlinx.serialization.Serializable

@Serializable
data class EpisodeDto(
    val number: Int?,
    val name: String?,
    val posterPreview: String?,
    val duration: Int?,
    val description: String?
)
