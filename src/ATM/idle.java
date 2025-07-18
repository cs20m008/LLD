package ATM;

public class idle implements atmState{
    public String name="idle";
    @Override
    public void nextState(atmContext atm) {
        System.out.println("idle to hasCard");
        atm.state= new hasCard();

    }

    public idle() {
        //this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
