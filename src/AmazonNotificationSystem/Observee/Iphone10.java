package AmazonNotificationSystem.Observee;

import AmazonNotificationSystem.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Iphone10 implements Observee{
    int quantity;
    List<Observer> observerList=new ArrayList<>();
    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);

    }

    @Override
    public void deleteObserver(Observer observer) {
        observerList.remove(observer);

    }


    @Override
    public void notifyToAll() {
        int n=observerList.size();
        for(int i=0;i<n;i++)
        {
            observerList.get(i).update();
        }

    }
    public void setQuantity(int amount)
    {
        this.quantity=amount;
        if(quantity>0)
            notifyToAll();
    }
}
