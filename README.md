# TicTacToe
Java Tic Tac Toe Console Game

Three classes required:
Cell.java
Player.java
TicTacToeGame.java

Game is run with the TestTicTacToeGame.java program

- Game starts by having both players enter their names (can be full names if desired).
- Players take turns as per tic tac toe rules, typing the number of the cell they want to put their piece in (cell value updates based on which player selected it)
- Once a cell has been played, it cannot be played again or changed in any other way
- Once someone gets 3 in a row, their score increases by 1, and they are given the option to have a rematch, or to quit
- If a draw occurs, no-one gets any points and they again are presented with the option to have a rematch or quit
- Once user quits, the final score of matches won for each player is shown

To Do Still:
- Simplify duplicate code, shorten where possible
- Put in hasInt() check on user selection to avoid possible type mismatches
