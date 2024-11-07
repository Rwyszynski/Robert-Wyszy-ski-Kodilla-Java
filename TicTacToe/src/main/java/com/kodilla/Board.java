package com.kodilla;

public class Board {
    char[][] values = {
            {' ',' ',' '},
            {' ',' ',' '},
            {' ',' ',' '}
    };

       for(int i = 0; i < 3; i++)

    {
        for (int j = 0; j < 3; j++) {
            System.out.print("|" + values[i][j]);
        }
        System.out.println("|");
    }
}
