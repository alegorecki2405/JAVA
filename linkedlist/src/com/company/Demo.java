package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        placesToVisit.add(1,"Alice Springs");
        printList(placesToVisit);

        placesToVisit.remove(4);

        printList(placesToVisit);

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
}
