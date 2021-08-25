package com.example.myapplication

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainAdapter(val homeFeed: HomeFeed) : RecyclerView.Adapter<MainAdapter.CustomViewHolder>(){

    val videoList = listOf("One","Two","Three")

    class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView : TextView

        init {
            textView = view.findViewById(R.id.textView)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.video_row,parent,false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {

            val video = homeFeed.videos.get(position)
            holder.textView.text = video.name
    }

    override fun getItemCount(): Int {
        return homeFeed.videos.count()
    }

}