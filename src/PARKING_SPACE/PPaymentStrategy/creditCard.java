package PARKING_SPACE.PPaymentStrategy;

public class creditCard implements paymentStrategy{
    @Override
    public void pay(Integer amount) {
        System.out.println("amount payed ");
        System.out.println(amount);
    }
}
