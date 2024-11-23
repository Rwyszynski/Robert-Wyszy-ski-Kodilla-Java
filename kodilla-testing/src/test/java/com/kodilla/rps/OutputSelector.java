package com.kodilla.rps;

import static com.kodilla.rps.Game.userName;
import static com.kodilla.rps.GameRules.computerGamesWon;
import static com.kodilla.rps.GameRules.playerGamesWon;

public class OutputSelector {
    public void start() {
        System.out.println("Let's play Rock Paper Scissors!");
    }

    public void name() {
        System.out.println("Enter your name:");
    }

    public void games() {
        System.out.println("How many win rounds do you want to play?");
    }

    public void selection() {
        System.out.println("Choose your weapon: 1-Rock, 2-Paper, 3-Scissors");
    }

    public void end() {
        System.out.println("Game Over!");
    }

    public void draw() {
        System.out.println("Draw!");
    }

    public void youWin() {
        System.out.println("You win!");
    }

    public void compWin() {
        System.out.println("Computer win!");
    }

    public void showStats() {
        System.out.println(userName + ": " + playerGamesWon.size());
        System.out.println("Computer " + computerGamesWon.size());
    }

    public void isGameOver() {
        System.out.println("Czy gra ma się zakończyć (Wybierz: x), zagraj jeszcze raz (Wybierz: n)");
    }
}
