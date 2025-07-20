package PizzaFactory.Decorator;

import PizzaFactory.Pizza.Pizza;

public class Paneer extends Decorator{

    public Paneer(Pizza pizza) {
        super(pizza);
        pizza.setPrice(pizza.getPrice()+50);
    }

    @Override
    public Integer getPrice() {

        return pizza.getPrice();
    }

    @Override
    public void setPrice(int amount) {


    }
}
