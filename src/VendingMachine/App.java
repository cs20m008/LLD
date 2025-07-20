package VendingMachine;

import VendingMachine.PaymentStrategy.CashPayment;
import VendingMachine.PaymentStrategy.UpiPayment;
import VendingMachine.State.State;

public class App {
    public static void vendingMachineMain() {
        Context vendingMachine = new Context();
        vendingMachine.selectItem("mango");
        vendingMachine.payment(new UpiPayment(), 10);
        vendingMachine.collect();
        State finalState = vendingMachine.getState();
        vendingMachine.selectItem("Iphone");
        vendingMachine.payment(new CashPayment(), 100000);
        vendingMachine.collect();
    }

}
