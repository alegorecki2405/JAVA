package com.company;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder("Sydney",placesToVisit);
        addInOrder("Melbourne",placesToVisit);
        addInOrder("Brisbane",placesToVisit);
        addInOrder("Canberra",placesToVisit);
        addInOrder("Adelaide",placesToVisit);
        addInOrder("Darwin",placesToVisit);
        addInOrder("Darwin",placesToVisit);
        visit(placesToVisit);

    }
    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Now visiting "+i.next());

        }
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxx");
    }

    private static boolean addInOrder(String newCity, LinkedList<String> linkedList){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison==0){
                System.out.println(newCity+" is already in a list");
                return false;
            }
            else if(comparison>0){
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
            else if(comparison<0){

            }



        }
        stringListIterator.add(newCity);
        return true;
    }


    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();
        if (cities.isEmpty()) {
            System.out.println("no cities is the itenary");
            return;

        }
        else{
            System.out.println("now visiting "+listIterator.next());
            printMenu();
        }
        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("holidays are over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward=true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("now visiting "+listIterator.next());
                    }
                    else {
                        System.out.println("you reached the end of the list");
                        goingForward=false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward=false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("now visiting "+listIterator.previous());
                    }
                    else{
                        System.out.println("you reached the begining of the list");
                        goingForward=true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("available actions");
        System.out.println("0 to quit");
        System.out.println("1 to go to next");
        System.out.println("2 to go to previous");
        System.out.println("3 print menu again");
    }
}
