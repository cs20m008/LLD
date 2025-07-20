package VendingMachine;

import VendingMachine.PaymentStrategy.UpiPayment;
import VendingMachine.State.State;

public class App {
    public static void vendingMachineMain()
    {
        Context vendingMachine=new Context();
        vendingMachine.selectItem("mango");
        vendingMachine.payment(new UpiPayment(),10);
        vendingMachine.collect();
        State finalState=vendingMachine.getState();
    }

}
