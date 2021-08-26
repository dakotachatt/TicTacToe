/**
 * Created By: Dakota Chatt
 * Date: Aug/25/2021
 * Time: 15:13
 * Project Name: TicTacToe
 * Program/Class Description:
 **/
public class Cell {
    private static int cellsCreated = 0;
    private String value;
    private boolean isPlayed;

    public Cell() {
        cellsCreated++;
        this.value = "" + cellsCreated; //Value viewable by players is same as cell number before an X or O is placed
    }

    public String getValue() {
        return this.value;
    }

    public boolean getIsPlayed() {
        return this.isPlayed;
    }

    public static void resetCellsCreated() {
        cellsCreated = 0;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setIsPlayed() {
        this.isPlayed = true;
    }
}
