package PizzaFactory;

import PizzaFactory.Decorator.Cheese;
import PizzaFactory.Decorator.Paneer;
import PizzaFactory.Pizza.Pizza;
import PizzaFactory.Pizza.Veg;

public class app {
    public static void PizzaMain()
    {
        Pizza pizza=new Veg();
        pizza.getPrice();
        new Cheese(pizza);
        new Paneer(pizza);
        new Cheese(pizza);
        pizza.getPrice();
    }
}
