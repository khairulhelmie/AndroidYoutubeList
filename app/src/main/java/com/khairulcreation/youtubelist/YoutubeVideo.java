package com.khairulcreation.youtubelist;

/**
 * Created by user on 1/8/2017.
 */

public class YoutubeVideo {

    String videoUrl;

    public YoutubeVideo(){

    }

    public YoutubeVideo(String videoUrl){
        this.videoUrl = videoUrl;
    }

    public String getVideoUrl(){
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl){

        this.videoUrl = videoUrl;
    }
}
