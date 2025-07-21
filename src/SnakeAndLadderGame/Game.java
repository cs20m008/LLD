package SnakeAndLadderGame;

import SnakeAndLadderGame.Player.Player;

import java.util.ArrayList;
import java.util.List;

public class Game {
    Board ground;
    Player player1;
    Player player2;
    Player currentPlayer;
    int index=0;
    List<Player>turn=new ArrayList<>();
    public Game() {
        ground=new Board();
        this.player1=new Player(0,"jatin");
        this.player2=new Player(0,"honey");
        turn.add(player1);
        turn.add(player2);

    }
    public String play()
    {
        while(true) {
            currentPlayer = turn.get(index);
            int currentPosition = currentPlayer.position + currentPlayer.move();
            if (currentPosition >= 100)
            {
                System.out.println(currentPlayer.name + "isWinner");
                return currentPlayer.name + "isWinner";
        }
            int i=currentPosition/10;
            int j=currentPosition%10;
            int newPosition=ground.board[i][j].next();
            currentPlayer.position=newPosition;
            System.out.println(currentPlayer.name + "  position  " +newPosition);
            index++;
            index=index%2;

        }
    }

}
