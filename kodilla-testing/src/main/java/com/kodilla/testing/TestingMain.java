package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        ///////////////////////////////

        Calculator calculator = new Calculator(8,5);

        Integer resultA = calculator.add();
        Integer resultB = calculator.subtract();

        if ((resultA.equals(13)) && (resultB.equals(3))) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        }

    }
