package board;

import game.BoardGenerator;
import ship.Factory;
import ship.Ship;

public class Board {
    public static final int SIZE = 10;
    private final Cell[][] cells;
    private final Ship[] ships;

    public Board() {
        this.cells = BoardGenerator.reset();
        this.ships = Factory.createShips(this);
    }

    public Ship[] getShips() {
        return ships;
    }


    public Cell getCell(int row, int col) {
        return cells[row][col];
    }

    public static boolean checkAllCellsAvailable(Cell[] position, Board board) {
        for (Cell cell : position) {
            if(!board.getCell(cell.getRow(), cell.getCol()).isAvailable()) {
                return false;
            }
        }
        return true;
    }

    // can be improved because for each cell, we set the 8 surrounding cell to unavailable
    // maybe start with the boat position array instead of individual cells
    public void makeCellsUnavailable(Cell[] position) {
        for (Cell cell:
             position) {
            for (int i = -1; i < 2; i++) {
                for (int j = -1; j < 2; j++) {
                    this.cells
                            [Math.min(Math.max(0, cell.getRow() + i), Board.SIZE - 1)]
                            [Math.min(Math.max(0, cell.getCol()+ j), Board.SIZE - 1)]
                            .setAvailability(false);

                }

            }
        }
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


