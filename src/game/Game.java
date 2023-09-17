package game;

import board.Board;

public class Game {
    private Board board;
// I really would prefer not doing this because I wanted the methods in game to be static and not have instances of Game
// But I don't know how to pass board to the methods in any other way
    public void reset() {
        System.out.println("WELCOME TO BATTLESHIPS\n");
        board = new Board();
        System.out.println(board);

    }

    public void loop() {
        boolean gameOver = false;
        while (!gameOver){
            Player.shoots(board);
        }
    }
}
