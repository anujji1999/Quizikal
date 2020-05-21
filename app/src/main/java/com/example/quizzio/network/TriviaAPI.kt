package com.example.quizzio.network

import com.example.quizzio.views.ui.TriviaUI
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface TriviaAPI {
        @GET("trivia")
    fun getTriviaFromNetwork(@Query("category") type: String):
            Call<List<TriviaUI>>

    
}