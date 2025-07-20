package VendingMachine.PaymentStrategy;

public class CardPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Payment Completed through card of " +amount);
    }
}
