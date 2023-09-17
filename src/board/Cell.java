package board;

public class Cell {
    public static final char WATER = '~';
    private final int row;
    private final int col;
    private char value;
    private boolean isAvailable;
    private boolean isShip;

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailability(boolean available) {
        isAvailable = available;
    }

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.isAvailable = true;
        this.isShip = false;
    }

    public Cell(int row, int col, char value) {
        this(row, col);
        this.value = value;
    }
    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }

    public void setIsShip(boolean isShip) {
        this.isShip = isShip;
    }

}
