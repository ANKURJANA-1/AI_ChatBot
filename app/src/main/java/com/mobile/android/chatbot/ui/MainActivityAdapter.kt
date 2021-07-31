package com.mobile.android.chatbot.ui

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mobile.android.chatbot.model.ChatModel

class MainActivityAdapter(val context: Context,
                          val list:ArrayList<ChatModel>):RecyclerView.Adapter<MainActivityAdapter.MyViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}