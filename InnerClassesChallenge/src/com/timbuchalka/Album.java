package com.timbuchalka;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

//    public ArrayList<Song> getSongs() {
//        return this.songs;
//    }

//    public String getName() {
//        return this.name;
//    }

    public boolean addSong(String songTitle, double duration) {
        return this.songs.add(new Song(songTitle, duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        Song checkedSong = this.songs.findSong(trackNumber);
        if(checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        return false;

    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playlist) {
        Song checkedSong = this.songs.findSong(songTitle);
        if(checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        return false;
    }

//    private Song findSong(String songTitle) {
//        if (!this.songs.isEmpty()) {
//            for(int i = 0; i < this.songs.size(); ++i) {
//                String searchedSong = ((Song)this.songs.get(i)).getTitle();
//                if (songTitle.equals(searchedSong)) {
//                    return (Song)this.songs.get(i);
//                }
//            }
//        }
//
//        return null;
//    }

    public static class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }
        private boolean add(Song song) {
            if(songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }

        private Song findSong(String songTitle) {
            for(Song checkingSong: this.songs){
                if(checkingSong.getTitle().equals(songTitle)) {
                    return checkingSong;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            int index = trackNumber -1;
            if((index > 0) && (index<songs.size())) {
                return songs.get(index);
            }
            return null;
        }
    }
}
