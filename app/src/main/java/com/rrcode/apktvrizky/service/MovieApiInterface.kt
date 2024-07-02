package com.rrcode.apktvrizky.service

import com.rrcode.apktvrizky.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=fabe3ced20c9a89ec53de629139ce5c8")
    fun getMovieList(): Call<MovieResponse>

}