package game;

import board.Board;

public class Game {
    private Board board;

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
