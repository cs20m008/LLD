package PizzaFactory.Pizza;

public class Veg implements Pizza{
    Integer price;
    public Veg() {
        this.price=100;
    }

    @Override
    public Integer getPrice() {
        return price;
    }
    public void setPrice(int amount) {
         price=amount;
    }
}
