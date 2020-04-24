package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> kontakty = new ArrayList<Contact>();
    public void addContact(String name,String number){
        kontakty.add(new Contact(name,number));
    }
    public void removContact(String name){
        for(int i=0;i<kontakty.size();i++){
            if(kontakty.get(i).getName()==name){
                kontakty.remove(i);
            }
        }
    }
    public void modifyContact(String previousContactName,String name,String number)
    {
        for(int i=0;i<kontakty.size();i++){
            if(kontakty.get(i).getName()==previousContactName){
                kontakty.get(i).setName(name);
                kontakty.get(i).setPhonenumber(number);
            }
        }

    }


}
