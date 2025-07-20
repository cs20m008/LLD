package PizzaFactory.Decorator;

import PizzaFactory.Pizza.Pizza;

public class Cheese extends Decorator{

    public Cheese(Pizza pizza) {
        super(pizza);
        pizza.setPrice(pizza.getPrice()+60);
    }

    @Override
    public Integer getPrice() {

        return pizza.getPrice();
    }

    @Override
    public void setPrice(int amount) {


    }
}
