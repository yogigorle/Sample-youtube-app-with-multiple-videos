package com.example.yogitube

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebView
import androidx.recyclerview.widget.RecyclerView

class VideosAdapter(val videosList: ArrayList<VideoModel>): RecyclerView.Adapter<VideosAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.activity_main,parent,false)

        return ViewHolder(v)

    }

    override fun getItemCount(): Int {

        return videosList.size
    }

    @SuppressLint("SetJavaScriptEnabled")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.youtubeWebView.settings.javaScriptEnabled = true
        holder.youtubeWebView.webChromeClient = WebChromeClient()


        holder. youtubeWebView.loadData(videosList.get(position).videoUrl,"text/html","utf-8")
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val youtubeWebView = itemView.findViewById(R.id.web_view) as WebView



    }

}

