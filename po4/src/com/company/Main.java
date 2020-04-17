package com.company;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        player.name="olek";
        player.health=20;
        player.weapon="sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Reamaining health is "+player.healthRemaining());

        damage = 11;
        player.loseHealth(damage);
        System.out.println("Reamaining health is "+player.healthRemaining());

    }
}
