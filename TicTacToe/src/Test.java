/**
 * Created By: Dakota Chatt
 * Date: Aug/25/2021
 * Time: 14:48
 * Project Name: TicTacToe
 * Program/Class Description:
 **/

import java.util.*;

public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String cell1 = "1";
        String cell2 = "2";
        String cell3 = "3";
        String cell4 = "4";
        String cell5 = "5";
        String cell6 = "6";
        String cell7 = "7";
        String cell8 = "8";
        String cell9 = "9";

        System.out.printf("     |     |     %n");
        System.out.printf("  %s  |  %s  |  %s  %n", cell1, cell2, cell3);
        System.out.printf("_____|_____|_____%n");
        System.out.printf("     |     |     %n");
        System.out.printf("  %s  |  %s  |  %s  %n", cell4, cell5, cell6);
        System.out.printf("_____|_____|_____%n");
        System.out.printf("     |     |     %n");
        System.out.printf("  %s  |  %s  |  %s  %n", cell7, cell8, cell9);
        System.out.printf("     |     |     %n");
    }
}
