package com.example.showapp.repository

import com.example.showapp.api.ApiService
import javax.inject.Inject

class ShowRepository
@Inject
constructor(private val apiService: ApiService) {
    suspend fun getShows() = apiService.getShows()
}