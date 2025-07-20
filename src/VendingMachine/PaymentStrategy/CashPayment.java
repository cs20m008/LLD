package VendingMachine.PaymentStrategy;

public class CashPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Payment Completed through cash of " +amount);
    }
}
