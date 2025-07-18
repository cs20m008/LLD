package ATM;

public interface atmState {
    //public String name="state";
    void nextState(atmContext atm);
    String getName();
    void setName(String name);

}
