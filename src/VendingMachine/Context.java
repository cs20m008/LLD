package VendingMachine;

import VendingMachine.PaymentStrategy.PaymentStrategy;
import VendingMachine.State.Idle;
import VendingMachine.State.State;

public class Context {
    public State state;

    public Context() {
        this.state = new Idle();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    public void selectItem(String item)
    {
        try {
            if (state.toString().equals("Idle")) {
                System.out.println("Item Selected "+ item);
                next();
            } else {
                throw new Exception("Invalid Operation");
            }
        } catch (Exception e) {
            System.out.println("Invalid Operation");
        }

    }
    public void payment(PaymentStrategy paymentStrategy,int amount)
    {
        try {
            if(state.toString().equals("ItemSelected"))
            {
                paymentStrategy.pay(amount);
                next();
            }
            else {
                throw new Exception("Invalid Operation");
            }
        } catch (Exception e) {
            System.out.println("Invalid Operation");
        }
    }
    public void collect()
    {

        try {
            if(state.toString().equals("ItemDispatched"))
            {
                System.out.println("Item Collect thanks");
                next();
            }
            else {
                throw new Exception("Invalid Operation");
            }
        } catch (Exception e) {
            System.out.println("Invalid Operation");
        }
    }
    public void next()
    {
        state.next(this);
    }

}
