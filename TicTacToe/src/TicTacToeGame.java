/**
 * Created By: Dakota Chatt
 * Date: Aug/25/2021
 * Time: 14:56
 * Project Name: TicTacToe
 * Program/Class Description:
 **/

import java.util.*;

public class TicTacToeGame {
    private Player[] players;
    private Cell[] cells;
    private boolean isP1;
    private boolean isP2;
    private int cellsPlayed;
    private boolean gameWon;
    private String winningPlayer;
    private static final String P1SYMBOL = "X";
    private static final String P2SYMBOL = "\u00D8";

    Scanner input = new Scanner(System.in);

    public TicTacToeGame() {
        players = new Player[2];

        System.out.println("Player 1, what is your name?");
        players[0] = new Player(input.nextLine());
        System.out.println("Player 2, what is your name?");
        players[1] = new Player(input.nextLine());
        System.out.println();
    }

    private void createGame() {
        Cell.resetCellsCreated();
        cells = new Cell[9];
        gameWon = false;
        this.isP1 = true;
        this.isP2 = false;
        cellsPlayed = 0;
        winningPlayer = "If you see this, something went wrong";


        for(int i = 0; i < 9; i++) {
            Cell cell = new Cell();
            cells[i] = cell;
        }

        cellsPlayed = 0;
        showGameBoard();
    }

    public void playGame() {
        createGame();

        while(this.cellsPlayed < 9) {
            String currentPlayerName = (isP1 && !isP2) ? players[0].getName() : players[1].getName();
            System.out.printf("%n%s, its your turn, select a number: ", currentPlayerName);
            int cellChoice = input.nextInt();

            if(cells[cellChoice - 1].getIsPlayed()) {
                System.out.println("Choose a cell that hasn't been played");
                continue;
            }

            playerRoundUpdates(cellChoice);
        }

        System.out.printf("%nGame ended in a draw! Placeholder to add reset function with same players");
    }

    private void playerRoundUpdates(int cell) {
        updateCell(cell);
//        clearConsole();
        showGameBoard();
        cellsPlayed++;

        if(checkWin()) {
            updateScore();
            System.out.printf("%nCongratulations %s, you won this round!%n%n", winningPlayer);
            input.nextLine(); //to consume new line from final cell entry
            System.out.println("Press enter for a rematch, or type Q to quit");

            if(input.nextLine().equalsIgnoreCase("Q")) {
                endGame();
            } else {
                createGame();
                return;
            }
        }

        if(isP1 && !isP2) {
            isP1 = false;
            isP2 = true;
        } else {
            isP1 = true;
            isP2 = false;
        }
    }

    private void updateCell(int cell) {
        switch(cell) {
            case 1:
                cells[0].setValue((isP1 && !isP2) ? P1SYMBOL : P2SYMBOL);
                cells[0].setIsPlayed();
                break;
            case 2:
                cells[1].setValue((isP1 && !isP2) ? P1SYMBOL : P2SYMBOL);
                cells[1].setIsPlayed();
                break;
            case 3:
                cells[2].setValue((isP1 && !isP2) ? P1SYMBOL : P2SYMBOL);
                cells[2].setIsPlayed();
                break;
            case 4:
                cells[3].setValue((isP1 && !isP2) ? P1SYMBOL : P2SYMBOL);
                cells[3].setIsPlayed();
                break;
            case 5:
                cells[4].setValue((isP1 && !isP2) ? P1SYMBOL : P2SYMBOL);
                cells[4].setIsPlayed();
                break;
            case 6:
                cells[5].setValue((isP1 && !isP2) ? P1SYMBOL : P2SYMBOL);
                cells[5].setIsPlayed();
                break;
            case 7:
                cells[6].setValue((isP1 && !isP2) ? P1SYMBOL : P2SYMBOL);
                cells[6].setIsPlayed();
                break;
            case 8:
                cells[7].setValue((isP1 && !isP2) ? P1SYMBOL : P2SYMBOL);
                cells[7].setIsPlayed();
                break;
            case 9:
                cells[8].setValue((isP1 && !isP2) ? P1SYMBOL : P2SYMBOL);
                cells[8].setIsPlayed();
                break;
        }
    }

