package VendingMachine.State;

import VendingMachine.Context;

public interface State {
    public void next(Context context);
}
