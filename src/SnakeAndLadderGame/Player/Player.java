package SnakeAndLadderGame.Player;

import java.util.Random;

public class Player {
    public String name;
    public int position;

    public Player(int position, String name) {
        this.position = position;
        this.name = name;
    }
    public int move()
    {
        Random random=new Random();
        return 1+ random.nextInt(6);
    }
}
