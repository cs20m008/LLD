package PizzaFactory.Decorator;

import PizzaFactory.Pizza.Pizza;

public abstract class Decorator implements Pizza {
    Pizza pizza;

    public Decorator(Pizza pizza) {
        this.pizza = pizza;
    }
}
