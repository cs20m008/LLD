package ATMDispenser.Currency;

public class FiveHundred extends ATMCurrency {
    int value=500;
    public FiveHundred() {
        super();
        next=new Hundred();
    }
    public void pay(int amount)
    {
        System.out.println(500+"  =  "+amount/500);
        if(amount%500!=0)
        {
            next.pay(amount%500);
        }
    }
}
