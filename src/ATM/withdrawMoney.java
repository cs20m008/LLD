package ATM;

public class withdrawMoney implements atmState{
    public String name="withdrawMoney";
    @Override
    public void nextState(atmContext atm) {
        System.out.println(" withdrawMoney to idle");
        atm.state=new idle();
    }
    public withdrawMoney()
    {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
