package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;

public class GameRules {
    public static List<String> playerGamesWon  = new ArrayList<>();
    public static List<String> computerGamesWon = new ArrayList<>();

    public void gamePlay() {
    RealPlayer rp = new RealPlayer();
    ComputerPlayer cp = new ComputerPlayer();
    int userTurn = rp.yourTurn();
    int compTurn = cp.yourTurn();
    checkWinner(userTurn, compTurn);
    OutputSelector selector = new OutputSelector();
    selector.showStats();
    }

    public void checkWinner(int userMove, int compMove) {
        OutputSelector os = new OutputSelector();
        if (userMove == compMove) {
            os.draw();
        } else if (userMove == 1 && compMove == 2) {
            os.compWin();
            addComputer("WIN");
        } else if (userMove == 1 && compMove == 3) {
            os.youWin();
            addPlayer("WIN");
        } else if (userMove == 2 && compMove == 1) {
            os.youWin();
            addPlayer("WIN");
        } else if (userMove == 2 && compMove == 3) {
            os.youWin();
            addPlayer("WIN");
        } else if (userMove == 3 && compMove == 1) {
            os.compWin();
            addComputer("WIN");
        } else if (userMove == 3 && compMove == 2) {
            os.compWin();
            addComputer("WIN");
        }
    }

    public void addPlayer(String player) {
        playerGamesWon.add(player);
    }

    public void addComputer(String computer) {
        computerGamesWon.add(computer);
    }

    public static int ifFinish (List<String> players, List<String> computers) {
        int player = playerGamesWon.size();
        int comp = computerGamesWon.size();
        return Math.max(player, comp);
    }
}
