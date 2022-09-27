package com.timbuchalka;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.eat();
        dog.breath();
        System.out.println(dog.getName());

        Parrot parrot = new Parrot("American Parrot");
        parrot.breath();
        parrot.eat();
        parrot.fly();
        System.out.println(parrot.getName());

        Penguin penguin = new Penguin("Arctic");
        penguin.fly();
        penguin.eat();
        penguin.breath();
        System.out.println(penguin.getName());

    }
}