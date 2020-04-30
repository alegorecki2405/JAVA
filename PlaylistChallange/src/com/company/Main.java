package com.company;

import java.security.SignedObject;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

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
        a2.addSong(s4);
        a2.addSong(s5);
        LinkedList<Song> playlist = new LinkedList<Song>();
        addToPlaylist(s1,a1,playlist);
        addToPlaylist(s2,a1,playlist);
        addToPlaylist(s3,a1,playlist);
        addToPlaylist(s4,a2,playlist);
        addToPlaylist(s5,a2,playlist);
        boolean quit = false;
        boolean goingForward = true;
        int scannerValue;
        Scanner scanner = new Scanner(System.in);
        ListIterator<Song> i = playlist.listIterator();

        while (!quit){
            printMenu();
            scannerValue=scanner.nextInt();
            switch (scannerValue){
                case 0:
                    System.out.println("You have just got out of the playlist ");
                    quit=true;
                    break;
                case 1:

                    if(!goingForward)
                    {
                        if(i.hasNext()){
                            i.next();
                        }
                    }
                    if(i.hasNext()){
                        System.out.println("now listening to "+i.next().getTitle());
                    }
                    else
                    {
                        System.out.println("you reached the end of the playlist");
                        goingForward=false;
                    }

                    break;
                case 2:

                    if(goingForward)
                    {
                        if(i.hasPrevious()){
                            i.previous();
                        }
                    }
                    if(i.hasPrevious()){
                        System.out.println("now listening to "+i.previous().getTitle());
                    }
                    else
                    {
                        System.out.println("you reached the start of the playlist");
                        goingForward=true;
                    }
                    break;
                case 3:
                    i.next();
                    System.out.println("now listening to "+i.previous().getTitle());

            }


        }



    }

    static void addToPlaylist(Song song,Album album, LinkedList playlist){
        if(album.findSong(song.getTitle())){
            playlist.add(song);
        }
        else{
            System.out.println("The song doesnt belong to any album");
        }
    }
    static void printMenu(){
        System.out.println("option 0 ->quit");
        System.out.println("option 1 ->next song");
        System.out.println("option 2 ->previous song");
        System.out.println("option 3 replay the song");

    }
}
