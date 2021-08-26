/**
 * Created By: Dakota Chatt
 * Date: Aug/25/2021
 * Time: 14:57
 * Project Name: TicTacToe
 * Program/Class Description:
 **/

import java.util.*;

public class Player {
    private String name;
    private boolean isWin;
    private static int playerNumber = 1;
    private int numWins;

    public Player(String name) {
        if(name.trim().equals("")) {
            this.name = String.format("Player %d", playerNumber);
        } else {
            this.name = name.trim();
        }
        this.numWins = 0;
        playerNumber++;
    }

    public String getName() {
        return this.name;
    }

    public int getNumWins() {
        return this.numWins;
    }

    public void incrementWin() {
        this.numWins++;
    }
}
