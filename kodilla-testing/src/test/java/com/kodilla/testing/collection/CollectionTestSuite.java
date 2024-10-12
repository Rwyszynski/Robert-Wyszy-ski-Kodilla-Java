package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;
import java.util.*;
import java.util.Arrays;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @Test
    void testOddNumbersExterminatorEmptyList () {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator(Arrays.asList());
        //When
        List<Integer> result = oddNumbersExterminator.exterminate();
        System.out.println("Testing " + result);
        //Then
        Assertions.assertEquals(Arrays.asList(), result);
    }

    @DisplayName("when create OddNumbersExterminator with numbers, " +
            "then getNumbers should return correct numbers"
    )

    @Test
    void testOddNumbersExterminatorNormalList () {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator(Arrays.asList(3,4,5,3,2,11));
        //When
        List<Integer> result = oddNumbersExterminator.exterminate();
        System.out.println("Testing " + result);
        //Then
        Assertions.assertEquals(Arrays.asList(4,2), result);
    }

}

