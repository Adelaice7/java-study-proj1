package com.adelaice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Album {
    private String name;
    private String artist;
    private List<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public List<Song> getSongs() {
        return songs;
    }

    public boolean addSong(String title, int duration) {
        if (findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }

        return false;
    }

    public Song findSong(String title) {
        List<Song> searchList = this.songs.stream()
                .filter(song -> song.getTitle().equals(title))
                .collect(Collectors.toList());

        if (searchList.size() > 0) {
            return searchList.get(0);
        }

        return null;
    }

    public boolean addToPlayList(int trackNumber, List<Song> playList) {
        int idx = trackNumber - 1;
        if (idx >= 0 && idx <= songs.size()) {
            playList.add(this.songs.get(idx));
            return true;
        }

        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, List<Song> playList) {
        Song searchSong = findSong(title);

        if (searchSong != null) {
            playList.add(searchSong);
            return true;
        }

        System.out.println("The song " + title + " could not be found.");
        return false;
    }
}
