package com.mobile.android.chatbot.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mobile.android.chatbot.core.KeywordsAndConstance
import com.mobile.android.chatbot.model.Message
import com.mobile.android.chatbot.repository.Repository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel(private val repository:Repository) : ViewModel() {

    val messageList = MutableLiveData<Message>()
    val errorMessage = MutableLiveData<String>()

    fun getMessage(){
        var response=repository.getBotMessage()
        response.enqueue(object : Callback<Message> {
            override fun onResponse(call: Call<Message>, response: Response<Message>) {
                messageList.postValue(response.body())
            }

            override fun onFailure(call: Call<Message>, t: Throwable) {
                errorMessage.postValue(t.message)
            }
        })
    }


}