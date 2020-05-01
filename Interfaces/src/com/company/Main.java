package com.company;

public class Main {

    public static void main(String[] args) {
        ITelephone olekPhone = new DeskPhone(782834458);
        olekPhone.powerOn();
        olekPhone.callPhone(782834458);
        olekPhone.answer();

        olekPhone = new MobilePhone(345345345);
//        olekPhone.powerOn();
        olekPhone.callPhone(234234234);
        olekPhone.answer();

    }
}
