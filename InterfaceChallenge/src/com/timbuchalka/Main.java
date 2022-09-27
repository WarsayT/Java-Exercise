package com.timbuchalka;

public class Main {
    public static void main(String[] args) {
        ISaveable player = new Player("Tim", 10, 15);
        ISaveable monster = new Monster("Werewolf", 20, 40);

        System.out.println(player.toString());
        System.out.println(monster.toString());


    }
}