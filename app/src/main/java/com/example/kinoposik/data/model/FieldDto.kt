package com.example.kinoposik.data.model

import kotlinx.serialization.Serializable

@Serializable
data class FieldDto(
    val name: String,
    val slug: String
)
