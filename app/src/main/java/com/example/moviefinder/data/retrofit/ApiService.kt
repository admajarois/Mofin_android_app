package com.example.moviefinder.data.retrofit

import com.example.moviefinder.data.MovieItemResponse
import com.example.moviefinder.data.response.TvItemResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("movie/{path}")
    fun getMovies(
        @Path("path") path: String,
        @Query("api_key") apiKey: String
    ): Call<List<MovieItemResponse>>

    @GET("tv/{path}")
    fun getTvShows(
        @Path("path") path: String,
        @Query("api_key") apiKey: String,
    ): Call<List<TvItemResponse>>


}