package VendingMachine.State;

import VendingMachine.Context;

public class ItemSelected implements State{
    public ItemSelected() {
    }

    @Override
    public void next(Context context) {
        System.out.println("State change from "+"ItemSelected"+"  to " +"ItemDispatched");
        context.setState(new ItemDispatched());
    }
    public String toString()
    {
        return "ItemSelected";
    }
}
