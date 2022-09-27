package com.timbuchalka;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String songTitle, double duration) {
        //check if the song already exist
        if (findSong(songTitle) == null) {
            songs.add(new Song(songTitle, duration));
            return true;
        }
        // song is already added
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        //track number starts from 1
        if (trackNumber <= 0 || trackNumber> songs.size()) {
            return false;
        }

        Song songToAdd = songs.get(trackNumber -1);
        String songToAddTitle = songToAdd.getTitle();
        ListIterator<Song> songListIterator = playlist.listIterator();
        while (songListIterator.hasNext()) {
            if (songListIterator.next().getTitle().compareTo(songToAddTitle) == 0) {
                return false;
            }
        }
        playlist.add(songToAdd);
        return true;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playlist) {
//        Song songToAdd = findSong(songTitle);
//        if (songToAdd != null) {
//            playlist.add(songToAdd);
//            return true;
//        }
        Song songToAdd = findSong(songTitle);
        if (songToAdd == null) {
            // The song was not found
            return false;
        }
        // Check if the song is already in the playList
        ListIterator<Song> playListIterator = playlist.listIterator();
        while (playListIterator.hasNext()) {
            if  (playListIterator.next().getTitle().compareTo(songToAdd.getTitle()) == 0) {
                // The song is already in the playlist
                return false;
            }
        }

        // Add the song to the end of the playList.
        playlist.add(songToAdd);
        return true;
    }

    private Song findSong(String songTitle) {
        if (!songs.isEmpty()) {
            for (int i=0; i< songs.size(); i++) {
                String searchedSong = songs.get(i).getTitle();
                if (songTitle.equals(searchedSong)) {
                    return songs.get(i);
                }
            }
        }
        //songs list is empty
        return null;
    }

}
