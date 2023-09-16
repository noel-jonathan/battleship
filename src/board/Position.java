package board;

import game.Generate;

import java.util.StringJoiner;

public class Position {
    private final boolean isHorizontal;
    private Cell[] cells;

    public Position(int length) {
        this.isHorizontal = Generate.randomBoolean();
        this.cells = Generate.shipPosition(length, this.isHorizontal);
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "(", ")");
        for (Cell cell :
                cells) {
            stringJoiner.add(String.format("(%d, %d)", cell.getRow(), cell.getCol()));
        }
    return stringJoiner.toString();
    }
}
