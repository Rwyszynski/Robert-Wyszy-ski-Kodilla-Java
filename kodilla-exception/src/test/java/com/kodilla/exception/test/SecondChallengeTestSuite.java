package com.kodilla.exception.test;
import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.test.SecondChallenge;
import com.kodilla.exception.test.ExceptionHandling;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    void testx2y3() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertThrows(Exception.class,() -> secondChallenge.probablyIWillThrowException(2.0, 3.0));
    }

    @Test
    void testx0_5y3() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertThrows(Exception.class,() -> secondChallenge.probablyIWillThrowException(0.5, 3.0));
    }

    @Test
    void testx0y3() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertThrows(Exception.class,() -> secondChallenge.probablyIWillThrowException(0.0, 3.0));
    }

    @Test
    void testx1_5y1_5() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertThrows(Exception.class,() -> secondChallenge.probablyIWillThrowException(1.5, 1.5));
    }

    @Test
    void testx1_5y2() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5, 2.0));
    }
}




