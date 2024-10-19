package com.kodilla.testing.shape;

public class Square implements Shape {

    private int a;

    public Square(int a) {
        this.a = a;
    }

    public String getShapeName() {
        return "Square";
    }

    @Override
    public int getField() {
        int field = a*a;
        return field;
    }


}
