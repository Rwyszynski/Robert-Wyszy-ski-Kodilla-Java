package com.kodilla.testing.shape;



public class Circle implements Shape {

    private Integer radius;

    public Circle(Integer radius) {
        this.radius = radius;
    }

    public String getShapeName() {
        return "Circle";
    }

    @Override
    public int getField() {
        Integer field = (int) (3.14*radius*radius);
        return field;
    }


}
