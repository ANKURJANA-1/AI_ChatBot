package com.mobile.android.chatbot.repository

import android.content.Context
import com.mobile.android.chatbot.core.KeywordsAndConstance
import com.mobile.android.chatbot.network.RetrofitService

class Repository(
    private val context: Context,
    private val message:String,
    private val retrofitService: RetrofitService):MainRepository {

    override fun getBotMessage()=retrofitService.getBotMessage(
                                                KeywordsAndConstance.BID,
                                                KeywordsAndConstance.API_KEY,
                                                KeywordsAndConstance.UID,
                                                message
                                            )


}