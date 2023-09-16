package ship;

import board.Position;

public class PatrolBoat extends Ship {

    public static final int PATROLBOAT_LENGTH = 2;

    public PatrolBoat() {
        super(new Position(PATROLBOAT_LENGTH));
    }
}
