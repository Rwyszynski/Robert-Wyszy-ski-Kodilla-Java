package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage(){

        //Given
        int[] array = new int[20];
        array[0] = 153;
        array[1] = 422;
        array[2] = 4745;
        array[3] = 6456;
        array[4] = 632;
        array[5] = 54;
        array[6] = 634;
        array[7] = 62;
        array[8] = 12;
        array[9] = 534;
        array[10] = 634;
        array[11] = 634;
        array[12] = 654;
        array[13] = 876;
        array[14] = 554;
        array[15] = 63;
        array[16] = 865;
        array[17] = 15;
        array[18] = 345;
        array[19] = 23;

        //When
        double resultArray = ArrayOperations.getAverage(array);

        //Then
        assertEquals(918.35, resultArray);

    }
}
