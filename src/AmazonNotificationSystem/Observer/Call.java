package AmazonNotificationSystem.Observer;

public class Call implements Observer{
    int phoneNumber;

    public Call(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update() {
        System.out.println("calling to "+phoneNumber);
    }
}
