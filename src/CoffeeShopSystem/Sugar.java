package CoffeeShopSystem;

public class Sugar extends Decorator{

    public Sugar(Coffee coffee){
        super(coffee);
    }

    @Override
    public Integer getPrice() {
        return coffee.getPrice()+5;
    }

    @Override
    public String getDescription() {
        return "Simpe Coffee " + " + Sugar";
    }
}
