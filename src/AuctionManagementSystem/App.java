package AuctionManagementSystem;

import AuctionManagementSystem.Product.Flat;
import AuctionManagementSystem.Product.Product;

public class App {
    public static void auctionManagementSystemMain()
    {
        Mediator mediator=Mediator.getInstance();
        Product product=new Flat(100000);
        Observer Honey=new Observer("Honey",1,1000000);
        Observer Jatin=new Observer("Jatin",2,1000000);
        Observer Jethalal=new Observer("Jethalal",3,800000);
        mediator.addObserver(Honey);
        mediator.addObserver(Jatin);
        mediator.addObserver(Jethalal);
        mediator.placeBid(product.getPrice(),null);


    }
}
