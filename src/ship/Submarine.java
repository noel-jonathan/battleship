package ship;

import board.Position;

public class Submarine extends Ship {

    public static final int SUBMARINE_LENGTH = 3;

    public Submarine() {
        super(new Position(SUBMARINE_LENGTH));
    }
}
