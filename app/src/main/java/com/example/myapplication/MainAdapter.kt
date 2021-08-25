package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class MainAdapter(val homeFeed: HomeFeed) : RecyclerView.Adapter<MainAdapter.CustomViewHolder>(){

    val videoList = listOf("One","Two","Three")

    class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView_video_title : TextView
        val textView_channel_name : TextView
        val imageView_video_thumbnail : ImageView
        val imageView_channel_profile : ImageView

        init {
            textView_video_title = view.findViewById(R.id.textView_video_title)
            textView_channel_name = view.findViewById(R.id.textView_channel_name)
            imageView_video_thumbnail = view.findViewById(R.id.imageView_video_thumbnail)
            imageView_channel_profile = view.findViewById(R.id.imageView_channel_profile)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.video_row,parent,false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {

            val video = homeFeed.videos.get(position)
            holder.textView_video_title.text = video.name

            holder.textView_channel_name.text = video.channel.name + " ◘ " + "20K Views\n 4 days ago"

            val thumbnailImageView = holder.imageView_video_thumbnail

            Picasso.get().load(video.imageUrl).into(thumbnailImageView)

            val channelProfileImageView = holder.imageView_channel_profile
            Picasso.get().load(video.channel.profileimageUrl).into(channelProfileImageView)
    }

    override fun getItemCount(): Int {
        return homeFeed.videos.count()
    }

}