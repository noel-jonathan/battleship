package game;

import board.Board;
import board.Cell;

import java.util.Random;

import static board.Cell.WATER;

public class BoardGenerator {
    public static boolean randomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }

    public static Cell randomFirstCell(int length, boolean isHorizontal) {
        if (isHorizontal) {
            return new Cell(
                    (int) (Math.random() * (Board.SIZE - length)),
                    (int) (Math.random() * Board.SIZE)
            );
        } else {
            return new Cell(
                    (int) (Math.random() * Board.SIZE),
                    (int) (Math.random() * (Board.SIZE - length))
            );
        }
    }

    public static Cell[][] reset() {
        Cell[][] board = new Cell[Board.SIZE][Board.SIZE];
        for (int i = 0; i < Board.SIZE; i++) {
            for (int j = 0; j < Board.SIZE; j++) {
                board[i][j] = new Cell(i, j, WATER);
            }
        }
        return board;
    }

    public static Cell[] randomPosition(int length, boolean isHorizontal) {
        Cell[] position = new Cell[length];
        position[0] = randomFirstCell(length, isHorizontal);
        for (int i = 1; i < length; i++) {
            if (isHorizontal) {
                position[i] =  new Cell(position[0].getRow() + i, position[0].getCol());
            } else {
                position[i] = new Cell(position[0].getRow(), position[0].getCol() + i);
            }
        }
        return position;
    }

    public static Cell[] createShipPosition(int length, boolean isHorizontal, Board board) {
        Cell[] position = randomPosition(length, isHorizontal);
        if (!Board.checkAllCellsAvailable(position, board))
            return createShipPosition(length, isHorizontal, board);
        return position;
    }
}
