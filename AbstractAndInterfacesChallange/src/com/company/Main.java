package com.company;

public class Main {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());
        String stringData = "5 7 3";
        String[] data = stringData.split("1 2 3");
        for(String s : data){
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());
    }
}
