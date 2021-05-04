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