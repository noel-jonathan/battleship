package game;

import board.Board;
import ship.*;

public class Game {

    public static void start() {
        System.out.println("WELCOME TO BATTLESHIPS\n");
        Board board = new Board(Generate.board());
        Ship[] ships = Generate.ships();
        System.out.println(board);
        System.out.println(ships[0]);
        System.out.println(ships[1]);
        System.out.println(ships[2]);
        System.out.println(ships[3]);
        System.out.println(ships[4]);
    }
}
