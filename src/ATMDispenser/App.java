package ATMDispenser;

import ATMDispenser.Currency.ATMCurrency;

public class App {
   public static void ATMDispenserMain()
   {
       ATMCurrency atmCurrency =new ATMCurrency();
      // atmCurrency.amount=9700;
       atmCurrency.pay(9700);
       atmCurrency.pay(9701);
   }
}
