package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Player olek = new Player("olek",10,15);
        System.out.println(olek.toString());
	    saveObject(olek);
	    olek.setHitPoints(8);
        System.out.println(olek);
        olek.setWeapon("Stormbringer");
        saveObject(olek);
        loadObject(olek);
        System.out.println(olek);

        ISaveable werewolf = new Monster("werewolf",20,40);

        System.out.println(((Monster) werewolf).getStrenght());
        saveObject(werewolf);
    }
    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("chose ");
        System.out.println("1 to enter string");
        System.out.println("0 to quit");

        while (!quit){
            System.out.println("chose an option");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit=true;
                    break;
                case 1:
                    System.out.println("enter a string");
                    String stringInput = scanner.nextLine();
                    values.add(index,stringInput);
                    index++;
                    break;
            }
        }
        return values;

    }
    public static void saveObject(ISaveable objectToSave){
        for(int i=0;i<objectToSave.write().size();i++){
            System.out.println("Saving "+objectToSave.write().get(i)+" to storage device");
        }
    }
    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}

