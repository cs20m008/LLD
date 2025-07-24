package CoffeeShopSystem;

public class SimpleCoffee extends Coffee{

    Integer price=50;
    @Override
    public Integer getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}
