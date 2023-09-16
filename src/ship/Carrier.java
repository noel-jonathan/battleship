package ship;

import board.Position;

public class Carrier extends Ship {

    public static final int CARRIER_LENGTH = 5;

    public Carrier() {
        super(new Position(CARRIER_LENGTH));
    }
}
