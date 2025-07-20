package PizzaFactory.Pizza;

public class NonVeg implements Pizza{
    Integer price;
    public NonVeg() {
        this.price=200;
    }

    @Override
    public Integer getPrice() {
        return price;
    }
    public void setPrice(int amount) {
        price=amount;
    }
}
