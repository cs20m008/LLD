package CoffeeShopSystem;

public class App {
    public static void coffeeShopSystemMain(){
       Coffee simpleCoffee=new SimpleCoffee();
       simpleCoffee=new Milk(simpleCoffee);
       System.out.println(simpleCoffee.getDescription());
       System.out.println(simpleCoffee.getPrice());

    }
}
