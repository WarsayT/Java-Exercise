package com.timbuchalka;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height =(height < 0) ? 0 : height;
    }

    public double getVolume() {
        return (getArea() * this.height);
    }

    public double getHeight() {
        return height;
    }
}
