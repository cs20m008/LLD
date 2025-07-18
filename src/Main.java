import ATM.atmContext;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");
        atmContext sbiAtm=new atmContext();
        sbiAtm.insertCard();
        sbiAtm.insertPin();
        sbiAtm.cashWithraw();
        sbiAtm.collectMoney();

    }
}