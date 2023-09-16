package board;

public class Cell {
    public static final char WATER = '~';
    public static final char SHIP = 'S';
    private int row;
    private int col;
    private char value;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public Cell(int row, int col, char value) {
        this(row, col);
        this.value = value;
    }
    public char getValue() {
        return value;
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
}
