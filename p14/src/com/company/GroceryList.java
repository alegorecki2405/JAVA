package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();
    public void addGrocery(String item){
        groceryList.add(item);
    }
    public void printGroceryList(){
        System.out.println("you have "+groceryList.size()+" items");
        for(int i=0;i<groceryList.size();i++){
            System.out.println(groceryList.get(i));
        }
    }
    public void modifyGroceryListItem(int place,String toItem){
        groceryList.set(place, "big black dildo xxl");
    }
    public void removeGroceryItem(int position){
        groceryList.remove(position);
    }
    public boolean findItem(String searchItem){
        return groceryList.contains(searchItem);
        //there is also IndexOf so chill
    }
}
