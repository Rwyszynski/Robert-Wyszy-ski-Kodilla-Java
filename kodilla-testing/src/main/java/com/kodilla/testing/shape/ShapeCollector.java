package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;
import com.kodilla.testing.shape.Shape;

public class ShapeCollector {

    private String name;
    private Integer area;
    private List<Shape> listOfShapes = new ArrayList<>();

    public ShapeCollector(String name, Integer area) {
        private this.name = name;
        private this.area = area;
    }

    public void addFigure(Shape shape) {
        Shape shape1 = new Shape(shape);
        listOfShapes.add();
    }
    public void removeFigure(Shape shape) {

    }
    public void getFigure(int n) {

    }
    public void showFigures() {

    }

    public String getName() {
        return name;
    }

    public Integer getArea() {
        return area;
    }
}
