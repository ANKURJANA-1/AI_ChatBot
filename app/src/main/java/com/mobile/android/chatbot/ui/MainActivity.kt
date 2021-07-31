package com.mobile.android.chatbot.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.mobile.android.chatbot.R
import com.mobile.android.chatbot.core.KeywordsAndConstance
import com.mobile.android.chatbot.model.ChatModel

class MainActivity : AppCompatActivity() {
    lateinit var chatList:ArrayList<ChatModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list=findViewById<RecyclerView>(R.id.list)
        chatList=ArrayList()

    }
}