package ship;
import board.Cell;

import game.Generate;

import java.util.StringJoiner;

public class Ship {
    private Cell[] position;
    private final boolean isHorizontal;
    private final String shipClass;


    public Ship(int length, String shipClass) {
        this.shipClass = shipClass;
        this.isHorizontal = Generate.randomBoolean();
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
