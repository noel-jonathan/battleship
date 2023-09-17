package board;

import game.Generate;
import ship.Ship;

import static ship.Factory.*;

public class Board {
    public static final int SIZE = 10;
    private final Cell[][] board;
    private final Ship[] ships;

    public Board() {
        this.board = Generate.cells();
        this.ships = createShips();
    }

    public Ship[] getShips() {
        return ships;
    }

    public Cell[] createShipPosition(int length, boolean isHorizontal) {
        Cell[] position = Generate.randomPosition(length, isHorizontal);
        if (!checkAllCellsAvailable(position))
            return createShipPosition(length, isHorizontal);
        return position;
    }

    private boolean checkAllCellsAvailable(Cell[] position) {
        for (Cell cell : position) {
            if(!this.board[cell.getRow()][cell.getCol()].isAvailable()) {
                return false;
            }
        }
        return true;
    }

    public Cell[][] getBoard() {
        return board;
    }

    public void placeShips() {
        for (Ship ship : ships) {
            Cell[] position = createShipPosition(ship.getLength(), ship.isHorizontal());
            ship.setPosition(position);

            for (Cell cell :
                    position) {
                this.board[cell.getRow()][cell.getCol()].setIsShip(true);
                this.board[cell.getRow()][cell.getCol()].setValue('s'); //for testing purposes
            }
            makeCellsUnavailable(position);
        }

    }

    private void makeCellsUnavailable(Cell[] position) {
        for (Cell cell:
             position) {
            for (int i = -1; i < 2; i++) {
                for (int j = -1; j < 2; j++) {
                    this.board
                            [Math.min(Math.max(0, cell.getRow() + i), 9)]
                            [Math.min(Math.max(0, cell.getCol()+ j), 9)]
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
                sb.append(board[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}


