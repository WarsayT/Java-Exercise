package com.timbuchalka;

public class Vehicle {
    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size ) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }
    public void stear(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.stear(): stearing at " + currentDirection+ " degrees");
    }
    public void move(int velocity, int direction) {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): moving at " +currentVelocity+ " in direction " +currentDirection);
      //  stear();
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
    public void stop() {
        this.currentVelocity = 0;
    }
}
