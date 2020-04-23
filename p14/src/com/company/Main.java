package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList list = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        while (!quit){
            System.out.println("enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    printInsturcitons();
                    break;
                case 1:
                    list.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyGroceryListItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    findItem();
                    break;
                case 6:
                    quit=true;
                    break;


            }
        }

    }
    public static void printInsturcitons(){
        System.out.println("blah blah blah instrucitons");
    }
    public static void addItem(){
        System.out.print("pleas enter the item :");
        list.addGrocery(scanner.nextLine());
    }
    public static void modifyGroceryListItem(){
        System.out.println("Enter the number");
        int index = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement item");
        String newItem = scanner.nextLine();
        list.modifyGroceryListItem(index-1,newItem);
     }
     public static void removeItem(){
         System.out.print("pleas enter the item :");
         list.removeGroceryItem(scanner.nextInt());

     }
     public static void findItem(){
         System.out.println("Item to search for :");
         String search = scanner.nextLine();
         if(list.findItem(search)== true){
             System.out.println("Found "+search);

         }
         else {
             System.out.println(search+" is not on a list");
         }

     }
     
}
