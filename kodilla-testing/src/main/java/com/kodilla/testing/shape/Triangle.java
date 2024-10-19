package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private int a;
    private int h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    public String getShapeName(){
        return "Triangle";
    }

    @Override
    public int getField() {
        int field = (a * h) / 2;
        return field;
    }


}
