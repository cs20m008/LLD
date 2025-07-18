package ATM;

public class atmContext {
    atmState state;;

    public atmContext() {
        this.state = new idle();
    }
    public  void insertCard() throws Exception {
        if (state.getName().equals("idle")) {
            System.out.println("card inserting");
            next();
        }
        else
        {
            throw new Exception("invalid operation");
        }
    }
    public void insertPin() throws Exception {
        if(state.getName().equals("hasCard")) {
            System.out.println("inserting pin");
            next();
        }
        else {
            throw new Exception("invalid operation");
        }
    }
    public void cashWithraw() throws Exception {
        if(state.getName().equals("userVerified")) {
            System.out.println("entering amount");
            next();
        }
        else {
            throw new Exception("invalid operation");
        }
    }
    public void collectMoney() throws Exception {
        if(state.getName().equals("withdrawMoney")) {
            System.out.println("collecting money");
            next();
        }
        else {
            throw new Exception("invalid operation");
        }
    }

    public atmState getState() {
        return state;
    }

    public void setState(atmState state) {
        this.state = state;
    }

    public void next()
    {
        state.nextState(this);
    }
}
