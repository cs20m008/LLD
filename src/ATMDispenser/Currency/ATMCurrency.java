package ATMDispenser.Currency;

public class ATMCurrency {
    //int quantity;
    public ATMCurrency next;
    public int amount;
    public ATMCurrency() {

    }
    public void pay(int amount)
    { next=new TwoThousand();
        next.pay(amount);
    }

}
