package ATM;

public class hasCard implements atmState{
    public String name="hasCard";
    @Override
    public void nextState(atmContext atm) {
        System.out.println("has card to userVerified");
        atm.state=new userVerified();
    }

    public hasCard( ) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
