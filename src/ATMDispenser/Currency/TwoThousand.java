package ATMDispenser.Currency;

public class TwoThousand extends ATMCurrency {

    public TwoThousand() {
        super();
        next=new FiveHundred();
    }
    public void pay(int amount)
    {
        System.out.println(2000+"  =  "+amount/2000);
        if(amount%2000!=0)
        {
            next.pay(amount%2000);
        }
    }

}
