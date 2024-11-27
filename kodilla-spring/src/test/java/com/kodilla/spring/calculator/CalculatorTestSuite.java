package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculatorAdd(){

        //Given
        //When
        double val = calculator.add(3,2);

        //Then
        assertEquals(5, val);
    }

    @Test
    void testCalculatorSubtract(){

        //Given
        //When
        double val = calculator.sub(3,2);

        //Then
        assertEquals(1, val);
    }

    @Test
    void testCalculatorMultiply(){

        //Given
        //When
        double val = calculator.mul(3,2);

        //Then
        assertEquals(6, val);
    }

    @Test
    void testCalculatorDivide(){

        //Given
        //When
        double val = calculator.div(3,2);

        //Then
        assertEquals(1.5, val);
    }
}
