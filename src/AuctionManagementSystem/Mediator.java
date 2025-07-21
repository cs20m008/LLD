package AuctionManagementSystem;

import java.util.ArrayList;
import java.util.List;

import static javax.management.Query.or;

public class Mediator {
    private static Mediator instance;
    List<Observer> observers=new ArrayList<>();
    private Mediator()
    {

    }
    public static Mediator getInstance()
    {
        if(instance==null)
        {
            instance=new Mediator();
        }
        return instance;
    }
    public void placeBid(int amount,Observer observer)
    {
        notifyAll(amount,observer);
    }

    public void notifyAll(int amount,Observer observer)
    {  int id=-1;
           if(observer!=null)
            id=observer.id;
        Boolean availableBidder=false;
        for(int i=0;i<observers.size();i++)
        {
            if(observers.get(i).id!=id)
            {
                availableBidder=availableBidder || observers.get(i).update(amount);


            }
        }
        if(!availableBidder)
        {
            System.out.println("sold to "+observer.name+" at price "+amount);
        }
    }
    public void addObserver(Observer observer)
    {
        observers.add(observer);
    }
    public void deleteObserver(Observer observer)
    {
        observers.remove(observer);
    }
}
