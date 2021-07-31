package com.mobile.android.chatbot.network

import com.mobile.android.chatbot.core.KeywordsAndConstance
import com.mobile.android.chatbot.model.Message
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitService {

    @GET("/get")
    fun getBotMessage(@Query("bid") bid:String,
                      @Query("key") key:String,
                      @Query("uid") uid:String,
                      @Query("msg") msg:String?): Call<Message>



    companion object {

        var retrofitService: RetrofitService? = null

        fun getInstance() : RetrofitService {

            if (retrofitService == null) {
                val retrofit = Retrofit.Builder()
                    .baseUrl(KeywordsAndConstance.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                retrofitService = retrofit.create(RetrofitService::class.java)
            }
            return retrofitService!!
        }
    }
}