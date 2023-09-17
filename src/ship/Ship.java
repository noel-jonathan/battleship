package ship;
import board.Board;
import board.Cell;
import game.BoardGenerator;

import java.util.StringJoiner;

import static game.BoardGenerator.randomBoolean;

public class Ship {
    private Cell[] position;
    private final boolean isHorizontal;
    private String shipClass;
    private int length;


    public Ship(int length, String shipClass, Board board) {
        this.length = length;
        this.shipClass = shipClass;
        this.isHorizontal = randomBoolean();
        this.position = placeShipOn(board);
    }

    public Cell[] placeShipOn(Board board){
        Cell[] position = BoardGenerator.createShipPosition(this.length, this.isHorizontal, board);
        for (Cell cell :
                position) {
           cell = board.getCell(
                    (cell.getRow()),
                    (cell.getCol())
            );
           cell.setIsShip(true);
           cell.setValue('s'); //for testing purposes
        }
        board.makeCellsUnavailable(position);
        return position;
    }

    public boolean isHorizontal() {
        return isHorizontal;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "(", ")");
        for (Cell cell :
                position) {
            stringJoiner.add(String.format("(%d, %d)", cell.getRow(), cell.getCol()));
        }
        return stringJoiner.toString();
    }

}
