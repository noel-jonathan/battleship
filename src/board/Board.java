package board;

import game.Game;

import java.util.Arrays;

public class Board {
    public static final int SIZE = 10;
    private Cell[][] cells;

    public Board(Cell[][] cells) {
        this.cells = cells;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                sb.append(cells[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}


