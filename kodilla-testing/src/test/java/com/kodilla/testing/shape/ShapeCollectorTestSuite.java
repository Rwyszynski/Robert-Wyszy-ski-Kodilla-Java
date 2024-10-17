package com.kodilla.testing.shape;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Triangle;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;
import java.lang.*;

@DisplayName("TDD: Shape Collector Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;


    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @DisplayName("Test for Shape")
    class TestShape {

        void testAddShape() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            Shape circle = new Circle();
            Shape square = new Square();
            Shape triangle = new Triangle();

            //When
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);

            //Then
            Assertions.assertEquals(3, shapeCollector.getShapeQuantity());

        }

        void testGetShape() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            Shape circle = new Circle();
            Shape square = new Square();
            Shape triangle = new Triangle();
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);

            //When
            Shape getFirstFigure;
            Shape getSecondFigure;
            Shape getThirdFigure;
            getFirstFigure = shapeCollector.getFigure(0);
            getSecondFigure = shapeCollector.getFigure(1);
            getThirdFigure = shapeCollector.getFigure(2);


            //Then
            Assertions.assertEquals(circle, getFirstFigure);
            Assertions.assertEquals(square, getSecondFigure);
            Assertions.assertEquals(triangle, getThirdFigure);
        }

        void testRemoveShape() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            Shape circle = new Circle();
            Shape square = new Square();
            Shape triangle = new Triangle();
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);

            //When
            boolean result1 = shapeCollector.removeFigure(circle);
            boolean result2 = shapeCollector.removeFigure(square);
            boolean result3 = shapeCollector.removeFigure(triangle);


            //Then
            Assertions.assertFalse(result1);
            Assertions.assertFalse(result2);
            Assertions.assertFalse(result3);

            Assertions.assertEquals(0, shapeCollector.getShapeQuantity());


        }

        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            Shape circle = new Circle();
            Shape square = new Square();
            Shape triangle = new Triangle();
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);
            List<Shape> listList = new ArrayList<>();
            listList.add(circle);
            listList.add(square);
            listList.add(triangle);

            //When
            List<Shape> getFigures = shapeCollector.showFigures();
            //Then
            Assertions.assertEquals(listList, getFigures);

        }


        void testShowName() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            Shape circle = new Circle();
            Shape square = new Square();
            Shape triangle = new Triangle();
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);

            //When
            String getFirstFigure = shapeCollector.getName(0);
            String getSecondFigure = shapeCollector.getName(1);
            String getThirdFigure = shapeCollector.getName(2);


            //Then
            Assertions.assertEquals(circle.getShapeName(), getFirstFigure);
            Assertions.assertEquals(square.getShapeName(), getSecondFigure);
            Assertions.assertEquals(triangle.getShapeName(), getThirdFigure);

        }

        void testShowField() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            Shape circle = new Circle();
            Shape square = new Square();
            Shape triangle = new Triangle();
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);

            //When
            Integer getFirstFigure = Integer.valueOf(shapeCollector.getName(0));
            Integer getSecondFigure = Integer.valueOf(shapeCollector.getName(1));
            Integer getThirdFigure = Integer.valueOf(shapeCollector.getName(2));


            //Then
            Assertions.assertEquals(circle.getField(), getFirstFigure);
            Assertions.assertEquals(square.getField(), getSecondFigure);
            Assertions.assertEquals(triangle.getField(), getThirdFigure);


        }

    }

}
