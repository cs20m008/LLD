package SnakeAndLadderGame.Cell;

public class Cell {
    public int startRow;
    public int startCol;
    public int endRow;
    public int endCol;

    public Cell(int startRow, int startCol, int endRow, int endCol) {
        this.startRow = startRow;
        this.startCol = startCol;
        this.endRow = endRow;
        this.endCol = endCol;
    }

    @Override
    public String toString() {
        Integer x=startRow*10+startCol;
        Integer y=endRow*10+endCol;
        return x.toString()+"::"+y.toString();
    }
    public int next()
    {
        int y=endRow*10+endCol;
        return y;
    }
}
