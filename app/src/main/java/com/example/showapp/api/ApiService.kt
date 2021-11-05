package com.example.showapp.api

import com.example.showapp.helper.Constants
import com.example.showapp.models.ShowResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET(Constants.END_POINT)
    suspend fun getShows():Response<ShowResponse>
}