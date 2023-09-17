package ship;
import board.Cell;

import game.Generate;

import java.util.StringJoiner;

import static game.Generate.randomBoolean;

public class Ship {
    private Cell[] position;
    private final boolean isHorizontal;
    private final String shipClass;
    private int length;


    public Ship(int length, String shipClass) {
        this.length = length;
        this.shipClass = shipClass;
        this.isHorizontal = randomBoolean();
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

    public void setPosition(Cell[] position){
        this.position = position;
    }

    public Cell[] getPosition() {
        return position;
    }
}
