package AmazonNotificationSystem.Observee;
import AmazonNotificationSystem.Observer.Observer;
public interface Observee {
    public void addObserver(Observer observer);
    public void deleteObserver(Observer observer);
    public void notifyToAll();
    public void setQuantity(int amount);
}
