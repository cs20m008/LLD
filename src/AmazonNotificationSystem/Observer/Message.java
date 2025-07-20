package AmazonNotificationSystem.Observer;

public class Message implements Observer{
    int messagingNumber;

    public Message(int messagingNumber) {
        this.messagingNumber = messagingNumber;
    }

    @Override
    public void update() {
        System.out.println("messaging to "+messagingNumber);
    }
}
