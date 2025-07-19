package TicTacToe.PPlayer;

import TicTacToe.Cell;
import TicTacToe.PPlayerStrategy.PlayerStrategy;
import TicTacToe.PieceType;

public  class Player {
    public String name;
    public PieceType pieceType;
    public PlayerStrategy playerStrategy;
    public Player(String name, PieceType pieceType, PlayerStrategy playerStrategy) {
        this.name = name;
        this.pieceType = pieceType;
        this.playerStrategy=playerStrategy;
    }
    public Cell turn()
    {
        return playerStrategy.PerformMove();
    }
}
