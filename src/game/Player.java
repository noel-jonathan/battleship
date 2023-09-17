package game;

import board.Board;
import board.Cell;
import static board.Cell.*;

import java.util.Scanner;


public class Player {

    public static void shoots(Board board){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x and y coordinates you want to attack (separated by space):");
        Cell target = board.getCell(sc.nextInt(), sc.nextInt());
        if (!target.isShip()) {
            target.setValue(MISS);
            System.out.println(board);
            System.out.println("You missed !\n");
            return;
        }

        target.setValue(HIT);
        System.out.println(board);
        System.out.println("You hit a ship !\n");
        // need to increment ship hitCounter. When hitCounter = ship length, ship.isDestroyed.
        // when all ship are destroyed, game is won and get out of loop
        // also need to implement checking shipClass and changing cell value accordingly ( 'c' for carrier, ...)
    }
}
