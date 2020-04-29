package com.company;

import java.security.SignedObject;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	    Song s1 = new Song("repentless","3:25");
        Song s2 = new Song("raining blood","3:00");
        Song s3 = new Song("seasons in the abyss","4:12");
        Album a1 = new Album("Slayer");
        a1.addSong(s1);
        a1.addSong(s2);
        a1.addSong(s3);
        Song s4 = new Song("california","2:50");
        Song s5 = new Song("amg","3:05");
        Album a2 = new Album("White 2115");
        LinkedList<Song> playlist = new LinkedList<Song>();

    }

    private void addToPlaylist(Song song,Album album){
        if(album.findSong(song.getTitle())){

        }
    }
}
