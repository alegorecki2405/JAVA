package com.company;

import java.util.ArrayList;

public class Album {
    private String name;
    private ArrayList<Song> album = new ArrayList<Song>();

    public Album(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Song> getAlbum() {
        return album;
    }
    public void addSong(String title,String duration){
        album.add(new Song(title,duration));
    }
    public void addSong(Song s){
        album.add(s);
    }
    public boolean findSong(String title){
        for(int i = 0;i<album.size();i++){
            if(album.get(i).getTitle()==title){
                return true;
            }
        }
        return false;
    }
}