    private void showGameBoard() {
        System.out.printf("     |     |     %n");
        System.out.printf("  %s  |  %s  |  %s  %n", cells[0].getValue(), cells[1].getValue(), cells[2].getValue());
        System.out.printf("_____|_____|_____%n");
        System.out.printf("     |     |     %n");
        System.out.printf("  %s  |  %s  |  %s  %n", cells[3].getValue(), cells[4].getValue(), cells[5].getValue());
        System.out.printf("_____|_____|_____%n");
        System.out.printf("     |     |     %n");
        System.out.printf("  %s  |  %s  |  %s  %n", cells[6].getValue(), cells[7].getValue(), cells[8].getValue());
        System.out.printf("     |     |     %n");
    }

    private void updateScore() {
        if(winningPlayer.equals(players[0].getName())) {
            players[0].incrementWin();
        } else if( winningPlayer.equals(players[1].getName())){
            players[1].incrementWin();
        }
    }

    private void endGame() {
        System.out.printf("%nThanks for playing! The final score was:%n");
        System.out.printf("%s: %d%n", players[0].getName(), players[0].getNumWins());
        System.out.printf("%s: %d%n", players[1].getName(), players[1].getNumWins());
        System.exit(0);
    }

    private boolean checkWin() {
        //brute force, would be cleaner if used a 2 dimensional array, possible update in future
        if(cells[0].getValue().equals(cells[1].getValue()) && cells[0].getValue().equals(cells[2].getValue())) {
            winningPlayer = cells[0].getValue().equals(P1SYMBOL) ? players[0].getName() : players[1].getName();
            gameWon = true;
        } else if (cells[3].getValue().equals(cells[4].getValue()) && cells[3].getValue().equals(cells[5].getValue())) {
            winningPlayer = cells[3].getValue().equals(P1SYMBOL) ? players[0].getName() : players[1].getName();
            gameWon = true;
        } else if (cells[6].getValue().equals(cells[7].getValue()) && cells[6].getValue().equals(cells[8].getValue())) {
            winningPlayer = cells[6].getValue().equals(P1SYMBOL) ? players[0].getName() : players[1].getName();
            gameWon = true;
        } else if (cells[0].getValue().equals(cells[3].getValue()) && cells[0].getValue().equals(cells[6].getValue())) {
            String winningPlayer = cells[0].getValue().equals(P1SYMBOL) ? players[0].getName() : players[1].getName();
            gameWon = true;
        } else if (cells[1].getValue().equals(cells[4].getValue()) && cells[1].getValue().equals(cells[7].getValue())) {
            winningPlayer = cells[1].getValue().equals(P1SYMBOL) ? players[0].getName() : players[1].getName();
            gameWon = true;
        } else if (cells[2].getValue().equals(cells[5].getValue()) && cells[2].getValue().equals(cells[8].getValue())) {
            winningPlayer = cells[2].getValue().equals(P1SYMBOL) ? players[0].getName() : players[1].getName();
            gameWon = true;
        } else if (cells[0].getValue().equals(cells[4].getValue()) && cells[0].getValue().equals(cells[8].getValue())) {
            winningPlayer = cells[0].getValue().equals(P1SYMBOL) ? players[0].getName() : players[1].getName();
            gameWon = true;
        } else if (cells[2].getValue().equals(cells[4].getValue()) && cells[2].getValue().equals(cells[6].getValue())) {
            winningPlayer = cells[2].getValue().equals(P1SYMBOL) ? players[0].getName() : players[1].getName();
            gameWon = true;
        }

        return gameWon;
    }

    public void clearConsole() {
        System.out.printf("\f");
        System.out.flush();
    }
}
