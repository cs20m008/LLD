package CoffeeShopSystem;

public class WhippedCream extends Decorator{

    public WhippedCream(Coffee coffee){
        super(coffee);
    }

    @Override
    public Integer getPrice() {
        return coffee.getPrice()+20;
    }

    @Override
    public String getDescription() {
        return "Simpe Coffee "+ "+ Whipped Cream";
    }
}
