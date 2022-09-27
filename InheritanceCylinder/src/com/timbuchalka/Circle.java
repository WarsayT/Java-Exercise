package com.timbuchalka;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = (radius < 0) ? 0 : radius;
    }

    public double getArea() {
        return (this.radius * this.radius * Math.PI);
    }

    public double getRadius() {
        return radius;
    }
}
