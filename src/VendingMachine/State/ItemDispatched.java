package VendingMachine.State;

import VendingMachine.Context;

public class ItemDispatched implements State{
    public ItemDispatched() {
    }

    @Override
    public void next(Context context) {
        System.out.println("State change from "+context.state.toString()+"  to " +"Idle");
        context.setState(new Idle());
    }
    public String toString()
    {
        return "ItemDispatched";
    }
}
