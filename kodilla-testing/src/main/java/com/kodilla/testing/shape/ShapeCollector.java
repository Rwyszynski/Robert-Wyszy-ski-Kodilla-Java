package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> listOfShapes = new ArrayList<>();




    public void addFigure(Shape shape) {
        listOfShapes.add(shape);

    }
    public boolean removeFigure(Shape shape) {
        listOfShapes.remove(shape);

        return true;
    }
    public Shape getFigure(int figureNumber) {
        Shape shape1 = listOfShapes.get(figureNumber);
        return shape1;
    }
    public List<Shape> showFigures() {

        return listOfShapes;
    }

    public String getName(int shape) {
        String shapeName = listOfShapes.get(shape).getShapeName();
        return shapeName;
    }

    public Integer getField(int shape) {
        Integer shapeField = listOfShapes.get(shape).getField();
        return shapeField;
    }

    public int getShapeQuantity() {
        return listOfShapes.size();
    }
}
