package AmazonNotificationSystem;

import AmazonNotificationSystem.Observee.Iphone10;
import AmazonNotificationSystem.Observee.Observee;
import AmazonNotificationSystem.Observer.Call;
import AmazonNotificationSystem.Observer.Email;
import AmazonNotificationSystem.Observer.Message;
import AmazonNotificationSystem.Observer.Observer;

public class App {
    public static void amazonNotificationSystemMain()
    {
        Observee iphone10=new Iphone10();
        Observer email1=new Email("india@gmail.com");
        Observer email2=new Email("us@gmail.com");
        Observer email3=new Email("china@gmail.com");
        Observer call=new Call(98765432);
        Observer message=new Message(8764454);
        iphone10.addObserver(email1);
        iphone10.addObserver(call);
        iphone10.addObserver(email2);
        iphone10.addObserver(message);
        iphone10.addObserver(email3);
        iphone10.setQuantity(-5);
        iphone10.setQuantity(0);
        iphone10.setQuantity(5);
        iphone10.setQuantity(-50);
    }
}
