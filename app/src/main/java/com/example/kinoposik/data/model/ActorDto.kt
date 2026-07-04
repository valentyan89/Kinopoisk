package com.example.kinoposik.data.model

import kotlinx.serialization.Serializable

@Serializable
data class ActorDto(
    val id: Int,
    val name: String,
    val photo: String
)