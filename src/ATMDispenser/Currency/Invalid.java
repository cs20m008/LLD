package ATMDispenser.Currency;

public class Invalid extends ATMCurrency {

    public Invalid() {
        super();
    }
    public void pay(int amount)
    {
        System.out.println("invalid " +amount);

    }
}
