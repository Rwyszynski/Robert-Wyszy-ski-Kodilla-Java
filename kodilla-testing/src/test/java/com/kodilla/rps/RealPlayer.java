package com.kodilla.rps;

import java.util.Scanner;

public class RealPlayer {
    public int yourTurn() {
        Scanner sc = new Scanner(System.in);
        OutputSelector os = new OutputSelector();
        os.selection();
        int games = sc.nextInt();
        return games;
    }
}
