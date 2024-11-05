package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(1.0, 2.0);
        } catch (Exception E ) {
            System.out.println(E.getMessage());
        } finally {
            System.out.println("I am gonna show here anyway");
        }
    }
}
