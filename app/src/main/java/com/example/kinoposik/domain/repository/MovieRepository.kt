package com.example.kinoposik.domain.repository

import com.example.kinoposik.domain.model.Movie
import com.example.kinoposik.domain.model.Season
import com.example.kinoposik.domain.model.Actor
import kotlinx.coroutines.flow.Flow
import androidx.paging.PagingData

interface MovieRepository {
    fun getMoviesPaged(genre: String?, year: String?, isSeries: Boolean?): Flow<PagingData<Movie>>

    fun searchMoviesPaged(query: String): Flow<PagingData<Movie>>

    fun getMovieById(movieId: Int): Flow<Movie?>

    suspend fun refreshMovieDetails(movieId: Int)

    fun getSeasonsWithEpisodes(movieId: Int): Flow<List<Season>>

    suspend fun refreshSeasons(movieId: Int)

    fun getSearchHistory(): Flow<List<String>>
    suspend fun addSearchQuery(query: String)
}