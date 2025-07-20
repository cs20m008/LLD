package AmazonNotificationSystem.Observer;

public class Email implements Observer{
    String emailId;

    public Email(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public void update() {
        System.out.println("sending to "+emailId);
    }
}
