package com.company;

public class CircleTest {
    public static void main(String[] args){
        Circle one = new Circle(5.0,"yellow");
        System.out.print("Радиус: "+one.getRadius()+" Цвет: "+one.getColor()+" Площадь: "+one.getArea());

    }
}
