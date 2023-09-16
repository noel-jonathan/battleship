package game;

import board.Board;
import ship.*;

public class Game {

    public static void start() {
        System.out.println("WELCOME TO BATTLESHIPS\n");
        Ship[] ships = Generate.ships();
        Board board = new Board(Generate.board());
        System.out.println(board);
        System.out.println(ships[0].getPosition());
        System.out.println(ships[1].getPosition());
        System.out.println(ships[2].getPosition());
        System.out.println(ships[3].getPosition());
        System.out.println(ships[4].getPosition());
    }

    ;


}
