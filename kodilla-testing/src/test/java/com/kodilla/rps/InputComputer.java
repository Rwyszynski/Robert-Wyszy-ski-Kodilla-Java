package com.kodilla.rps;

import java.util.Objects;
import java.util.Scanner;

public class InputComputer {
    public String getName() {
        Scanner sc = new Scanner(System.in);
        OutputSelector os = new OutputSelector();
        os.name();
        return sc.nextLine();
    }

    public static int homManyGames() {
        Scanner sc = new Scanner(System.in);
        OutputSelector os = new OutputSelector();
        os.games();
        return sc.nextInt();
    }

    public boolean anotherGame() {
        Scanner sc = new Scanner(System.in);
        OutputSelector os = new OutputSelector();
        os.isGameOver();
        if (Objects.equals(sc.nextLine(), "n")){
            return true;
        }
        return false;
    }
}
