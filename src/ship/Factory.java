package ship;

import board.Board;

public class Factory {
    public static Ship [] createShips(Board board){
        return new Ship[]{
                createCarrier(board),
                createBattleship(board),
                createDestroyer(board),
                createSubmarine(board),
                createPatrolBoat(board)
        };
    }
    public static Ship createCarrier(Board board) {
        return new Ship(5, "Carrier", board);
    }
    public static Ship createBattleship(Board board) {
        return new Ship(4, "Battleship", board);
    }
    public static Ship createDestroyer(Board board) {
        return new Ship(3, "Destroyer", board);
    }
    public static Ship createSubmarine(Board board) {
        return new Ship(3, "Submarine", board);
    }
    public static Ship createPatrolBoat(Board board) {
        return new Ship(2, "PatrolBoat", board);
    }

}
