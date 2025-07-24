package CoffeeShopSystem;

public class Milk extends Decorator{

    public Milk(Coffee coffee){
        super(coffee);
    }

    @Override
    public Integer getPrice() {
        return coffee.getPrice()+10;
    }

    @Override
    public String getDescription() {
        return "Simple Coffee " + " + Milk";
    }
}
