package com.example.yogitube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_videos_adapter.*

class MainActivity : AppCompatActivity() {

    var videoArrayList = ArrayList<VideoModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_videos_adapter)


        val rvVideos = findViewById<RecyclerView>(R.id.rv_videos)

        rvVideos.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        videoArrayList.add(VideoModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Qn_fh4L-fzQ\" frameborder=\"0\" allowfullscreen></iframe>"))
        videoArrayList.add(VideoModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ztbe4NHeghk\" frameborder=\"0\" allowfullscreen></iframe>"))
        videoArrayList.add(VideoModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/QXsptbz3X34\" frameborder=\"0\" allowfullscreen></iframe>"))
        videoArrayList.add(VideoModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/PiHjgrnay3k\" frameborder=\"0\" allowfullscreen></iframe>"))
        videoArrayList.add(VideoModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/haPfTH5XwX4\" frameborder=\"0\" allowfullscreen></iframe>"))
        videoArrayList.add(VideoModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/LdlnWyKUY9k\" frameborder=\"0\" allowfullscreen></iframe>"))
        videoArrayList.add(VideoModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/FIlYlMMKaX8\" frameborder=\"0\" allowfullscreen></iframe>"))
        videoArrayList.add(VideoModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/cllajjcpdBs\" frameborder=\"0\" allowfullscreen></iframe>"))
        videoArrayList.add(VideoModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/FMeTMkAVh9g\" frameborder=\"0\" allowfullscreen></iframe>"))
        videoArrayList.add(VideoModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/bNuHb7PglTU\" frameborder=\"0\" allowfullscreen></iframe>"))
        videoArrayList.add(VideoModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/cC2ObV_WOiw\" frameborder=\"0\" allowfullscreen></iframe>"))
        videoArrayList.add(VideoModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Z9KqFjcYu4Y\" frameborder=\"0\" allowfullscreen></iframe>"))
        videoArrayList.add(VideoModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/nwVTU-jAhsY\" frameborder=\"0\" allowfullscreen></iframe>"))
        videoArrayList.add(VideoModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/1g4wNHS9RVc\" frameborder=\"0\" allowfullscreen></iframe>"))
        videoArrayList.add(VideoModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/lNzVhoX7oBQ\" frameborder=\"0\" allowfullscreen></iframe>"))
        videoArrayList.add(VideoModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/1nghy4hWPps\" frameborder=\"0\" allowfullscreen></iframe>"))
        videoArrayList.add(VideoModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/_m0tPwzaOd8\" frameborder=\"0\" allowfullscreen></iframe>"))
        videoArrayList.add(VideoModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/78vUsRHRKKI\" frameborder=\"0\" allowfullscreen></iframe>"))
        videoArrayList.add(VideoModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/8UoToFwTHYc\" frameborder=\"0\" allowfullscreen></iframe>"))
        videoArrayList.add(VideoModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/smLht1ZvUzs\" frameborder=\"0\" allowfullscreen></iframe>"))
        videoArrayList.add(VideoModel("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/O4NteMdWdCM\" frameborder=\"0\" allowfullscreen></iframe>"))


       val adapter =  VideosAdapter(videoArrayList)

        rvVideos.adapter = adapter

    }
}
