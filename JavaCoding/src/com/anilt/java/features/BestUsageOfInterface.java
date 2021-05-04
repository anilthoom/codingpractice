package com.anilt.java.features;

public class BestUsageOfInterface {
}

interface Shape {
    Double perimeter();
}

class Rectangle implements Shape {
    //data members and constructors
    private Double length;
    private Double breadth;
    Rectangle(Double length, Double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public Double perimeter() {
        return 2 * (length + breadth);
    }
}

class Circle implements Shape {
    private Double radius;
    Circle(Double radius){
        this.radius = radius;
    }
    @Override
    public Double perimeter() {
        return 2 * Math.PI * (this.radius);
    }
}