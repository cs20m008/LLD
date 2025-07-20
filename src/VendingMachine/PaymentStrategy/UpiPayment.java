package VendingMachine.PaymentStrategy;

public class UpiPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Payment Completed through upi of " +amount);
    }
}
