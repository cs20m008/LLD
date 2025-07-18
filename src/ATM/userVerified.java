package ATM;

public class userVerified implements atmState{
    public String name ="userVerified";
    @Override
    public void nextState(atmContext atm) {
        System.out.println("userVerified to withdrawMoney");
        atm.state=new withdrawMoney();
    }
    public userVerified(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
