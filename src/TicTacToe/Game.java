package TicTacToe;

import TicTacToe.PPlayer.Player;
import TicTacToe.PPlayerStrategy.AIStrategy;
import TicTacToe.PPlayerStrategy.HumanStrategy;

import java.util.ArrayList;
import java.util.List;

public  class Game {
    public List<Player>players=new ArrayList<>();
    private Board board;
    private static Game instance=null;
    private int index=0;
    private Game()
    {
        Player player1=new Player("Jatin",PieceType.X, new HumanStrategy());
        Player player2=new Player("Honey",PieceType.O,new HumanStrategy());
        //Player player2=new Player("AI",PieceType.O,new AIStrategy());
        players.add(player1);
        players.add(player2);
        board=new Board(3,3);


    }
    public static Game GetInstance()
    {
        if(instance==null)
        {
            instance=new Game();
        }
        return instance;
    }
    public Boolean Validate(Cell cell)
    {
        return board.Validate(cell);
    }
    public void play()
    {
        while (true) {
            board.PrintBoard();
            Player currentPlayer = players.get(index);
            Cell cell = currentPlayer.turn();
            board.move(cell, currentPlayer);
            index++;
            index = index % 2;
        }

    }

}
