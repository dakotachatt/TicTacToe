/**
 * Created By: Dakota Chatt
 * Date: Aug/25/2021
 * Time: 15:29
 * Project Name: TicTacToe
 * Program/Class Description:
 **/

import java.util.*;

public class TestCell {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Cell[] cells = new Cell[9];

        for(int i = 0; i < 9; i++) {
            Cell cell = new Cell();
            cells[i] = cell;
        }

        String cell1 = cells[0].getValue();
        String cell2 = cells[1].getValue();
        String cell3 = cells[2].getValue();
        String cell4 = cells[3].getValue();
        String cell5 = cells[4].getValue();
        String cell6 = cells[5].getValue();
        String cell7 = cells[6].getValue();
        String cell8 = cells[7].getValue();
        String cell9 = cells[8].getValue();

        System.out.printf("     |     |     %n");
        System.out.printf("  %s  |  %s  |  %s  %n", cell1, cell2, cell3);
        System.out.printf("_____|_____|_____%n");
        System.out.printf("     |     |     %n");
        System.out.printf("  %s  |  %s  |  %s  %n", cell4, cell5, cell6);
        System.out.printf("_____|_____|_____%n");
        System.out.printf("     |     |     %n");
        System.out.printf("  %s  |  %s  |  %s  %n", cell7, cell8, cell9);
        System.out.printf("     |     |     %n");

        System.out.println();
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
