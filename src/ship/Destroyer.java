package ship;

import board.Position;

public class Destroyer extends Ship {

    public static final int DESTOYER_LENGTH = 3;

    public Destroyer() {
        super(new Position(DESTOYER_LENGTH));
    }
}
