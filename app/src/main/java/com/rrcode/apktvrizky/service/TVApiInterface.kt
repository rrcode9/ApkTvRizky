package com.rrcode.apktvrizky.service

import com.rrcode.apktvrizky.model.TelevisionResponse
import retrofit2.Call
import retrofit2.http.GET

interface TVApiInterface {
    @GET("/3/tv/popular?api_key=fabe3ced20c9a89ec53de629139ce5c8")
    fun getTVList(): Call<TelevisionResponse>

}