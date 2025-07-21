package SnakeAndLadderGame;

import SnakeAndLadderGame.Cell.Cell;
import SnakeAndLadderGame.Cell.Snake;

import java.util.Random;

import static java.lang.Math.random;

public class Board {
    public Cell[][] board;
    private static Board instance;
    public Board() {
        board=new Cell[10][10];
        for(int i=0;i<10;i++) {
            for (int j = 0; j < 10; j++) {
                board[i][j] = new Cell(i, j, i, j);
            }
        }
        for(int i=0;i<20;i++)
        {
            Random random=new Random();
            int x=random.nextInt(10);
            int y=random.nextInt(10);
            int x1=random.nextInt(10);
            int y1=random.nextInt(10);
            board[x][y]=new Cell(x,y,x1,y1);
        }
        printBoard();

    }
    public static Board getInstance()
    {
        if(instance == null)
        {
            instance=new Board();
        }
        //return new Board();
        return instance;
    }
    public void printBoard()
    {
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                if(i==0)
                System.out.print(board[i][j]+"   ");
                else
                    System.out.print(board[i][j]+"  ");

            }
            System.out.println();
        }

    }



}
