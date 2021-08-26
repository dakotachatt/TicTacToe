/**
 * Created By: Dakota Chatt
 * Date: Aug/25/2021
 * Time: 15:00
 * Project Name: TicTacToe
 * Program/Class Description:
 **/

import java.util.*;

public class TestPlayer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Player 1, what is your name?");
        String player1Name = input.nextLine();
        System.out.println("Player 2, what is your name?");
        String player2Name = input.nextLine();

        Player player1 = new Player(player1Name);
        Player player2 = new Player(player2Name);

        System.out.println(player1.getName());
        System.out.println(player2.getName());
    }
}
