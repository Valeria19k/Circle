package com.company;

public class Circle {
    private double radius;
    private String color;
    public Circle(double r,String c){
        radius=r;
        color=c;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }
}
