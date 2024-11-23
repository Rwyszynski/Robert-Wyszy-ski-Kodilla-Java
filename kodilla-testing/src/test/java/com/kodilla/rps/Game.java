package com.kodilla.rps;

import static com.kodilla.rps.GameRules.computerGamesWon;
import static com.kodilla.rps.GameRules.playerGamesWon;

public class Game {
    static int rounds = 0;
    static String userName;

    public void runGame(){
        OutputSelector selector = new OutputSelector();
        selector.start();
        InputComputer computer = new InputComputer();
        userName = computer.getName();
        rounds = InputComputer.homManyGames();

        while ((GameRules.ifFinish(playerGamesWon, computerGamesWon)) < rounds) {
            GameRules rules = new GameRules();
            rules.gamePlay();
        }
        boolean another = computer.anotherGame();
        playerGamesWon.clear();
        computerGamesWon.clear();
        if (another){
        runGame();
        }
        selector.end();
    }
}
