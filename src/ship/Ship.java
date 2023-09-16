package ship;
import board.Board;
import board.Cell;

import board.Position;
import game.Generate;

import java.util.StringJoiner;

public abstract class Ship {
    private final boolean isHorizontal;

    private final Cell[] position;

    public Ship(int length) {
        this.isHorizontal = Generate.randomBoolean();
        this.position = Generate.shipPosition(length, this.isHorizontal);
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

    public void placeOn(Board board) {

    }
}
