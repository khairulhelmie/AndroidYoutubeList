package com.khairulcreation.youtubelist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Vector;

public class MainActivity extends AppCompatActivity {


    //RECYCLER VIEW FIELD
    RecyclerView recyclerView;

    //VECTOR FOR VIDEO URL
    Vector<YoutubeVideo> youtubeVideos = new Vector<YoutubeVideo>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager( new LinearLayoutManager(this));

        //LOAD VIDEO LIST//
        youtubeVideos.add( new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Cr2OFgPaIQo\" frameborder=\"0\" allowfullscreen></iframe>"));
        youtubeVideos.add( new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/-GQmFVFlG-c\" frameborder=\"0\" allowfullscreen></iframe>"));
        youtubeVideos.add( new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ax5Fg3yQpbY\" frameborder=\"0\" allowfullscreen></iframe>"));
        youtubeVideos.add( new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/XQXwb4qchFA\" frameborder=\"0\" allowfullscreen></iframe>"));
        youtubeVideos.add( new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/cHiECCiAT-c\" frameborder=\"0\" allowfullscreen></iframe>"));

        VideoAdapter videoAdapter = new VideoAdapter(youtubeVideos);
        recyclerView.setAdapter(videoAdapter);

    }
}
