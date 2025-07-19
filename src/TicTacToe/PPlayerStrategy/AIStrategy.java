package TicTacToe.PPlayerStrategy;

import TicTacToe.Cell;

public class AIStrategy implements PlayerStrategy{
    @Override
    public Cell PerformMove() {
        return new Cell(0,0);
    }
}
