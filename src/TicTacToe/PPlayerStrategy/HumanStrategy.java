package TicTacToe.PPlayerStrategy;

import TicTacToe.Cell;
import TicTacToe.Game;

import java.util.Scanner;

public class HumanStrategy implements PlayerStrategy{
    public HumanStrategy() {
    }

    @Override
    public Cell PerformMove() {
        Scanner scanner=new Scanner(System.in);
        while (true)
        {
            System.out.println("enter your move");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            Cell cell = new Cell(row, col);
            if (Game.GetInstance().Validate(cell)) {
                return cell;
                //break;
            }

        }


         // return new Cell(0,0);

    }
}
