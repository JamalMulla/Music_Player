package com.jmulla.musicplayer;

import java.util.ArrayList;

/**
 * Created by Jamal on 15/07/2016.
 */
public class Song {
    public String title;
    public String artist;
    public String duration;
    public String location;
    public Song(String title, String artist, String duration, String location) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.location = location;
    }

    public static ArrayList<Song> getSong(ArrayList<ArrayList<String>> songInfoSent) {
        ArrayList<Song> songInfo = new ArrayList<>();
        for (int i=0;i<songInfoSent.size();i++) {
            songInfo.add(new Song((songInfoSent.get(i)).get(2), (songInfoSent.get(i)).get(1), (songInfoSent.get(i)).get(5), (songInfoSent.get(i).get(3))));
        }
        return songInfo;
    }
}