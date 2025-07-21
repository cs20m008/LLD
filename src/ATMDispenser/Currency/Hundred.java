package ATMDispenser.Currency;

public class Hundred extends ATMCurrency{
    int val=100;
    public Hundred() {
        super();
       next=new Invalid();
    }
    public void pay(int amount)
    {
        System.out.println(100+"  =  "+amount/100);
        if(amount%100!=0)
        {
            next.pay(amount%100);
        }
    }
}
