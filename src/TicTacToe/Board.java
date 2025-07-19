package TicTacToe;

import TicTacToe.PPlayer.Player;

import java.util.ArrayList;
import java.util.List;

public class Board {
    int row;
    int col;
    PieceType[][] board;

    public Board(int row, int col) {
        this.row = row;
        this.col = col;
        this.board = new PieceType[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                board[i][j]=PieceType.EMPTY;
            }
        }
    }
    public Boolean Validate(Cell cell)
    {
        if(board[cell.row][cell.col]==PieceType.EMPTY)
        {
            return true;
        }
            return false;

    }
    public void move(Cell cell,Player player)
    {
        board[cell.row][cell.col]=player.pieceType;
    }
    public void PrintBoard()
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(board[i][j]);
                System.out.print("   ");

            }
            System.out.println();
        }
    }
}
