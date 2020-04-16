package com.company;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(true);

        System.out.println(printer.getTonerLevel());
        System.out.println(printer.getNumberOfPages());
        printer.fillUp();
        printer.printPage(50);
        System.out.println(printer.getTonerLevel());
        System.out.println(printer.getNumberOfPages());

    }
}
