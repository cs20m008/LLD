package AuctionManagementSystem;

import java.util.Random;

public class Observer {
    Mediator mediator;
    int id;
    String name;
    int limit;
    public Observer(String name,int id,int limit) {
        mediator=Mediator.getInstance();
        this.name = name;
        this.id=id;
        this.limit=limit;
    }
    public Boolean update(int amount)
    {
        if(amount>=limit)
        {
            System.out.println("I am out of this auction. My limit "+limit+" current amount "+amount);
            return false;
        }

       Thread thread=new Thread(()->{
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
           bid(amount);
       });
        thread.start();
        return true;

    }
    public void bid(int amount)
    {
        Random random=new Random();
        int maxi=limit-amount;
        int currentBid=amount+random.nextInt(maxi+2);
        System.out.println(this.name+"  "+currentBid);
        mediator.placeBid(currentBid,this);


    }
}
