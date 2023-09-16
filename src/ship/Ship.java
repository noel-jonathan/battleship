package ship;
import game.Game;

import board.Position;

public abstract class Ship {

    private final Position position;

    public Ship(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "position=" + position +
                '}';
    }
}
