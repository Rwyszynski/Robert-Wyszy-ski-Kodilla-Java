package com.kodilla.rps;

import java.util.Random;

public class ComputerPlayer {
    public int yourTurn() {
        Random random = new Random();
        int randomNumber = random.nextInt(3) + 1;
        System.out.println(randomNumber);
        return randomNumber;
    }
}
