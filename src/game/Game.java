package game;

import board.Board;
import ship.*;

public class Game {

    public static void start() {
        System.out.println("WELCOME TO BATTLESHIPS\n");
        Board board = new Board();
        board.placeShips();
        System.out.println(board);

    }
}
