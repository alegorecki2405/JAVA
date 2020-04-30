package com.company;

public class Main {

    public static void main(String[] args) {
        ITelephone olekPhone = new DeskPhone(782834458);

        olekPhone.powerOn();
        olekPhone.callPhone(782834458);
        olekPhone.answer();

    }
}
