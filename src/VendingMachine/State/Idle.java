package VendingMachine.State;

import VendingMachine.Context;

public class Idle implements State
{
    public Idle() {
    }

    @Override
    public void next(Context context) {
        System.out.println("State change from "+context.state.toString()+"  to " +"ItemSelected");
        context.setState(new ItemSelected());
    }
    public String toString()
    {
        return "Idle";
    }
}
